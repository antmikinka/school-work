import java.util.*;
/**
 * Reversing an Array.
 *
 * @author (AM)
 * @version (1/30/20)
 */
public class APCSLab16
{
    private int randInt;//random number
    public static void main(String[] args)
    {
        int user;//user input
        int a = -10;
        int b = 25;
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of the array");//user input
        user = scan.nextInt();
        int[] arr = new int [user];//size of array
        
        for (int i = 0; i < arr.length; i++)//array
        {
           
            arr[i] = (int)(Math.random() * (b-a) + a); 
            System.out.println("Array: " + arr[i]);//print array
        }
            
        for(int x = 0; x < arr.length / 2; x++)//reversed array
        {
         int temp = arr[x];
         arr[x] = arr[arr.length - x - 1];
         arr[arr.length - x - 1] = temp;
         //print r array
        }
        
        for(int i = 0; i < arr.length;i++)
        {
           System.out.println(arr[i]);
        }
        
    }
}

