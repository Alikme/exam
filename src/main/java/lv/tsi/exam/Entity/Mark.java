package lv.tsi.exam.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Mark
{
    @Id
    private Long id;
    private Long markValue;
    private Long pupilId;
    private String subject;

}
