package peri.luo.pattern.staticfactory;

public class BFactory implements IFactory{

	@Override
	public IProduct createProduct() {
		return new BProduct();
	}

}
