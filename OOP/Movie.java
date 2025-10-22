package OOP;

import java.util.*;

public class Movie {
  String name, language;
  double rating;

  public Movie(String name, String language, double rating) {
    this.name =  name;
    this.language = language;
    this.rating = rating;
  }

  public String toString() {
    return "name: "+name+ ", language: "+language+", rating"+rating;
  }

  public static void main(String[] args) {
    List<Movie> movies = Arrays.asList(
      new Movie("Sholey", "Hindi", 3.9),
      new Movie("Agneepath", "Hindi", 4.1),
      new Movie("War", "Hindi", 5.0)
    );

    for (Movie m : movies) {
      if (m.rating > 4) {
        System.out.println(m);
      }
    }
  }
}
