package WarTool;

public class Bow extends Weapon implements Upgradeable {

	
	private int numOfArrows;
	private int damageAmount;
	public Bow(int itemQuantity, int itemPrice, int itemWeight,int damageAmount) {
		super(itemQuantity, itemPrice, itemWeight);
		this.numOfArrows = numOfArrows;
		this.damageAmount=damageAmount;
	}
	public int getNumOfArrows() {
		return numOfArrows;
	}

	public void setNumOfArrows(int numOfArrows) {
		this.numOfArrows = numOfArrows;
	}
	@Override
	public void upGrade() {
		numOfArrows += 10;
	}	
	
	public boolean useItem() {

		if(numOfArrows<0) {
			return false;
		}else {
			return true;
		}
	}

	@Override
	public String toString() {
		return "Bow [itemQuantity=" + itemQuantity + ", damageAmount=" +damageAmount + "]";
	}


}
