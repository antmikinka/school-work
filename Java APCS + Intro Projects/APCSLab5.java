import java.util.*;
/**
 * Using predefined classes to create random numbers.
 *
 * @author (AM)
 * @version (10/1/19)
 */
public class APCSLab5
{public static void main(String[] args)
    {
        Random rand = new Random();
        int a, b, c, d, e, f, g, h, j, k;
        a = (int)(Math.random() * (7-1)+1);
        b = (int)(Math.random() * (7-1)+1);
        c = (int)(Math.random() * (7-1)+1);
        d = rand.nextInt(6)+1;
        e = rand.nextInt(1);
        f = rand.nextInt(1);
        g = rand.nextInt(9)+1;
        h = rand.nextInt(9);
        j = rand.nextInt(9);
        k = rand.nextInt(9);
        System.out.println("The phone number is " + a + b + c + "-" + d + e + f + "-" + g + h + j + k + ".");
    }
}
