package lv.tsi.exam.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class BookEntity {

    @Id
    @GeneratedValue
    private Long id;
    private String author;
    private String name;
    private Long Year;

    @OneToMany
    @JoinColumn(name = "bookId")
    private List<UserEntity> userList;

    public BookEntity() {
    }

    public BookEntity(Long id, String author, String name, Long year, List<UserEntity> userList) {
        this.id = id;
        this.author = author;
        this.name = name;
        Year = year;
        this.userList = userList;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getYear() {
        return Year;
    }

    public void setYear(Long year) {
        Year = year;
    }

    public List<UserEntity> getUserList() {
        return userList;
    }

    public void setUserList(List<UserEntity> userList) {
        this.userList = userList;
    }
}
