package concurrentHashMap_cowa_ls;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class Without_CopyOnWriteArrayList {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("A");
		list.add("B");
		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			String element = itr.next();
			if (element.equals("A")) {
				list.add("AA");
			}
		}
		System.out.println(list);
	}
}
