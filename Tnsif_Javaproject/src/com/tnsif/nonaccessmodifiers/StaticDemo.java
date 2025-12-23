package com.tnsif.nonaccessmodifiers;

public class StaticDemo {
//Static Variable
	static int count;
	// Static Block
	static {
		count=20;
		System.out.println("show the static" + " count assigned:" + count);
	}
	//Static Method
	
	static void show() {
		System.out.println("Methods run in static" + " with count of:" +count);
	}
	public static void main (String[] args){
	System.out.println("static in main"+ " method: "+count);
	show();
	}
}
