// Getting user input and variables
// Adding two numbers given by user

import java.util.Scanner;

public class basics2 {

   public static void main(String[] args) {
      System.out.println("Taking user input");

      // (System.in) reads data from keyboard
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter number 1");
      int a = sc.nextInt();
      System.out.println("Enter number 2");
      int b = sc.nextInt();
      int sum = a + b;
      System.out.println("The sum of the two numbers is " + sum);

      
      boolean b1 = sc.hasNextInt();
      System.out.println(b1);
   }
}

