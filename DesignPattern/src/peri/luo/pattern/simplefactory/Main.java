package peri.luo.pattern.simplefactory;

public class Main {
	private final static String TAG = "Main";

	public static void main(String[] args) throws InstantiationException,
			IllegalAccessException, ClassNotFoundException {
		System.out.println(TAG);
		IProduct aProduct =  ProductFactory.getProduct("AProduct");
		aProduct.call();
		IProduct bProduct = (BProduct) ProductFactory.getProduct("BProduct");
		bProduct.call();
	}

}
