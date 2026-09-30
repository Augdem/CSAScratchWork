public class Pen {

   String penColor;
   

   public Pen() {
   penColor = "purple";
   System.out.println("I'm inside the constructor");
   
   }
   
   public String write(String wordToWrite) {
   return "writing in " + penColor + " ink" + wordToWrite;
   }
   
   public static String takeOffCap() {
   return "POP!";
   }
}
