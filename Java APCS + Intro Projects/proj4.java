
/** This project is os that we can learn how to create a constant variable and use it in the program.
 * .
 *
 * @author (Anthony Mikinka)
 * @version (se8, 2/27/19)
 */
public class proj4
{
    /**
     * Constructor for objects of class proj4
     * 
     */
    public static void main(String[] args)
    {
       final int DAY_IN_LEAP_YEAR = 366, DAYS_IN_NON_LEAP_YEAR = 365;
       
       final int MINUTES_IN_LEAP_YEAR = (DAY_IN_LEAP_YEAR*24*60) , MINUTES_IN_NON_LEAP_YEAR = (DAYS_IN_NON_LEAP_YEAR*24*60);

       System.out.println("A year that is not a leap year has " + MINUTES_IN_NON_LEAP_YEAR + " minutes.");
       
       System.out.println("A year that is a leap year has " + MINUTES_IN_LEAP_YEAR + " minutes.");
       
       
       
       
       
       
        
        
        
        
        
        
        
    }
}
