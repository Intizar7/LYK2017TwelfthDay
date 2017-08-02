package bookStore;

import java.util.ArrayList;

public class Customer {

	protected String UserName;
	protected String Surname;
	ArrayList<Purchase> purchaseHistory;
	protected int pursacheCount;
	


	public String getUserName() {
		return UserName;
	}



	public void setUserName(String userName) {
		UserName = userName;
	}



	public String getSurname() {
		return Surname;
	}



	public void setSurname(String surname) {
		Surname = surname;
	}



	public ArrayList<Purchase> getPurchaseHistory() {
		return purchaseHistory;
	}



	public void setPurchaseHistory(ArrayList<Purchase> purchaseHistory) {
		this.purchaseHistory = purchaseHistory;
	}



	public int getPursacheCount() {
		return pursacheCount;
	}



	public void setPursacheCount(int pursacheCount) {
		this.pursacheCount = pursacheCount;
	}



	public void placePurchase(Purchase purchase) {
		purchaseHistory.add(purchase);
	}
}
