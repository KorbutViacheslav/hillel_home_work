package home_work_20.dao;

import home_work_20.entity.Student;
import home_work_20.util.HibernateSession;
import lombok.Cleanup;
import org.hibernate.Session;

import java.util.List;

public class DaoStudentImplementation implements DaoStudent {
    @Override
    public void addStudent(Student student) {
        @Cleanup
        Session session = getSession();
        session.save(student);
    }

    @Override
    public void deleteStudent(Long id) {
        @Cleanup
        Session session = getSession();
        var transaction = session.beginTransaction();
        session.delete(session.get(Student.class, id));
        transaction.commit();
    }

    @Override
    public void updateStudent(Student student) {
        @Cleanup
        Session session = getSession();
        var transaction = session.beginTransaction();
        session.update(student);
        transaction.commit();
    }

    @Override
    public List<Student> getAllStudent() {
        @Cleanup
        Session session = getSession();
        return session.createQuery("FROM Student").list();
    }

    @Override
    public Student getStudent(Long id) {
        @Cleanup
        Session session = getSession();
        return session.get(Student.class, id);
    }

    private Session getSession() {
        return HibernateSession.getSessionFactory().openSession();
    }
}
