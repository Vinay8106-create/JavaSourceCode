package OOP;

public class Rectangle {
  double length;
  double breadth;

  public Rectangle(double length, double breadth) {
    this.length = length;
    this.breadth = breadth;
  }

  public double findArea() {
    return length*breadth;
  }

  public double findPerimeter() {
    return 2*(length+breadth);
  }

  public static void main(String[] args) {
    Rectangle rectangle1 = new Rectangle(2, 3);
    System.out.println(rectangle1.findArea());
    System.out.println(rectangle1.findPerimeter());
  }
}
