import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();

		for (int i = 0; i < N; i++) {
			String s1 = scan.next();
			String odd = "";
			String even = "";
			for (int j = 0; j < s1.length(); j++) {

				if (j % 2 == 1) {
					odd = odd + s1.charAt(j);
				} else {
					even = even + s1.charAt(j);
				}
			}

			System.out.println(even.trim() + " " + odd.trim());
		}
	}
}