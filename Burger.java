public class  Burger {
   // instance variables

   private int numPatties;
   private boolean isTasty;
   private double gramsOfSauce;
   private String burgerName;
   private int numberOfBites = 0;

   // constructors
   // first, the no-argument constuctor
   public Burger() {
   numberOfBites = 0; 
   numPatties = 2;
   isTasty = true;
   gramsOfSauce = 30;
   burgerName = "Craig the Burger";
   
   }
   
   public Burger(int numPatties, boolean isTasty, double gramsOfSauce, String burgerName) {
   this.numberOfBites = 0;
   this.numPatties = numPatties;
   this.isTasty = isTasty;
   this.gramsOfSauce = gramsOfSauce;
   this.burgerName = burgerName;
   
   }

   public void bite () {
   System.out.println("Chomp...");
   numberOfBites++;

   
   }
   

   
   public int getNumberOfBites() {
   return numberOfBites;
   
   }
   
   public static String getBurgerRecipe() {
   return "Cook burger, add buns, add condiments";
   }
   //
   public static void main(String[] args) {
   Burger basicBurger = new Burger();
   System.out.println("The Craig Special:");
   System.out.println(basicBurger.numPatties + " patties");
   System.out.println("Tasty", basicBurger.isTasty);
   Burger bigMan = new Burger(1, true, 3.9, "The Big Man");
   bigMan.bite();
   bigMan.bite();
   bigMan.bite();
   System.out.println(bigMan.getNumberOfBites());
   System.out.println(Burger.getBurgerRecipe());
   }

}