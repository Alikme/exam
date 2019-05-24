package lv.tsi.forum.entity;

import javax.annotation.Generated;
import javax.persistence.*;
import java.util.List;

@Entity
public class PostEntity {
    @Id
    @GeneratedValue
    private Long id;

    private String author;
    private String title;
    private String body;

    Long topicId;


    @OneToMany
    @JoinColumn(name = "postId")
    private List<lv.tsi.forum.entity.CommentEntity> commentList;

    public PostEntity(Long id, String author, String title, String body, List<lv.tsi.forum.entity.CommentEntity> commentList) {
        this.id = id;
        this.author = author;
        this.title = title;
        this.body = body;
        this.commentList = commentList;
    }

    public PostEntity() {
    }

    public Long getTopicId() {
        return topicId;
    }

    public void setTopicId(Long topicId) {
        this.topicId = topicId;
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

    public List<lv.tsi.forum.entity.CommentEntity> getCommentList() {
        return commentList;
    }

    public void setCommentList(List<lv.tsi.forum.entity.CommentEntity> commentList) {
        this.commentList = commentList;
    }
}