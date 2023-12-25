package section14;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;
public class App {
	class Data<K, V> {
		private K key;
		private V value;
		Data(K key, V value) {
			this.key = key;
			this.value = value;
		}
		public K getKey() {
			return key;
		}
		public V getValue() {
			return value;
		}
		@Override
		public String toString() {
			return "Data [key=" + key + ", value=" + value + "]";
		}
	}
	public static void main(String[] args) {
		// using inner class concept
		Comparator<Data<Integer, String>> COMPARE_KEY = new Comparator<Data<Integer, String>>() {
			@Override
			public int compare(Data<Integer, String> obj1, Data<Integer, String> obj2) {
				if (obj1.getKey() < obj2.getKey())
					return -1;
				else if (obj1.getKey() > obj2.getKey())
					return 1;
				else
					return 0;
			}
		};
		Comparator<Data<Integer, String>> COMPARE_NAME_LENGTH = new Comparator<Data<Integer, String>>() {
			@Override
			public int compare(Data<Integer, String> n1, Data<Integer, String> n2) {
				if (n1.getValue().length() < n2.getValue().length())
					return -1;
				else if (n1.getValue().length() > n2.getValue().length())
					return 1;
				else
					return 0;
			}
		};

//		Set<Data> set = new LinkedHashSet<>();
//		Set<Data> set = new TreeSet<>();

//		Set<Data<Integer, String>> set = new TreeSet<>(COMPARE_KEY);
//
//		set.add(new App().new Data<Integer, String>(1, "One"));
//		set.add(new App().new Data<Integer, String>(2, "Two"));
//		set.add(new App().new Data<Integer, String>(4, "Four"));
//		set.add(new App().new Data<Integer, String>(3, "Three"));
//		set.add(new App().new Data<Integer, String>(4, "Four"));
//
//		for (Data<Integer, String> items : set) {
//			System.out.println(items);
//		}
//		
//		System.out.println("\n----------------\n");
		Set<Data<Integer, String>> set2 = new TreeSet<>(COMPARE_NAME_LENGTH);
		set2.add(new App().new Data<Integer, String>(1, "Chaand"));
		set2.add(new App().new Data<Integer, String>(59, "Ed"));
		set2.add(new App().new Data<Integer, String>(9, "John"));
		set2.add(new App().new Data<Integer, String>(2, "Arnold J"));
		set2.add(new App().new Data<Integer, String>(50, "Mia" + ""));
		for (Data<Integer, String> data : set2) {
			System.out.println(data);
		}
	}

}
