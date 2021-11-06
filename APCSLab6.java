import java.util.*; 
import java.lang.*; 
import java.awt.*; 
/**
 * Write a program that converts strings into (x, y) coordinates for a point and the input to be stored in a string.
 *
 * @author (AM)
 * @version (10,7,19)
 */
public class APCSLab6
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter a sentance with (x, y) coordinates:");//get points
        
        String xy = scan.nextLine();//get user input
        
        int comma = xy.indexOf(",");// find the numbers before/after comma
        
        int x = Integer.parseInt(xy.substring(0,comma));//get x cord
        
        int y = Integer.parseInt(xy.substring(comma + 2));//get y cord
        
        Point cord = new Point(x, y);//point
        
        System.out.println("(" + x + ", " + y + ")");///print (x, y)
        
        System.out.println(cord);//prints x and y coordinates
        
        String myString = new String("old String");
        
        System.out.println(myString);
        
        myString.replaceAll("old", "new");
        
        System.out.println(myString);
        
    
    }
}
