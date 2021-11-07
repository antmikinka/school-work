
/**
 **Concept and working with rational numbers.
 *
 * @author (AM)
 * @version (1/8/20)
 */
public class ratNumClient
{
    public static void main(String[] args)
    {
        ratNum a = new ratNum(2,3);//numerator, denominator
        ratNum b = new ratNum(5,7);//numerator, denominator
        
        System.out.println(a.toString());//prints toString with the values of a
        System.out.println("Numerator value: " + a.getNuNum()  + ". " +"Denominator value: " + a.getDeNum() + ". " );//print string with new values
        System.out.println(b.toString());//prints toString with the values of b
        
        System.out.println(a.cNum());//checks to see if the denominator value needs to be changed
        System.out.println(b.cNum());//checks to see if the denominator value needs to be changed
       
        System.out.println("The addition of the two numbers is: " + a.add(b));//adding numerator and denominator
        System.out.println("The multiplication of the two numbers is: " + a.multi(b));//multiplying the numbers together
        
        a.setNuNum(5);
        a.setDeNum(7);
        System.out.println("New numerator value: " + a.getNuNum() + ". " +"New denominator value: " + a.getDeNum() + ". ");//print string with new values
        System.out.println(a.eqCheck(b));//checks if the sets of rational numbers are equal or not
    }
}