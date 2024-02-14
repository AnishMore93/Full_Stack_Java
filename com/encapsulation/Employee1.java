package com.encapsulation;

import java.time.LocalTime;

public class Employee1 {
	private int empId;
	private String name;
	private double salary;
	private LocalTime time;
	private String UpdatedStatus;
	private double priceWithGST;

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
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public double getSalary() {
		return salary;
	}
	

	public void setPriceWithGST(double priceWithGST) {
		this.priceWithGST = priceWithGST;
	}
	
	public double getPriceWithGST() {
		return priceWithGST;
	}


	public void setTime(LocalTime time) {
		this.time = time;
	}
	

	public LocalTime getTime() {
		return time;
	}


	public void setUpdatedStatus(String updatedStatus) {
		UpdatedStatus = updatedStatus;
	}
	
	public String getUpdatedStatus() {
		return UpdatedStatus;
	}



	


}
