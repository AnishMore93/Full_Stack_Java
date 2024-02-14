package com.Exam;

public class Circle implements Shape{

	@Override
	public double calculateArea() {
		
		return Area();
	}

	public double Area() {
		
		double r=5;
		return 3.14*r*r;
	}
	
	

}
