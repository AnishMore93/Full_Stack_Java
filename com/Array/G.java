package com.Array;

public class G {
	public double getAvg(int a[]) {
		int avg = 0;
		int sum= 0;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
		avg=sum/a.length;
		
		return avg;
		
	}
	public static void main(String[] args) {
		G ag=new G();
		int b[]= {10,20,30,40,50};
		System.out.println(ag.getAvg(b));
		
	}

}
