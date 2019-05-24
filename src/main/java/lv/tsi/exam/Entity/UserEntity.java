package lv.tsi.exam.Entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class UserEntity {

    @Id
    @GeneratedValue
    private Long id;
    private String author;
    private String title;
    private String body;

    @OneToMany
    @JoinColumn(name="postId")
    private List<CommentEntity> commentsList;

    public UserEntity(Long id, String author, String title, String body, List<CommentEntity> commentsList) {
        this.id = id;
        this.author = author;
        this.title = title;
        this.body = body;
        this.commentsList = commentsList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public List<CommentEntity> getCommentsList() {
        return commentsList;
    }

    public void setCommentsList(List<CommentEntity> commentsList) {
        this.commentsList = commentsList;
    }
}