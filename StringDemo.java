import java.util.*;
public class StringDemo {

    /*
     * Strings are used for storing text.
     * A String variable contains a collection of characters surrounded by double quotes:
     */

     public static void main(String[] args) {
        
        String s = "Hello This Is My World";
        String sSame = "Hello This Is My World";

        String s2 = "Hello Good Morning";
        System.out.println(s);

        // String length
        // A String in Java is actually an object, which contain methods that can perform certain operations on strings. For example, the length of a string can be found with the length() method:

        System.out.println(s.length()); // 22

        // String Methods

        //Returns the character at the specified index (position)
        System.out.println(s.charAt(0)); // H

        //Returns the Unicode of the character at the specified index
        System.out.println(s.codePointAt(0));  // (72 ascii value)

        //Returns the Unicode of the character before the specified index
        System.out.println(s.codePointBefore(1)); // 72

        //Returns the number of Unicode values found in a string.
        System.out.println(s.codePointCount(0, 2));

        //Compares two strings lexicographically
        /*
         A negative integer if  string (s) is lexicographically less than anotherString (s2).
         Zero if this string (s) is lexicographically equal to anotherString (s2).
         A positive integer if this string (s) is lexicographically greater than anotherString (s2).

         */
        System.out.println(s.compareTo(s2)); // 13 (that means s is lexicographically greate than s2)

        //Compares two strings lexicographically, ignoring case differences
        System.out.println(s.compareToIgnoreCase(s2)); // 13 (Ignore case difference)

        //Appends a string to the end of another string

        System.out.println(s.concat("Bye")); //Hello This Is My WorldBye

        //Checks whether a string contains a sequence of characters
        System.out.println(s.contains("Hello")); // true

        //Checks whether a string contains the exact same sequence of characters of the specified CharSequence or StringBuffer

        System.out.println(s.contentEquals(s2));  // false
        System.out.println(s.contentEquals(sSame)); // true

        //Returns a String that represents the characters of the character array

      char[] myStr1 = {'H', 'e', 'l', 'l', 'o'};
      String myStr2 = "";
      myStr2 = myStr2.copyValueOf(myStr1, 0, 5);
      System.out.println("Returned String: " + myStr2);


      //Checks whether a string ends with the specified character(s)

      System.out.println(s.endsWith("ld"));  // true
      System.out.println(s.endsWith("World")); // true
      System.out.println("No");    // No
         
        //Compares two strings. Returns true if the strings are equal, and false if not

        System.out.println(s.equals(s2)); // false
        System.out.println(s.equals(sSame)); // true

        // Compares two strings, ignoring case considerations

        System.out.println("Hello".equalsIgnoreCase("hello"));  // true
        System.out.println("hello".equalsIgnoreCase("Bye"));    // false

      // Converts a string into an array of bytes

      String myStr = "Hello";
      byte[] result = myStr.getBytes();
      System.out.println(result[0]);  // 72 ascci value


      // link for reference --> https://www.w3schools.com/java/java_ref_string.asp

     }
    
}
