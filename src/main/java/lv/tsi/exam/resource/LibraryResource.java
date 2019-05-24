package lv.tsi.exam.resource;

import lv.tsi.exam.entity.BookEntity;
import lv.tsi.exam.entity.BookRepository;
import lv.tsi.exam.entity.UserRepository;
import lv.tsi.exam.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.*;

@Controller
@RequestMapping("/library")
public class LibraryResource {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private BookRepository bookRepository;

    @RequestMapping(value = {"/json/users", "/json/users/{id}"})
    public @ResponseBody List<UserEntity> getAllUsers(@PathVariable Optional<Long> id) {
        if(id.isPresent()) {
            return userRepository.findAllById(Collections.singletonList(id.get()));
        }
        return userRepository.findAll();
    }

    @GetMapping("/json/users/byBook/{bookId}")
    public @ResponseBody List<UserEntity> getAllUsersByBook(@PathVariable Long bookId) {
        List<UserEntity> users = userRepository.findAll();
        users.removeIf(el -> (el.getBookId() != bookId));
        return users;
    }


    @RequestMapping(value = {"/json/books", "/json/books/{id}"})
    public @ResponseBody List<BookEntity> getAllBooks(@PathVariable Optional<Long> id) {
        if(id.isPresent()) {
            return bookRepository.findAllById(Collections.singletonList(id.get()));
        }
        return bookRepository.findAll();
    }

    @GetMapping({"/", "/hello"})
    public String hello(Model model, @RequestParam(value="name", required=false, defaultValue="World") String name) {
        final String[] res = {"["};
        userRepository.findAll().forEach(u -> {
            res[0] += u.toString() + ",";
        });
        res[0] = res[0].substring(0,res[0].length() - 1) + "]";
        model.addAttribute("users", res[0]);
        return "hello";
    }
}
