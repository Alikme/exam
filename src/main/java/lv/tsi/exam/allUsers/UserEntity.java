package lv.tsi.exam.allUsers;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name ="UserEntity")
public class UserEntity {
    @Id
    @GeneratedValue
    private long user_id;
    private String name;
    private String surname;
    private String phone;
    private String book_title;

    public UserEntity(long user_id, String name, String surname, String phone, String book_title) {
        this.user_id = user_id;
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.book_title = book_title;
    }

    public long getUser_id() {
        return user_id;
    }

    public void setUser_id(long user_id) {
        this.user_id = user_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getBook_title() {
        return book_title;
    }

    public void setBook_title(String book_title) {
        this.book_title = book_title;
    }
}
