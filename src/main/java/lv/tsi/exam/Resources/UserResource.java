package lv.tsi.exam.Resources;

import lv.tsi.exam.model.Repository.UserRepository;
import lv.tsi.exam.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/users")
public class UserResource {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/getAll")
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @GetMapping("/getId/{id}")
    @ResponseBody
    public Optional<User> getById(@PathVariable Long id) {
        return userRepository.findById(id);
    }

    @GetMapping("/getBook/{book}")
    @ResponseBody
    public List<User> getByBookName(@PathVariable String book) {
        return userRepository.findByBook(book);
    }
}