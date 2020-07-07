package exceptions;

public class ExceptionDemo {

	public static void show() throws AccountException {
		Account account = new Account();
		account.withdraw(10);

	}

}
