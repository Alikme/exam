package lv.tsi.exam.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class CommentEntity {
    @Id
    @GeneratedValue
    private Long id;
    private String filmname;
    private String filmcode;
    private String movieId;

    public CommentEntity(Long id, String filmname , String filmcode, String movieId) {
        this.id = id;
        this.filmname = filmname;
        this.filmcode = filmcode;
        this.movieId = movieId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFilmname() {
        return filmname;
    }

    public void setFilmname(String filmname) {
        this.filmname = filmname;
    }

    public String getFilmcode() {
        return filmcode;
    }

    public void setFilmcode(String filmcode) {
        this.filmcode = filmcode;
    }

    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }
}
