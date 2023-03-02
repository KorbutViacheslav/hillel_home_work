package home_work_20.dao;

import home_work_20.entity.Student;
import home_work_20.util.HibernateSession;
import lombok.Cleanup;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

public class DaoStudentImplementation implements DaoStudent {
    @Override
    public void addStudent(Student student) {
        @Cleanup
        Session session = HibernateSession.getSessionFactory().openSession();
        var transaction = session.beginTransaction();
        session.save(student);
        transaction.commit();
    }

    @Override
    public void deleteStudent(Long id) {
        @Cleanup
        Session session = HibernateSession.getSessionFactory().openSession();
        var transaction = session.beginTransaction();
        Student student = session.get(Student.class, id);
        session.delete(student);
        transaction.commit();
    }

    @Override
    public void updateStudent(Student student) {
        @Cleanup
        Session session = HibernateSession.getSessionFactory().openSession();
        var transaction = session.beginTransaction();
        session.update(student);
        transaction.commit();
    }

    @Override
    public List<Student> getAllStudent() {
        @Cleanup
        Session session = HibernateSession.getSessionFactory().openSession();
        Query query = session.createQuery("FROM Student ");
        return query.list();
    }

    @Override
    public Student getStudent(Long id) {
        @Cleanup
        Session session = HibernateSession.getSessionFactory().openSession();
        return session.get(Student.class, id);
    }
}
