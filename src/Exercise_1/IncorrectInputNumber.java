package Exercise_1;

public class IncorrectInputNumber extends Exception{
	private static String message = "Такого завдання не існує";

	public String getMessage() {
		return message;
	}

}
