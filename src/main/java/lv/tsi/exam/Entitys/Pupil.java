package lv.tsi.exam.Entitys;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.List;

@Data
@Entity
public class Pupil {//Класс Ученик

    @Id
    private Long code;

    private String firstname; // Имя
    private String surname; // Фамилия
    private String groupId; // Id группы

    @OneToMany
    @JoinColumn (name = "pupilId")
    private List<Mark> markList;



}
