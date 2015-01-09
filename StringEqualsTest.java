package com.kaizhousoft.StringEquals;

public class StringEqualsTest {
  private String str1 = "Hello World";
  private String str2 = "Hello World";
  private String str3 = new String("Hello World");
  private String str4 = new String();

  public StringEqualsTest () {
  
  }
  
  public void excute() {
    System.out.println("str1 == str2 is: " + (str1 == str2));
    System.out.println("str1.equals(str2) is: " + str1.equals(str2));

    return;
  }
}
