package peri.luo.pattern.staticfactory;

public class AFactory implements IFactory{

	@Override
	public IProduct createProduct() {
		return new AProduct();
	}

}
