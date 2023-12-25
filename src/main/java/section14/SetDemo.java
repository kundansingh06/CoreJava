package section14;
import java.util.HashSet;
import java.util.Set;
public class SetDemo {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("Dinesh");
		set.add("Nirmal");
		set.add("Binod");
		set.add("Anand");
		set.add("Rajendra");
		set.add("Nirmal");
		set.add("nirmal");
		for (String str : set) {
			System.out.println(str);
		}
		System.out.println(set.contains("nirmal"));
		System.out.println(set.contains(123));
	}
}
