package app.service;

import app.domain.Student;

import java.util.List;

public interface StudentService {

    public void addStudent(Student student);

    public List<Student> listStudent();

    public void removeStudent(int studentID);

    public void editStudent(Student student);

    public Student getStudent(int studentID);
}
