package lv.tsi.exam.model.repository;

import lv.tsi.exam.model.Pupil;
import lv.tsi.exam.model.PupilClas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PupilRepository extends JpaRepository<Pupil, Long> {

   // public Pupil findAll();
    //public Pupil findById();
    List<Pupil> findByPupilClas(PupilClas pupilClas);
}
