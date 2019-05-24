package lv.tsi.exam;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/movies")
public class MovieController {
    private MovieRepository repository;

    public MovieController(MovieRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<MovieEntity> getMovies(@RequestParam(required = false) String genre) {
        if (genre == null) {
            return repository.findAll();
        } else {
            return repository.findAllByGenre(genre);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<MovieEntity> getMovie(@PathVariable Long id) {
        Optional<MovieEntity> movie = repository.findById(id);
        if (movie.isPresent()) {
            return ResponseEntity.ok(movie.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}