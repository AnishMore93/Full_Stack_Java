package com.enproduct;

import java.util.Scanner;

public class prodata extends data {
	static Scanner sc=new Scanner(System.in);
	static pro pr=new pro();
	static int  rs=0;
	static int a;
	static public void setinfo() {
		System.out.println("Enter Customer Name :");
		pr.setName(sc.next());
		System.out.println("Enter Customer Mobile number :");
		pr.setMobno(sc.nextDouble());
		
		System.out.println("Enter Quantity of product :");
//		pr.setquantity_of_product(sc.nextInt());
		a=sc.nextInt();
		if(a<op.getStock()) {
			
		
//		System.out.println("Amount of product :");
//		pr.setAmount(sc.nextDouble());
		double finalamt=op.getproductprice()*a;	
		pr.setquantity_of_product(a);
		pr.setAmount(finalamt);
		System.out.println("Customer Amount :");
		double totalamt=sc.nextDouble();
		pr.setCust_amt(totalamt);
		if(pr.getAmount()>=a) {
			
//		pr.setCust_amt(sc.nextDouble());
//		System.out.println("Give change to customer :");
//		pr.setCust_change(sc.nextDouble());
		double returnamt=pr.getCust_amt()-finalamt;
		pr.setCust_change(returnamt);
		}
		else {
			System.out.println("Customer has giving less amount than total amount..");
}
		}
		
		else {
			System.out.println("Product is Out of Stock....");
		}

		if(op.getStock()>=a) {
		rs=(op.getStock()-a);
		System.out.println("Remaining Stock:"+rs);

}
		
	}
//==========================================================
	
	static public void getinfo() {
		System.out.println("Customer Name :"+pr.getName());
		System.out.println("Customer Mobile Number :"+pr.getMobno());
		System.out.println("Quantity of product :"+pr.getquantity_of_product());
		System.out.println("Amount of product :"+pr.getAmount());
		System.out.println("Customer given Amount :"+pr.getCust_amt());
		System.out.println("Give Change to Customer :"+pr.getCust_change());
		
		System.out.println("Remaing stock :"+rs);
	}
	

}