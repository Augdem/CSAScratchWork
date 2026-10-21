public class BooleanPractice {

   private int g = 7;
   private int h = 8;
   private int i = 9;
   
   public static void main(String[] args)
   {
   System.out.println(op());
   System.out.println(op());    
   
      
      
      
   
   }
   
   public boolean op() {
   
   if ((g < h) && (h < i)) {
      System.out.print("A");
      
      boolean T = ((g < h) && (h < i));
      g ++;
      h --;
      return T;
      
      } else {
      System.out.print("B");
      }

   }
   


}