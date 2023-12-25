package MAP_EXAMPLE;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Stream;
public class Way_To_Access_Map {
	public static void main(String[] arguments) {
		Map<Integer, String> hash_map = new HashMap<Integer, String>();
		hash_map.put(1, "Thor");
		hash_map.put(2, "Iron man");
		// 1st way for each loop & enrtySet()
		for (Entry<Integer, String> entry : hash_map.entrySet()) {
			System.out.println(entry.getKey() + " = " + entry.getValue());
		}
		// 2nd way for each loop & keySet()
		for (Integer k : hash_map.keySet()) {
			String v = hash_map.get(k);
			System.out.println("Key = " + k + ", Value = " + v);
		}
		// using keySet() for iteration over keys
		for (Integer name : hash_map.keySet()) {
			System.out.println("key: " + name);
		}
		// using values() for iteration over values
		for (String url : hash_map.values()) {
			System.out.println("value: " + url);
		}
		// 3rd way enrtySet() with Iterator
		Iterator<Entry<Integer, String>> it = hash_map.entrySet().iterator();
		while (it.hasNext()) {
			Entry<Integer, String> entry = (Entry<Integer, String>) it.next();
			System.out.println(entry.getKey() + " = " + entry.getValue());
		}
		// Using keySet() and iterator
		Iterator itr2 = hash_map.keySet().iterator();
		while (itr2.hasNext()) {
			Integer key = (Integer) itr2.next();
			hash_map.get(key);
		}
		hash_map.entrySet().stream().forEach(input -> System.out.println(input.getKey() + " : " + input.getValue()));
		// 2nd Way iterating it using forEach.
		hash_map.forEach((key, value) -> System.out.println(key + " = " + value));
		hash_map.forEach((k, v) -> {
			System.out.println("Key : " + k + "   Value : " + v);
		});
		hash_map.entrySet().forEach((entry) -> {
			System.out.println("Key : " + entry.getKey() + "   Value : " + entry.getValue());
		});
		Stream.of(hash_map.entrySet()).forEach((entry) -> {
			System.out.println(entry);
		});
	}
}
