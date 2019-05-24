package lv.tsi.exam.Entity;

import javax.persistence.*;

import java.util.List;

@Entity
public class SchoolEntity {

    @Id
    Long Id;
    String title;
    String description;

    @OneToMany
    @JoinColumn(name="topicId")
    List<postEntity> PostList;

    public void setId(Long id) {Id=id;}
    public Long getId(){return Id;}
    public List<postEntity> getPostEntity() {return PostList;}
    public SchoolEntity (Long id, String title, String description, List<postEntity> postList) {
        Id=id;
        PostList=postList;}

}
