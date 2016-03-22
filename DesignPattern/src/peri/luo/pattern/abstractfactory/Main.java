package peri.luo.pattern.abstractfactory;

public class Main {
	public static void main(String[] args) {
		IFactory factory = new AFactory();
		IFactory factory_ = new BFactory();
		factory.createPad().call();
		factory.createPhone().call();
		factory_.createPad().call();
		factory_.createPhone().call();

	}
}
