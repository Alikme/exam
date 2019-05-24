package lv.tsi.exam.model.repository;

import lv.tsi.exam.model.Movie;
import lv.tsi.exam.model.MovieCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {
    List<Movie> findByMovieCategory(MovieCategory movieCategory);

}
