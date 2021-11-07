import java.util.*;
/**
 *Data input and output using predefined classes. This project is to calculate diameter, area and, circumference of a circle
 *using arithimetic operators.
 *
 * @author (Anthony Mikinka)
 * @version (se8, 4/11/19)
 */
public class proj9x2
{
    public static void main(String[] args)
    {
        Scanner number = new Scanner(System.in);
        
        System.out.println("Enter the radius of the circle.");//prints a statement for radius of circle.
        
        double r = number.nextDouble();
        
        double area = Math.PI*Math.pow(r, 2);
        
        double diameter = 2*r;
        
        double circumference = Math.PI*diameter;
        
        System.out.println("The area of the circle is " + area + " unit(s).");//calculates and prints area of circle.
        
        System.out.println("The diameter of the circle is " + diameter +" unit(s).");//prints the diameter of the circle.
        
        System.out.println("The circumference of the circle is " + circumference + " unit(s)." );
        
    }
}
