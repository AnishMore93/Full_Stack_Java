package com.Exam;

public class Rectangle implements Shape{

	@Override
	public double calculateArea() {
		
		return Area();
	}
	
	public double Area() {
		int length=10;
		int breadth=5;
		int height=3;
		return length*breadth*height;
		
	}
	
	

}
