package bookStore;

import java.util.ArrayList;

public class BookApplication {
public static void main(String[] args) {
	
	Customer customer = new Customer();
	Purchase purchase = new Purchase();
	ShoppingCard shoppingCard =new ShoppingCard();
	
	customer.setUserName("IntiSoft");
	System.out.println(customer.getUserName());
	
}
}
