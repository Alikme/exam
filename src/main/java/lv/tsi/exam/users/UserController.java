package lv.tsi.exam.users;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


@RestController
public class UserController {
    @RequestMapping("/user/list")
    public Map<Integer, User> UsersList() {
        return User.getAll();
    }

    @RequestMapping("/user/")
    public User UsersList(@RequestParam("id") Integer id) {
        return User.getById(id);
    }

    @RequestMapping("/users/")
    public List<User> UsersListByBook(@RequestParam("book") Integer id) {
        return new ArrayList<>(User.getUserByBook(id).values());
    }
}
