package pkg.product.concr;

import pkg.product.abstr.Product3;

public class ConcreteProduct3A implements Product3 {

	@Override
	public void doSomething() {
		System.out.println("I am a product of family 3 (ConcrteteProduct3A)");
	}

}
