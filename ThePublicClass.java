// this Java file contains multiple classes, but the main function resides at
// the non-public class, let's see if the class file if executable
// The result is: can compile, but cannot execute the ThePublicClass class,
// because cannot find main method in the ThePublicClass class.

public class ThePublicClass {
  public ThePublicClass () {
  }
}

class TheNonPublicClass {
  public TheNonPublicClass () {
  }
  public static void main (String [] args) {
    System.out.println("Hello world! I'm from the non-public class.");
  }
}
