import java.util.*;
/**
 * Write a program that displays information for a company to it's customers vehicle rentals.
 *
 * @author (AM)
 * @version (10/23/19)
 */
public class APCSLab8
{
   public static void main(String[] args)
    {
        Scanner scan  = new Scanner(System.in);
        String user, cCode, cSum;
        int numOfDays, oStart, oEnd, milesDriven;
    
        System.out.println("Welcome to car rentals.");
        System.out.println("At the prompts, please enter the following:" + 
        "\n Customer's classification code(a character: BDW)"+
        "\n Number of days the vehicle was rented (int)" + 
        "\n Odometer reading at the start of the rental period (int) " + 
        "\n Odometer reading at the end of the rental period (int) ");
        
        System.out.println("Would you like to continue (Y/N)?");
        
        user = scan.nextLine();
        char cuser = user.charAt(0);
        System.out.println(user);
         while(cuser == 'Y'|| cuser == 'y'){
        System.out.println("Customer Classification code(B, D, W): ");
        cCode = scan.nextLine();//gets classification code
        char cc = cCode.charAt(0);
        
        
        System.out.println("Number of days: ");
        numOfDays = scan.nextInt();//gets number of days vehicle used
        
        System.out.println("Odometer reading at the start:");
        oStart = scan.nextInt();//odometer reading at the start of use
        
        System.out.println("Odometer reading at the end:");
        oEnd = scan.nextInt();//odometer reading at the end of use
        scan.nextLine();
        milesDriven = oEnd - oStart;//total miles driven
        double amtDue;
        double B;
        double D;
        double W;
        double AMDW;//average miles driven per week
        AMDW = 7/milesDriven;
        int fifMOvrL;//miles over 1500
        fifMOvrL = milesDriven - 1500;
        if (cc == 'B'|| cc == 'b'){
            amtDue = 40.00 + milesDriven*.25;//calculates cost for b customer code
          
                    cSum = "Chapter Summary: \n\t classification code: " + cCode + 
        "\n\trental period (days): " + numOfDays +
        "\n\todometer reading at start: " + oStart + 
        "\n\todometer reading at end: " + oEnd + 
        "\n\ttotal amount of miles driven: "+ milesDriven + 
        "\n\tamount due: $ " + amtDue;
        System.out.println(cSum);
        if (cc == 'D'|| cc == 'd'){//calculates cost for d customer code
            if(milesDriven <= 100){
                //no charge
                amtDue = 60.00 + 0;        
                cSum = "Chapter Summary: \n\t classification code: " + cCode + 
                "\n\trental period (days): " + numOfDays +
                "\n\todometer reading at start: " + oStart + 
                "\n\todometer reading at end: " + oEnd + 
                "\n\ttotal amount of miles driven: "+ milesDriven + 
                "\n\tamount due: $ " + amtDue;
                System.out.println(cSum);
           }else if(milesDriven >= 100){
                //charging if drove more than 100 miles
                amtDue = 60.00 + milesDriven*0.25;        
                cSum = "Chapter Summary: \n\t classification code: " + cCode + 
                "\n\trental period (days): " + numOfDays +
                "\n\todometer reading at start: " + oStart + 
                "\n\todometer reading at end: " + oEnd + 
                "\n\ttotal amount of miles driven: "+ milesDriven + 
                "\n\tamount due: $ " + amtDue;
                System.out.println(cSum);
            }
           }else if (cc == 'W'|| cc == 'w'){
            if (AMDW <= 900){
                amtDue = 190.00;//calculates cost for w customer code, no mileage charge
                cSum = "Chapter Summary: \n\t classification code: " + cCode + 
                "\n\trental period (days): " + numOfDays +
                "\n\todometer reading at start: " + oStart + 
                "\n\todometer reading at end: " + oEnd + 
                "\n\ttotal amount of miles driven: "+ milesDriven + 
                "\n\tamount due: $ " + amtDue;
                System.out.println(cSum);
            }else if(900 >= AMDW && AMDW <= 1500){
                amtDue = 190.00 + 100.00;//calculates cost for w customer code
                cSum = "Chapter Summary: \n\t classification code: " + cCode + 
                "\n\trental period (days): " + numOfDays +
                "\n\todometer reading at start: " + oStart + 
                "\n\todometer reading at end: " + oEnd + 
                "\n\ttotal amount of miles driven: "+ milesDriven + 
                "\n\tamount due: $ " + amtDue;
                System.out.println(cSum);
            }else if(AMDW >= 1500){
                amtDue = 190.00 + 200.00 +  fifMOvrL*.25;//calculates cost for w customer code
                cSum = "Chapter Summary: \n\t classification code: " + cCode + 
                "\n\trental period (days): " + numOfDays +
                "\n\todometer reading at start: " + oStart + 
                "\n\todometer reading at end: " + oEnd + 
                "\n\ttotal amount of miles driven: "+ milesDriven + 
                "\n\tamount due: $ " + amtDue;
                System.out.println(cSum);
            }   
       }
      }
    }
    if(cuser == 'N'|| cuser == 'n'){
           System.out.println("Thank you for your loyalty.");
    }
   }
   
      
        
        /*code 'B' budget, base charge per day: 40.00, mileage charge: .25 per mile
         * code 'D' daily, base charge: 60.00 per day, mileage charge: no charge if miles is less than 100 otherwise, .
         * 25 per mile after 100
         * code 'W' weekly, base charge per day: 190.00 each week or fraction of a week, mileage charge if avg num of miles per week is 
         * exceeds 900 miles but does not exceed 1500; otherwise 200.00 per week plus .25 for each mile driven above the 1500 mile per week
         * limit
         */
        
    
   }



