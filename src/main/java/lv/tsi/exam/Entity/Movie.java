package lv.tsi.exam.Entity;

import javax.persistence.*;

@Entity
public class Movie {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String category;
    private int releaseYear;

    public String getMovieCategory() {
        return category;
    }

    public void setMovieCategory(String category) {
        this.category = category;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public Movie(int id, String name, String category, int releaseYear) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.releaseYear = releaseYear;
    }

    public Movie(){
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}


