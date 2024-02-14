package com.Arraylist;

import java.util.Random;

public class OTP {
	public static void main(String[] args) {
		Random rm=new Random();
		int otp=rm.nextInt(100000,999999);
		System.out.println(otp);
	}

}
