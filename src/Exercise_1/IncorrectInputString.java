package Exercise_1;

public class IncorrectInputString extends Exception{
	private static String message = "Невірний формат вводу!";

	public String getMessage() {
		return message;
	}

}
