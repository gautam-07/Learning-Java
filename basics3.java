// Program to calculate average marks in JAVA

import java.util.Scanner;

public class basics3 {

   public static void main(String[] args) {
      System.out.println("Welcome to the average calculator");
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter your English subject marks");
      float eng = sc.nextFloat();
      System.out.println("Enter your Math subject marks");
      float math = sc.nextFloat();
      System.out.println("Enter your Science subject marks");
      float sci = sc.nextFloat();
      System.out.println("Enter your Hindi subject marks");
      float hind = sc.nextFloat();
      System.out.println("Enter your Computer subject marks");
      float comp = sc.nextFloat();

      float total = eng + math + sci + hind + comp;
      float average = total / 5;
      System.out.println("Your average marks of the total five subjects is : " + average);
      
   }
}
