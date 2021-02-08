// String methods in Java

public class string1 {

   public static void main(String[] args) {

      String str = "Gautam Khatter";

      System.out.println(str.length());

      System.out.println(str.toLowerCase());

      System.out.println(str.toUpperCase());

      System.out.println(str.trim());

      System.out.println(str.substring(7));

      System.out.println(str.replace('K', 'k'));

      System.out.println(str.startsWith("Gau"));

      System.out.println(str.endsWith("G"));

      System.out.println(str.charAt(4));

      System.out.println(str.indexOf("ta"));

      System.out.println(str.indexOf("ta", 5));
      
      System.out.println(str.lastIndexOf("K"));

      System.out.println(str.equals("Gautam Khatter"));

      System.out.println(str.equalsIgnoreCase("gautam khatter"));
      
   }
}


