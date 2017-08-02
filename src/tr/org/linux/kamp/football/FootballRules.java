	package tr.org.linux.kamp.football;


public class FootballRules extends Football {

	protected FootballClub homeTeam;
	protected FootballClub guestTeam;
	protected int scoresOfHomeTeam;
	protected int scoresOfGuestTeam;
	
	public FootballRules(FootballClub homeTeam, FootballClub guestTeam) {
		super();
		this.homeTeam = homeTeam;
		this.guestTeam = guestTeam;
	}
	@Override
	public void hasOpponent() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void moveTheBall() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void anOpponentScores(FootballClub club) {
		if(club.equals(homeTeam)) {
			scoresOfHomeTeam = scoresOfHomeTeam + 1;
		}
		else if(club.equals(guestTeam)) {
			scoresOfGuestTeam = scoresOfGuestTeam + 1;
		}
	}
	@Override
	void hasWinner() {
		if(scoresOfHomeTeam > scoresOfGuestTeam) {
			System.out.println(homeTeam.getClubName() + " kazandı");
		}
		else if(scoresOfGuestTeam > scoresOfHomeTeam) {
			System.out.println(guestTeam.getClubName() + " kazandı");
		}
		else System.out.println("Berabere");
		
	}
	@Override
	void hasHoliganizm() {
		// TODO Auto-generated method stub
		
	}
	@Override
	void playableWith22layers() {
		// TODO Auto-generated method stub
		
	}

}