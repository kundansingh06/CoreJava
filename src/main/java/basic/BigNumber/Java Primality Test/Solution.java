package basic.BigNumber.Java

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		BigInteger n = in.nextBigInteger();
		in.close();
		// Write your code here.

		if (n.isProbablePrime(1)) {
			System.out.println("prime");
		} else {
			System.out.println("not prime");
		}
	}
}