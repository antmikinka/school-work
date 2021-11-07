import java.util.*;
/**
 * Yahtzee game.
 * @author (AM)
 * @version (2/3/20)
 */
public class APCSLab17
{
    public static void main(String[] args)
    {
       Scanner scan = new Scanner(System.in);
       int die1, die2, die3, die4, die5;//five dice
       int[] arr = {1, 2, 3, 4, 5, 6};
       int die[] = new int[5];
       int rand;
       String user;//user input
       for(int i = 0; i<die.length;i++)
       {
           rand = (int) (Math.random() * 5) + 1;
           die[i] = rand;
           System.out.println(die[i]);
       }
       
      // for(int i = 0; i<die.length;i++)
       //{
       //    System.out.println(die[i]);
      // }
       //if((die1 == die2)&&(die2 == die3) && (die3 == die4) && (die4 == die5))
     //  {
        //   System.out.println("Yahtzee.");// all five dice are equal
       //} else {
       //    System.out.println("Try again.");//five dice not equal
      // }
      // System.out.println("Do you want to play again? (Y/N)");//prompts user to quit/play
      // user = scan.nextLine();
     //}while(user.equalsIgnoreCase("Y"));
  }
}

