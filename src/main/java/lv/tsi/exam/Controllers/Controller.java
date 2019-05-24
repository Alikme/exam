package lv.tsi.exam.Controllers;

import lv.tsi.exam.Entity.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/journal")
public class Controller {
    @Autowired
    private MovieRepository movieRepository;


    @RequestMapping("/getId/{id}")
    public Optional<Movie> getMovieById (@PathVariable("id") Long id){
        return movieRepository.findById(id);
    }
    @RequestMapping(value = {"/all" , "/all/{Group}" })
    public @ResponseBody
    List<Movie> getAllPupil(@PathVariable Optional<String> Group){
        if(Group.isPresent())
            return movieRepository.findByGroupId(Group.get());
        return movieRepository.findAll();
    }
}
