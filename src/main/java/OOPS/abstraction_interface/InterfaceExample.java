package OOPS.abstraction_interface;

interface I1 {
	int MINAGE=10;
	void print();
	
	default void defaultprint(){
		System.out.println("default method");
	}  
	static void staticprint(){	
		System.out.println("default method");
	}
}
interface I2{  
void print();
	
	default void defaultprint(){
		System.out.println("default method");
	}  
	static void staticprint(){
		
	}
} 
public class InterfaceExample implements I1,I2 {
	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}
	
	/*@Override
	public void defaultprint() {
		// TODO Auto-generated method stub
		I1.super.defaultprint();
	}*/
	
	@Override
	public void defaultprint() {
		// TODO Auto-generated method stub
		I2.super.defaultprint();
	}

	public static void main(String args[]) {
		InterfaceExample i1 = new InterfaceExample();
		i1.print();
		I1.staticprint();
		I2.staticprint();
		

	}

	
}
