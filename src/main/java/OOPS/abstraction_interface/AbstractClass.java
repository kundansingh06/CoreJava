package OOPS.abstraction_interface;
abstract class Emp {
	final int age1 = 5;
	int age2 = 10;
	int age3 = 15;
	static int age4 = 20;
	Emp() {
		System.out.println("bike is created");
	}
	abstract void walk();
	void eating() {
		System.out.println("void eating()" + age1+age2+age3);
	}
	static void staticeating() {
		System.out.println("void eating()" + age4);
	}
}
public class AbstractClass extends Emp {
	@Override
	void walk() {
		System.out.println("Impletemented Walk method: " +age1+age2+age3);
	}
	public static void main(String[] args) {
		Emp e = new AbstractClass();
		AbstractClass e1 = new AbstractClass();
		System.out.println(e.age1);
		e.walk();
		e.eating();
		System.out.println(e1.age1);
		e1.walk();
		e1.eating();
	}
}
