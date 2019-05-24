package lv.tsi.exam.Entity;


import javax.persistence.*;
import java.util.List;

@Entity
public class CatEntity {
    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String description;

    @OneToMany
    @JoinColumn(name="topicId")
    private List<UserEntity> userList;

    public CatEntity(Long id, String title, String description, List<UserEntity> userList) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.userList = userList;
    }

    public CatEntity() {
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

    public List<UserEntity> getPostList() {
        return userList;
    }

    public void setPostList(List<UserEntity> userList) {
        this.userList = userList;
    }
}