package com.Game;


import java.util.Random;

public class Game {
	private int otp;
	static int pt=1000;
	
	public void WinLos() {
		Random rm=new Random();
		 setOtp(rm.nextInt(1,2));
		 
		
	}
	

	public void setOtp(int otp) {
		this.otp = otp;}
	
	public int getOtp() {
		return otp;
	}
	
//	
	




}