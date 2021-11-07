
/**
 * Write a value-returning method that returns the number of elements in a two-dimensional array of floats. 
 * Include code to test your method.
 *
 * @author (AM)
 * @version (2/25/20)
 */
public class APCSLab21
{
    private double array [][] = { {3.33, 2.56, 12.67}, {3.33, 2.56, 12.67}, {3.33, 2.56, 12.67} };
    public void printArray(float [][] array)
    {
        for(int row = 0; row < array.length; row++)
        {
            for(int col = 0; col < array[row].length; col++)
            {
                System.out.printf("%7d", array[row][col]);
            }
            System.out.println();
        }
    }
    public void sumRows(int [][] array)
    {
       int sum;
       //sum of individual row
        for(int row = 0; row < array.length; row++)
       {
           sum = 0;
           for(int col = 0; col < array[row].length; col++)
           {
               sum = sum + array[row] [col];
           }
           System.out.println("The sum of row" + (row + 1) + " = " + sum);
       }
    }
    public void largestInRows(int [][] array)//change to count and frequency of the number of elements in an array of floats
    {
        int largest; 
        for(int row = 0; row < array.length; row++)
        {
            //assume that the first element of the row is the largest
            largest = array[row][0];
            for(int col = 0; col < array[row].length; col++)
            {
                if(largest < array[row][col])
                {
                    largest = array[row][col];
                }
            }
            System.out.println("The largest element of row " + (row + 1) + " = " + largest);
        }
    }
    
}