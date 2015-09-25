package app.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "DISCIPLINE")
public class Discipline {

    @Id
    @Column(name = "DISCIPLINE_ID")
    @GeneratedValue
    private Integer disciplineID;

    @Column(name = "DISCIPLINENAME")
    private String disciplinename;

    @ManyToMany(cascade = CascadeType.ALL,fetch=FetchType.EAGER, mappedBy = "disciplines")
    List<Term> term = new ArrayList<Term>();

    @Override
    public String toString(){
        return getDisciplineID() + " " + getDisciplinename();
    }

    public Integer getDisciplineID() {
        return disciplineID;
    }

    public void setDisciplineID(Integer disciplineID) {
        this.disciplineID = disciplineID;
    }

    public String getDisciplinename() {
        return disciplinename;
    }

    public void setDisciplinename(String disciplinename) {
        this.disciplinename = disciplinename;
    }

}
