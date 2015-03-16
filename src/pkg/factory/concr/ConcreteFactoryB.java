package pkg.factory.concr;

import pkg.factory.abstr.AbstractFactory;
import pkg.product.abstr.Product1;
import pkg.product.abstr.Product2;
import pkg.product.abstr.Product3;
import pkg.product.concr.ConcreteProduct1B;
import pkg.product.concr.ConcreteProduct2B;
import pkg.product.concr.ConcreteProduct3B;

public class ConcreteFactoryB implements AbstractFactory {

	@Override
	public Product1 createProduct1() {
		return new ConcreteProduct1B();
	}

	@Override
	public Product2 createProduct2() {
		return new ConcreteProduct2B();
	}

	@Override
	public Product3 createProduct3() {
		return new ConcreteProduct3B();
	}

}
