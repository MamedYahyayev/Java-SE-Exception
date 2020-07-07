package exceptions;


public class Main {
	
	// Exception
	// Catching Exceptions(try-catch , finally block , try-with-resource )
	// Throwing Exception , Re-Throwing Exception
	// Custom Exception
	// Chaining Exception
	
	
	public static void main(String[] args) {
		try {
			ExceptionDemo.show();
		} catch (AccountException e) {
			e.printStackTrace();
		}
	}
}
