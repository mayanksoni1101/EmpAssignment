package org.jsp.emp;

import java.util.Scanner;

import javax.persistence.NoResultException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class VerifyEmployeeWithEmailAndPassword {
	public static void main(String[] args) {
		Configuration conf = new Configuration();
		conf.configure();
		SessionFactory sef = conf.buildSessionFactory();
		Session ses = sef.openSession();
		Scanner sc = new Scanner(System.in);
		Query<Employee> q = ses.createQuery("select e from Employee e where email=?1 and password=?2" , Employee.class);
		System.out.println("Enter Email ID Of Employee = ");
		q.setParameter(1, sc.next());
		System.out.println("Enter password = ");
		q.setParameter(2, sc.next());
		try {
			Employee e = q.getSingleResult();
			System.out.println(e);
		}
		catch(NoResultException e) {
			System.err.println("No Record Found !!!");
		}
		finally {
			sc.close();
		}
}}
