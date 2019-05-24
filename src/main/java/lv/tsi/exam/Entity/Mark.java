package lv.tsi.exam.Entitys;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Mark
{
    @Id
    private Long id;
    private Long markValue;
    private Long pupilId;
    private String subject;

}