package lv.tsi.exam.Controllers;

import lv.tsi.exam.Entitys.Pupil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/journal")
public class JournalController {

    @Autowired
    private PupilRepository pupilRepository;




    @RequestMapping("/getId/{id}")
    public Optional<Pupil> getPupilById (@PathVariable("id") Long id){
        return pupilRepository.findById(id);
    }

    @RequestMapping(value = {"/all" , "/all/{Group}" })
    public @ResponseBody
    List<Pupil> getAllPupil(@PathVariable Optional<String> Group){
        if(Group.isPresent())
            return pupilRepository.findByGroupId(Group.get());
        return pupilRepository.findAll();
    }