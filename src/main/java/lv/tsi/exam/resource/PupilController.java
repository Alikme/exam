package lv.tsi.exam.resource;

import lv.tsi.exam.model.Pupil;
import lv.tsi.exam.model.PupilClas;
import lv.tsi.exam.model.repository.PupilRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/pupil")
public class PupilController {

    @Autowired
    private PupilRepository pupilRepository;

    @RequestMapping(value={"/all", "/all/{pupilClas}"})
    public @ResponseBody
    List<Pupil> getAllPupils(@PathVariable Optional<PupilClas> pupilClas){
        if(pupilClas.isPresent()){
            return pupilRepository.findByPupilClas(pupilClas.get());

        }
        return pupilRepository.findAll();
    }

    @RequestMapping("/{id}")
    public @ResponseBody
    Optional<Pupil> getPupilById(@PathVariable Long id){return pupilRepository.findById(id);}



}
