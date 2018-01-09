//~~~~~~~~IMPORTS~~~~~~~~
import cs1.Keyboard;

public class Football {
    
    //~~~~~~~~INSTANCE VARIABLES~~~~~~~~
    public String userName;  //the name of the user but will display as "Coach <name>".
    public String teamName;  //the team that the user chooses to coach.
    public String[][] menuBoard = new String[2][2]; //the coach’s dashboard for managing the team.

    //~~~~~~~~CONSTRUCTOR~~~~~~~~
    public Football() {
	menuBoard[0][0] = "NAME: ";
	menuBoard[1][0] = "TEAM: ";
    }
    //~~~~~~~~METHODS~~~~~~~~
    public void setUserName( String name ) {
	userName = name;
	menuBoard[0][1] = userName;
    }
    
    public void setupUser() {
	System.out.println("\nHello Coach, What is your name? (Input Name)\n");
	String name = Keyboard.readString();
	System.out.println("\nCoach " + name + ", Is that right?");
	System.out.println("\nType 'Yes' to confirm, 'No' to change name.\n");
	String confirm = Keyboard.readString();
	if( confirm.equals("Yes") ) {
	    setUserName(name);
	    System.out.println("\nWelcome Coach " + name + "!");
	    return;
	}
	if( confirm.equals("No") ) {
	    setupUser();
	}
	else {
	    System.out.println("\nI couldn't quite get that.");
	    setupUser();
	}
    }

    public void setTeamName( String name ) {
	teamName = name;
	menuBoard[1][1] = teamName;
    }

    public void setupTeam() {
	System.out.println("\nCoach " + userName + ", What team are you coaching this season? (Giants Eagles Patriots Steelers Falcons)\n");
	String name = Keyboard.readString();
	if( name.equals("Giants") ) {
	    System.out.println("\nYou chose the Giants. Type 'Yes' to confirm, 'No' to change team.\n");
	    String confirm = Keyboard.readString();
	    if( confirm.equals("Yes") ) {
		setTeamName(name);
		System.out.println("\nWelcome to the " + teamName + " Coach " + userName + "!");
		return;
	    }
	    if( confirm.equals("No") ) {
		setupTeam();
	    }
	    else {
		System.out.println("\nI couldn't quite get that.");
		setupTeam();
	    }
	    return;
	}
	if( name.equals("Eagles") ) {
	    System.out.println("\nYou chose the Eagles. Type 'Yes' to confirm, 'No' to change team.\n");
	    String confirm = Keyboard.readString();
	    if( confirm.equals("Yes") ) {
		setTeamName(name);
		System.out.println("\nWelcome to the " + teamName + " Coach " + userName + "!");
		return;
	    }
	    if( confirm.equals("No") ) {
		setupTeam();
	    }
	    else {
		System.out.println("\nI couldn't quite get that.");
		setupTeam();
	    }
	    return;
	}
	if( name.equals("Patriots") ) {
	    System.out.println("\nYou chose the Patriots. Type 'Yes' to confirm, 'No' to change team.\n");
	    String confirm = Keyboard.readString();
	    if( confirm.equals("Yes") ) {
		setTeamName(name);
		System.out.println("\nWelcome to the " + teamName + " Coach " + userName + "!");
		return;
	    }
	    if( confirm.equals("No") ) {
		setupTeam();
	    }
	    else {
		System.out.println("\nI couldn't quite get that.");
		setupTeam();
	    }
	    return;
	}
	if( name.equals("Steelers") ) {
	    System.out.println("\nYou chose the Steelers. Type 'Yes' to confirm, 'No' to change team.\n");
	    String confirm = Keyboard.readString();
	    if( confirm.equals("Yes") ) {
		setTeamName(name);
		System.out.println("\nWelcome to the " + teamName + " Coach " + userName + "!");
		return;
	    }
	    if( confirm.equals("No") ) {
		setupTeam();
	    }
	    else {
		System.out.println("\nI couldn't quite get that.");
		setupTeam();
	    }
	    return;
	}
	if( name.equals("Falcons") ) {
	    System.out.println("\nYou chose the Falcons. Type 'Yes' to confirm, 'No' to change team.\n");
	    String confirm = Keyboard.readString();
	    if( confirm.equals("Yes") ) {
		setTeamName(name);
		System.out.println("\nWelcome to the " + teamName + " Coach " + userName + "!");
		return;
	    }
	    if( confirm.equals("No") ) {
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

    public String toString() {
	String arr = "";
	for( int i = 0; i < menuBoard.length; i++ ) {
	    arr += "| ";
	    for( int j = 0; j < menuBoard.length; j++ ) {
		arr += menuBoard[i][j] + " ";
	    }
	    arr += "|\n";
	}
	return arr;
    }
    
    public static void main( String[] args ) {
	Football Coach1 = new Football();
	System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
	Coach1.setupUser();
	System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
	Coach1.setupTeam();
	System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
	System.out.println(Coach1);
    }
    
}
