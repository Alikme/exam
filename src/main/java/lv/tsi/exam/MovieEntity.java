package lv.tsi.exam;

import javax.persistence.*;
import java.util.List;

@Entity
public class MovieEntity {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    private String title;
    private String director;
    private String genre;
    private int year;

    protected MovieEntity() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public MovieEntity(String firstName, String lastName, String genre, int year) {
        this.id = id;
        this.title = title;
        this.director = director;
        this.genre = genre;
        this.year = year;
    }

    @Override
    public String toString() {
        return String.format(
                "MovieEntity[id=%d, title='%s', director='%s'] genre='%s' year='%d'",
                id, title, director, genre, year);
    }

}