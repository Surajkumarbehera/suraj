package com.ExceptionHandling;
//q3
class MyAutoClosable implements AutoCloseable{
	@Override
	public void close() throws Exception {
		System.out.println("MyAutoClosableclosed!");
		}
	}

public class AutocloseableTest {

	public static void main(String[] args) throws  Exception{
		int x=10,y=0;
		try(MyAutoClosable c=new MyAutoClosable()) {
			int division=x/y;
			System.out.println("the result is=" +division);
		}
		catch(ArithmeticException e) {
			System.out.println("The result is infinite");
			
		}

	}

}
