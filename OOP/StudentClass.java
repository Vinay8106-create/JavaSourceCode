package OOP;

public class StudentClass {
  private int rollno;
  private String name;
  private double marks;

  public StudentClass(int rollno, String name, double marks) {
    this.rollno = rollno;
    this.name = name;
    this.marks = marks;
  }

  public int getRollNo() {
    return rollno;
  }
  
  public void setRollno(int rollno) {
    this.rollno = rollno;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getMarks() {
    return marks;
  }

  public void setMarks(double marks) {
    this.marks = marks;
  }

  @Override
  public String toString() {
    return "rollno: "+rollno+", name: "+name+", marks: "+marks;
  }

  public static void main(String[] args) {
    StudentClass student1 = new StudentClass(1, "john wick", 98);
    StudentClass student2 = new StudentClass(2, "spider-man", 85);
    StudentClass student3 = new StudentClass(1, "bat-man", 90);
    System.out.println(student1);
    System.out.println(student2);
    System.out.println(student3);
  }
}
