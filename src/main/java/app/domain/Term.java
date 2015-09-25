package app.domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "TERM")
public class Term {

    @Id
    @Column(name = "TERM_ID")
    @GeneratedValue
    private Integer termID;

    @Column(name = "DURATION")
    private String duration;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name="TERM_DISCIPLINE",
            joinColumns={@JoinColumn(name="TERM_ID")},
            inverseJoinColumns={@JoinColumn(name="DISCIPLINE_ID")})
    List<Discipline> disciplines;

    @Override
    public String toString() {
        return getTermID() + " " + getDuration();
    }

    public Integer getTermID() {
        return termID;
    }

    public void setTermID(Integer termID) {
        this.termID = termID;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }


    public List<Discipline> getDisciplines() {
        return disciplines;
    }

    public void setDisciplines(List<Discipline> disciplines) {
        this.disciplines = disciplines;
    }

}
