age lv.tsi.exam.Entitys;

import PRep.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.List;

@Data
@Entity
public class People {

    @Id
    private Long code;

    private String firstname;
    private String surname;
    private String groupId;

    @OneToMany
    @JoinColumn (name = "pupilId")
    private List<MARK> markList;



}
