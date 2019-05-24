package lv.tsi.exam.model.Repository;

import lv.tsi.exam.model.LibraryUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface LibraryUserRepository extends JpaRepository<LibraryUser, Long> {

    List<LibraryUser> findByBook(String bookName);
}