package prac_string;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
public class StringRem {
    public static void main(String[] args) {
        String s="ram 12 7 1 sss";
        String[] s1 = s.split(" ");
        ArrayList<String> al = new ArrayList<String>(Arrays.asList(s1));
        al.remove("ram");
        al.remove("sss");
        int sum=0;
        for (String a:al){
            int i = Integer.parseInt(a);
            sum=sum+i;
        }
        System.out.println(sum);
    }
}
