package com.String;

public class MYImmutability {
	int x;
	MYImmutability(int x){
		this.x=x;
	}
	
	public MYImmutability change(int x) {
		if(this.x==x) {
			return this;
		}else {
			return new MYImmutability(x);
		}
		
		
	}
	
	public static void main(String[] args) {
		MYImmutability mb = new MYImmutability(20);
		System.out.println(mb.x);
		
		System.out.println(mb.change(30));
		mb.change(40);
		System.out.println(mb.x);
		
		
	}
	
	

}
