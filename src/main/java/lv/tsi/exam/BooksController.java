package lv.tsi.exam;

import lv.tsi.exam.books.Book;
import lv.tsi.exam.users.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BooksController {

    @RequestMapping("/library")
    public List<Book> library() {
        return Book.getAll();
    }

}
