package peri.luo.pattern.abstractfactory;

public class AFactory implements IFactory {

	@Override
	public IPhone createPhone() {
		return new Phone();
	}

	@Override
	public IPad createPad() {

		return new Pad();
	}

}
