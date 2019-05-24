package lv.tsi.exam.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class commentEntity {
    @Id
    @GeneratedValue
    private Long Id;
    String body;
    Long posts;

    public commentEntity(Long id, String body, Long posts) {
        Id=id;
        this.body=body;
        this.posts=posts;

    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id=id;
    }
    public String getBody() {
        return body;
    }
    public void setBody(String body) {
        this.body=body;
    }
    public Long getPosts() {
        return posts;
    }
    public void setPosts(Long posts) {
        this.posts=posts;
    }
}
