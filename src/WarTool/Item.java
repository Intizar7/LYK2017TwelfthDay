package WarTool;

public abstract class Item {
	
	protected int itemQuantity;
	protected int itemPrice;
	protected int itemWeight;
	protected boolean useItem;
	
	
	public Item(int itemQuantity, int itemPrice, int itemWeight) {
		super();
		this.itemQuantity = itemQuantity;
		this.itemPrice = itemPrice;
		this.itemWeight = itemWeight;
		
	}
	
	public int getItemQuantity() {
		return itemQuantity;
	}
	public void setItemQuantity(int itemQuantity) {
		this.itemQuantity = itemQuantity;
	}
	public int getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(int itemPrice) {
		this.itemPrice = itemPrice;
	}
	public int getItemWeight() {
		return itemWeight;
	}
	public void setItemWeight(int itemWeight) {
		this.itemWeight = itemWeight;
	}
	public boolean isUseItem() {
		return useItem;
	}
	public void setUseItem(boolean useItem) {
		this.useItem = useItem;
	}
	
}
