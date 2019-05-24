package lv.tsi.exam.model.Repository;

import  lv.tsi.exam.model.User;
import  lv.tsi.exam.model.UserClas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.awt.print.Book;
import java.util.List;

@Repository
public interface  UserRepository extends JpaRepository<User, Long> {

    //public User findAll();
    //public User findById();
    List<User > findByBook ();
}