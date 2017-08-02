package tr.org.linux.kamp.football;

import java.awt.Color;
public class FootballClub extends Club {
	
	protected String stadiumName;
	protected int stadiumCapacity;

	public FootballClub(String clubName, String colors, int clubValue, String stadiumName, int stadium) {
		super(clubName, colors, clubValue);
		this.stadiumName = stadiumName;
		this.stadiumCapacity = stadiumCapacity;
	}

	public String getStadiumName() {
		return stadiumName;
	}

	public void setStadiumName(String stadiumName) {
		this.stadiumName = stadiumName;
	}

	public int getStadiumCapacity() {
		return stadiumCapacity;
	}

	public void setStadiumCapacity(int stadiumCapacity) {
		this.stadiumCapacity = stadiumCapacity;
	}
	
	

}
