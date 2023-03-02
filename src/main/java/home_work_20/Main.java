package home_work_20;

import home_work_20.dao.DaoStudentImplementation;
import home_work_20.entity.Student;

public class Main {
    public static void main(String[] args) {
        var daoStudentImplementation = new DaoStudentImplementation();
        daoStudentImplementation.addStudent(new Student("Ariany", "ariany@gamail.com"));
        daoStudentImplementation.addStudent(new Student("Mike", "mike@gamail.com"));
        daoStudentImplementation.addStudent(new Student("John", "john@gamail.com"));
        System.out.println(daoStudentImplementation.getStudent(1L));
        Student newStudent = new Student(2L, "Karin", "karin@gamail.com");
        daoStudentImplementation.updateStudent(newStudent);
        daoStudentImplementation.getAllStudent().forEach(System.out::println);
        daoStudentImplementation.deleteStudent(3L);
    }
}
