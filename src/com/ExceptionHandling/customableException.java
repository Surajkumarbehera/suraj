package com.ExceptionHandling;
//q2
//class InsufficentbalanceException extends RuntimeException
//this will show only runtime exception at run time as it will be unchecked exception
class InsufficentbalanceException extends Exception{
	// this will show a checked exception for which we have to use throw keyword and try and catch Block.
	private String message; 
	public InsufficentbalanceException() {
		this.message=" " ;
	}
	public InsufficentbalanceException(String message) {
		this.message=message;
	}
	public String toString() {
		return "insufficent balance in the account"+message;
	}
}
//either make the 
class Account {
	private int accountBal=1000;
	public void withdraw(int amount)throws InsufficentbalanceException {
		try {
			if (accountBal>amount) {
				this.accountBal-=amount;
				System.out.println("total balance in your account is :"+accountBal);
			}
			else {
				throw new InsufficentbalanceException();
			}
			}
		catch(Exception e) {	
			e.printStackTrace();
		}
	}
}
public class customableException {

	public static void main(String[] args) throws Exception{
		Account a=new Account();
		a.withdraw(10001);

	}

}
