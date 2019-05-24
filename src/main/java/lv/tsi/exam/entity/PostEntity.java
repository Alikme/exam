package lv.tsi.exam.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class PostEntity {
    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String filmcode;
    @OneToMany
    @JoinColumn(name = "postId")
    private List<CommentEntity> commentList;
    private String filmname;
    public PostEntity(Long id, String title, String filmcode, List<CommentEntity> commentList, String filmname) {
        this.id = id;
        this.title = title;
        this.filmcode = filmcode;
        this.commentList = commentList;
        this.filmname = filmname;
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

    public String getfilmcode() {
        return filmcode;
    }

    public void setfilmcode(String filmcode) {
        this.filmcode = filmcode;
    }

    public List<CommentEntity> getCommentList() {
        return commentList;
    }

    public void setCommentList(List<CommentEntity> commentList) {
        this.commentList = commentList;
    }
}
