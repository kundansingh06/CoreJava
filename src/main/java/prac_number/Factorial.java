package prac_number;
public class Factorial {
    public static void main(String[] args) {
        Factorial a=new Factorial();
        int fact=a.factorial(4);
        System.out.println(fact);
    }
    public int factorial2(int n) {
        int fact =1;
        for (int i=1;i<n;i++){
            fact =fact*i;
        }
        return 0;
    }
    public int factorial(int n) {
        if (n<0) {
            return -1;
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n-1);
    }

}
