package home_work_20.dao;

import home_work_20.entity.Student;
import home_work_20.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class DaoStudentImplementation implements DaoStudent{
    @Override
    public void addStudent(Student student) {
        Session session=new HibernateUtil().getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(new Student("Name","gmail.com"));
        transaction.commit();
    }

    @Override
    public void deleteStudent(Long id) {

    }

    @Override
    public void updateStudent(Student student) {

    }

    @Override
    public List<Student> getAllStudent() {
        return null;
    }

    @Override
    public Student getStudent(Long id) {
        return null;
    }
}
