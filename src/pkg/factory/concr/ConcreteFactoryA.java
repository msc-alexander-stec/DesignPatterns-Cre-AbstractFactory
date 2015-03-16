package pkg.factory.concr;

import pkg.factory.abstr.AbstractFactory;
import pkg.product.abstr.Product1;
import pkg.product.abstr.Product2;
import pkg.product.abstr.Product3;
import pkg.product.concr.ConcreteProduct1A;
import pkg.product.concr.ConcreteProduct2A;
import pkg.product.concr.ConcreteProduct3A;

public class ConcreteFactoryA implements AbstractFactory {

	@Override
	public Product1 createProduct1() {
		return new ConcreteProduct1A();
	}

	@Override
	public Product2 createProduct2() {
		return new ConcreteProduct2A();
	}

	@Override
	public Product3 createProduct3() {
		return new ConcreteProduct3A();
	}

}
