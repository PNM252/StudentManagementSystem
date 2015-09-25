package app.dao;

import app.domain.Term;

import java.util.List;

public interface TermDAO {

    public void addTerm(Term term);

    public List<Term> listTerm();

    public void editTerm(Term term);

    public void removeTerm(Integer termID);

    public Term getTerm(Integer termID);
}
