package com.encapsulation;

public class Employee {
	private int empId;
	private String name;
	private String designation;
//	this makes empId same as global empId
	public void setEmpId(int empId) {
		this.empId=empId;
	}
	
	public int getEmpId() {
		return empId;
		
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getName() {
		return name;
		
	}
	
	public void setDesignation(String designation) {
		this.designation=designation;
	}
	
	public String getDesignation() {
		return designation;
		
	}
	
	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.setEmpId(100);
		System.out.println(emp.getEmpId());
		emp.setName("Anish");
		System.out.println(emp.getName());
		emp.setDesignation("Software Developer");
		System.out.println(emp.getDesignation());
	}

}
