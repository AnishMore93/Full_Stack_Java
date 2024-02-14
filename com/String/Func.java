package com.String;

public class Func {
	public static void main(String[] args) {
		String a="  Abc  ";
		String b="ac";
		System.out.println(a.contentEquals(b));
		System.out.println(a.toLowerCase());
		System.out.println(a.charAt(0));
		System.out.println(a.compareTo(b));
		System.out.println(a.endsWith(b));
		System.out.println(a.indexOf('A'));
		System.out.println(a.replace('A', 'b'));
		System.out.println(a);
		System.out.println(a.codePointAt(0));
//		Prints Unicode value
		System.out.println(a.compareToIgnoreCase(b));
		System.out.println(a.concat(b));
		System.out.println(a.contains(b));
		System.out.println(a.equals(b));
		System.out.println(a.equalsIgnoreCase(b));
		System.out.println(a.formatted(b));
		System.out.println(a.isBlank());
		System.out.println(a.trim());
		System.out.println(a.getClass());
		System.out.println(a.indent(2));
		System.out.println(a.hashCode());
		System.out.println(a.stripLeading());
		System.out.println(a.toCharArray());
		System.out.println(a.matches(b));
		System.out.println(a.codePoints());
		System.out.println(a.getBytes());
		
		
		
	}
	

}
