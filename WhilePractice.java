public class WhilePractice {

   public static void main(String[] args) {
   int speedLimit = 2000000;
   int range = 1;
   int change = 0;
   int currentSpeed = 0;
   
   while ((currentSpeed != speedLimit) || ((speedLimit + range >= currentSpeed) || (speedLimit - range <= currentSpeed))) {
   if (currentSpeed < speedLimit / 2) {
   change++;
   range++;
   currentSpeed += 5;
   System.out.println("Current speed is " + currentSpeed + " MPH");
   }
   else if (currentSpeed < speedLimit) {
   change++;
   range++;
   currentSpeed += 11;
   System.out.println("Top gear! Current speed is " + currentSpeed + " MPH");
   
   }
   else if (currentSpeed > speedLimit) {
   change++;
   range++; 
   currentSpeed -= 3;
   System.out.println("Slow down! Current speed is " + currentSpeed + " MPH");
   }
   }
   System.out.println("Perfect! Current speed is " + currentSpeed + " MPH");
   System.out.println("Changes: " + change);
   System.out.println("Final range: " + range);
   }
   
   
   

}