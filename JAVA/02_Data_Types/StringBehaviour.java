public class StringBehaviour {
  public static void main(String[] args) {
      // String literal
      String str1 = "Hello";
      String str2 = "Hello";
      
      // String object
      String str3 = new String("Hello");

      // Comparing string literals (references are the same)
      System.out.println(str1 == str2); // true

      // Comparing string literal with new String object (references are different)
      System.out.println(str1 == str3); // false

      // Comparing string contents
      System.out.println(str1.equals(str3)); // true

      // Demonstrating immutability
      str1.concat(" World");
      System.out.println(str1); // prints "Hello" because str1 was not modified

      // To modify the string, assign the result to a new reference
      String str4 = str1.concat(" World");
      System.out.println(str4); // prints "Hello World"
  }
}
