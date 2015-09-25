package app.dao;

import app.domain.Discipline;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DisciplineDAOImpl implements DisciplineDAO {

    @Autowired
    private SessionFactory sessionFactory;

    public void addDiscipline(Discipline discipline) {
        sessionFactory.getCurrentSession().save(discipline);
    }

    @SuppressWarnings("unchecked")
    public List<Discipline> listDiscipline() {

        return sessionFactory.getCurrentSession()
                .createQuery("from Discipline").list();
    }

    public void removeDiscipline(Integer disciplineID) {
        Discipline discipline = (Discipline) sessionFactory.getCurrentSession()
                .load(Discipline.class, disciplineID);
        if (null != discipline) {
            sessionFactory.getCurrentSession().delete(discipline);
        }
    }

    public void editDiscipline(Discipline discipline) {
        sessionFactory.getCurrentSession().update(discipline);
    }

        public Discipline getDiscipline(Integer disciplineID) {

        return (Discipline) sessionFactory.getCurrentSession().get(
                Discipline.class, disciplineID);
    }

}
