public class WhilePractice {

   public static void main(String[] args) {
   int speedLimit = 20;
   
   int currentSpeed = 0;
   
   while (currentSpeed < speedLimit) {
   currentSpeed += (1 + (currentSpeed / 2 % 8));
   System.out.println("Current speed is " + currentSpeed + " MPH");
   }
   
   
   }

}