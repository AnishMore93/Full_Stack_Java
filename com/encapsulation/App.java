package com.encapsulation;

import java.time.LocalTime;
import java.util.Scanner;

public class App {
	static Scanner sc=new Scanner(System.in);
	static Employee1 emp=new Employee1();
	public static void setData() {
		System.out.println("Enter Employee Id:");
		int id=sc.nextInt();
		emp.setEmpId(id);
		System.out.println("Enter Employee name");
		String name=sc.next();
		emp.setName(name);
		System.out.println("Enter Employee Salary");
		double salary=sc.nextDouble();
		emp.setSalary(salary);
		double priceWithGST=salary * 1.18;
		emp.setPriceWithGST(priceWithGST);
		emp.setTime(LocalTime.now());
		emp.setUpdatedStatus("Product is new and not updated after registeration");
		
		}
	public static void getData() {
		System.out.println("******************** Employee Information ****************************");
		System.out.println("Employee Id is: "+ emp.getEmpId());
		System.out.println("Employee Name is: " +emp.getName());
		System.out.println("Employee salary is: " +emp.getSalary());
		System.out.println("Salary with GST"+emp.getPriceWithGST());
		System.out.println("Latest Updated employee information: "+emp.getTime());
		System.out.println("updated status: "+emp.getUpdatedStatus());
		System.out.println("******************** Thank You ***************************************");
	}
	public static void updateData() {
		System.out.println("Press 1 for update id\nPress 2 for update name\nPress 3 for update Salary");
		int ch=sc.nextInt();
		switch(ch) {
		case 1:
			System.out.println("Enter new Employee id: ");
			emp.setEmpId(sc.nextInt());
			emp.setTime(LocalTime.now());
			emp.setUpdatedStatus("id recently updated");
			emp.setPriceWithGST(ch);
			
			break;
		case 2:
			System.out.println("Enter new Employee name: ");
			emp.setName(sc.next());
			emp.setTime(LocalTime.now());
			emp.setUpdatedStatus("name recently updated");
			break;
		case 3:
			System.out.println("Enter new Employee Salary: ");
			double salary=sc.nextDouble();
			emp.setSalary(salary);
			double priceWithGST=sc.nextDouble();
			emp.setPriceWithGST(priceWithGST);
			emp.setTime(LocalTime.now());
			emp.setUpdatedStatus("salary recently updated");
			
			break;
		
		}
	}

}
