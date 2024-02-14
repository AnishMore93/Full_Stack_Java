package com.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Compile {
	public static void main(String[] args) {
		try {
			FileInputStream fs=new FileInputStream("\"D:\\TEST.txt\"");
		} catch (FileNotFoundException e) {
			
			System.out.println("File not found");
		}
	}

}
