package Programms.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Multi_Dimen_Array {
    public static void main(String[] args) {
        // take the input from user and store it in Grid format
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size : ");
        int size = sc.nextInt();
        // String name = sc.nextLine();  // it will take more than one word from user

        // create a 2-D array to store the elements 
        String[][] arr = new String[size][size];   // first part indicates no of rows and 2nd part indicates no of columns , but mentioning no of columns is completely optional which can be dynamic
        // after creating the array store each and every element in the 2D array
        for (int i = 0; i < arr.length; i++) {  // outer loop is for indexes
            for (int j = 0; j < arr[i].length; j++) {  // here column varies and it depend on the current row
                arr[i][j] = sc.nextLine();
            }
        }

        // after taking the input print the 2D array
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();

    }
}
