import java.util.*;
/**
 * Using predefined classes to create random numbers.
 *
 * @author (AM)
 * @version (10/14/19)
 */
public class APCSLab7
{
    public static void main(String []args)
    {
       int a, b, c;//instalizes variables
       double avg;//instalizes average 
       Random rand = new Random();
       a = rand.nextInt(50 - 15) + 15;//prints first random number
       b = 175 + (int)(Math.random() * (200-175)+1);//calculates the random number between 200-175
       c = rand.nextInt(5) - 30;//prints third random number
       System.out.println("The first random number is " + a);//prints first number
       System.out.println("The second random number is " + b);//prints second number
       System.out.println("The third random number is " + c);//prints third number
       avg = (a + b + c) / 3;//calculates average
       System.out.println("The average is " + avg);//prints the average
    }
}
