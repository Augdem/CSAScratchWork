public class MathPractice {
   
   public static void main(String[] args)
   {
      double number = Random(1.0, 2.0);
      System.out.println(number);
      number = Random(number, number + 1);
      System.out.println(number);
   }

   public static double Random(double x, double y)
   {
   double result =  (int)((Math.random() + 1) * x);
   return result;
   }
   

  

}