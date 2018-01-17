//~~~~~~~~IMPORTS~~~~~~~~
import cs1.Keyboard;

public class Team {
    
    //~~~~~~~~INSTANCE VARIABLES~~~~~~~~
    public String userName;  //the name of the user but will display as "Coach <name>".
    public String teamName;  //the team that the user chooses to coach.
    public static int teamRating;
    public int week;
    public int wins, losses;
    public int balance;
    public static Quarterback myQB;
    public static Receiver myWR1, myWR2, myWR3;
    public static Runningback myRB;
    public static Linebacker myLB1, myLB2;
    public static Cornerback myCB1, myCB2;
    public static Safety mySS;

    //~~~~~~~~PLAYERS~~~~~~~~~~
    public static Quarterback EliManning = new Quarterback("Eli Manning", "Giants");
    public static Quarterback CarsonWentz = new Quarterback("Carson Wentz", "Eagles");
    public static Quarterback CodyKessler = new Quarterback("Cody Kessler", "Browns");
    public static Quarterback BenRoethlisberger = new Quarterback("Ben Roethlisberger", "Steelers");
    public static Quarterback MattRyan = new Quarterback("Matt Ryan", "Falcons");
    public static Quarterback MichaelVick = new Quarterback("Michael Vick");
    public static Quarterback TomBrady = new Quarterback("Tom Brady");
    // === [ Receivers ] ===
    public static Receiver OdellBeckham = new Receiver("Odell Beckham", "Giants");
    public static Receiver SterlingShepard = new Receiver("Sterling Shepard", "Giants");
    public static Receiver BrandonMarshall = new Receiver("Brandon Marshall", "Giants");
    public static Receiver AlshonJeffery = new Receiver("Alshon Jeffery", "Eagles");
    public static Receiver NelsonAgholor = new Receiver("Nelson Agholor", "Eagles");
    public static Receiver MackHollins = new Receiver("Mack Hollins", "Eagles");
    public static Receiver JoshGordon = new Receiver("Josh Gordon", "Browns");
    public static Receiver CoreyColeman = new Receiver("Corey Coleman", "Browns");
    public static Receiver KasenWilliams = new Receiver("Kasen Williams", "Browns");
    public static Receiver AntonioBrown = new Receiver("Antonio Brown", "Steelers");
    public static Receiver JujuSmith = new Receiver("Juju Smith", "Steelers");
    public static Receiver EliRogers = new Receiver("Eli Rogers", "Steelers");
    public static Receiver JulioJones = new Receiver("Julio Jones", "Falcons");
    public static Receiver MohamedSanu = new Receiver("Mohamed Sanu", "Falcons");
    public static Receiver TaylorGabriel = new Receiver("Taylor Gabriel", "Falcons");
    public static Receiver MikeEvans = new Receiver("Mike Evans");
    public static Receiver DeseanJackson = new Receiver("DeSean Jackson");
    public static Receiver DezBryant = new Receiver("Dez Bryant");
    // === [ Runningbacks ] ===
    public static Runningback OrleansDarkwa = new Runningback("Orleans Darkwa", "Giants");
    public static Runningback JayAjayi = new Runningback("Jay Ajayi", "Eagles");
    public static Runningback IsaiahCrowell = new Runningback("Isaiah Crowell", "Browns");
    public static Runningback LeveonBell = new Runningback("Leveon Bell", "Steelers");
    public static Runningback DevontaFreeman = new Runningback("Devonta Freeman", "Falcons");
    public static Runningback MattForte = new Runningback("Matt Forte");
    public static Runningback ToddGurley = new Runningback("Todd Gurley");
    
    //~~~~~~~~CONSTRUCTOR~~~~~~~~
    public Team() {
    	week = 1;
    	wins = 0;
    	losses = 0;
    }//End of Team()
    
    public Team( String name , String team ) {
    	this();
    	setUserName( name );
    	setTeamName( team );
    }//End of Team(name,team)
    
    public void setUserName( String name ) {
    	userName = name;
    }//End of setUserName(name)
    
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
	}//End of "Yes" loop
	if( confirm.equalsIgnoreCase("No") ) {
	    setupUser();
	}//End of "No" loop
	else {
	    System.out.println("\nI couldn't quite get that.");
	    setupUser();
	}//Returns user to prompt
    }//End of setupUser()
    
    public void setTeamName( String name ) {
	teamName = name;
    }//End of setTeamName(name)

    public void setupTeam() {
    	OffensivePlayers.setOffensivePlayerStats();
    	System.out.println("\nCoach " + userName + ", What team are you coaching this season? (Giants Eagles Browns Steelers Falcons)\n");
    	String name = Keyboard.readString();
    	if( name.equalsIgnoreCase("Giants") )
	    {
    		System.out.println("\nYou chose the Giants. Type 'Yes' to confirm, 'No' to change team.\n");
    		String confirm = Keyboard.readString();
    		if( confirm.equalsIgnoreCase("Yes") )
		    {
			setTeamName(name.toUpperCase());
			System.out.println("\nWelcome to the " + teamName + " Coach " + userName + "!");
			// -- Offensive Players --
			setQB(EliManning);
			setWR1(OdellBeckham);
			setWR2(SterlingShepard);
			setWR3(BrandonMarshall);
			setRB(OrleansDarkwa);
			// -- Defensive Players --
			/*setLB1(JonathanCasillas);
			setLB2(CurtisGrant);
			setCB1(EliApple);
			setCB2(DarrylMorris);
			setSS(CooperTaylor);*/
			return;
		    }//End of "Yes" loop
    		if( confirm.equalsIgnoreCase("No") )
		    {
    			setupTeam();
		    }//End of "No" loop, returns to prompt
    		else
		    {
    			System.out.println("\nI couldn't quite get that.");
    			setupTeam();
		    }//Returns to prompt
    		return;
	    }//End of Giants prompt
    	
    	if( name.equalsIgnoreCase("Eagles") ) 
	    {
    		System.out.println("\nYou chose the Eagles. Type 'Yes' to confirm, 'No' to change team.\n");
    		String confirm = Keyboard.readString();
    		if( confirm.equalsIgnoreCase("Yes") )
		    {
    			setTeamName(name);
    			System.out.println("\nWelcome to the " + teamName + " Coach " + userName + "!");
    			return;
		    }//End of "Yes" loop
    		if( confirm.equalsIgnoreCase("No") )
		    {
    			setupTeam();
		    }//End of "No" loop, returns to prompt
    		else
		    {
    			System.out.println("\nI couldn't quite get that.");
    			setupTeam();
		    }//Returns to prompt
    		return;
	    }//End of Eagles prompt
    	
    	if( name.equalsIgnoreCase("Browns") )
	    {
    		System.out.println("\nYou chose the Browns. Type 'Yes' to confirm, 'No' to change team.\n");
    		String confirm = Keyboard.readString();
    		if( confirm.equalsIgnoreCase("Yes") )
		    {
			setTeamName(name);
			System.out.println("\nWelcome to the " + teamName + " Coach " + userName + "!");
			return;
		    }//End of "Yes" loop
    		if( confirm.equalsIgnoreCase("No") )
		    {
    			setupTeam();
		    }//End of "No" loop, returns to prompt
    		else
		    {
    			System.out.println("\nI couldn't quite get that.");
    			setupTeam();
		    }//Returns to prompt
		return;
	    }//End of Browns prompt
    	
    	if( name.equalsIgnoreCase("Steelers") )
	    {
    		System.out.println("\nYou chose the Steelers. Type 'Yes' to confirm, 'No' to change team.\n");
    		String confirm = Keyboard.readString();
    		if( confirm.equalsIgnoreCase("Yes") )
		    {
    			setTeamName(name);
    			System.out.println("\nWelcome to the " + teamName + " Coach " + userName + "!");
    			return;
		    }//End of "Yes" loop
    		if( confirm.equalsIgnoreCase("No") )
		    {
    			setupTeam();
		    }//End of "No" loop, returns to prompt
    		else
		    {
    			System.out.println("\nI couldn't quite get that.");
    			setupTeam();
		    }//Returns to prompt
		return;
	    }//End of Steelers prompt
    	
    	if( name.equalsIgnoreCase("Falcons") ) {
	    System.out.println("\nYou chose the Falcons. Type 'Yes' to confirm, 'No' to change team.\n");
	    String confirm = Keyboard.readString();
	    if( confirm.equalsIgnoreCase("Yes") ) {
		setTeamName(name);
		System.out.println("\nWelcome to the " + teamName + " Coach " + userName + "!");
		return;
	    }//End of "Yes" loop
	    if( confirm.equalsIgnoreCase("No") ) {
		setupTeam();
	    }//End of "No" loop, returns to prompt
	    else {
		System.out.println("\nI couldn't quite get that.");
		setupTeam();
	    }//Returns to prompt
	    return;
    	}//End of Falcons prompt
    	
    	else
	    {
    		System.out.println("\nI couln't quite get that.");
    		setupTeam();
	    }//Returns to prompt
    	
    }//End of setupTeam()

    public void setWeek(int i) {
    	week = i;
    }//end of setWeek(i)

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
    }//End of toString()
    
    public void setQB( Quarterback qb ) {
    	myQB = qb;
    }//End of setQB(qb)
    public Quarterback getQB() {
    	return myQB;
    }//End of getQB()
    
    public void setWR1( Receiver wr ) {
    	myWR1 = wr;
    }//End of setWR1(wr)
    public Receiver getWR1(){
    	return myWR1;
    }//End of getWR1()
    
    public void setWR2( Receiver wr ) {
    	myWR2 = wr;
    }//End of setWR2(wr)
    public Receiver getWR2(){
    	return myWR2;
    }//End of getWR2()
    
    public void setWR3( Receiver wr ) {
    	myWR3 = wr;
    }//End of setWR3(wr)
    public Receiver getWR3(){
    	return myWR3;
    }//End of getWR3()
    
    public void setRB( Runningback rb ) {
    	myRB = rb;
    }//End of setRB(rb)
    public Runningback getRB(){
    	return myRB;
    }//End of getRB()
    
    public void setWR1( Linebacker lb ) {
    	myLB1 = lb;
    }//End of setLB1(lb)
    public Linebacker getLB1(){
    	return myLB1;
    }//End of getLB1()
    
    public void setWR2( Linebacker lb ) {
    	myLB2 = lb;
    }//End of setLB2(lb)
    public Linebacker getLB2(){
    	return myLB2;
    }//End of getLB2()
    
    public void setCB1( Cornerback cb ) {
    	myCB1 = cb;
    }//End of setCB1(cb)
    public Cornerback getCB1(){
    	return myCB1;
    }//End of getCB1()

    public void setCB2( Cornerback cb ) {
    	myCB2 = cb;
    }//End of setCB2(cb)
    public Cornerback getCB2(){
    	return myCB2;
    }//End of getCB2()
      
    public void setSS( Safety ss ) {
    	mySS = ss;
    }//End of setSS(ss)
    public Safety getSS(){
    	return mySS;
    }//End of getSS()

    public void dashboard() {
    	String call = Keyboard.readString();
    	if( call.equals("1") ) {
	    dashboard1();
	    return;
    	}//Calls option 1
    	
    	if( call.equals("2") ) {
	    dashboard2();
	    return;
    	}//Calls option 2
    	
    	if( call.equals("3") ) {
	    dashboard3();
	    return;
    	}//Calls option 3
    	
    	if( call.equals("4") ) {
	    dashboard4();
	    return;
    	}//Calls option 4
    	
    	if( call.equals("5") ) {
	    dashboard5();
	    return;
    	}//Calls option 5
    	
    	else
	    {
		System.out.println("\nInvalid choice\n");
		this.dashboard();
	    }//Invalid call, returns to prompt
	
    }//End of dashboard()
    
    public void dashboard1() { //List Players, View Stats
	String db1 = "\n";
	db1 += "1) List Players\n";
	db1 += "2) Return to Dashboard\n";
	System.out.println(db1);
	
	String call = Keyboard.readString();
	if ( call.equals("1") )
	    {
		System.out.println("\nCoach" + teamName + "'s team\n");
		listPlayers();
	    }//Option 1, Lists players
	if ( call.equals("2") )
	    {
		System.out.println("\nReturning to Dashboard.\n");
		dashboard();
	    }//Option 2, Returns to Dashboard
	else
	    {
		System.out.println("\nInvalid input. Returning to Dashboard.\n");
		dashboard1();
	    }//Returns to Dashboard
	
    }//End of dashboard1()

    public void listPlayers() {
	System.out.println("\nOffensive Players");
	System.out.println(myQB);
	System.out.println(myWR1);
	System.out.println(myWR2);
	System.out.println(myWR3);
	System.out.println(myRB);
	System.out.println("Defensive Players");
	System.out.println(myLB1);
	System.out.println(myLB2);
 	System.out.println(myCB1);
	System.out.println(myCB2);
	System.out.println(mySS);

	String lp = "\n";
	lp += "1) Return to Dashboard\n";
	System.out.println(lp);
	
	String call = Keyboard.readString();
	if ( call.equals("1") )
	    {
		System.out.println("\nReturning to Dashboard.\n");
	        dashboard();
	    }//Option 1, Returns to Dashboard
	else
	    {
		System.out.println("\nInvalid input. Returning to Dashboard.\n");
		dashboard1();
	    }//Returns to Dashboard
	
    }//End of listPlayers()
    
    public void dashboard2() { //View Budget, View Payroll	
	String db2 = "\n";
	db2 += "1) View Budget\n";
	db2 += "2) View Payroll\n";
	System.out.println(db2);
	
	String call = Keyboard.readString();
	if ( call.equals("1") )
	    {
		System.out.println("\nCoach" + teamName + "'s Budget\n");
		balancePrint();
	    }//Option 1, Displays Budget
	if ( call.equals("2") )
	    {
		System.out.println("\nCoach" + teamName + "'s Payroll\n");
	        payroll();
	    }//Option 2, Opens Payroll
	else
	    {
		System.out.println("\nInvalid input. Returning to Dashboard.\n");
		dashboard2();
	    }//Returns to Dashboard

    }//End of dashboard2()

    public void balancePrint() {
	System.out.println("Your balance: " + balance + "\n");
	String bp = "\n";
	bp += "1) Return to Dashboard\n";
	System.out.println(bp);
	
	String call = Keyboard.readString();
	if ( call.equals("1") )
	    {
		System.out.println("\nCoach" + teamName + "'s Budget\n");
		balancePrint();
	    }//Option 1, Displays Budget
	if ( call.equals("2") )
	    {
		System.out.println("\nCoach" + teamName + "'s Payroll\n");
	        payroll();
	    }//Option 2, Opens Payroll
	else
	    {
		System.out.println("\nInvalid input. Returning to Dashboard.\n");
		dashboard2();
	    }//Returns to Dashboard
    }
    public void payroll() {
	
    }//End of payroll()
    
    public void dashboard3() { //Buy Gear, Equip Gear	
	String db3 = "";
	System.out.println(db3);
    }//End of dashboard3()
    
    public void dashboard4() { //Draft Players, Team Roster
	String db4 = "";
	System.out.println(db4);
    }//End of dashboard4()
    


    public void dashboard5() { //Play Game!!
	System.out.println("You are about to start a game, are you sure?");
	System.out.println("Type 'Yes' to play or 'No' to go back");
	String call = Keyboard.readString();
	if (call.equalsIgnoreCase("Yes")) {
		Game.setTeamRating();
		Game.setDifficulty(week);
		Game.playGame();
		return;
	}
	if (call.equalsIgnoreCase("No")) {
		System.out.println("Returning to dashboard...\n");
		dashboard();
	}
	else {
		System.out.println("Invalid input. Try again.\n");
		dashboard5();
	}

    }//End of dashboard5()

    public static int setTeamRating(){
    	teamRating =
    	(myQB.playerRating + myWR1.playerRating + myWR2.playerRating +
    	myWR3.playerRating + myRB.playerRating) / 5;
    	return teamRating;
    }

    public void playGame() {
	setWeek( week + 1 );
    }//End of playGame()
    
    public static void main( String[] args ) {

    }//End of main
    
}//End of Team
