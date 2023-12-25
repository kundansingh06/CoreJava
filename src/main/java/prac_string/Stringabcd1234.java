package prac_string;

public class Stringabcd1234 {
    public static void main(String[] args) {
        String s="kundan1 2345";
        String numb="";
        String letter="";
        String whites="";
        char[] arr = s.toCharArray();
        for (Character a:arr){
            if(Character.isDigit(a)){
                numb=numb+a;
            }
            else if (Character.isLetter(a)) {
                letter=letter+a;
            }
            else if (Character.isWhitespace(a)) {
                whites=whites+a;
            }
        }
        System.out.println(numb);
        System.out.println(letter);
        System.out.println(whites);
    }
}
