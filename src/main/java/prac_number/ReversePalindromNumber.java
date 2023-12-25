package prac_number;
public class ReversePalindromNumber {
    public static void main(String args[]) {
		int num = 121;
		int rev = 0;
		while (num > 0){
			rev = rev*10 + num % 10 ;
			num = num/10;
		}
		System.out.println(rev);


		System.out.println(new StringBuilder(String.valueOf(12345)).reverse());
		System.out.println(new StringBuilder().append(12345).reverse());


    }
}
