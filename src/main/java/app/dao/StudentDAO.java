package app.dao;

import app.domain.Student;

import java.util.List;

public interface StudentDAO {

    public void addStudent(Student student);

    public List<Student> listStudent();

    public void editStudent(Student student);

    public void removeStudent(int studentID);

    public Student getStudent(int studentID);
}