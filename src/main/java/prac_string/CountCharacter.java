package prac_string;
import java.util.HashMap;
public class CountCharacter {
    public static void main(String[] args) {
        String s="abkundanabr";
        char[] array = s.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        for (Character ch : array){
            if (map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }
            else{
                map.put(ch,1);
            }
        }
        System.out.println(map);
    }
}
