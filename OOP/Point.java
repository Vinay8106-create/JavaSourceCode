package OOP;

public class Point {
  int x, y;
  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public double findDistance(Point other) {
    double distance = Math.sqrt(Math.pow(other.x - this.x, 2) + Math.pow(other.y - this.y, 2));
    return distance;
  }

  public static void main(String[] args) {
    Point point1 = new Point(4, 5);
    Point point2 = new Point(7, 1);
    double distance = point1.findDistance(point2);
    System.out.println(distance);
  }
}
