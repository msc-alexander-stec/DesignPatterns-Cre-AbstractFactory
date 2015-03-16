package pkg.product.concr;

import pkg.product.abstr.Product2;

public class ConcreteProduct2A implements Product2 {

	@Override
	public void doSomething() {
		System.out.println("I am a product of family 2 (ConcrteteProduct2A)");
	}

}
