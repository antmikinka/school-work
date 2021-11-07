
/**
 * Calculate amount of coins and return money in coins.
 *
 * @author (AM)
 * @version (12/18/19)
 */
public class Coin
{
    private int p;//amount of nickels
    private int q;//amt of quarters
    private int d;//amt of dimes
    private int n;//amt of nickels
    public Coin()//default constructor
    {
        p = 0;
        q = 0;
        d = 0;
        n = 0;
    }
    
    public Coin(int startP, int startQ, int startD, int startN)
    {
        if(p<0)//if the value is less than zero it sets it to 0
        {
          p = 0;  
        }
        else
        p = startP;
        if(q<0)//if the value is less than zero it sets it to 0
        {
          q = 0;  
        }
        else
        q = startQ;
        if(d<0)//if the value is less than zero it sets it to 0
        {
          d = 0;  
        }
        else
        d =startD;
        if(n<0)//if the value is less than zero it sets it to 0
        {
          n = 0;  
        }
        else
        n = startN;
    }
    
    public int setP(int newP)//set new amount of pennies
    {
        p = newP;
        return newP;
    }
    
    public int setQ(int newQ)//set new amount of quarters
    {
        q = newQ;
        return newQ;
    }
    
    public int setD(int newD)//set new amount of dimes
    {
        d = newD;
        return newD;
    }
    
    public int setN(int newN)//set new amount of nickels
    {
        n = newN;
        return newN;
    }
    
    public int getP()//gets pennies amount
    {
        return p;
    }
    
    public int getQ()//gets quarters amount
    {
        return q;
    }
    
    public int getD()//gets dimes amount
    {
        return d;
    }
    
    public int getN()//gets nickel amount
    {
        return n;
    }
    
    public double getTotal()
    {
        return (p * 0.01) + (q * 0.25) + (d + .10) + (n * 0.05);//calculates total
    }
    
    public String equalityCheck(Coin Change2)//checks equality of days
    {
       if(getTotal() == Change2.getTotal() && getTotal() == Change2.getTotal())//equality check on amount of change
       {
           return "The coins or amount of change is similar.";//prints similar
       } else {
           return "The coins or amount of change is not similar.";//prints not similar
       }
    }
    
    public void setNewChange(Coin newChange)//sets amount of coins from change 2 to change. So that Change 2 = Change.
    {
        p = newChange.getP();
        q = newChange.getQ();
        d = newChange.getD();
        n = newChange.getN();
    }
    
}
