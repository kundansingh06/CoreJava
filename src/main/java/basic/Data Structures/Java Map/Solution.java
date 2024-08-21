package basic.Data// Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution
{
    public static void main(String[] argh)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String, Integer> phoneBook = new HashMap<String, Integer>();
        for (int i = 0; i < n; i++)
        {
            in.nextLine();
            String name = in.nextLine();
            int phone = in.nextInt();
            // Write code here
            phoneBook.put(name.trim().toLowerCase(), phone);
        }

        in.nextLine();
        while (in.hasNext())
        {

            String s = in.nextLine();

            s = s.trim().toLowerCase();
            if (phoneBook.containsKey(s))
            {
                System.out.println(s + "=" + phoneBook.get(s));
            }
            else
            {
                System.out.println("Not found");
            }
        }
        in.close();
    }
}