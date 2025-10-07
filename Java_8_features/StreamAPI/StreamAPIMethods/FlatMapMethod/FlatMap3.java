package Java_8_features.StreamAPI.StreamAPIMethods.FlatMapMethod;

import java.util.*;
import java.util.stream.Collectors;

class Student {
  String sname;
  int sid;
  char grade;

  public Student(String sname, int sid, char grade) {
    this.sname = sname;
    this.sid = sid;
    this.grade = grade;
  }
}

public class FlatMap3 {
  public static void main(String[] args) {
    List<Student> studentList1 = new ArrayList<>();
    studentList1.add(new Student("Smith", 101, 'A'));
    studentList1.add(new Student("John", 102, 'B'));
    studentList1.add(new Student("Kenedy", 103, 'C'));

    List<Student> studentList2 = new ArrayList<>();
    studentList2.add(new Student("Scott", 104, 'A'));
    studentList2.add(new Student("Mary", 105, 'B'));
    studentList2.add(new Student("Kitty", 106, 'C'));

    // add this 2 collection's into one bigger collection
    List<List<Student>> studentList = Arrays.asList(studentList1,studentList2);
    // now i want to fetch the names of the student from studentList

    // before java 8
/*     for (List<Student> list : studentList) {
      for (Student student : list) {
        System.out.println(student.sname);
      }
    }   */

    // after java 8, using stream API / flatMap()
    List<String> namesList = studentList.stream().flatMap(stulist->stulist.stream()).map(s->s.sname).collect(Collectors.toList());
    System.out.println(namesList);

  }
}
