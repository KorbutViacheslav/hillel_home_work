package home_work_20.dao;

import home_work_20.entity.Student;

import java.util.List;

public interface DaoStudent {
    void addStudent(Student student);

    void deleteStudent(Long id);

    void updateStudent(Student student);

    List<Student> getAllStudent();

    Student getStudent(Long id);

}
