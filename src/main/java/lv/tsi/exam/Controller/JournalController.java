package lv.tsi.exam.Controllers;

import lv.tsi.exam.Entity.*;
import lv.tsi.exam.Repo.PRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/journal")
public class JournalController {

    @Autowired
    private PRep PRep;




    @RequestMapping("/getId/{id}")
    public Optional<PRep> getPupilById (@PathVariable("id") Long id){
        return PRep.findById(id);
    }

    @RequestMapping(value = {"/all" , "/all/{Group}" })
    public @ResponseBody
    List<PRep> getAllPupil(@PathVariable Optional<String> Group){
        if(Group.isPresent())
            return PRep.findByGroupId(Group.get());
        return PRep.findAll();
    }
    /*
    @GetMapping("/getAll")
    public List<Pupil> getAllPupil()
    {
        return pupilRepository.findAll();
    }*/
}
