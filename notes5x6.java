import java.util.*;
/**
 * Write a description of class notes5x6 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class notes5x6
{

    /**
     * Constructor for objects of class notes5x6
     */
    public notes5x6()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = scan.nextInt();
        if (age == 16)
        {System.out.println("You can drive.");
            System.out.println("You are 16.");
        }else if (age <=16)
        {
            System.out.println("You cant drive.");
        }
        final int SENTINEL = -1;
        int number;
        System.out.println("Enter an int, or -1 to stop > ");
        number = scan.nextInt();
        while (number != SENTINEL)
        {
            System.out.println(number);
            System.out.println("Enter an int, or -1 to stop -1 >");
        }
        System.out.println("Sentinel value detected. Goodbye.");
        
    }      
}