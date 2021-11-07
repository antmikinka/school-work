import java.util.*;
/**
 * Implementing arrays.
 *
 * @author (AM)
 * @version (2/10/20)
 */
public class APCSLab18
{
    public static void main(String[] args)
    {
        int sz, a = 0 , b = 25;
        int [] count = new int [26];
        int index;
        Scanner scan = new Scanner(System.in);
        System.out.println("How many numbers do you want generated?");
        sz = scan.nextInt();
        int[] ar = new int[sz];
        System.out.println("\t\tData Generated");
        System.out.println("\t     Integer\t Number of Occurrences");
        for(int i = 0; i < ar.length; i++)//calculates random numbers
        {
           ar[i] = (int) (Math.random() * (26 - 0) + 0);
           index = ar[i];
           count[index]++;
           System.out.println("\t     "+ ar[i]);
           
        }
        for(int i = 0; i < count.length; i++)
        {
          System.out.println(i + " Occurrences " + count[i]);   
        }
    }
} 
