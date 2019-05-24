package lv.tsi.exam.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class GroupEntity {

    @Id
    private String id;
    private String programm;

    @OneToMany
    @JoinColumn(name = "groupId")
    private List<Pupil> pupilList;



}
