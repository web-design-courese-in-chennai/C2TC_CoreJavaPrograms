package com.tnsif.interfacedemo;

interface ddd{
	void show();

}
public class InterfaceCode implements ddd{

	@Override
	public void show() {
		System.out.println("Helloo");
		
	}
	
public static void main(String[]args) {
	InterfaceCode i = new InterfaceCode();
	i.show();
}
		
	}

	