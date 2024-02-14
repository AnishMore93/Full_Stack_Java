package com.StringBuffer;

public class A {
	public static void main(String[] args) {
		StringBuffer st=new StringBuffer();
		StringBuffer st1=new StringBuffer();
		st.append("Mumbai");
		st1.append("Pune");
		System.out.println(st);
		System.out.println(st1);
		System.out.println(st==st1);
		System.out.println(st.equals(st1));
		System.out.println(st.indexOf("a"));
		String a=st.toString();
		String b=st1.toString();
		System.out.println(a);
		System.out.println(b);
		System.out.println(st.capacity());
//		System.out.println(st.charAt(0));
//		System.out.println(st.codePointAt(1));
//		System.out.println(st.compareTo(st1));
		System.out.println(st.isEmpty());
		System.out.println(st.lastIndexOf(b));
		System.out.println(st.length());
		System.out.println(st.substring(2));
		System.out.println(st.substring(2, 5));
		System.out.println(st.deleteCharAt(1));
		System.out.println(st.repeat(a, 5));
//		System.out.println(st.reverse());
		System.out.println(st.replace(1, 3, b));
		
		
	
	}

}
