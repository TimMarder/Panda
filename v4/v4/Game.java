public class Game {
    
	private static int difficulty;
	private static int teamRating;

	public static void setTeamRating() {
		teamRating = Team.setTeamRating();
		System.out.println("Your team rating is " + teamRating);
	}

	public static void setDifficulty(int difficult) {
		if (difficult == 1) {
			difficulty = 60;
			return;
		}
		if (difficult == 2) {
			difficulty = 70;
			return;
		}
		if (difficult == 3) {
			difficulty = 80;
			return;
		}
		if (difficult == 4) {
			difficulty = 90;
			return;
		}
		else {
			System.out.println("Invalid difficulty. Something went wrong.");
		}	
	}


	public static void playGame() {
		System.out.println("GAME!!");
	}



}
