package concurrentHashMap_cowa_ls;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
public class CountOccuranceOfChar1 {
	public static void main(String args[]) {
		String str = "google";
		char[] strArray = str.toCharArray();
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (char c : strArray) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}
		System.out.println(map);
		Map<String, Long> map2 = Arrays
				.stream(str.split(""))
				.collect(Collectors.groupingBy(c -> c, Collectors.counting()));
		System.out.println(map2);
	}
}