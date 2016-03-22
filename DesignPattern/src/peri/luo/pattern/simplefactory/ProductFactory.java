package peri.luo.pattern.simplefactory;

public class ProductFactory {
	private final static String TAG = "ProductFactory";
	private static IProduct mProduct = null;

	public static IProduct getProduct(String productType)
			throws InstantiationException, IllegalAccessException,
			ClassNotFoundException {
		normalInvoke(productType);
		reflectInvoke(productType);
		System.out.println(TAG);
		return mProduct;
	}

	private static void normalInvoke(String productType) {
		if (productType == null || productType.trim().equals("")) {
			mProduct = new AProduct();
		} else if (productType.trim().equals("AProduct")) {
			mProduct = new AProduct();
		} else if (productType.trim().equals("BProduct")) {
			mProduct = new BProduct();
		}
	}

	/*
	 * further encapsulate
	 */
	private static void reflectInvoke(String productType)
			throws InstantiationException, IllegalAccessException,
			ClassNotFoundException {
		if (productType == null || productType.trim().equals("")) {
			mProduct = (IProduct) Class.forName(
					"peri.luo.pattern.simplefactory.AProduct").newInstance();
		} else if (productType.trim().equals("AProduct")) {
			mProduct = (IProduct) Class.forName(
					"peri.luo.pattern.simplefactory.AProduct").newInstance();
		} else if (productType.trim().equals("BProduct")) {
			mProduct = (IProduct) Class.forName(
					"peri.luo.pattern.simplefactory.BProduct").newInstance();
		}
	}
}
