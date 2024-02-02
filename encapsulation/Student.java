package com.encapsulation;

public class Student {
	int rollNo;
	String Department;
	String name;
	
	@Override
//	toString is method of object class
	public String toString() {
		return "Student [rollNo=" + rollNo + ", Department=" + Department + ", name=" + name + "]";
	}
	public static void main(String[] args) {
		Student st=new Student();
		st.name="Anish";
		st.rollNo=10;
		st.Department="CSE";
		System.out.println(st);
	}

}
