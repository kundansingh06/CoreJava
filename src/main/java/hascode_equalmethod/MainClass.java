package hascode_equalmethod;
import java.util.HashMap;
//https://javainfinite.com/java/what-happens-if-we-do-not-override-hashcode-and-equals-in-hashmap/
public class MainClass {
	public static void main(String[] args) {
		Emp e1 = new Emp(100, "A");
		Emp e2 = new Emp(100, "B");
		Emp e3 = new Emp(101, "C");
		Emp e4 = new Emp(100, "D");
		HashMap<Emp, String> map = new HashMap<Emp, String>();
		map.put(e1, "A");
		map.put(e2, "B");
		map.put(e3, "C");
		map.put(e4, "D");
		System.out.println(map.size());
		System.out.println("Both Objects are Equal: " + e1.equals(e2));
		System.out.println("Employee 1 Hashcode: " + e1.hashCode());
		System.out.println("Employee 2 Hashcode: " + e2.hashCode());
		map.forEach((k, v) -> System.out.println("Key is: " + k + " Value is: " + v));
		        for (Emp mm : map.keySet()) {
		            System.out.println(map.get(mm).toString());
		            
		        }
	}
}
