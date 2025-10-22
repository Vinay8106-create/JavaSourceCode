package Practice;

class InvalidAgeException extends Exception {

}

public class CustomException {
  public static void main(String[] args) {
    int age = 17;

    if (age >= 18) {
      System.out.println("Elegible");
    } else {
      try {
        throw new InvalidAgeException();
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
  }
}
