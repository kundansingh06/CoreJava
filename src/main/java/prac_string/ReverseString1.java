package prac_string;

public class ReverseString1 {
    public static void main(String[] args) {
        String str="ram";
        String rev="";
        for (int i=str.length()-1;i >=0; i--) {
            rev=rev+str.charAt(i);
        }
        System.out.println(rev);
        System.out.println(new StringBuilder(str).reverse().toString());

        String rev2="";
        char[] array = str.toCharArray();
        for (int i=array.length-1;i>=0;i--) {
            rev2=rev2+array[i];
        }
        System.out.println(rev2);


        System.out.println(revString("abcd"));

    }

    static String revString(String s){
        if(s.length()==0)
            return " ";
        return s.charAt(s.length()-1)+revString(s.substring(0,s.length()-1));
    }
}
