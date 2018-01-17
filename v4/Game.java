import cs1.Keyboard;

public class Game {    


	private static int difficulty;
	private static int teamRating;
	private static String winToss;
	private static String oppWinTossOption;
	private static int yard;
	private static int oppYard;
	private static int returnedYardTo;
	private static boolean playedOffense;
	private static boolean playedDefense;
	private static int downCounter;
	private static int oppDownCounter;
	private static int yardsToGo;
	private static int oppYardsToGo;
	private static double chance;
	private static int yardsGot;
	private static int oppYardsGot;
	private static int myScore;
	private static int theirScore;


	public Game() {
		playedOffense = false;
		playedDefense = false;
	}


	public static void setTeamRating() {
		teamRating = Team.setTeamRating();
		System.out.println("\nYour team rating is " + teamRating);
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


	public static void coinToss() {
		if (Math.random() > 0.5) {
			winToss = "Heads";
		}
		else {
			winToss = "Tails";
		}
		System.out.println("\nWhat is the call? Heads or Tails?\n");
		String coinChoice = Keyboard.readString();
		if (coinChoice.equalsIgnoreCase("Heads")) {
			System.out.println("\nYou chose Heads!\n");
			if (coinChoice.equalsIgnoreCase(winToss)) {
				System.out.println("It is Heads! You win the toss!\n");
				winToss();
				return;
			}
			else {
				System.out.println("It is Tails! You lose the toss!\n");
				loseToss();
				return;
			}
		}
		if (coinChoice.equalsIgnoreCase("Tails")) {
			System.out.println("\nYou chose Tails!\n");
			if (coinChoice.equalsIgnoreCase(winToss)) {
				System.out.println("It is Tails! You win the toss!\n");
				winToss();
				return;
			}
			else {
				System.out.println("It is Heads! You lose the toss!\n");
				loseToss();
				return;
			}
		}
		else {
			System.out.println("Invalid input. Try again.\n");
			coinToss();
		}
	}

	public static void winToss() {
		System.out.println("What would you like to do? Kick or Receive?\n");
		String choice = Keyboard.readString();
		if (choice.equalsIgnoreCase("Kick")) {
			System.out.println("You have chosen to kickoff the ball!\n");
			kickoff();
			return;
		}
		if (choice.equalsIgnoreCase("Receive")) {
			System.out.println("You have chosen to receive the ball!\n");
			receive();
			return;
		}
		else {
			System.out.println("Invaid Input. Try Again.\n");
			winToss();
		}
	}

	public static void loseToss() {
		if (Math.random() > 0.5) {
			oppWinTossOption = "kick";
		}
		else {
			oppWinTossOption = "receive";
		}
		System.out.println("The opponent has chosen to " + oppWinTossOption + " the ball!\n");
		if (oppWinTossOption.equalsIgnoreCase("kick")) {
			receive();
		}
		else {
			kickoff();
		}
	}

	public static int receiveCatch() {
		return (int) (Math.random() * 19) + 1;
	}

	public static int receiveReturn() {
		returnedYardTo = (int) (Math.random() * 29) + 21;
		return returnedYardTo;
	}

	public static void kickoff() {
		System.out.println("YOU KICKED OFF THE BALL!\n");
		System.out.println("The opposing team's returner caught the ball at the " + receiveCatch() + " yard line and returned it to the " + receiveReturn() + " yard line.\n");
		oppYard = returnedYardTo;
		oppDownCounter = 1;
		oppYardsToGo = 10;
		Defense();
	}

	public static void receive() {
		System.out.println("YOU RECEIVED THE BALL!\n");
		System.out.println("Your returner caught the ball at the " + receiveCatch() + " yard line and returned it to the " + receiveReturn() + " yard line.\n");
		yard = returnedYardTo;
		downCounter = 1;
		yardsToGo = 10;
		Offense();
	}


	public static void yardUpdater() {
		String down = new String();
		if (downCounter == 1) {
			down = "1st";
		}
		if (downCounter == 2) {
			down = "2nd";
		}
		if (downCounter == 3) {
			down = "3rd";
		}
		if (downCounter == 4) {
			down = "4th";
		}
		System.out.println("==============================");
		System.out.println("You are on " + down + " & " + yardsToGo + " on the " + yard + " yard line");
		System.out.println("==============================");
	}


	public static void Offense() {

		yardUpdater();
		System.out.println("What would you like to do?");
		System.out.println("[1] Run");
		System.out.println("[2] Short Pass");
		System.out.println("[3] Long Pass");
		int choice = Keyboard.readInt();
		if (choice == 1) {
			run();
			return;
		}
		if (choice == 2) {
			shortPass();
			return;
		}
		if (choice == 3) {
			longPass();
			return;
		}
		else {
			System.out.println("Invalid Input. Try Again.\n");
			Offense();
		}

		playedOffense = true;
	}

	public static void run() {

		if (Math.random() < ((chance / 100) - 0.3)) {
			goodRun();
			return;
		}
		if (Math.random() < 0.2) {
			badRun();
			return;
		}
		else {
			averageRun();
		}
	}

	public static int goodRunYards() {
		yardsGot = ((int)(Math.random() * 13)) + 7;
		return yardsGot;
	}

	public static int averageRunYards() {
		yardsGot = ((int)(Math.random() * 5)) + 2;
		return yardsGot;
	}

	public static int badRunYards() {
		yardsGot = -((int)(Math.random() * 3)) + 1;
		return yardsGot;
	}

	public static void goodRun() {
		System.out.println(Team.myRB.name + " has gotten a huge run of " + goodRunYards() + " yards.\n");
		yard += yardsGot;
		checkTouchdown();
		convertFirst();
	}

	public static void averageRun() {
		System.out.println(Team.myRB.name + " has ran " + averageRunYards() + " yards.\n");
		yard += yardsGot;
		checkTouchdown();
		convertFirst();
	}

	public static void badRun() {
		System.out.println(Team.myRB.name + " got tackled in the backfield for a loss of " + (badRunYards() * -1) + " yards.\n");
		yard += yardsGot;
		checkTouchdown();
		convertFirst();
	}

	public static void shortPass() {
		if (Math.random() < ((chance / 100) - 0.3)) {
			goodPass();
			return;
		}
		if (Math.random() < 0.1) {
			getIntercepted();
			return;
		}
		else {
			averagePass();
		}
	}

	public static void longPass() {
		if (Math.random() < ((chance / 100) - 0.1)) {
			goodPass();
			return;
		}
		if (Math.random() < 0.2) {
			getIntercepted();
			return;
		}
		else {
			averagePass();
		}
	}

	public static int goodPassYards() {
		yardsGot = ((int)(Math.random() * 14)) + 6;
		return yardsGot;
	}

	public static int averagePassYards() {
		yardsGot = ((int)(Math.random() * 7)) + 3;
		return yardsGot;
	}

	public static void goodPass() {
		System.out.println(Team.myQB.name + " has thrown a great pass to " + Team.myWR1.name + " for " + goodPassYards() + " yards.\n");
		yard += yardsGot;
		checkTouchdown();
		convertFirst();
	}

	public static void averagePass() {
		System.out.println(Team.myQB.name + " has thrown a pass to " + Team.myWR2.name + " for " + averagePassYards() + " yards.\n");
		yard += yardsGot;
		checkTouchdown();
		convertFirst();
	}

	public static void getIntercepted() {
		System.out.println(Team.myQB.name + " got INTERCEPTED while trying to pass to " + Team.myWR3.name + "!");
		Defense();
	}

	public static void turnoverCheck() {
		if (downCounter == 5) {
			System.out.println("Turnover! The ball goes to the opponent!");
			oppYard = 100 - yard;
			oppDownCounter = 1;
			oppYardsToGo = 10;
			Defense();
			return;
		}
		else {
			Offense();
		}
	}

	public static void convertFirst() {
		if (yardsToGo - yardsGot <= 0 ) {
			downCounter = 1;
			yardsToGo = 10;
			Offense();
			return;
		}
		else {
			downCounter += 1;
			yardsToGo -= yardsGot;
			turnoverCheck();
			return;
		}
	}

	public static void checkTouchdown() {
		if (yard >= 100) {
			touchdown();
		}
	}

	public static void touchdown() {
		System.out.println("TOUCHDOWN!\n");
		System.out.println("Ball Goes to Opponent\n");
		myScore += 6;
		checkWin();
		return;
	}

	public static void oppYardUpdater() {
		String down = new String();
		if (oppDownCounter == 1) {
			down = "1st";
		}
		if (oppDownCounter == 2) {
			down = "2nd";
		}
		if (oppDownCounter == 3) {
			down = "3rd";
		}
		if (oppDownCounter == 4) {
			down = "4th";
		}
		System.out.println("==============================");
		System.out.println("They are on " + down + " & " + oppYardsToGo + " on the " + oppYard + " yard line");
		System.out.println("==============================");
	}

	public static void Defense() {
		oppYardUpdater();
		System.out.println("What would you like to do?");
		System.out.println("[1] Zone Coverage");
		System.out.println("[2] Man Coverage");
		System.out.println("[3] Blitz");
		int choice = Keyboard.readInt();
		if (choice == 1) {
			zone();
			return;
		}
		if (choice == 2) {
			man();
			return;
		}
		if (choice == 3) {
			blitz();
			return;
		}
		else {
			System.out.println("Invalid Input. Try Again.\n");
			Defense();
		}

		playedDefense = true;
	}

	public static int goodCoverYards() {
		oppYardsGot = ((int)(Math.random() * 3)) + 1;
		return oppYardsGot;
	}


	public static int badCoverYards() {
		oppYardsGot = ((int)(Math.random() * 13)) + 7;
		return oppYardsGot;
	}

	public static void badCover() {
		System.out.println("Their runningback got tackled after " + badCoverYards() + " yards.\n");
		oppYard += oppYardsGot;
		oppCheckTouchdown();
		oppConvertFirst();
	}

	public static void goodCover() {
		System.out.println("Their runningback got tackled after " + goodCoverYards() + " yards.\n");
		oppYard += oppYardsGot;
		oppCheckTouchdown();
		oppConvertFirst();
	}

	public static void zone() {
		if (Math.random() < ((chance / 100) - 0.4)) {
			badCover();
			return;
		}
		else {
			goodCover();
		}
	}

	public static void man() {
		if (Math.random() < ((chance / 100) - 0.3)) {
			badCover();
			return;
		}
		if (Math.random() < 0.15) {
			interception();
			return;
		}
		else {
			goodCover();
		}
	}

	public static void blitz() {
		if (Math.random() < ((chance / 100) - 0.2)) {
			badCover();
			return;
		}
		if (Math.random() < 0.2) {
			sack();
			return;
		}
		else {
			goodCover();
		}

	}

	public static void interception() {
		System.out.println("INTERCEPTION!\n");
		System.out.println("You are now on offense!\n");
		Offense();
	}

	public static void sack() {
		System.out.println("SACK!\n");
		System.out.println("You have successfully sacked their quarterback!\n");
		oppYard =- 5;
		oppDownCounter += 1;
		return;
	}

	public static void oppConvertFirst() {
		if (oppYardsToGo - oppYardsGot <= 0 ) {
			oppDownCounter = 1;
			oppYardsToGo = 10;
			Defense();
			return;
		}
		else {
			oppDownCounter += 1;
			oppYardsToGo -= oppYardsGot;
			oppTurnoverCheck();
			return;
		}
	}

	public static void oppTurnoverCheck() {
		if (oppDownCounter == 5) {
			System.out.println("Turnover! The ball goes to you!");
			yard = 100 - oppYard;
			downCounter = 1;
			yardsToGo = 10;
			Offense();
			return;
		}
		else {
			Defense();
		}
	}

	public static void oppCheckTouchdown() {
		if (oppYard >= 100) {
			oppTouchdown();
		}
	}

	public static void oppTouchdown() {
		System.out.println("OPONNENT SCORED A TOUCHDOWN!\n");
		System.out.println("Ball Goes to You!\n");
		theirScore += 6;
		checkWin();
		return;
	}

	public static void checkWin() {
		while (myScore >= 18 || theirScore >= 18) {
			if (myScore > theirScore) {
				win();
				break;
			}
			else {
				lose();
				break;
			}
		}
		while (myScore < 18 && theirScore < 18) {
			scoreUpdater();
			receive();
			break;
		}
	}

	public static void win() {
		System.out.println("YOU WON!!!\n");
		System.out.println("Final score is " + myScore + "-" + theirScore + "!\n");
		System.out.println("You are rewarded $" + (25 * difficulty) + "!\n");
	}

	public static void lose() {
		System.out.println("OPPONENT WINS!!!\n");
		System.out.println("Final score is " + myScore + "-" + theirScore + "!\n");
		System.out.println("Here is a small amount of money to upgrade your players and hopefully win next time! ( $" + (10 * difficulty) + " )");
	}

	public static void setChance() {
		if (teamRating > difficulty) {
			chance = ((teamRating - difficulty) + 50);
		}
		else {
			chance = ((difficulty * -1) + teamRating + 50);
		}
	}

	public static void scoreUpdater() {
		System.out.println("~~ The score is " + myScore + "-" + theirScore + " ~~");
	}

	public static void playGame() {
		setChance();
		coinToss();
	}



}
