package com.kaizhousoft;

import java.util.Scanner;

public class Main {
  public static void main (String [] args){
	  int nTo = 0;
	  Scanner scanner = new Scanner(System.in);
	  FizzBuzz fizzBuzz = new FizzBuzz();
	  System.out.println("Please enter the ending integer: ");
	  nTo = scanner.nextInt();
	  
	  for (int i = 1; i <= nTo; i ++){
		  fizzBuzz.PrintFizzBuzz(i);
	  }
	  
	  return;
  }
}
