package prac_string;
import java.util.Arrays;
public class CheckAnagrams {
    public static void main(String[] args) {
        assert isAnagrams("Silent", "Listen");
        assert isAnagrams("This is a string", "Is this a string");
        assert !isAnagrams("There", "Their");
    }
    public static boolean isAnagrams(String s1, String s2) {
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        char[] values1 = s1.toCharArray();
        char[] values2 = s2.toCharArray();
        Arrays.sort(values1);
        Arrays.sort(values2);
        //return new String(values1).equals(new String(values2));
        return Arrays.equals(values1,values2);
    }
}
