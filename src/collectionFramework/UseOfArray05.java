package collectionFramework;

public class UseOfArray05 {
	/*
	 * Author: Shohag, Organised by: Tofael
	 */

	public static void main(String[] args) {
		char [] a = new char[6]; // Different data type (String, char, int etc) can't be mix in an Array
		a[0] = 'A';
		a[1] = 9; 
		a[2] = 'c';
	
		
		a[5] = '8';
		// print single index value:
		System.out.println("^^^^^^^^^^^^^ Printing single index value ^^^^^^^^^^^^^^^^ ");
		System.out.println("Single index value: " + a[0]);// output: Tofael
		System.out.println("Single index value: " + a[1]);// output: why empty?
		System.out.println("Single index value: " + a[2]);// output: ?
		System.out.println("Single index value: " + a[3]);// output: ? //important, see 3 type of output?
		System.out.println("Single index value: " + a[5]);// output: Mohammad

		System.out.println("\nThe length of the array is: " + a.length);
		System.out.println("\nSingle index value: " + a[a.length-1]); //find the value for (length-1) no.

		// print all index value:

		System.out.println("\n^^^^^^^^^^^^^ Printing all index value of Array a [] ^^^^^^^^^^^^^^^^ ");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
	}
}