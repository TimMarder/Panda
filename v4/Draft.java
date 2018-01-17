import cs1.Keyboard;

public class Draft {
    public static String[] quarterbacks = {"Michael Vick", "Tom Brady"};
    public static String[] receivers = {"Mike Evans", "Desean Jackson"};
    public static String[] runningbacks = {"Matt Forte", "Todd Gurley"};
    public static String[] linebackers = {"Luke Kuechly", "Ray Lewis"};
    public static String[] cornerbacks = {"Richard Sherman", "Patrick Peterson"};
    public static String[] safetys = {"Earl Thomas", "Kam Chancellor"};


    public static void openDraft() {
	System.out.println("~~~~~Draft Players~~~~~\n[1]Browse Quarterbacks\n[2]Browse Receivers\n[3]Browse Runningbacks\n[4]Browse Linebackers\n[5]Browse Cornerbacks\n[6]Browse safetys");
	int choice = Keyboard.readInt();
	if (choice == 1) {
	    draftQB();
	}
	else if (choice == 2) {
	    draftWR();
	}
	else if (choice == 3) {
	    draftRB();
	}
	else if (choice == 4) {
	    draftLB();
	}
	else if (choice == 5) {
	    draftCB();
	}
	else if (choice == 6) {
	    draftSS();
	}
	else {
	    System.out.println("Uh oh! Try Again.");
	    openDraft();
	}
    }

    public static void updateTeamStats(int n) {
	Team.teamRating += n;
    }

    public static String printArray(String[] s) {
	String retStr = "";
	for (int i = 0; i <= 1; i++) {
	    retStr += "[" + (i+1) + "]Purchase " + s[i] + "\n";
	}
	retStr += "[3]Back\n";
	return retStr;
    }
    
    public static void draftQB() {
	System.out.println("\n~~~~~Quarterbacks~~~~~");
	System.out.println(printArray(quarterbacks));
	int choice = Keyboard.readInt();
	if (choice == 1) {
	    updateTeamStats(2);
	}
	else if (choice == 2) {
	    updateTeamStats(5);
	}
	else if (choice == 3) {
	    openDraft();
	}
	else {
	    System.out.println("Uh oh! Try again.");
	    draftQB();
	}
    }

    public static void draftWR() {
	System.out.println("\n~~~~~Receivers~~~~~");
	System.out.println(printArray(receivers));
	int choice = Keyboard.readInt();
	if (choice == 1) {
	    updateTeamStats(2);
	}
	else if (choice == 2) {
	    updateTeamStats(5);
	}
	else if (choice == 3) {
	    openDraft();
	}
	else {
	    System.out.println("Uh oh! Try again.");
	    draftWR();
	}
    }

    public static void draftRB() {
	System.out.println("\n~~~~~Runningbacks~~~~~");
	System.out.println(printArray(runningbacks));
	int choice = Keyboard.readInt();
	if (choice == 1) {
	    updateTeamStats(2);
	}
	else if (choice == 2) {
	    updateTeamStats(5);
	}
	else if (choice == 3) {
	    openDraft();
	}
	else {
	    System.out.println("Uh oh! Try again.");
	    draftRB();
	}
    }

    public static void draftLB() {
	System.out.println("\n~~~~~Linebackers~~~~~");
	System.out.println(printArray(linebackers));
	int choice = Keyboard.readInt();
	if (choice == 1) {
	    updateTeamStats(2);
	}
	else if (choice == 2) {
	    updateTeamStats(5);
	}
	else if (choice == 3) {
	    openDraft();
	}
	else {
	    System.out.println("Uh oh! Try again.");
	    draftLB();
	}
    }

    public static void draftCB() {
	System.out.println("\n~~~~~Cornerbacks~~~~~");
	System.out.println(printArray(cornerbacks));
	int choice = Keyboard.readInt();
	if (choice == 1) {
	    updateTeamStats(2);
	}
	else if (choice == 2) {
	    updateTeamStats(5);
	}
	else if (choice == 3) {
	    openDraft();
	}
	else {
	    System.out.println("Uh oh! Try again.");
	    draftCB();
	}
    }

    public static void draftSS() {
	System.out.println("\n~~~~~Safeties~~~~~");
	System.out.println(printArray(safetys));
	int choice = Keyboard.readInt();
	if (choice == 1) {
	    updateTeamStats(2);
	}
	else if (choice == 2) {
	    updateTeamStats(5);
	}
	else if (choice == 3) {
	    openDraft();
	}
	else {
	    System.out.println("Uh oh! Try again.");
	    draftSS();
	}
    }
    
    public static void main(String args[]) {
	openDraft();
    }
}
