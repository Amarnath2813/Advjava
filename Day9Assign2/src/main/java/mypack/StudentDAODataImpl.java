package mypack;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StudentDAODataImpl implements StudentDAO{

	@Override
	public void addStudent(Student student) {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		Transaction tr = session.getTransaction();
        boolean existingTransaction = tr.isActive();

        // If there is no active transaction, begin a new one
        if (!existingTransaction) {
            tr = session.beginTransaction();
            session.persist(student);
    		tr.commit();
        }

	
		
	     session.close();
	     
		
	}

}
