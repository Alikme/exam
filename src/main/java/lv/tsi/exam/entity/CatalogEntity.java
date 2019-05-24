package lv.tsi.exam.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class CatalogEntity {
    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String description;
    
    @OneToMany
    @JoinColumn(name="catalogId")
    private List<MovieEntity> movieList;

    public CatalogEntity() {
    }

    public CatalogEntity(Long id, String title, String description, List<MovieEntity> movieList) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.movieList = movieList;
    }

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<MovieEntity> getMovieList() {
        return movieList;
    }

    public void setMovieList(List<MovieEntity> movieList) {
        this.movieList = movieList;
    }
}
