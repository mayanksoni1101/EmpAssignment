package org.jsp.emp;

public class Employee {
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", phone=" + phone + ", email=" + email + ", designation="
				+ designation + ", salary=" + salary + ", password=" + password + "]";
	}
	private int id;
	private String name;
	private long phone;
	private String email;
	private String designation;
	private double salary;
	private String password;
	
	//setter methods
	public void setId(int i) {
		id = i;
	}
	public void setName(String n) {
		name = n;	
	}
	public void setSalary(double sal) {
		salary = sal;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	
	//getter methods
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public double getSalary() {
		return salary;
	}
	public long getPhone() {
		return phone;
	}
	public String getEmail() {
		return email;
	}
	public String getDesignation() {
		return designation;
	}
	public String getPassword() {
		return password;
	}
	
}
