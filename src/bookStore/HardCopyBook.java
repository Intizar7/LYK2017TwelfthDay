package bookStore;

import java.lang.reflect.GenericArrayType;

public class HardCopyBook extends Book {

	protected int weigth;
	protected double shippingCost;
	public double getTotalCost() {
		return getPrice()+shippingCost;
		
	}

	public HardCopyBook(int weigth, int shippingCost) {
		super(author, author, shippingCost, shippingCost);
		this.weigth = weigth;
		this.shippingCost = shippingCost;
	}

	public int getWeigth() {
		return weigth;
	}

	public void setWeigth(int weigth) {
		this.weigth = weigth;
	}

	public double getShippingCost() {
		return  shippingCost;
	}

	public void setShippingCost(double shippingCost) {
		this.shippingCost = shippingCost;
	}


}
