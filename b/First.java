package com.b;

public class First {
	String pvt="Private";
	String def="Default";
	public String pb="public";
	protected String pt="Protected";
	public static void main(String[] args) {
		First ft=new First();
		System.out.println(ft.pvt);
		System.out.println(ft.def);
		System.out.println(ft.pb);
		System.out.println(ft.pt);
	}

}
