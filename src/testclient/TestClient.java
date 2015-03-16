package testclient;

import pkg.factory.abstr.AbstractFactory;
import pkg.factory.concr.ConcreteFactoryA;
import pkg.factory.concr.ConcreteFactoryB;
import pkg.product.abstr.Product1;
import pkg.product.abstr.Product2;
import pkg.product.abstr.Product3;

/*
 * See:
 * http://www.philipphauer.de/study/se/design-pattern/abstract-factory.php
 * 
 */

public class TestClient {

	public static void main(String[] args) {

		System.out.println("Start: AbstractFactory");

		//
		// Factory A products
		//

		AbstractFactory factoryA = new ConcreteFactoryA();

		Product1 product1FromFactoryA = factoryA.createProduct1();
		Product2 product2FromFactoryA = factoryA.createProduct2();
		Product3 product3FromFactoryA = factoryA.createProduct3();

		product1FromFactoryA.doSomething();
		product2FromFactoryA.doSomething();
		product3FromFactoryA.doSomething();

		//
		// Factory B products
		//

		AbstractFactory factoryB = new ConcreteFactoryB();

		Product1 product1FromFactoryB = factoryB.createProduct1();
		Product2 product2FromFactoryB = factoryB.createProduct2();
		Product3 product3FromFactoryB = factoryB.createProduct3();

		product1FromFactoryB.doSomething();
		product2FromFactoryB.doSomething();
		product3FromFactoryB.doSomething();
	}

}
