package lv.tsi.exam.resource;

import lv.tsi.exam.model.Movie;
import lv.tsi.exam.model.MovieCategory;
import lv.tsi.exam.model.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/movie")
public class MovieController {
    @Autowired
    private MovieRepository movieRepository;

    @RequestMapping(value = {"/all", "/all/{movieCategory}"})
    public @ResponseBody
    List<Movie> getAllMovies(@PathVariable Optional<MovieCategory> movieCategory) {
        if (movieCategory.isPresent()) {
            return movieRepository.findByMovieCategory(movieCategory.get());
        }
        return movieRepository.findAll();
    }

    @RequestMapping("/{id}")
    public @ResponseBody
    Optional<Movie> getMovieById(@PathVariable Long id) {
        return movieRepository.findById(id);
    }

}
