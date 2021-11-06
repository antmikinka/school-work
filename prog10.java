import java.util.*;
import java.text.*;
/**
 * Using predefined classes to get an input 
 *
 * @author (Anthony Mikinka)
 * @version (se8, 4/23/19)
 */
public class prog10
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter the number of quarters");
       
        int Quarter = scan.nextInt();
        
        System.out.println("Enter the numbers of dimes");
        
        int Dime = scan.nextInt();
        
        System.out.println("Enter the number of nickels");
        
        int Nickel = scan.nextInt();
        
        double dollar = ((Quarter * .25) + (Dime * .10) + (Nickel * 0.05));
        
        DecimalFormat deci = new DecimalFormat("$###,###,###.00");
        
        String output = deci.format(dollar);
        
        System.out.println("You have " + output + " dollars");
        
        
        
        
        
        
        
        
        
    }
}
