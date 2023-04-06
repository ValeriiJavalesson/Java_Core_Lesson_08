package Exercise_1;

public class IncorrectInputMonth extends Exception{
	private static String message = "Такого місяця не існує!";

	public String getMessage() {
		return message;
	}

}
