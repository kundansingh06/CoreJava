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
        // Take the input
        int[] arr = new int[N];

        for (int i = 0; i < N; i++)
        {
            arr[i] = scan.nextInt();
        }

        int count = 0;
        for (int i = 0; i < N; i++)
        {

            if (arr[i] < 0)
            {
                count++;
            }
            int sum = arr[i];
            for (int j = i + 1; j < N; j++)
            {
                sum = sum + arr[j];

                if (sum < 0)
                {
                    count++;
                }
            }

        }

        System.out.println(count);

    }
}
