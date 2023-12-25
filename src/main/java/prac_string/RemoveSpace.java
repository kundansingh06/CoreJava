package prac_string;

public class RemoveSpace {
    public static void main(String[] args) {
        String str="ram is good";
        System.out.println(str.replaceAll(" ",""));
        String rev="";
        String[] sar = str.split(" ");
        for (String s:sar){
            rev=rev+s;
        }
        System.out.println(rev);

        for (int i = sar.length-1; i>=0; i--) {
            System.out.print(sar[i]+" ");
        }




    }
}
