/*
 * LOGOS IT Academy. Lesson 9.
 * Checking the number of task.
 */
package Exercise_1;

import java.util.Scanner;
/**
 * @author VALERKO
 * @since java 1.8.0
 * @version 2.0
 */
public class InputCheck {

	public static int getNumber(int list) {
		Scanner scan = new Scanner(System.in);
		int i = -1;
		try {
			if (scan.hasNextInt()) {
				String input = scan.next().toUpperCase();
				i = Integer.parseInt(input);
				try {
					if (i > list | i < 0) {
						throw new IncorrectInputNumber();
					}
				} catch (IncorrectInputNumber en) {
					System.err.println(en.getMessage());
				}
			} else
				throw new IncorrectInputString();
		} catch (IncorrectInputString e) {
			System.err.println(e.getMessage());
		}
		return i;
	}
}
