package WarTool;

public class Sword extends Weapon{

	public Sword(int itemQuantity, int itemPrice, int itemWeight) {
		super(itemQuantity, itemPrice, itemWeight);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Sword [itemPrice=" + itemPrice + ", itemWeight=" + itemWeight + "]";
	}
	
}
