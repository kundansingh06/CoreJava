package basic.Strings.Java

import java.io.*;
import java.util.*;

public class Solution
{

    public static void main(String[] args)
    {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }

    static boolean isAnagram(String a, String b)
    {

        if (a == null || a.isEmpty())
        {
            return false;
        }

        if (b == null || b.isEmpty())
        {
            return false;
        }

        if (a.length() != b.length())
        {
            return false;
        }

        a = a.toLowerCase();
        b = b.toLowerCase();

        int length = a.length();

        while (!a.isEmpty())
        {
            char temp = a.charAt(0);
            a = a.replaceFirst(String.valueOf(temp), "");
            b = b.replaceFirst(String.valueOf(temp), "");

            if (a.length() == 0 && b.length() == 0)
            {
                return true;
            }
            if (a.length() != 0 && b.length() == 0)
            {
                return false;
            }
            if (a.length() == 0 && b.length() != 0)
            {
                return false;
            }

        }
        return true;
    }
}
