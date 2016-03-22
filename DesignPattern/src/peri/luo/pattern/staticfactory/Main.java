package peri.luo.pattern.staticfactory;

public class Main {
	private final static String TAG = "Main";

	public static void main(String[] args) {
		System.out.println(TAG);
		new AFactory().createProduct().call();
		new BFactory().createProduct().call();
	}
}
