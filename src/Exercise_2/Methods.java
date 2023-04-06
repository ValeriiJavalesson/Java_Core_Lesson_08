package Exercise_2;

public class Methods {
	private int a;
	private int b;

	Methods(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public void setA(int a) {
		this.a = a;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int Plus() {
		return a + b;
	}

	public int Minus() {
		return a - b;
	}

	public int Multi() {
		return a * b;
	}

	public int Div() {
		return a / b;
	}

	public boolean Check() {
		boolean flag = false;
		try {
			if (a < 0 && b < 0)
				throw new IllegalArgumentException();
			if ((a == 0 && b != 0) || (a != 0 && b == 0))
				throw new ArithmeticException();
			if (a == 0 && b == 0)
				throw new IllegalAccessException();
			if (a > 0 && b > 0)
				throw new MyException();
			flag = true;
		} catch (IllegalArgumentException are) {
			are.printStackTrace();
		} catch (ArithmeticException ae) {
			ae.printStackTrace();
		} catch (IllegalAccessException ace) {
			ace.printStackTrace();
		} catch (MyException mye) {
			mye.printStackTrace();
		}
		return flag;
	}
}
