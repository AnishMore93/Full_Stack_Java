package com.Lib;

public class Test {
	public static void main(String[] args) {
		Library lb=new Library(1,"Java");
		Library lb1=new Library(2,"CPP");
		Library lb2=new Library(3,"C");
		
		Cart cart=new Cart();
		cart.addIntoCart(lb);
		cart.addIntoCart(lb1);
		
		cart.addIntoCart(lb2);
		cart.displayBooks();
		cart.removeItems(lb1);
		System.out.println("After Remove");
		cart.displayBooks();
	}

}
