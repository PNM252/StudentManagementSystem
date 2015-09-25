package app.service;

import app.domain.Term;

import java.util.List;

public interface TermService {

    public void addTerm(Term term);

    public List<Term> listTerm();

    public void removeTerm(Integer termID);

    public void editTerm(Term term);

    public Term getTerm(Integer termID);

}
