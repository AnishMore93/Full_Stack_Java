package com.String;

;

public class Vowels {
	public static int countVowels(String my) {
		
		int count=0;
		for(int i=0;i < my.length();i++) {
			char x=my.charAt(i);
			if(x=='a'|| x=='e'||x=='i'||x=='o'||x=='u'||x=='A'||x=='E'||x=='I'||x=='O'||x=='U' ) {
				count++;
			}
		
	}
		return count;
	
}
	
	public static void main(String[] args) {
		System.out.println(Vowels.countVowels("anish"));
	}
}