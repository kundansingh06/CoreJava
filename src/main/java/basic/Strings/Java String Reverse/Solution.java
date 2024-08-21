package basic.Strings.Java

import java.io.*;
import java.util.*;

public class Solution
{

    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        int lenght = A.length();
        int mid = lenght / 2;

        String isYes = "Yes";
        for (int i = 0; i < mid; i++)
        {
            if (A.charAt(i) == A.charAt(A.length() - i - 1))
            {
                isYes = "Yes";
            }
            else
            {
                isYes = "No";
                break;
            }
        }

        System.out.println(isYes);

    }
}
