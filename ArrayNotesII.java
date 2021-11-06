
/**
 * Write a description of class ArrayNotesII here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ArrayNotesII
{
    public static void main(String[] args)
    {
        //6.1 Array creation and Access
        //default values
        //int -> 0, double -> 0.0, boolean -> false
        //reference type -> null
        int[] scores = new int[7];
        
        //assign values
        scores[0] = 100;
        scores[1] = 90;
        scores[2] = 80;
        
        System.out.println(scores[0]);
        System.out.println(scores[1]);
        System.out.println(scores[0] + scores[1]);
        
        //Array of Strings
        String[] names = new String[7];
        names[0] = "Scott";
        names[1] = "Jenn";
        names[2] = "JR";
        System.out.println( names[0] +  names[1] +  names[2]);
        names[1] = "Jennifer";
        System.out.println(names[1]);
        
        //Array Initalizer List
        String[] cities = {"Tokyo", "Seoul", "Bucharest"};
        
        System.out.println(cities[0]);
        System.out.println(cities[1]);
        System.out.println(cities[2]);
     
     
        //length of an array
        System.out.println(cities.length);
        System.out.println(" "); 
        
        //6.2 Tranversing arrays
        for(int i = 0; i < scores.length; i++)
        {
            System.out.println(scores[i]);
        }
        System.out.println(" ");
        
        for(int i = 0; i < names.length; i++)//if i-- would go backwards
        {
            System.out.println(names[i]);
        }
        System.out.println(" ");
        
        int j = 0;
        while(j<cities.length)
        {
            System.out.println(cities[j]);
            j++;
        }
        System.out.println(" ");
        
        //6.3 Enhanced for loop
        for(int score: scores)//for each score, print that score
        {
            System.out.println(score);
        }
        System.out.println(" ");
        
        for(String city: cities)
        {
            System.out.println(city);
        }
        System.out.println(" ");
        
        //6.4 Standard Algorithms
        
        //determining a maximum or minimum value
        int[] averages = {87, 45, 75, 99, 93, 78};
        int maximum = averages[0];
        for(int i = 1; i < averages.length; i++)
        {
            if(averages[i] > maximum)
            {
                maximum = averages[i];
            }
        }
        System.out.println("The maximum is " + maximum + ".");
        
        //Compute sum or average
        double[] costs = {4.99, 3.99, .99, 21.99, 2.00};
        double sum = 0.0;
        double average = 0.0;
        
        for(double cost: costs)
        {
            sum += cost;
        }
        
        average = sum / costs.length;
        System.out.println("Sum " + sum);
        System.out.println("Average " + average);
        System.out.println(" ");
        
        //Determine if one element has a particular property
        boolean isOverTen = false;
        for(double cost: costs)
        {
           if(cost > 9.99)
           {
               isOverTen = true;
           }
        }
        System.out.println(" ");
        
        if(isOverTen)
        {
            System.out.println("There is an item over $9.99");
        }
        else
        {
            System.out.println("There are no items over $9.99");
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}