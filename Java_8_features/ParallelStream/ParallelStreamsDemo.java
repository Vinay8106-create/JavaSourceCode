package Java_8_features.ParallelStream;

import java.util.*;

class Student {
  String name;
  int score;

  public Student(String name, int score) {
    this.name = name;
    this.score = score;
  }

  public String getName() {
    return this.name;
  }

  public int getScore() {
    return this.score;
  }

  // @Override
  // public String toString() {
  //   return "Student [name=" + name + ", score=" + score + "]";
  // }

  
}

public class ParallelStreamsDemo {
  public static void main(String[] args) {
    List<Student> studentsList = Arrays.asList(
                                  new Student("David", 82),
                                  new Student("Bob", 90),
                                  new Student("John", 65),
                                  new Student("Canedy", 55),
                                  new Student("Eric", 85),
                                  new Student("Smith", 88),
                                  new Student("Scott", 50)
                                );
    // now i want to filter Students with grade greater than 80   
    // using stream() - sequential process
    studentsList.stream().filter(stu->stu.getScore()>=80).limit(3).forEach(stu->System.out.println(stu.getName()+" "+stu.getScore()));

    // parallel stream - parallel process (execution will be very faster)
    studentsList.parallelStream().filter(stu->stu.getScore()>=80)
                         .limit(3)
                         .forEach(stu->System.out.println(stu.getName()+" "+stu.getScore()));

    // we can also convert normal stream() into parallelStream() by using parallel()
    studentsList.stream().parallel()
                .filter(stu->stu.getScore()>=80)
                .limit(3)
                .forEach(stu->System.out.println(stu.getName()+" "+stu.getScore()));


  }
}
