//~~~~~~~~IMPORTS~~~~~~~~
import cs1.Keyboard;

public class Team {
    
    //~~~~~~~~INSTANCE VARIABLES~~~~~~~~
    public String userName;  //the name of the user but will display as "Coach <name>".
    public String teamName;  //the team that the user chooses to coach.
    public int teamRating;
    public int week;
    public Quarterback myQB;
    public Receiver myWR1, myWR2, myWR3;
    public Runningback myRB;
    public Linebacker myLB1, myLB2;
    public Cornerback myCB1, myCB2;
    public Safety mySS;

    //~~~~~~~~CONSTRUCTOR~~~~~~~~
    public Team() {
    	
    }
    
    public Team( String name , String team ) {
    	setUserName( name );
    	setTeamName( team );
    }
    
    public void setUserName( String name ) {
    	userName = name;
	}
    
    public void setupUser() {
    	System.out.println("\nHello Coach, What is your name? (Input Name)\n");
    	String name = Keyboard.readString();
    	System.out.println("\nCoach " + name + ", Is that right?");
		System.out.println("\nType 'Yes' to confirm, 'No' to change name.\n");
		String confirm = Keyboard.readString();
		if( confirm.equalsIgnoreCase("Yes") ) {
		    setUserName(name);
		    System.out.println("\nWelcome Coach " + name + "!");
		    return;
		}
		if( confirm.equalsIgnoreCase("No") ) {
		    setupUser();
		}
		else {
		    System.out.println("\nI couldn't quite get that.");
		    setupUser();
		}
    }
    
    public void setTeamName( String name ) {
	teamName = name;
	//menuBoard[1][1] = teamName;
    }

    public void setupTeam() {
	System.out.println("\nCoach " + userName + ", What team are you coaching this season? (Giants Eagles Browns Steelers Falcons)\n");
	String name = Keyboard.readString();
	if( name.equalsIgnoreCase("Giants") ) {
	    System.out.println("\nYou chose the Giants. Type 'Yes' to confirm, 'No' to change team.\n");
	    String confirm = Keyboard.readString();
	    if( confirm.equalsIgnoreCase("Yes") ) {
		setTeamName(name.toUpperCase());
		System.out.println("\nWelcome to the " + teamName + " Coach " + userName + "!");
		return;
	    }
	    if( confirm.equalsIgnoreCase("No") ) {
		setupTeam();
	    }
	    else {
		System.out.println("\nI couldn't quite get that.");
		setupTeam();
	    }
	    return;
	}
	if( name.equalsIgnoreCase("Eagles") ) {
	    System.out.println("\nYou chose the Eagles. Type 'Yes' to confirm, 'No' to change team.\n");
	    String confirm = Keyboard.readString();
	    if( confirm.equalsIgnoreCase("Yes") ) {
		setTeamName(name);
		System.out.println("\nWelcome to the " + teamName + " Coach " + userName + "!");
		return;
	    }
	    if( confirm.equalsIgnoreCase("No") ) {
		setupTeam();
	    }
	    else {
		System.out.println("\nI couldn't quite get that.");
		setupTeam();
	    }
	    return;
	}
	if( name.equalsIgnoreCase("Browns") ) {
	    System.out.println("\nYou chose the Browns. Type 'Yes' to confirm, 'No' to change team.\n");
	    String confirm = Keyboard.readString();
	    if( confirm.equalsIgnoreCase("Yes") ) {
		setTeamName(name);
		System.out.println("\nWelcome to the " + teamName + " Coach " + userName + "!");
		return;
	    }
	    if( confirm.equalsIgnoreCase("No") ) {
		setupTeam();
	    }
	    else {
		System.out.println("\nI couldn't quite get that.");
		setupTeam();
	    }
	    return;
	}
	if( name.equalsIgnoreCase("Steelers") ) {
	    System.out.println("\nYou chose the Steelers. Type 'Yes' to confirm, 'No' to change team.\n");
	    String confirm = Keyboard.readString();
	    if( confirm.equalsIgnoreCase("Yes") ) {
		setTeamName(name);
		System.out.println("\nWelcome to the " + teamName + " Coach " + userName + "!");
		return;
	    }
	    if( confirm.equalsIgnoreCase("No") ) {
		setupTeam();
	    }
	    else {
		System.out.println("\nI couldn't quite get that.");
		setupTeam();
	    }
	    return;
	}
	if( name.equalsIgnoreCase("Falcons") ) {
	    System.out.println("\nYou chose the Falcons. Type 'Yes' to confirm, 'No' to change team.\n");
	    String confirm = Keyboard.readString();
	    if( confirm.equalsIgnoreCase("Yes") ) {
		setTeamName(name);
		System.out.println("\nWelcome to the " + teamName + " Coach " + userName + "!");
		return;
	    }
	    if( confirm.equalsIgnoreCase("No") ) {
		setupTeam();
	    }
	    else {
		System.out.println("\nI couldn't quite get that.");
		setupTeam();
	    }
	    return;
	}
	else {
	    System.out.println("\nI couln't quite get that.");
	    setupTeam();
	}
    }

    public void setWeek(int i) {
	week = i;
    }

    public String toString() {
		String menu = "";
		menu += "========[" + teamName + "]======== \n";
		menu += "Coach " + userName + "'s Dashboard \n";
		menu += "Week " + week + " \n";
		menu += "~~~~~~~~~~~~~~~~~~~~\n";
		menu += "[1] Team stats \n";
		menu += "[2] Team budget \n";
		menu += "[3] Equipment \n";
		menu += "[4] Players \n";
		menu += "[5] Game On! \n";
		menu += "==================== \n";
		return menu;
    }

    public void dashboard() {
	String call = Keyboard.readString();
	if( call.equals("1") ) {
	    dashboard1();
	    return;
	}
	if( call.equals("2") ) {
	    dashboard2();
	    return;
	}
	if( call.equals("3") ) {
	    dashboard3();
	    return;
	}
	if( call.equals("4") ) {
	    dashboard4();
	    return;
	}
	if( call.equals("5") ) {
	    dashboard5();
	    return;
	}
	else {
	    System.out.println("\nInvalid choice\n");
	    this.toString();
	}
	
    }

    public void dashboard1() { //List Players, View Stats
	
    }
    
    public void dashboard2() { //View Budget, View Payroll

    }
    
    public void dashboard3() { //Buy Gear, Equip Gear
	
    }
    
    public void dashboard4() { //Draft Players, Team Roster
	
    }
    
    public void dashboard5() { //Play Game!!
	playGame();
	    
    }

    public void playGame() {
	week++;
	
    }
    
    public static void main( String[] args ) {
    Team Coach = new Team();
	System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
	Coach.setupUser();
	System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
	Coach.setupTeam();
	System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
	System.out.println(Coach); //Week 1
	Coach.dashboard(); 
    }
    
}
/* woo.java
*   - main method <> dialogue
*	<> make 5 teams
*/