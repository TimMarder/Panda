public class Football {

    //~~~~~~~~IMPORTS~~~~~~~~
    import cs1.Keyboard;
    
    //~~~~~~~~INSTANCE VARIABLES~~~~~~~~
    public String userName;  //the name of the user but will display as “Coach <name>”.
    public String teamName;  //the team that the user chooses to coach.
    public String menuBoard; //the coach’s dashboard for managing the team.

    //~~~~~~~~METHODS~~~~~~~~
    public void setUserName( String name ) {
	userName = name;
    }
    
    public void setupUser() {
	System.out.println("Hello Coach, What is your name? (Input Name)");
	String name = Keyboard.readString();
	System.out.println("Coach " + name + ", Is that right?");
	System.out.println("Type 'Yes' to confirm, 'No' to change name.");
	String confirm = Keyboard.readString();
	if( confirm.equals("Yes") ) {
	    setUserName(name);
	    System.out.println("Welcome Coach " + name + "!");
	}
	if( confirm.equals("No") ) {
	    setupUser();
	}
    }

    public void setTeamName( String name ) {
	teamName = name;
    }

    public void setupTeam() {
	//Giants Eagles Patriots Steelers Falcons
    }
    
}
