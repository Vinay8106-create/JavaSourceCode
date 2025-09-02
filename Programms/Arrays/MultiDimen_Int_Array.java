package Programms.Arrays;

import java.util.Scanner;

public class MultiDimen_Int_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size : ");
        int size = sc.nextInt();
        
        int[][] arr = new int[size][size];   // first part indicates no of rows and 2nd part indicates no of columns , but mentioning no of columns is completely optional which can be dynamic
        // after creating the array store each and every element in the 2D array
        for (int i = 0; i < arr.length; i++) {  // outer loop is for indexes
            for (int j = 0; j < arr[i].length; j++) {  // here column varies and it depend on the current row
                arr[i][j] = sc.nextInt();
            }
        }

        // after taking the input print the 2D array
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j]);
            }
        }
        sc.close();
    }
}
