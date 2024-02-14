package com.Game;


import java.util.Random;
import java.util.Scanner;

public class App {
	static Scanner sc=new Scanner(System.in);
 
	static int cnt=0;
	static int s=0;
	static int a;
	static int st;
	static Game gm=new Game();
	public static void main(String[] args) {
		
		boolean b=true;
		while(b) {
			System.out.println("Press 1 for Enter jackpot : ");
			System.out.println("Press 2 for Enter in points : ");
			System.out.println("Press 3 for Add Fund : ");
			System.out.println("Press 4 for To fetch points : ");
			System.out.println("Press 5 to EXIT.......");
			switch(sc.nextInt()) {
			
			case 1:
				System.out.println("Enter Name : ");
				String name=sc.next();
				
				
//				System.out.println(a);
				Random rm = new Random();
				int otp = rm.nextInt(1, 99);
				System.out.println(otp);
				gm.setOtp(otp);
				System.out.println("Enter number : ");
				 a=sc.nextInt();
				if(a==gm.getOtp()) {
					System.out.println("Winner..");
					cnt++;
					st=(Game.pt-150);
					s=st+200;
				}
				else {
					System.out.println("Losser");
				}
//				break;
			case 2:
				if(cnt==1) {
					System.out.println(cnt);
					
				System.out.println("Total Points : "+(s));
				}
				else {
					
					System.out.println("Total Points : "+st);
				}
				break;
			case 3:
				System.out.println("Enter fund : ");
				s=s+sc.nextInt();
				break;
			case 4:
				System.out.println("Points : "+s);
				
			case 5:
				b=false;
				break;
			}}
		}
	}