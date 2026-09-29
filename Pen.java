public class Pen {

   public static void main(String[] args) {
      Pen krokowerPen = new Pen();
      System.out.println(takeOffCap());
      System.out.println(write("Hello, World"));
   }
   
   public static String write(String wordToWrite) {
   return wordToWrite;
   }
   
   public static String takeOffCap() {
   return "POP!";
   }
}
