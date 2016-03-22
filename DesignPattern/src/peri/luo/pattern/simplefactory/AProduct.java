package peri.luo.pattern.simplefactory;

public class AProduct implements IProduct {
	private final static String TAG = "AProduct";

	@Override
	public void call() {
		System.out.println(TAG);

	}

}
