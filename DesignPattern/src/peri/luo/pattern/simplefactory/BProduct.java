package peri.luo.pattern.simplefactory;

public class BProduct implements IProduct {
	private final static String TAG = "BProduct";

	@Override
	public void call() {
		System.out.println(TAG);

	}

}
