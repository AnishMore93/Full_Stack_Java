package com.Instagram.login;
import com.A.Uvw;

public class Abd {
	public static void main(String[] args) {
//		Calling Non static from other class of same package
		Abc obj=new Abc();
		obj.m1();
//		calling static from other class of same package
		Abc.m2();
//		Calling Non static from other class of different package
		Uvw obj1=new Uvw();
		obj1.m3();
//		Calling static from other class of different package
		Uvw.m4();
	}

}
