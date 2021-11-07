import java.util.Scanner;
/**
 * how-tos and doing predefined classes
 *
 * @author (Anthony Mikinka)
 * @version (se8, 4/7/19)
 */
public class notes3x4
{
    /**
     * Constructor for objects of class notes3x4
     */
    public static void main(String[] args)
    {
        //argument - (argslist) - info method needs to do its work
      //return value - value sent back from mathod
      //method - code which performs a task
      //different ways to call methods, returnValue = object.method(args);
      //another way returnValue = class.method(args);\
      System.out.println("Pi is "+Math.PI);
      Scanner scan = new Scanner(System.in); //p148
      System.out.println("Enter the base");
      double base = scan.nextDouble();
      System.out.println("Enter the exponent");
      double power = scan.nextDouble(); 
      double result = Math.pow(base, power);
      System.out.println(base + " to the power of " + power + " is "+ result);
      System.out.println("Enter first number");
      int firstNum = scan.nextInt();
      System.out.println("Enter the second number");
      int secondNum = scan.nextInt();
      System.out.println(Math.min(firstNum, secondNum)+" is the smaller number");
      System.out.println(Math.max(firstNum, secondNum)+" is the greater number");
   
    }
}


