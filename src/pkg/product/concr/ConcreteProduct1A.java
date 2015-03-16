package pkg.product.concr;

import pkg.product.abstr.Product1;

public class ConcreteProduct1A implements Product1 {

	@Override
	public void doSomething() {
		System.out.println("I am a product of family 1 (ConcrteteProduct1A)");
	}

}
