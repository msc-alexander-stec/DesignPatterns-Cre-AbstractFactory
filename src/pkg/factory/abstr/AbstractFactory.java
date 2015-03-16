package pkg.factory.abstr;

import pkg.product.abstr.Product1;
import pkg.product.abstr.Product2;
import pkg.product.abstr.Product3;

public interface AbstractFactory {

	public Product1 createProduct1();

	public Product2 createProduct2();

	public Product3 createProduct3();

}
