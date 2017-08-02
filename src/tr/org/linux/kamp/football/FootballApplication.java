package tr.org.linux.kamp.football;

public class FootballApplication {

	public static void main(String[] args) {
		FootballClub fc1 = new FootballClub("Gençlerbirliği", "Kara kızıl", 1, "19 Mayıs", 25000);
		FootballClub fc2 = new FootballClub("Ankaragücü", "Sarı Lacivert", 1, "19 Mayıs", 25000);
		FootballRules rules = new FootballRules(fc1, fc2);
		System.out.println(rules.homeTeam.clubName);
		System.out.println(rules.guestTeam.clubName);
		rules.anOpponentScores(fc1);
		rules.anOpponentScores(fc2);
		rules.anOpponentScores(fc1);
		System.out.println(fc1.getClubName() + " " + rules.scoresOfHomeTeam + " " + fc2.clubName + " " + rules.scoresOfGuestTeam);
		rules.hasWinner();
		
}
}
