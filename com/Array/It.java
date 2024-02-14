package com.Array;

import java.util.ArrayList;
import java.util.Iterator;

public class It {
	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add(100);
		list.add(200);
		list.add(300);
		list.add(400);
		
		
		Iterator itr =list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
