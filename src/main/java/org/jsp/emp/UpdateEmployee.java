package org.jsp.emp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateEmployee {
	public static void main(String[] args) {
		Configuration conf = new Configuration();
		conf.configure();
		SessionFactory sef = conf.buildSessionFactory();
		Session ses = sef.openSession();
		Transaction tran = ses.getTransaction();
		tran.begin();
		Employee e = new Employee();
		e.setId(7);
		e.setName("Manu Soni");
		e.setPhone(9485688456l);
		e.setEmail("manusoni@gmail.com");
		e.setDesignation("Engineer");
		e.setPassword("admin");
		e.setSalary(47000);
		ses.saveOrUpdate(e);
		tran.commit();
	}
}
