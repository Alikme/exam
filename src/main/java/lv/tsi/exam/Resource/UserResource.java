package lv.tsi.exam.Resource;

import lv.tsi.exam.allUsers.UserEntity;
import lv.tsi.exam.allUsers.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserResource {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/getAll")
    public List<UserEntity> getAllUsers()
    {
        return userRepository.findAll();
    }

    @GetMapping("/getId/{id}")
    @ResponseBody
    public Optional<UserEntity> getUser_id(@PathVariable long user_id)
    {
        return userRepository.findById(user_id);
    }

    @GetMapping("/getBook/{book}")
    @ResponseBody
    public List<UserEntity> getBook_title(@PathVariable String book_title)
    {
        return userRepository.findByBook(book_title);
    }

}
