package Exercise_2;

public class Main {

	public static void main(String[] args) {

		Methods m = new Methods(4, 0);
		if (m.Check()) {
			System.out.println(m.Plus());
			System.out.println(m.Minus());
			System.out.println(m.Multi());
			System.out.println(m.Div());
		}
		m.setA(4);
		m.setB(9);
		if (m.Check()) {
			System.out.println(m.Plus());
			System.out.println(m.Minus());
			System.out.println(m.Multi());
			System.out.println(m.Div());
		}
		m.setA(-4);
		m.setB(-9);
		if (m.Check()) {
			System.out.println(m.Plus());
			System.out.println(m.Minus());
			System.out.println(m.Multi());
			System.out.println(m.Div());
		}
		m.setA(0);
		m.setB(0);
		if (m.Check()) {
			System.out.println(m.Plus());
			System.out.println(m.Minus());
			System.out.println(m.Multi());
			System.out.println(m.Div());
		}
		m.setA(10);
		m.setB(-3);
		if (m.Check()) {
			System.out.println(m.Plus());
			System.out.println(m.Minus());
			System.out.println(m.Multi());
			System.out.println(m.Div());
		}
	}
}
