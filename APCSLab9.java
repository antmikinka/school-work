import java.util.*;
/**
 * To develop a java program that will convert English words into their Pig Latin form, as described.
 *
 * @author (AM)
 * @version (11/06/2019)
 */
public class APCSLab9
{
    public static void main(String[] args)
    {
           String input, lWord, vowel;
           Scanner scan = new Scanner(System.in);
           String pLatin="";
           System.out.println("Please enter a word.");
           input = scan.nextLine();
           lWord = input.toLowerCase();
           System.out.println(lWord);
           int flag=0;
        for(int i=0;i<lWord.length();i++)
        {
            char x=lWord.charAt(i);
            if(x=='a' || x=='e' || x=='i' || x=='o' ||x=='u')
            {
                pLatin=lWord.substring(i)+lWord.substring(0,i)+"way";
                flag=1;
                break;
            }
        }
        if(flag==0)
        {
            pLatin=lWord+"ay";
        }
        System.out.println(lWord+" in Piglatin form is "+pLatin + ".");
    }
    }

        

    

