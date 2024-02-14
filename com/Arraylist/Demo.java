package com.Arraylist;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Demo {
	public static void main(String[] args) {
//		ArrayList<String> al=new ArrayList();
//		al.add("Mobile");
//		al.add("TV");
//		al.add("AC");
//		
//		Random rm=new Random();
//		int i=rm.nextInt(al.size());
//		String a=al.get(i);
//		System.out.println(a);
		
		ArrayList<Integer> al=new ArrayList<>();
		al.add(100);
		al.add(200);
		al.add(300);
		al.add(400);
		al.add(500);
		Random rm=new Random();
		Collections.shuffle(al,rm);
		System.out.println(al);
		
	}

}
