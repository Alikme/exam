package lv.tsi.exam.Repo;

import lv.tsi.exam.Entity.PRep;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PRep extends JpaRepository<PRep,Long> {

    List<PRep> findByGroupId(String group);
}
