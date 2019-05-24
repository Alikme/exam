package lv.tsi.exam.Controller;

import lv.tsi.exam.Entity.Movie;
import lv.tsi.exam.Repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/movies")
public class MovieController {

    @Autowired
    private MovieRepository movieRepository;


    @GetMapping("/getAll")
    public List<Movie> getAllMovies() { return movieRepository.findAll();}

    @RequestMapping("/getId/{id}")
    public Optional<Movie> getMovieById(@PathVariable("id") int id){
        return movieRepository.findById(id);
    }

   @RequestMapping(value = {"/getCategory", "/getCategory/{category}"})
    public @ResponseBody List<Movie> getMovieByCategory(@PathVariable Optional<String> category){
           return movieRepository.getMovieByCategory(category.get());
    }
}
