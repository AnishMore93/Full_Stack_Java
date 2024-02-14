package com.enproduct;
import java.time.LocalDateTime;

import java.util.*;
public class data {
	static Scanner sc= new Scanner (System.in);
	static product op=new product();

	
	static public void setdata() {
		System.out.println("Enter  Product Id :");
		op.setProductId(sc.nextInt());
		System.out.println("Enter for Product Name :");
		op.setProductName(sc.next());
		System.out.println("Enter for Product price :");
//		op.setProductprice(sc.nextDouble());
		double productprice=sc.nextDouble();
		op.setProductprice(productprice);
		double pricewithGST=productprice*1.18;
//		double productwithGST=sc.nextDouble();
		op.setPricewithGST(pricewithGST);
		op.setUpdatedstatus("= New Product");
		op.setLocalTime(LocalDateTime.now());
		System.out.println("Enter Stock.");
		op.setStock(sc.nextInt());
		System.out.println("Stock ="+op.getStock());

	}
	static public void updatedata() {
		System.out.println("Press 1 for update product Id ");
		System.out.println("Press 2 for update product Name ");
		System.out.println("Press 3 for update product price ");
		int ch=sc.nextInt();
		switch(ch) {
		case 1:
			System.out.println("Enter New Product Id:");
			op.setProductId(sc.nextInt());
//			System.out.println("Id update "+LocalDateTime.now());
			op.setLocalTime(LocalDateTime.now());
			op.setUpdatedstatus("Id Updated");


		break;
		case 2:
			System.out.println("Enter New Product Name:");
			op.setProductName(sc.next());
//			System.out.println("Id update "+LocalDateTime.now());
			op.setLocalTime(LocalDateTime.now());
			op.setUpdatedstatus("Name Updated");



		break;
		case 3:
			System.out.println("Enter New Product Price:");
			double productprice=sc.nextDouble();
//			op.setPricewithGST();
			op.setPricewithGST(productprice);
			double pricewithGST=sc.nextDouble();
			
			op.setPricewithGST(pricewithGST);
//			op.setProductprice(sc.nextDouble());
			op.setLocalTime(LocalDateTime.now());
//			System.out.println("Id update "+LocalDateTime.now());
			op.setUpdatedstatus("Price Updated");


		break;
			
		}

	}
	static public void getdata() {
		System.out.println("Product Id="+op.getproductId());
		System.out.println("Product Name="+op.getproductName());
		System.out.println("Product price="+op.getproductprice());
		System.out.println("Product price with GST="+op.getPricewithGST());
		System.out.println("Latest Updated Time="+op.getlocaltime());
		System.out.println("Updated status:"+op.getUpdatedstatus());
		if (op.getStock()>=prodata.a) {
		System.out.println("Stock:"+prodata.rs);}
		else {System.out.println("Stock::"+op.getStock());}

	}

}