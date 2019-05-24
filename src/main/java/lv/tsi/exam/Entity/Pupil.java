package lv.tsi.exam.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Pupil {

    @Id
    private Long code;

    private String firstname;
    private String surname;
    private String groupId;

    @OneToMany
    @JoinColumn (name = "pupilId")
    private List<Mark> markList;



}
