package Oops_;

public class example {

	protected class protectedclass {

		public protectedclass() {
		}

		public void show() {
			System.out.println("ha bhai phoch gya shi jgh ");
		}
	}

	public void accessinner() {
		protectedclass obj = new protectedclass();
		obj.show();
	}

	public static void main(String[] args) {
		example obj = new example();
		obj.accessinner();
	}
}
