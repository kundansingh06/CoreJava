package basic.Introduction.Java;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i = 1;
		while (scan.hasNext()) {
			// scan.nextLine();
			System.out.printf("%d %s\n", i, scan.nextLine());
			i++;
		}
	}
}