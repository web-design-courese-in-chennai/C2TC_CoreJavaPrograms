package com.tnsif.oops.inheritance.multipleinheritance;

interface Car{
	void horn();
}
interface Dog{
	void bark();

}
class Sound implements Car,Dog{
	
	@Override
	
	public void horn() {
		System.out.println("Horn Horn!");
	}
	public void bark() {
		System.out.println("bark bark!");
	}
	
}

public class MultipleInheritanceDemo {

	public static void main(String[] args) {
		Sound s = new Sound();
		s.bark();
		s.horn();

	}

}
