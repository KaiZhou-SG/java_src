public class IntegerEquals {
	public void IntegerEquals(Integer int1, Integer int2) {
		// The Integer objects are immutable objects.
		// If there is an Integer object for a value that already exists, then
		// it does not create a new object again.
		System.out.println("int1 == int2 is: " + (int1 == int2));
		System.out.println("int1.equals(int2) is: " + int1.equals(int2));
	}
}