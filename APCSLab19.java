import java.util.*;
/**
 * Gets user input on how many numbers to generate and the max and min amounts of the number, 
 * then gets how many times the lowest and highest number occurs what it is and where they are.
 *
 * @author (AM)
 * @version (2/12/20)
 */
public class APCSLab19
{
    public static void main(String []args){
        Scanner input = new Scanner(System.in);//inits scanner
        int minocc = 0;//inits minocc
        int maxocc = 0;//inits maxocc
        int minx = Integer.MAX_VALUE;//inits minx
        int maxx = Integer.MIN_VALUE;//inits maxx
        String minIndex = "";//inits minindex
        String maxIndex = "";//inits maxindex
        System.out.println("How many random integers should be generated?");//askes how many numbers should be generated
        int aSize = input.nextInt();//gets input
        int [] intArray = new int [aSize];//creates intarray
        System.out.println("What is the smallest random number allowed in the array?");//asks what the smallest random number is
        int min = input.nextInt();//gets input
        System.out.println("What is the largest random number allowed in the array?");//asks what the largest random number is
        int max = input.nextInt();//gets input
        for (int i = 0; i<aSize; i++){
            intArray[i] = (int)(Math.random()*(max-min)+1)+(min);//populates array
        }
        System.out.println("Array Output");//prints
        System.out.print(" [ ");//prints
        for (int i = 0; i<aSize; i++){
            if (i==(aSize-1)){//if last number then 
                System.out.println(intArray[i]+" ]");//prints the last number
            }
            else {
                System.out.print(intArray[i]+", ");//prints number at that index
            }
        }
        for (int i = 0; i<aSize; i++){
            if (intArray[i]<minx){//if number at the index is less than already stored min value
                minx = intArray[i];//stores min value
                minocc = 1;//sets occurence to one
                minIndex = ""+i;//resets index list
            }
            else if (intArray[i]==minx){//if number at the index is same as already stored min value
                minocc++;//ups occurence
                minIndex = minIndex+", "+i;//adds index
            }
            else {}
        }
        System.out.print("The minimum value in the array is "+minx+".");//prints min value
        System.out.println(" Number of times it occurs: "+minocc);//prints how often it occurs
        System.out.println("Located at index: "+minIndex);//prints the indexs
        for (int i = 0; i<aSize; i++){
            if (intArray[i]>maxx){//if number at the index is more than already stored max value
                maxx = intArray[i];//stores max value
                maxocc = 1;//sets occurence to 1
                maxIndex = ""+i;//resets occurence
            }
            else if (intArray[i]==maxx){//if number at the index is same as already store max value
                maxocc++;//ups occurences
                maxIndex = maxIndex+", "+i;//adds index
            }
            else {}
        }
        System.out.print("The maximum value in the array is "+maxx+".");//prints max value
        System.out.println(" Number of times it occurs: "+maxocc);//prints how often it occurs
        System.out.println("Located at index: "+maxIndex);//print the indexs
    }
}
