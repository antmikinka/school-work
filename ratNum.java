

/**
 * Concept and working with rational numbers.
 *
 * @author (AM)
 * @version (1/8/20)
 */
public class ratNum
{
    private int rNuNum;//numerator rational number
    private int rDeNum;//denominator rational number
    private double result;//result for the numbers
    public ratNum()//default constructor
    {
       rNuNum= 0;//default value
       rDeNum = 1;//default value
    }
    
    public ratNum(int startNu, int startDe)//numerator, denominator
    {
        rNuNum = startNu;//numerator
        rDeNum = startDe;//denominator
    }
    
    public String cNum()//makes sure the numbers are correct and not invalid types
    {
        if(rDeNum == 0)
       {
           return "Change the value of the denominator.";
       } else {
           return "";
       }
    }
 
    public double multi(ratNum b)//method of multiplying the two rational numbers, can use this to get the result
    {
        return (rNuNum*b.getNuNum()) + (rDeNum*b.getDeNum());
    }
    
    public double add(ratNum b)//method of adding the two rational numbers, can use this to get the result
    {
        return ((b.getNuNum()*rDeNum)+(rNuNum*b.getDeNum()))/(rDeNum*b.getDeNum());
    }
    
    public int setNuNum(int newNu)//numerator set
    {
        return this.rNuNum = newNu;
    }
    
     public int setDeNum(int newDe)//denominator set
    {
        return this.rDeNum = newDe;
    }
    
    public int getNuNum()//gets numerator number
    {
        return rNuNum;
    }
    
    public int getDeNum()//gets denominator numbers
    {
        return rDeNum;
    }
    
    public String eqCheck(ratNum b)//checks if the numbers are equal
    {
        if(rNuNum == b.getNuNum() && rDeNum == b.getDeNum())//if numerator equal to denominator
        {
          return "The two rational numbers are similiar.";//are similiar
        } else {
          return "The two rational numbers are not similar.";//arent similiar 
        }
    }
    
    @Override
    public String toString()//toString
    {
       return "Your numerator or first rational number is " + rNuNum + ". " + "Your denominator or second rational number is " + rDeNum + ".";//prints a string
    }
}
