package WarTool;

public class Armor extends Item implements Upgradeable {

	private int defencePoints;
	private boolean isWorn;
	
	public Armor(int itemQuantity, int itemPrice, int itemWeight) {
		super(itemQuantity, itemPrice, itemWeight);
		this.defencePoints = defencePoints;
		this.isWorn = isWorn;
		
	}
	public int getDefencePoints() {
		return defencePoints;
	}

	public void setDefencePoints(int defencePoints) {
		this.defencePoints = defencePoints;
	}

	public boolean isWorn() {
		return isWorn;
	}

	public void setWorn(boolean isWorn) {
		this.isWorn = isWorn;
	}
	public void getHit(int damageAmount) {
		if(isWorn) {
		if (defencePoints > damageAmount) {
			defencePoints = defencePoints - damageAmount;
			isWorn=true;
		} else {
			defencePoints = 0;
			isWorn = false;
		}
	  }
	}
	@Override
	public void upGrade() {
		defencePoints += 100;

	}

	@Override
	public String toString() {
		return "Armor [defencePoints=" + defencePoints + ", isWorn=" + isWorn + "]";
	}	
	
}
