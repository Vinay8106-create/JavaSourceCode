package OOP_Programs;

public class ConstructorOverloading {
  /*  Creating mutiple constructors in the same class which may differ
   *  -> No of arguements 
   *  -> order of arguements
   *  -> type of arguements
   */

   public ConstructorOverloading() {
    
   }

   public ConstructorOverloading(int a, String b) {
    System.out.println("argumented constructor");
   }

   public ConstructorOverloading(String a, int b) {
    System.out.println("2nd argument constructor");
   }
   public static void main(String[] args) {
    ConstructorOverloading co = new ConstructorOverloading(5, "j");
    ConstructorOverloading co1 = new ConstructorOverloading();
    ConstructorOverloading co2 = new ConstructorOverloading("j", 6);

    System.out.println();
  }
}
