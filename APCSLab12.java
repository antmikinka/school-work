import java.util.*;
/**
 * Loops and using valid data
 *
 * @author (AM)
 * @version (11/25/19)
 */
public class APCSLab12
{
    public static void main(String []args)
    {
      Scanner scan = new Scanner(System.in);
      int x = 1;
      int s1,s2,s3,s4, s5,min,max, input, sum;
      double avg;
      while(x<=5)
      {
         System.out.println("Enter an exam grade.");
         s1 = scan.nextInt();//1st user input
         while(s1<=100 && s1>=0)
         {
          System.out.println("Invalid range. Enter an exam grade.");//invalid range, prompts user again
          s1 = scan.nextInt();//1st user input
         }
         System.out.println("Enter an exam grade.");
         s2 = scan.nextInt();//2nd user input
         x++;
         while(s2<=100 && s2>=0)
         {
          System.out.println("Invalid range. Enter an exam grade.");//invalid range, prompts user again
          s2 = scan.nextInt();//2nd user input
         }
         x++;
         System.out.println("Enter an exam grade.");
         s3 = scan.nextInt();//2nd user input
         while(s3<=100 && s3>=0)
         {
         System.out.println("Invalid range. Enter an exam grade.");//invalid range, prompts user again
         s3 = scan.nextInt();//3rd user input
         }
         x++;
         System.out.println("Enter an exam grade.");
         s4 = scan.nextInt();//2nd user input
         while(s4<=100 && s4>=0)
         {
          System.out.println("Invalid range. Enter an exam grade.");//invalid range, prompts user again
          s5 = scan.nextInt();//4th user input
         }
         x++;
         System.out.println("Enter an exam grade.");
         s5 = scan.nextInt();//2nd user input
          while(s5<=100 && s5>=0)
         {
          System.out.println("Invalid range. Enter an exam grade.");//invalid range, prompts user again
          s5 = scan.nextInt();//5th user input
         }
         x++;
          sum = s1+s2+s3+s4+s5;//calculates sum
          avg = (sum) / 5.0;//calculates average
          System.out.println("The average of the numbers is " + avg + ".");//prints avg
          max = Math.max(Math.max(Math.max(s1,s2), Math.max(s3,s4)), s5);//calculates max value
          System.out.println("The maximum value is "+ max);//prints max value
          min = Math.min(Math.min(Math.min(s1,s2), Math.min(s3,s4)), s5);//calculates min value
          System.out.println("The minimum value is "+ min);//prints minimum value
         
     }
  }
}  
  

