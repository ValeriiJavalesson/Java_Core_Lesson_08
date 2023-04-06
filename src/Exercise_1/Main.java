/*
 * LOGOS IT Academy. Lesson 9.
 * Application for test own enums and exceptions.
 */
package Exercise_1;

import java.util.Scanner;

/**
 * @author VALERKO
 * @since java 1.8.0
 * @version 2.0
 */
public class Main {
	public static void main(String[] args) {
		boolean start = true;
		int abc;
		
		/* Create arrays of enums */
		Months[] year = Months.values();
		Seasons[] seas = Seasons.values();
		
		/* start the main cycle of the program */
		while (start) {
			System.out.println("Введіть, будь ласка, номер завдання зі списку, яке треба виконати:");
			System.out.println(
					"1-Перевірити чи є такий місяць (місяць вводимо з консолі, передбачити, щоб регістр букв був не важливим ");
			System.out.println("2-Вивести всі місяці з такою ж порою року ");
			System.out.println("3-Вивести всі місяці які мають таку саму кількість днів");
			System.out.println("4-Вивести на екран всі місяці які мають меншу кількість днів");
			System.out.println("5-Вивести на екран всі місяці які мають більшу кількість днів");
			System.out.println("6-Вивести на екран наступну пору року");
			System.out.println("7-Вивести на екран попередню пору року");
			System.out.println("8-Вивести на екран всі місяці які мають парну кількість днів");
			System.out.println("9-Вивести на екран всі місяці які мають непарну кількість днів");
			System.out.println("10-Вивести на екран чи введений з консолі місяць має парну кількість днів");
			System.out.println("Для виходу з програми, введіть: 0");

			abc = InputCheck.getNumber(10); //10 - is a number of tasks.
			switch (abc) {

			case 1: {
				String input = InputMonth();
				boolean flag = isMonthPresent(year, input);

				if (flag)
					System.out.println("Такий місяць існує.");
				break;
			}
			case 2: {
				String input = InputMonth();
				boolean flag = isMonthPresent(year, input);

				if (flag) {
					for (Months i : year) {
						if (i.name().equals(input)) {
							System.out.println("Така пора року " + i.getSeason() + " також має ще місяці:");
							for (Months i2 : year) {
								if (i2.getSeason().equals(i.getSeason())) {
									if (i2.name() != i.name())
										System.out.println(i2.name());
								}
							}
						}
					}
				}
				break;
			}
			case 3: {
				String input = InputMonth();
				boolean flag = isMonthPresent(year, input);

				if (flag) {
					for (Months i : year) {
						if (i.name().equals(input)) {
							int days = i.getDays();
							System.out.println("Таку саму кількість днів (" + days + ") мають ще місяці:");
							for (Months i2 : year) {
								if (i2.getDays() == i.getDays()) {
									if (i2.name() != i.name())
										System.out.println(i2.name());
								}
							}
						}
					}
				}
				break;
			}
			case 4: {
				String input = InputMonth();
				boolean flag = isMonthPresent(year, input);

				if (flag) {
					for (Months i : year) {
						if (i.name().equals(input)) {
							int days = i.getDays();
							System.out.println("Меншу кількість днів (меншу за " + days + ") мають місяці:");
							for (Months i2 : year) {
								if (i2.getDays() < i.getDays()) {
									if (i2.name() != i.name())
										System.out.println(i2.name());
								}
							}
						}
					}
				}
				break;
			}
			case 5: {
				String input = InputMonth();
				boolean flag = isMonthPresent(year, input);

				if (flag) {
					for (Months i : year) {
						if (i.name().equals(input)) {
							int days = i.getDays();
							System.out.println("Більшу кількість днів (більшу за " + days + ") мають місяці:");
							for (Months i2 : year) {
								if (i2.getDays() > i.getDays()) {
									if (i2.name() != i.name())
										System.out.println(i2.name());
								}
							}
						}
					}
				}
				break;
			}
			case 6: {
				String input = InputMonth();
				boolean flag = isMonthPresent(year, input);

				if (flag) {
					for (Months i : year) {
						if (i.name().equals(input)) {
							System.out.print("Після " + i.getSeason() + " приходить ");
							for (Seasons s : seas) {
								if (s.name().equals(i.getSeason().toString())) {
									if (s.ordinal() + 1 == seas.length) {
										System.out.println(seas[0]);
									} else {
										System.out.println(seas[(int) s.ordinal() + 1]);
									}
								}
							}
						}
					}
				}
				break;
			}
			case 7: {
				String input = InputMonth();
				boolean flag = isMonthPresent(year, input);

				if (flag) {
					for (Months i : year) {
						if (i.name().equals(input)) {
							System.out.print("Перед " + i.getSeason() + " приходить ");
							for (Seasons s : seas) {
								if (s.name().equals(i.getSeason().toString())) {
									if (s.ordinal() == 0) {
										System.out.println(seas[seas.length - 1]);
									} else {
										System.out.println(seas[(int) s.ordinal() - 1]);
									}
								}
							}
						}
					}
				}
				break;
			}
			case 8: {
				System.out.println("Парну кількість днів мають місяці:");
				for (Months i : year) {
					int days = i.getDays();
					if (days % 2 == 0) {
						System.out.println(i.name());
					}
				}
				break;
			}
			case 9: {
				System.out.println("Непарну кількість днів мають місяці:");
				for (Months i : year) {
					int days = i.getDays();
					if (days % 2 != 0) {
						System.out.println(i.name());
					}
				}
				break;
			}
			case 10: {
				String input = InputMonth();
				boolean flag = isMonthPresent(year, input);

				if (flag) {
					for (Months i : year) {
						if (i.name().equals(input)) {
							int days = i.getDays();
							if (days % 2 == 0) {
								System.out.println(i.name() + " має парну кількість днів");
							} else {
								System.out.println(i.name() + " має непарну кількість днів");
							}
						}
					}
				}
				break;
			}
			case 0: {
				start = !start;
				break;
			}
			}
		}
		System.out.println("На все добре!");
	}
/*	getting input name of the month*/
	private static String InputMonth() {
		System.out.println("Введіть місяць:");
		Scanner scan = new Scanner(System.in);
		String input = scan.next().toUpperCase();
		return input;
	}
/*	checking input name of the month*/
	private static boolean isMonthPresent(Months[] year, String input) {
		boolean flag = false;
		for (Months i : year) {
			if (i.name().equals(input)) {
				flag = true;
				break;
			}
		}
		try {
			if (flag == false)
				throw new IncorrectInputMonth();
		} catch (IncorrectInputMonth em) {
			System.err.println(em.getMessage());
		}
		return flag;
	}
}
