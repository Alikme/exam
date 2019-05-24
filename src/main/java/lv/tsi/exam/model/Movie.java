package lv.tsi.exam.model;

import javax.persistence.*;

@Entity
@Table(name = "Movie")
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String genre;
    private String name;

    public Movie(String genre, String name)
    {
        this.genre = genre;
        this.name = name;
    }

    public Movie(Long id,String genre, String name)
    {
        this.id = id;
        this.genre = genre;
        this.name = name;
    }
    public Movie()
    {

    }
    public Long getId()
    {
        return id;
    }
    public void setId(Long id)
    {
        this.id = id;
    }
    public String getGenre()
    {
        return genre;
    }
    public void setGenre(String genre)
    {
        this.genre = genre;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
}
