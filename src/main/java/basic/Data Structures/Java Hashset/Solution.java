package basic.Data

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution
{

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String[] pair_left = new String[t];
        String[] pair_right = new String[t];

        for (int i = 0; i < t; i++)
        {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }
        HashSet<String> uniquePairs = new HashSet<String>();

        for (int i = 0; i < t; i++)
        {
            String left = pair_left[i];
            String right = pair_right[i];
            uniquePairs.add(left + " " + right);
            System.out.println(uniquePairs.size());

        }
    }
}
