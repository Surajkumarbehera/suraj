package com.ExceptionHandling;

public class ExceptionHandlingMain {

	public static void main(String[] args)throws ArithmeticException {
		//variable declaration
		int x=10,y=2;
		//1(a)
		/*try {
			int division=x/y;
			System.out.println("the result is=" +division);
		}
		catch(ArithmeticException e) {
			System.out.println("The result is infinite");
		}
		*/
		
		//1(b)and 1(c)and 1(d)
		try {
				int division1 = x / y;
				System.out.println("the result is ="+ division1);
				try {
					int ary[] = new int[5];
					ary[7] = 34;
				}
				catch(ArrayIndexOutOfBoundsException e) {
					e.printStackTrace();
				}
			}
			catch(ArithmeticException e) {
				e.printStackTrace();
			}
		finally {
			System.out.println("Done");
		}
		
	}

}
