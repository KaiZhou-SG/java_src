// 2015-01-11 This is to try adding two package statements in a single
// java file having two classes. Let's see if it can compile.
package com.kaizhousoft.PackageStatement; // the first package statement
import java.lang.*; // importing statement

public class PackageStatement { // class statement
  public static void main (String [] args) {
    System.out.println("Hello World!");
    
    // use another class under another package statement
    AnotherClass ac = new AnotherClass();
    ac.SaySomething("I'm another class!");

    return;
  }
}

// another package statement
// package com.kaizhousoft.PackageStatement;
// cannot compile with another package statement
class AnotherClass {
    public void SaySomething(String something) {
      System.out.println(something);
    }
}
