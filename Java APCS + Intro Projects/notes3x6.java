import java.util.*;
/**
 * Write a description of class notes3x6 here.
 *
 * @author (Anthony Mikinka)
 * @version (se8, 5/1/19)
 */
public class notes3x6
{
    public static void main(String[] args)
    {
        int a = 1;
        int b = 11;
        int randomNumber;
        randomNumber = a + (int)(Math.random() * (b-a));
        System.out.println("A random number betweeen 1-10: " + randomNumber);
        Scanner scan = new Scanner(System.in);
        int A;
        int B;
        System.out.println("Enter the lower bound");
        A = scan.nextInt();
        System.out.print("Enter the upper bound");
        B = scan.nextInt();
        B += 1;
        randomNumber = a + (int)(Math.random()*(B-A));
        System.out.println("A random number between " + A + " and " + (B-1) + " is " + randomNumber);
        System.out.println("Two random numbers are: ");
        int firstRandom = A + (int)(Math.random() * (B-A));
        int secondRandom = A + (int)(Math.random() * (B-A));
        System.out.println(firstRandom + " " + secondRandom);
        Random generator = new Random();
        int thirdRandom;
        thirdRandom = generator.nextInt();
        System.out.println("A random number " + thirdRandom);
        int fourthRandom;
        fourthRandom = generator.nextInt(100) + 1;
        System.out.println("Random number between 1 and 100 " + fourthRandom);
        
        
        
        
        
        
        
        
        
    }
}
