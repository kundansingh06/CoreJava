package prac_number;
public class ArmstrongNumber {
    public static void main(String[] args) {
        int num = 153;
        int r=0;
        int arm = 0;
        int originalNum = num;

        while (num>0) {
            r = num % 10;
            arm=arm+(r*r*r);
            num=num/10;
        }
        if(arm == originalNum)
            System.out.println(originalNum+ " is an Armstrong number");
        else
            System.out.println(originalNum+ " is not an Armstrong number");
    }
}
