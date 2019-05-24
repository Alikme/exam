package lv.tsi.exam.Entity;

import javax.persistence.*;
import java.util.List;

@Entity

public class postEntity {
    @Id
    @GeneratedValue
    private Long Id;
    private String body;

    @OneToMany
    @JoinColumn(name="postId")
    private List<commentEntity> commentList;
    public void setId(Long id){
        Id=id;
    }
    public void setBody(String body) {
        this.body=body;
    }
    public void setCommentList(List<commentEntity> commentList) {
        this.commentList=commentList;
    }
    public Long getId() {
        return Id;
    }
    public String getBody() {
        return body;
    }
    public List<commentEntity> getCommentList() {
        return commentList;
    }
    public postEntity (Long id, String title, String body, List<commentEntity> commentList, String author) {
        Id=id;
        this.body=body;
        this.commentList=commentList;
    }

}
