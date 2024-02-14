package com.abstraction;
//Abstract Class

public abstract class College {
	public void ClassName() {
		System.out.println("FY");
	}
	public abstract void getDep();
	public abstract void getTeacher();
	public static void main(String[] args) {
		FY obj=new FY();
		obj.getDep();
		obj.getTeacher();
		
	}

}
