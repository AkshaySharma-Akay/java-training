package com.epsilon.programs;

public class GetQuotient {

	public static void main(String[] args) {
		//System.out.println(Arrays.toString(args));
		try {
			String a1 = args[0];
			String a2 = args[1];
			int n = Integer.parseInt(a1);
			int d = Integer.parseInt(a2);
			int q = n/d;
			System.out.println("Quotient of " + n + "/" + d + " = " + q);
			throw new Exception("wrong");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("Only integer values allowed!");
		} catch (ArithmeticException e) {
			System.err.println("Cannot divide by zero!");
		} catch (Exception e) { //fallback, must always be the last one.
			System.err.println("Two inputs expected!");
		} finally { // try to avoid
			System.out.println("This works in most cases!");
		}
		System.out.println("End of main!");
	}

}
