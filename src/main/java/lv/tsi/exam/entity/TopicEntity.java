package lv.tsi.exam.entity;

import org.hibernate.validator.constraints.EAN;

import javax.persistence.*;
import java.util.List;


@Entity
public class TopicEntity {
    @Id
    @GeneratedValue
    Long id;
    String title;
    String description;

    @OneToMany
    @JoinColumn(name = "topicId")
    List<PostEntity> postList;

    public TopicEntity(Long id, String title, String description, List<PostEntity> postList) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.postList = postList;
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

    public List<PostEntity> getPostList() {
        return postList;
    }

    public void setPostList(List<PostEntity> postList) {
        this.postList = postList;
    }
}
