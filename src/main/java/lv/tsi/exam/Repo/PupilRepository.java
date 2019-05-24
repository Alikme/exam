package lv.tsi.exam.Repo;

import lv.tsi.exam.Entitys.Pupil;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PupilRepository extends JpaRepository<Pupil,Long> {

    List<Pupil> findByGroupId(String group);
}
