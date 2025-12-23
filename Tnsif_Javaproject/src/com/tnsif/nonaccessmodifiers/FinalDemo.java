package com.tnsif.nonaccessmodifiers;

class FinalDemo {
	
	final int Var = 100;
	
	void display() {
		System.out.println("show the value of "
				+ "var: "+Var);
	}
	// you cannot use Final method in Subclass
	class Child extends FinalDemo{
	  static int Max = 200;

		void display() {
			System.out.println("show the value of "
					+ "max: "+Max);
		}
	}

	public static void main(String[] args) {
		FinalDemo fd = new FinalDemo();
		fd.display();
		

	}

}
