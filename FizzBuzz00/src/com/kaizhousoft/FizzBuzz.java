package com.kaizhousoft;

public class FizzBuzz {

	public final String strFizz = "Fizz";
	public final String strBuzz = "Buzz";
	public final String strFizzBuzz = "FizzBuzz";

	// constructors
	public FizzBuzz()
	{
		// do nothing
	}
	
	// print Fizz or Buzz or FizzBuzz according to the input:
	// if n is multiples of 15, print FizzBuzz
	// else if n is multiples of 3, print Fizz
	// else if n is multiples of 5, print Buzz.
	// Noting that the checking order above cannot be changed(always check 15 first).
	public void PrintFizzBuzz(int n){
		if (IsMultiplesOf15(n)){System.out.println(strFizzBuzz + ", " + n);}
		else if (IsMultiplesOf5(n)){System.out.println(strBuzz  + ", " + n);}
		else if (IsMultiplesOf3(n)){System.out.println(strFizz + ", " + n);}
		
		return;
	}
	
	// Is multiples of 3
	public Boolean IsMultiplesOf3 (int n){
		Boolean rtn = false;
		if (n % 3 == 0)
		{
			rtn = true;
		}
		else
		{
			rtn = false;
		}
		
		return rtn;
	}  
	
	// Is multiples of 5
	public Boolean IsMultiplesOf5(int n){
		Boolean rtn = false;
		if (n % 5 == 0)
		{
			rtn = true;
		}
		else
		{
			rtn = false;
		}
		
		return rtn;
	}
	
	// Is multiples of 5
	public Boolean IsMultiplesOf15(int n){
		Boolean rtn = false;
		if (n % 15 == 0)
		{
			rtn = true;
		}
		else
		{
			rtn = false;
		}
		
		return rtn;
	}
}


