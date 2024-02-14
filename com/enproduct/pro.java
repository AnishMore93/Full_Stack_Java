package com.enproduct;

public class pro {
	private String name;
	private double mobno;
	int quantity_of_product;
	private double amount;
	private double cust_amt;
	private double cust_change;
	private int stock;
	private String product;
//================================================
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
//=================================================	
		public void setCust_change(double cust_change) {
		this.cust_change = cust_change;
	}
		public double getCust_change() {
			return cust_change;
		}
//================================================
		public void setMobno(double mobno) {
		this.mobno = mobno;
	}
		public double getMobno() {
		return mobno;
	}
////================================================
		public void setquantity_of_product(int quantity_of_product) {
			this.quantity_of_product=quantity_of_product;
		}
		
		public double getquantity_of_product(){
			return quantity_of_product;
		}
		
////================================================
		public void setAmount(double amount) {
			this.amount = amount;
		}
		
		public double getAmount() {
			return amount;
		}
////================================================

		public void setCust_amt(double cust_amt) {
			this.cust_amt = cust_amt;
		}
		public double getCust_amt() {
			return cust_amt;
		}
////================================================
		
		public void setStock(int stock) {
			this.stock = stock;
		}
		public int getStock() {
			return stock;
		}
//====================================================
		
		public void setProduct(String product) {
			this.product = product;
		}
		public String getProduct() {
			return product;
		}
//=====================================================
		

	

}