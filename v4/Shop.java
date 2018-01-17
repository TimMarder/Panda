import cs1.Keyboard;

public class Shop {
    private static String menu = "\n~~~~~~Shop~~~~~~~\n[1]Browse Helmets\n[2]Browse Cleats\n[3]Browse Pads\n[4]Exit Shop\n";
    public static String[] helmets = {"Riddel ($x) +5 Team Rating", "Schutt ($x) +10 Team Rating", "Xenith ($x) +15 Team Rating"};
    public static String[] pads = {"Under Armour ($x) +5 Team Rating", "Adidas ($x) +10 Team Rating", "Nike ($x) +15 Team Rating"};
    public static String[] cleats = {"Alphas ($x) +5 Team Rating", "Highlights ($x) +10 Team Rating", "Untouchables ($x) +15 Team Rating"};
    public static String[] quarterbacks = {"MichaelVick", "TomBrady"};
    public static String[] receivers = {"MikeEvans", "DeseanJackson", "DezBryant"};
    public static String[] runningbacks = {"MattForte", "ToddGurley"};
    public static String[] linebackers = {"LukeKuechly", "RayLewis"};
    public static String[] cornerbacks = {"RichardSherman", "PatrickPeterson"};
    public static String[] safetys = {"EarlThomas", "KamChancellor"};

    public static String printArray(String[] s) {
	String retStr = "";
	for (int i = 0; i <= 2; i++) {
	    retStr += "[" + (i+1) + "]Purchase " + s[i] + "\n";
	}
	retStr += "[4]Back";
	return retStr;
    }

    public static void updateTeamStats(int n) {
	Team.teamRating += n;
    }
					  
    
    public static void openShop(){
	System.out.println(menu);
	int choice = Keyboard.readInt();
	if (choice == 1) {
	    buyHelm();
	}
	if (choice == 2) {
	    buyCleats();
	}
	if (choice == 3) {
	    buyPads();
	}
			 
    }

    public static void buyHelm() {
	System.out.println("\n~~~~~Helmets~~~~~");
	System.out.println(printArray(helmets));
	int choice = Keyboard.readInt();
	if (choice < 1 || choice > 4) {
	    System.out.println("Uh oh! Try again.");
	    buyHelm();
	}
	if (choice == 4) {
	    openShop();
	}
	if (choice == 1) {
	    updateTeamStats(5);
	}
	if (choice == 2) {
	    updateTeamStats(10);
	}
	if (choice == 3) {
	    updateTeamStats(15);
	}
    }

    public static void buyCleats() {
	System.out.println("\n~~~~~Cleats~~~~~");
	System.out.println(printArray(cleats));
	int choice = Keyboard.readInt();
	if (choice < 1 || choice > 4) {
	    System.out.println("Uh oh! Try again.");
	    buyHelm();
	}
	if (choice == 4) {
	    openShop();
	}
	if (choice == 1) {
	    updateTeamStats(5);
	}
	if (choice == 2) {
	    updateTeamStats(10);
	}
	if (choice == 3) {
	    updateTeamStats(15);
	}
    }

    public static void buyPads() {
	System.out.println("\n~~~~~Pads~~~~~");
	System.out.println(printArray(pads));
	int choice = Keyboard.readInt();
	if (choice < 1 || choice > 4) {
	    System.out.println("Uh oh! Try again.");
	    buyHelm();
	}
	if (choice == 4) {
	    openShop();
	}
	if (choice == 1) {
	    updateTeamStats(5);
	}
	if (choice == 2) {
	    updateTeamStats(10);
	}
	if (choice == 3) {
	    updateTeamStats(15);
	}
    }
    
    
    public static void main(String args[]) {
	/*Team yo = new Team();
	System.out.println(yo.teamRating);
	    
	openShop();
	System.out.println(yo.teamRating);
	*/
    }
}
