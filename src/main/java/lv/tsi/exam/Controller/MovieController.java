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

    private final String MESSAGE = "<h1>Hello!</h1><br><h2>Welcome to my movies database! ;)</h2><br/>" +
            "<table><tr><th>Description</th><th>URI Path</th></tr>"+
            "<tr><td>To get all movies</td><td>/movies/getAll</td></tr>" +
            "<tr><td>To get movie by id use</td><td>/movies/get/&lt;id&gt;</td></tr>" +
            "<tr><td>To find movie by category use</td><td> /movies/getCat/&lt;category&gt;</td>";

    @Autowired
    private MovieRepository movieRepository;

    @GetMapping("")
    @ResponseBody
    public String getBodyHtml(){
        return MESSAGE;
    }

    @GetMapping("/getAll")
    public List<Movie> getAllMovies() { return movieRepository.findAll();}

    @RequestMapping("/getId/{id}")
    public Optional<Movie> getMovieById(@PathVariable("id") int id){
        return movieRepository.findById(id);
    }

   @RequestMapping(value = {"/getCat", "/getCat/{category}"})
    public @ResponseBody List<Movie> getMovieByCategory(@PathVariable Optional<String> category){
        //return movieRepository.findAll().stream().filter(x -> x.getCategory().toLowerCase().equals(category.toLowerCase())).collect(Collectors.toList());\

       if(category.isPresent()) {
           return movieRepository.getMovieByCategory(category.get());
       }

       return movieRepository.findAll();
    }
}
