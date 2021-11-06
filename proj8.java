import java.util.Scanner;
/**
 * Integers and the Scanner Class project. This project is to practice using integers, scanner class and, string class methods.
 *
 * @author (Anthony Mikinka)
 * @version (se8, 3/21/19)
 */
public class proj8
{
    public static void main(String[] args)
    {
        Scanner aInt = new Scanner(System.in);
        int a;
        System.out.println("Enter the first number");
        a = aInt.nextInt();
        
        
        Scanner bInt = new Scanner(System.in);
        int b;
        System.out.println("Enter the second number");
        b = bInt.nextInt();
        
        
        Scanner cInt = new Scanner(System.in);
        int c;
        System.out.println("Enter the third number");
        c = cInt.nextInt();
        
        
        Scanner dInt = new Scanner(System.in);
        int d;
        System.out.println("Enter the fourth number");
        d = dInt.nextInt();
        
        
        int sum;
        sum = a + b + c + d;
        System.out.println("The sum of the numbers is: " + sum);
        
        
        int product;
        product = a*b*c*d;
        System.out.println("The product of the numbers is: " + product);
        
        
        double average;
        average = (double) sum/4.0;
        System.out.println("The average of the numbers is: " + average);
        
        
       
    }

    }

