import java.util.*;
/**
 * Write a description of class ArrayNotes here.
 *
 * @author (AM)
 * @version (2/5/20)
 */
public class ArrayNotes
{
    public ArrayNotes()
    {
       int randInt;
       int a = 1;
       int b = 100;
       int [] testData = new int [100];
       for(int i=0; i<testData.length; i++)
       {
           randInt = (int)(Math.random()* b - a ) + a;
           testData[i] = randInt;
           System.out.println("TestData" + i + " " + testData[i]);
           int minValue = testData[i];
           int minIndex = 0;
           int maxValue = 0;
           for(i = 1; i < testData.length; i++)
           if(testData[i]<testData[minIndex])
           {
               minValue = testData[i];
               minIndex = i;
           }
          
           System.out.println("Smallest value is " + minValue);
           System.out.println("The element is " + minIndex);
           System.out.println("Largest value is " + maxValue); 
       }
      
       } 
    }
