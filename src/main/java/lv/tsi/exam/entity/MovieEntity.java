package lv.tsi.exam.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class MovieEntity {
    @Id
    @GeneratedValue
    private Long id;
    private Long movieId;
    private String title;
    private String info;

    @OneToMany
    @JoinColumn(name="movieId")
    private List<CommentEntity> commentsList;

    public MovieEntity() {
    }

    public MovieEntity(Long id, Long movieId, String title, String info, List<CommentEntity> commentsList) {
        this.id = id;
        this.movieId = movieId;
        this.title = title;
        this.info = info;
        this.commentsList = commentsList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMovieId() {
        return movieId;
    }

    public void setMovieId(Long movieId) {
        this.movieId = movieId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public List<CommentEntity> getCommentsList() {
        return commentsList;
    }

    public void setCommentsList(List<CommentEntity> commentsList) {
        this.commentsList = commentsList;
    }
}
