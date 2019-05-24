package lv.tsi.exam.resource;

import lv.tsi.exam.model.Movie;
import lv.tsi.exam.model.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/movie")
public class MovieController {

    @Autowired
    MovieRepository movieRepository;

    @RequestMapping("/all")
    public @ResponseBody
    List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }

    @RequestMapping("/{id}")
    public @ResponseBody
    Optional<Movie> getMovieById(@PathVariable Long id) {
        return movieRepository.findById(id);
    }

    @PostMapping("/add")
    public @ResponseBody Boolean addMovie(@RequestBody Movie movie) {
        movieRepository.save(movie);
        return true;
    }

    @RequestMapping("/")
    public String indexPage(Model model) {
        model.addAttribute("movies", movieRepository.findAll());
        return "index";
    }
}
