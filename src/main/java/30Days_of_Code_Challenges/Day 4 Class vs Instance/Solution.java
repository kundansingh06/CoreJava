import java.util.*;

public class Person
{

    private int age;

    public Person(int initialAge)
    {
        if (initialAge < 0)
        {
            this.age = 0;
            System.out.println("Age is not valid, setting age to 0.");
        }
        else
        {
            this.age = initialAge;
        }
        // Add some more code to run some checks on initialAge
    }

    public void amIOld()
    {
        // Write code determining if this person's age is old and print the correct statement:

        String msg = "";

        if (age < 13)
        {
            msg = "You are young.";
        }
        if (age >= 13 && age < 18)
        {
            msg = "You are a teenager.";
        }
        if (age >= 18)
        {
            msg = "You are old.";
        }
        System.out.println(msg);
    }

    public void yearPasses()
    {
        age++;
        // Increment this person's age.
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++)
        {
            int age = sc.nextInt();
            Person p = new Person(age);
            p.amIOld();
            for (int j = 0; j < 3; j++)
            {
                p.yearPasses();
            }
            p.amIOld();
            System.out.println();
        }
        sc.close();
    }
}
