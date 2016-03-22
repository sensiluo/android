package peri.luo.pattern.staticfactory;

public class BProduct implements IProduct {

	private final static String TAG = "BProduct";

	@Override
	public void call() {
		System.out.println(TAG);

	}

}
