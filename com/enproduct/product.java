package com.enproduct;
import java.time.LocalDateTime;
//import java.time.LocalDate;
import java.time.LocalTime;

 public  class product {
	 private int productId;
	 private String productName;
	 private double productprice;
	 private LocalDateTime time;
	 private String updatedstatus;
	 private double pricewithGST;
	 private int stock;
	 
	 public void setProductId(int productId) {
		 this.productId=productId;
		 
	 }
	 public int getproductId() {
		 return productId;
	 }
	 public void setProductName(String productName) {
		 this.productName=productName;
		 
	 }
	 public String getproductName() {
		 return productName;
	 }
	 public void setProductprice(double productprice) {
		 this.productprice=productprice;
		 
	 }
	 public double getproductprice() {
		 return productprice;
	 }
	public void setLocalTime(LocalDateTime time) {
		this.time=time;
		
	}
	public LocalDateTime getlocaltime() {
		return time;
	}
	
	public void setUpdatedstatus(String updatedstatus) {
		this.updatedstatus = updatedstatus;
	}
	public String getUpdatedstatus() {
		return updatedstatus;
	}
	
	public void setPricewithGST(double pricewithGST) {
		this.pricewithGST = pricewithGST;
	}
	public double getPricewithGST() {
		return pricewithGST;
	}
	
	public void setStock(int stock) {
		this.stock = stock;
	}
	public int getStock() {
		return stock;
	}

}