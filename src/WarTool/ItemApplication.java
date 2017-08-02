package WarTool;

public class ItemApplication {
public static void main(String[] args) {
	Armor armor =new Armor(0, 7, 23);
	Sword sword =new Sword(1, 2, 4);
	Bow bow =new Bow(2, 4, 5,200);
	System.out.println(armor.toString());
	System.out.println(sword.toString());
	System.out.println(bow.toString());
  }
}
