package peri.luo.pattern.abstractfactory;

public class BFactory implements IFactory{

	@Override
	public IPhone createPhone() {
		// TODO Auto-generated method stub
		return new Phone1();
	}

	@Override
	public IPad createPad() {
		// TODO Auto-generated method stub
		return new Pad1();
	}

}
