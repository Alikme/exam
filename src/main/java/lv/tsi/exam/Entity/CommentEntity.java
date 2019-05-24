package lv.tsi.forum.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class CommentEntity {
    @Id
    @GeneratedValue
    private Long id;
    private String author;
    private String body;

    Long postId;

    public CommentEntity() {
    }

    public CommentEntity(Long id, String author, String body, Long postId) {
        this.id = id;
        this.author = author;
        this.body = body;
        this.postId = postId;
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

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Long getPostId() {
        return postId;
    }

    public void setPostId(Long postId) {
        this.postId = postId;
    }


}