package org.jsp.emp;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class FindEmployeeByDesignation {
	public static void main(String[] args) {
		Configuration conf = new Configuration();
		conf.configure();
		SessionFactory sef = conf.buildSessionFactory();
		Session ses = sef.openSession();
		Scanner sc = new Scanner(System.in);
		Query<Employee> q = ses.createQuery("select e from Employee e where designation=?1" , Employee.class);
		System.out.println("Enter designation of the Employee = ");
		q.setParameter(1, sc.nextLine());
		List<Employee> el = q.getResultList();
		if(!el.isEmpty()) {
			for(Employee e : el) {
				System.out.println(e);
			}
		}
		else {
			System.err.println("No Record Found !!!");
		}
		try {}
		finally {
			sc.close();
		}
	}
}
