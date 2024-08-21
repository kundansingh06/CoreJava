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
        int N = scan.nextInt();
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < N; i++)
        {
            list.add(i, scan.nextInt());
        }

        int Q = scan.nextInt();
        for (int i = 0; i < Q; i++)
        {
            scan.nextLine();
            String operation = scan.nextLine();

            if ("Insert".equalsIgnoreCase(operation))
            {
                list.add(scan.nextInt(), scan.nextInt());

            }
            else
            {
                list.remove(scan.nextInt());
            }

        }

        for (int i = 0; i < list.size(); i++)
        {
            System.out.print(list.get(i) + " ");
        }
    }
}