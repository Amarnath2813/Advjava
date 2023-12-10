package mypack;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class Main {
	public static void main(String args[]) {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		Transaction tr =session.beginTransaction();
		Student s=new Student();
		s.setName("Amarnath");
		s.setAge(21);
		s.setAddress("Mumbai");
		session.persist(s);
		tr.commit();
		factory.close();
		System.out.println("Done with student data entry");
		

	}

}
