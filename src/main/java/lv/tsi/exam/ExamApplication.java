package lv.tsi.exam;

import lv.tsi.exam.model.Movie;
import lv.tsi.exam.model.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ExamApplication {
    @Autowired
    MovieRepository movieRepository;

    public static void main(String[] args) {
        SpringApplication.run(ExamApplication.class, args);
    }

    @Bean
    void populateDB() {
        movieRepository.save(new Movie("Action", "Fast & Furious 1"));
        movieRepository.save(new Movie("Action", "Fast & Furious 2"));
        movieRepository.save(new Movie("Action", "Fast & Furious 3"));
        movieRepository.save(new Movie("Action", "Kong: Skull Island 1"));
        movieRepository.save(new Movie("Action", "Kong: Skull Island 2"));
        movieRepository.save(new Movie("Action", "Kong: Skull Island 3"));
    }
}
