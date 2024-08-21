package basic.Data

import java.util.*;

class Solution
{

    public static void main(String[] argh)
    {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext())
        {
            String input = sc.next();
            int Length = input.length();
            Stack<Character> stack = new Stack<Character>();
            boolean valid = true;
            for (int i = 0; i < Length; i++)
            {
                char c = input.charAt(i);
                if (c == '{' || c == '(' || c == '[')
                {
                    stack.push(c);
                }
                else
                {

                    if (stack.isEmpty())
                    {
                        valid = false;
                        break;
                    }
                    int poped = stack.pop();
                    if ((c == '}' && poped == '{') || (c == ')' && poped == '(') || (c == ']' && poped == '['))
                    {
                        valid = true;
                    }
                    else
                    {
                        valid = false;
                        break;
                    }
                }
            }
            if (valid && stack.isEmpty())
            {
                System.out.println("true");
            }
            else
            {
                System.out.println("false");
            }
        }

    }
}