package org.jsp.emp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class addEmployee {
	public static void main(String[] args) {
		Configuration conf = new Configuration();
		conf.configure();
		SessionFactory sef = conf.buildSessionFactory();
		Session ses = sef.openSession();
		Transaction tran = ses.getTransaction();
		tran.begin();
		Employee e = new Employee();
		e.setName("Badal Kumar");
		e.setPhone(8607490654l);
		e.setEmail("kumar@gmail.com");
		e.setDesignation("UI/UX Developer");
		e.setPassword("admin");
		e.setSalary(39000);
		ses.save(e);
		tran.commit();
		
		tran.begin();
		Employee e1 = new Employee();
		e1.setName("Himanshu Soni");
		e1.setPhone(7896543789l);
		e1.setEmail("himanshu@gmail.com");
		e1.setDesignation("Data Analyst");
		e1.setPassword("admin");
		e1.setSalary(25000);
		ses.save(e1);
		tran.commit();
	}
}
