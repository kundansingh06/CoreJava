package basic.Strings.Java

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
  
    public static String getSmallestAndLargest(String s, int k) {
       String smallest = "";
		String largest = "";
		
		int lenght = s.length();

		SortedSet<String> sorted = new TreeSet<String>();
		for(int i = 0;i <= lenght-k;i++){
			 sorted.add(s.substring(i, k+i));
		}
		
		smallest = (String) sorted.toArray()[0];
		largest = (String) sorted.toArray()[sorted.toArray().length-1];
		// Complete the function
		// 'smallest' must be the lexicographically smallest substring of length
		// 'k'
		// 'largest' must be the lexicographically largest substring of length
		// 'k'

		return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}