package bookStore;

public class Purchase {//satın Almak
	protected String purchaseDate;//satın almak
	protected String shoppingDate;//taşima RENAME -> ALT+SHIFT+R
	protected String purchasingCard;
	protected String delivaryLenght;


	public String getDelivaryLenght() {
		return delivaryLenght;
	}
	public void setDelivaryLenght(String delivaryLenght) {
		this.delivaryLenght = delivaryLenght;
	}
	public String getPurchaseDate() {
		return purchaseDate;
	}
	public void setPurchaseDate(String purchaseDate) {
		this.purchaseDate = purchaseDate;
	}
	public String getShippingDate() {
		return shoppingDate;
	}
	public void setShippingDate(String shippingDate) {
		this.shoppingDate = shippingDate;
	}
	public String getPurchasingCard() {
		return purchasingCard;
	}
	public void setPurchasingCard(String purchasingCard) {
		this.purchasingCard = purchasingCard;
	}
	
}
