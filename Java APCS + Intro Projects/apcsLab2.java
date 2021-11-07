
/**
 * To be able to learn to control placement of your output using escape sequences.
 *
 * @author (Anthony Mikinka)
 * @version (9/12/19)
 */
public class apcsLab2
{
    public static void main(String[] args)
    {
        System.out.println("\"This is a String literal.\"");
        System.out.println("\"This is a very long string output " + 
        "which is broken into two strings.\"");
         System.out.println(12+5);
         System.out.println("8 plus 5 is " + 8 + 5 );
         System.out.println("8 plus 5 is " + (8+5));
         System.out.println(8 + 5 + " equals 8 plus 5.");
         System.out.println("\n\n\t   Some handy escape sequences:\n");
         System.out.println("\t   Sequence" + "\t Meaning");
         System.out.println("\t   \\n"+"\t\t line feed");
         
         System.out.println("\t   \\t"+"\t\t tab");
         System.out.println("\t   \\\"" + "\t\t double quote");
         System.out.println("\t   \'"+"\t\t single quote");
         
         System.out.println("\t   \\\\ "  +"\t\t backlash");
         
         System.out.println();
         System.out.println("\t         /\\   " );
         System.out.println("\t        /  \\  ");
        System.out.println("\t       /    \\  ");
        System.out.println("\t       \\    /   ");
        System.out.println("\t        \\  /    ");
        System.out.println("\t         \\/    ");
        System.out.println("\t Adding some numbers:");
        System.out.println("\t\t 1234 ");
        System.out.println("\t\t 2345");
        System.out.println("\t\t+3456");
        System.out.println("\t\t-----");
        System.out.println("\t\t=7035");
     
    }
}
