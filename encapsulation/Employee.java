package com.encapsulation;

public class Employee {
	private int empId;
	private String name;
	private String designation;
	public void setEmpId(int empId) {
		this.empId=empId;
	}
	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.setEmpId(100);
	}

}
