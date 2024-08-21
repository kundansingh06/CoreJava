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
        Scanner scan = new Scanner(System.in);
        int noOfLines = scan.nextInt();
        List<ArrayList> list = new ArrayList<ArrayList>();
        for (int i = 0; i < noOfLines; i++)
        {

            int size = scan.nextInt();
            List<Integer> list2 = new ArrayList<Integer>();
            for (int j = 0; j < size; j++)
            {
                list2.add(j, scan.nextInt());
            }
            list.add(i, (ArrayList) list2);
        }

        // Queries

        int noOfQueries = scan.nextInt();
        for (int k = 0; k < noOfQueries; k++)
        {
            int x = scan.nextInt();
            int y = scan.nextInt();
            try
            {
                System.out.println(list.get(x - 1).get(y - 1));
            }
            catch (Exception e)
            {
                System.out.println("ERROR!");
            }
        }
    }
}
