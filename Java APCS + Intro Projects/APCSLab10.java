import java.util.*;
/**
 * Write a java program that produces a multiplication table based on the user's input.
 *
 * @author (AM)
 * @version (11/14/19)
 */
public class APCSLab10
{
    public static void main(String[] args){
        int tSize;
        Scanner scan = new Scanner(System.in);
        System.out.println("What is the upper limit for the multiplication table?");
        tSize = scan.nextInt();
        
        printMultiplicationTable(tSize);
    }
     
    public static void printMultiplicationTable(int tSize) {
        // first print the top header row
        System.out.format("      ");
        for(int i = 1; i<=tSize;i++ ) {
            System.out.format("%4d",i);
        }
        System.out.println();
        System.out.println("------------------------------------------");
         
        for(int i = 1 ;i<=tSize;i++) {
            // print left most column first
            System.out.format("%4d |",i);
            for(int j=1;j<=tSize;j++) {
                System.out.format("%4d",i*j);
            }
            System.out.println();
        }
    }
            
            
            
            
        
    }
  
