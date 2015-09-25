package app.dao;

import app.domain.Discipline;

import java.util.List;

public interface DisciplineDAO {

    public void addDiscipline(Discipline discipline);

    public List<Discipline> listDiscipline();

    public void editDiscipline(Discipline discipline);

    public void removeDiscipline(Integer id);

    public Discipline getDiscipline(Integer disciplineID);


}
