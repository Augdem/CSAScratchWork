import java.util.Scanner;

public class Practice09112026
{
   public static void main(String[] args)
   {
   int playerCount = 40;
   double avgPlayerTime = 12.56;
   boolean lastGameWon = true;
   String teamName = "Ballard Beavers";
   playerCount = playerCount + 1;
   
   System.out.println((3 + 7 + 14 + 3) / 4.0);
   
   System.out.println("Please enter your team name");
   Scanner scan = new Scanner(System.in);
   teamName = scan.nextLine();
   System.out.println("You entered the team name \"" + teamName + "\"");
   scan.close();
   
   }



}