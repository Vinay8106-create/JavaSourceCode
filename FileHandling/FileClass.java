package FileHandling;
import java.io.*;

public class FileClass {
  public static void main(String[] args) {
    File newfile = new File("C:\\Users\\barri\\OneDrive\\Desktop\\Java\\FileHandling\\Demo.txt");
    
    try {
      newfile.createNewFile();  // this method is important to create any file using filehandling concept
      // after creating check, wheather the file is created or not using if condition
      if (newfile.createNewFile()) {
        System.out.println("FileCreated : "+newfile.getName());  // it will craete a file and give it's name if it is not present 
      } else {
        System.out.println("File already exists");  // if it is already there means it will print this message
      }

      // after creating a file, write something into that file
      FileWriter f = new FileWriter("");
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
