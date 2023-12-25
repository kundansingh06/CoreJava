package concurrentHashMap_cowa_ls;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
public class With_CopyOnWriteArrayList {
	public static void main(String[] args) {
		List<String> list = new CopyOnWriteArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("A");
		list.add("B");
		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			String element = itr.next();
			if (element.equals("A")) {
				list.add("ADDING");
			}
		}
		System.out.println(list);
	}
}
