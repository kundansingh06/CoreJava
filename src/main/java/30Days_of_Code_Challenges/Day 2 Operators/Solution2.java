import java.util.*;

public class Arithmetic {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double mealCost = scan.nextDouble(); // original meal price
		int tipPercent = scan.nextInt(); // tip percentage
		int taxPercent = scan.nextInt(); // tax percentage
		scan.close();

		double extra = (mealCost * ((double) tipPercent / 100))
				+ (mealCost * ((double) taxPercent / 100));

		mealCost = mealCost + extra;

		// Write your calculation code here.

		// cast the result of the rounding operation to an int and save it as
		// totalCost
		int totalCost = (int) Math.round(mealCost);

		// Print your result
		System.out.printf("The total meal cost is %d dollars.", totalCost);
	}
}