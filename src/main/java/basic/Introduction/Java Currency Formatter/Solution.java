package basic.Introduction.Java;

import java.util.*;
import java.text.*;

public class Solution {

	public static void main(String[] args) throws ParseException {
		Scanner scanner = new Scanner(System.in);
		double payment = scanner.nextDouble();
		scanner.close();
		// Write your code here.
		Locale indiaLocale = new Locale("en", "IN");
		NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);
		System.out.println("US: " + nf.format(payment));
		nf = NumberFormat.getCurrencyInstance(indiaLocale);
		System.out.println("India: " + nf.format(payment));
		nf = NumberFormat.getCurrencyInstance(Locale.CHINA);
		System.out.println("China: " + nf.format(payment));
		nf = NumberFormat.getCurrencyInstance(Locale.FRANCE);
		System.out.println("France: " + nf.format(payment));
	}
}