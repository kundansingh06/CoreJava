package concurrentHashMap_cowa_ls;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
public class With_CopyOnWriteArraySet {
	public static void main(String[] args) {
		Set<String> set = new CopyOnWriteArraySet<String>();
		set.add("A");
		set.add("B");
		set.add("C");
		set.add("A");
		set.add("B");
		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
			String element = itr.next();
			if (element.equals("A")) {
				set.add("ADDING");
			}
		}
		System.out.println(set);
	}
}
