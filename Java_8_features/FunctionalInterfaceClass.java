package Java_8_features;


@FunctionalInterface
interface A {
  void show();

  // String toString();  // We wont get any error because toString() present in Object class and it is getting implemented in the class anyway

}

// here we can avoid creating another class to implement the functional interface, but as we know we are going to use it only once 
// in that case avoid creating new class and use anonymous class

// implementation class for interface A
// class B implements A {
//   @Override
//   public void show() {
//     System.out.println("void method");
//   }
// }

public class FunctionalInterfaceClass {
  public static void main(String[] args) {
    // A obj = new A();   // CTE - because we cannot create Object for an interface, we get error because A does not have implementation ,but what if we provide implementation here itself by creating Anonymous class
    // obj.show();

    A obj = new A(){  // this concept is called Anonymous Inner Class (creating a class without a name)
      public void show() {
        System.out.println("hi in show method");
      }
    };

    // instead of going for normal separate class i am using anonymous inner class for functional interface
    // we know how to write the syntax of anonymous class but my job is to focus just on logic inside tha method, since we are working on Functional Interface let compiler only write the syntax for anonymous class and implement only abstract method from interface, so that we can focus only on logic inside that method

    A obj1 = () -> {   // () thses are parameters for method we can pass parameters if needed 
        System.out.println("hi in show method (lambda expression)");   // now here i need to make sure this particular block belongs to a method, for that i use arrow 
        // this block can have multiple statements, but if we have only one statement means we can remove outer curly brackets also and we can write everything in one line
      };
      obj1.show();
      // this arrow is also known as arrow function or Lambda Expression
      // instead of creating a separate class to implement the functional interface we can use Lambda Expression (it will reduce no of lines, we can focus only on logic without worrying about class and method syntax)
    }
    
  }

