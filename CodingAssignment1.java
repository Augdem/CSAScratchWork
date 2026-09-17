import java.util.Scanner;

public class CodingAssignment1
{
   public static void main(String[] args)
   {
   int favNumber = 5;
   boolean causeForConcern = false;
   double puppyWeight = 3.5;
   double firstPuppyWeight = 3.5;
   double truncPuppyWeight;
   double dif;
   
   System.out.println("My favorite number is \"" + favNumber + "\"");
   System.out.println("Cause for concern is \"" + causeForConcern + "\"");
   String puppyWeightCalc = ("My dog Gigi was last recorded to be \"" + firstPuppyWeight+ "\"" + " pounds");
   
   
   System.out.println(puppyWeightCalc);
   System.out.println("Type and enter a number followed by one decimal value to best rerecord her weight");
    
   Scanner scan = new Scanner(System.in);
   puppyWeight = scan.nextDouble();
   truncPuppyWeight = (int) (puppyWeight * 100) / 100.0;
   dif = (int) ((truncPuppyWeight - firstPuppyWeight) * 100) / 100.0;
   System.out.println("Wow! She is \"" + truncPuppyWeight + "\" pound(s) now!");
   System.out.println("That is \"" + dif + "\" more pound(s) than the first time I weighed her!");
   scan.close();
   puppyWeightCalc = ("My dog Gigi was last recorded to be \"" + truncPuppyWeight + "\" pound(s)");
   System.out.println(puppyWeightCalc);
   
   
   }
}