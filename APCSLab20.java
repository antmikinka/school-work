
import java.util.*;
/**
 * Write a value-returning method that returns the number of rows in a two-dimensional array of doubles. 
 * Include code to test your method.
 *
 * @author (AM)
 * @version (2/25/20)
 */
public class APCSLab20
{
    public static void main(String[] args)
    {
        int numRows, numCols;
        double landscape[][] = new double[3][5];
        numRows = landscape.length;
        numCols = landscape[0].length;
        System.out.println("Number of rows: " + numRows);
        System.out.println("Number of cols: " + numCols);
        for (int i = 0; i < numRows; i++) {
           for (int j = 0; j < numCols; j++) {
               System.out.print(landscape[i][j]);
            }
            System.out.println("");
        }
    } 
}
  

