import java.util.*;
/**
 * Program a class to determine the day's sky condition with temp.
 *
 * @author (AM)
 * @version (12/11/19)
 */
public class day//APCSLab13
{
   private double temp;//temperature
   private String skyCond;//sky conditions
   private double celTemp;//Celsius
   private boolean constant;//checks if program is consistent
   private String equality;//equality of days
   public day()
   {
       temp = 0;
       skyCond = "";
       celTemp = 0;
       constant = true;
       equality = "";
   }
   
   public day(String startSkyCond, double startTemp)//arguments
   {
       this.skyCond = startSkyCond;
       this.temp = startTemp;
   }
   
   public boolean getConstant()
   {
       if(temp >= 70 && skyCond.equals("Sunny"))
       {
           return true;
       }else if(temp <= 70 && temp >= 60 && skyCond.equals("Cloudy"))
       {
           return true;
       }else if (temp <= 60 && temp >= 40 && skyCond.equals("Rainy"))
       {
           return true;
       }else if (temp <= 32 && skyCond.equals("Snowy"))
       {
           return true;
       }
       return constant;
   }
   
   public double getTemp()//gets temp
   {
       return temp;
   }
   
   public String getSkyCond()//gets sky condition
   {
       return skyCond;
   }   
   
   public double getCelTemp()//gets celsius temp
   {
     return ((temp - 32) * 5/9);
   }
   
   @Override
   public String toString()//toString
   {
       return "The temperature is " + temp + ". " + "The sky condition is " + skyCond + ".";
   }
   
   public String equalityCheck(day weather2)//checks equality of days
   {
       if(temp == weather2.getTemp() && skyCond == weather2.getSkyCond())
       {
           return "The days are similar.";
       } else {
           return "The days are not similar.";
       }
   }
   
   public void setTemp(double x)
   {
       this.temp = x;
   }
   
    public void setSkyCond(String x2)
   {
       this.skyCond = x2;
   }
}

