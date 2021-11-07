
/**
 * Perform basic computations and name variables correctly.
 *
 * @author (Anthony)
 * @version (se8, 9/5/19)
 */
public class apCS1
{
    /**
     * Outputs the equation of the line through the points(x1, y1). Change the assignments to x1, y1,x2, and y2, recompile, and return to
     * the program to use for different pairs of points.
     */
    public static void main(String[] args){
        //the coordinates of the two points
        int x1, y1, x2, y2;
        x1 = 5;
        x2 = 2;
        y1 = 11;
        y2 = 5;
        //compute the slope and intercepts of the line through the points
        double slope, yintercept;
        slope = (y2 - y1) / (x2- x1);
        yintercept = y1 - (x1 * slope);
        //outputs the slope and intercept of the line
        System.out.println(slope);
        System.out.println(yintercept);
        System.out.println("The equation of the line is y = " + slope + "x + " + yintercept  );
        
        
        
        
        
        
        
        
        
        
        
        
        
        
  }
    }

