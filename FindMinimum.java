public class FindMinimum {

   public static int findMin(int range) {
   range++;
   int min = range;
   for (int i = 1; i <= 10; i++) {
   int value = (int) (Math.random() * range); 
   if (value < min) {
   min = value; }
   }
   int result = min;
   return result;
   }
   
   public static void main(String[] args) {
   System.out.println(findMin(99));

   
   }


}