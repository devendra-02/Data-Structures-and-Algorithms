package projects;

import Oops_.example;

public class example1 extends example {

	public void axcessprotecclass() {
		protectedclass obj = this.new protectedclass();
		obj.show();
	}

	public static void main(String[] args) {
		example1 obj = new example1();
		obj.axcessprotecclass();
	}
}

// it is use in projects package with class name - example1.java