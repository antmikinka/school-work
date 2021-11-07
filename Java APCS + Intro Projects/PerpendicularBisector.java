
/**
 * A program that outputs the equation of the perpenindicular bisector of the line segment between two points. Calculates the slope and
 * midpoints.
 * @author (Anthony Mikinka)
 * @version (9/10/19)
 */
public class PerpendicularBisector
{
   public static void main(String[] args){
       int x1,x2,y1,y2; //set up points
       x1 = 0;
       
       y1 = 0;
       
       x2 = 2;
       
       y2 = 2;
       
       double slope, midX, midY, pbSlope, pbInt; // calculate the slope + intercepts through the points
       
       String pb;
       
       slope = ((y2 - y1) / 1.0) / ((x2 - x1) / 1.0); //slope calculation
       
       midX = ((x1+x2)/2.0); //midpoint x calculation
       
       midY = ((y2+y1)/2.0); //midpoint y calculation
       if (slope < 0) {
           pbSlope  = -1.0/slope; //perpendicular bisector slope calculation
           pbInt = (midY - pbSlope*midX);
           pb = ("y = " + pbSlope + "x + " + pbInt); //equation for pb
           System.out.println(pb);
        } else if (slope > 0){
        pbSlope = 1.0/slope; //perpendicular bisector slope calculation
        pbInt = (midY - pbSlope*midX);
        pb = ("y = " + pbSlope + "x + " + pbInt); //equation for pb
         System.out.println(pb);
        } else if ((x1==x2)){
        System.out.println("x =" + x1);//prints horizontal line
        }     
        else if ((y1==y2)){
        System.out.println("y =" + y1);//prints vertical line
    
        }
   }
} 
