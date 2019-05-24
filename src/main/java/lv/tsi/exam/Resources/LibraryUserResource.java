package lv.tsi.exam.Resources;

import lv.tsi.exam.model.Repository.LibraryUserRepository;
import lv.tsi.exam.model.LibraryUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/users")
public class LibraryUserResource {

    @Autowired
    private LibraryUserRepository LibraryUserRepository;

    @GetMapping("/getAll")
    public List<LibraryUser> getAllUsers() {
        return LibraryUserRepository.findAll();
    }

    @GetMapping("/getId/{id}")
    @ResponseBody
    public Optional<LibraryUser> getById(@PathVariable Long id) {
        return LibraryUserRepository.findById(id);
    }

    @GetMapping("/getBook/{book}")
    @ResponseBody
    public List<LibraryUser> getByBookName(@PathVariable String book) {
        return LibraryUserRepository.findByBook(book);
    }
}

