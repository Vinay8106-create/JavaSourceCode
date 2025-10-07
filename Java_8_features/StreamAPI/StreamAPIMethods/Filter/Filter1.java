package Java_8_features.StreamAPI.StreamAPIMethods.Filter;

import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Arrays;

// Filter should happen based on certain condition
public class Filter1 {
  public static void main(String[] args) {
    
  
  /* public static void main(String[] args) {
    ArrayList<Integer> l = new ArrayList<Integer>();
    l.add(10);
    l.add(15);
    l.add(20);
    l.add(25);
    l.add(30);  */

    // we can add objects into ArrayList without using add method
    List<Integer> numbersList = Arrays.asList(10, 15, 20, 25, 30);
    // filter even numbers from the collection and put them into new collection

    
    List<Integer> evenNumbersList = new ArrayList<>();
    // without using stream API
    /* for (int n:l) {
      if (n % 2 == 0) {
          evenNumbersList.add(n);
      }
    } 
    System.out.println(evenNumbersList); */

    // with streams
    /// first we have to add the objects into stream, we are not directly filtering the collection we filter the stream
    /// inside filter it acccept a predicate which take lambda expression and condition and return the output in boolen form
     evenNumbersList =  numbersList.stream().filter(n->n%2==0).collect(Collectors.toList());
    /*  analyzation of above expression :
     *  numbersList.stream() : added our numbersList to stream to process further
     *  numbersList.stream().filter(n->n%2==0) : after adding we used filter method which takes a predicate (condition) and return the output in boolean form
     *  numbersList.stream().filter(n->n%2==0).collect(Collectors.toList()) : after filtering we are collecting the data and adding them into another collection
     */
    System.out.println(evenNumbersList); 

    /* instead of storing in anoter collection we ca directly print the Objects by using forEach(lambda expression) */
    numbersList.stream().filter(n->n%2==0).forEach(n->System.out.println(n));
    numbersList.stream().filter(n->n%2==0).forEach(System.out::println);  // anotehr way by replacing the lambda expression
    
  }
}

