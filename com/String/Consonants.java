package com.String;

public class Consonants {

public static String letterCount(String my) {
	int Vcount=0;
	int Ccount=0;
	for(int i=0;i < my.length();i++) {
		char x=my.charAt(i);
		if(x=='a'|| x=='e'||x=='i'||x=='o'||x=='u'||x=='A'||x=='E'||x=='I'||x=='O'||x=='U' ) {
			Vcount++;
			}
		else if(Character.isSpace(my.charAt(i))||Character.isDigit(my.charAt(i))) {
			
		}
		else if(Character.isDigit(my.charAt(i))||!Character.isLetter(my.charAt(i))) {
			
		}
		else {
				Ccount++;
				}
		}
	return "Number of Consonants: "+Ccount+" Number of Vowels: "+Vcount;
	}
public static void main(String[] args) {
	System.out.println(Consonants.letterCount("anish more"));
	
}


}
