package home_work_20;

import home_work_20.entity.Student;
import home_work_20.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args) {
        Session session=new HibernateUtil().getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(new Student("Name","gmail.com"));
        transaction.commit();
    }
}
