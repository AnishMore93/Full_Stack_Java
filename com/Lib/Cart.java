package com.Lib;

import java.util.ArrayList;

public class Cart {
	private ArrayList<Library> list;
	public Cart() {
		list=new ArrayList<Library>();
	}
	public void addIntoCart(Library op) {
		list.add(op);
	}
	public void removeItems(Library op) {
		list.remove(op);
	}
	
	public void displayBooks() {
		for(Library lib:list) {
			System.out.println("Id: "+lib.getId()+" Name: "+lib.getname());
			
		}
		
	}

}
