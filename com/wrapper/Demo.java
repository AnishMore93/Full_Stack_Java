package com.wrapper;

public class Demo {
//	Primitive to object
	int a=10;
	Integer i=Integer.valueOf(a);

	byte h=10;
	Byte j=Byte.valueOf(h);
	
	boolean b=true;
	Boolean bi=Boolean.valueOf(b);
	
//	Object to primitive
	Integer x=20;
	int g=x.intValue();

	Byte k=10;
	byte l=k.byteValue();
	
	Boolean bk=false;
	boolean bt=bk.booleanValue();
	
//	primitive to string
	
	int z=10;
	String o=Integer.toString(a);
	
	boolean bl=true;
	String st=Boolean.toString(bl);
	
//	string to primitive
	
	String p="10";
	int op=Integer.parseInt(p);
	
	String sr="100";
	boolean bn=Boolean.parseBoolean(sr);
	
//	Object to String
	Integer hk=10;
	String yt=hk.toString();
	
	Float fl=3f;
	String sg=fl.toString();
	
//	String to Object
	String kl="10";
	Integer po=Integer.parseInt(kl);
	
	String si="10";
	Float fo=Float.parseFloat(si);
	
}
