public class Pen {

   String penColor = "purple";
   

   public Pen() {
   System.out.println("I'm inside the constructor");
   }
   
   public static String write(String wordToWrite) {
   return wordToWrite;
   }
   
   public static String takeOffCap() {
   return "POP!";
   }
}
