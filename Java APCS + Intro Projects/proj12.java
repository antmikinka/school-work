import java.util.*;

/**
 * Using predefined classes to create multiple random numbers.
 *
 * @author (Anthony Mikinka)
 * @version (se8, 5/1/19)
 */
public class proj12
{
    public static void main(String[] args){
        Random generator = new Random();
        
        int firstRan, secRan, thirdRan;
        
        int a = 50;
        
        int b = 10;
        
        int c = 200;
        
        int d = 150;
        
        int e = 5;
        
        int f = -20;
        
        double avg;
       
        firstRan = generator.nextInt(50) + 10;
        
        System.out.println("The first random number is: " + firstRan);
        
        secRan = d + (int)(Math.random() * (c-d)+1);
         
        System.out.println("The second random number is: " + secRan);
        
        thirdRan = generator.nextInt(5) - 20;
        
        System.out.println("The third random number is: " + thirdRan);
        
        avg = thirdRan + secRan + firstRan / 3.0;
        
        System.out.println("The average of all three random numbers is: " + avg);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}