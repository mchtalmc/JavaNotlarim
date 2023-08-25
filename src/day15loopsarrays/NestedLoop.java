package javaders.day15loopsarrays;

import java.util.Scanner;

public class NestedLoop {
    public static void main(String[] args) {
        /*
            1.Example:Type code to get the output like
                        Week: 1
                          Day: 1
                          Day: 2
                          Day: 3
                          .....
                        Week: 2
                          Day: 1
                          Day: 2
                          Day: 3
                          ....
                        Week: 3
                          Day: 1
                          Day: 2
                          Day: 3
                          ....
         */

        for (int i=1; i<4; i++){
            System.out.println("Week: " + i);
            System.out.println("---------------");
            for (int a=1; a<8; a++){
                System.out.println("   Day: "+ a);
            }
        }

        System.out.println();
        /*
          2.Example: Write a Java Program to Print Rectangle Star Pattern using For Loop
                        ****
                        ****
                        ****
            Note: Get the number of the rows and the columns from user
         */



        Scanner input = new Scanner(System.in);
        System.out.println("Please enter number of rows");
        int rows = input.nextInt();
        System.out.println("Please enter number of columns");
        int columns = input.nextInt();

        for (int s=1; s<=rows; s++){
            for (int k=1; k<=columns; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
