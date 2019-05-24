package lv.tsi.exam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/users")
public class UserRes {

    @Autowired
    private UserRepo userRepo;

    @GetMapping("/getAll")
    public List<User> getAllUsers() {
        return userRepo.findAll();
    }

    @GetMapping("/getId/{id}")
    @ResponseBody
    public Optional<User> getById(@PathVariable Long id) {
        return userRepo.findById(id);
    }

    @GetMapping("/getBook/{book}")
    @ResponseBody
    public List<User> getByBookName(@PathVariable String book) {
        return userRepo.findByBook(book);
    }
}