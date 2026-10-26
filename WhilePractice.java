public class WhilePractice {

   public static void main(String[] args) {
   int speedLimit = 40;
   
   int currentSpeed = 0;
   
   while (currentSpeed < speedLimit / 2) {
   currentSpeed += (1 + (currentSpeed / 2 % 8));
   System.out.println("Current speed is " + currentSpeed + " MPH");
   }
   while (currentSpeed < speedLimit) {
   currentSpeed += (1 + (currentSpeed / 4));
   System.out.println("Top gear! Current speed is " + currentSpeed + " MPH");
   }
   
   
   }

}