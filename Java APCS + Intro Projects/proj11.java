import java.util.*;
/**
 * using predefined method of the math class to generate numbers.
 *
 * @author (Anthony Mikinka)
 * @version (se8, 5/1/19)
 */
public class proj11
{
    public static void main(String[] args)
    {
       
       int b = 200;
       
       int a = 150;
       
       int firstRandom = a + (int)(Math.random() * (b-a)+1);
       
       int secondRandom = a + (int)(Math.random() * (b-a)+1);
       
       int smallNum = Math.min(firstRandom, secondRandom);
       
       System.out.println("The two random numbers generated are: " + firstRandom + " and " + secondRandom);
       
       System.out.println("The smaller of the two numbers is: " + smallNum);
    }
}



