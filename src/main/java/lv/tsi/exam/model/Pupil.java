package lv.tsi.exam.model;


import javax.persistence.*;

@Entity
@Table(name="pupil")
public class Pupil {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String surname;

    @Enumerated(EnumType.STRING)
    private PupilClas pupilClas;

    public Pupil(Long id, String name, String surname, PupilClas pupilClas) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.pupilClas = pupilClas;
    }

    public Pupil() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public PupilClas getPupilClas() {
        return pupilClas;
    }

    public void setPupilClas(PupilClas pupilClas) {
        this.pupilClas = pupilClas;
    }
}
