//~~~~~~~~IMPORTS~~~~~~~~
import cs1.Keyboard;

public class Team {
    
    //~~~~~~~~INSTANCE VARIABLES~~~~~~~~
    public String userName;  //the name of the user but will display as "Coach <name>".
    public String teamName;  //the team that the user chooses to coach.
    public String myPayroll;
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
    // === [ Quarterbacks ] ===
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
    // === [ Linebackers ] ===
    public static Linebacker JonathanCasillas = new Linebacker("Jonathan Casillas", "Giants");
    public static Linebacker CurtisGrant = new Linebacker("Curtis Grant", "Giants");
    public static Linebacker JoeWalker = new Linebacker("Joe Walker", "Eagles");
    public static Linebacker MychalKendricks = new Linebacker("Mychal Kendricks", "Eagles");
    public static Linebacker JamieCollins = new Linebacker("Jamie Collins", "Browns");
    public static Linebacker JoeSchobert = new Linebacker("Joe Schobert", "Browns");
    public static Linebacker RyanShazier = new Linebacker("Ryan Shazier", "Steelers");
    public static Linebacker TJWatt = new Linebacker("T.J. Watt", "Steelers");
    public static Linebacker DeionJones = new Linebacker("Deion Jones", "Falcons");
    public static Linebacker DukeRiley = new Linebacker("Duke Riley", "Falcons");
    public static Linebacker LukeKuechly = new Linebacker("Luke Kuechly");
    public static Linebacker RayLewis = new Linebacker("Ray Lewis");
    // === [ Cornerbacks ] ===
    public static Cornerback EliApple = new Cornerback("Eli Apple", "Giants");
    public static Cornerback DarrylMorris = new Cornerback("Darryl Morris", "Giants");
    public static Cornerback PatrickRobinson = new Cornerback("Patrick Robinson", "Eagles");
    public static Cornerback NolanCarroll = new Cornerback("Nolan Carroll", "Eagles");
    public static Cornerback JoeHaden = new Cornerback("Joe Haden", "Browns");
    public static Cornerback JasonMccourty = new Cornerback("Jason McCourty", "Browns");
    public static Cornerback WilliamGay = new Cornerback("William Gay", "Steelers");
    public static Cornerback IkeTaylor = new Cornerback("Ike Taylor", "Steelers");
    public static Cornerback DesmondTrufant = new Cornerback("Desmond Trufant", "Falcons");
    public static Cornerback RobertMcclain = new Cornerback("Robert McClain", "Falcons");
    public static Cornerback RichardSherman = new Cornerback("Richard Sherman");
    public static Cornerback PatrickPeterson = new Cornerback("Patrick Peterson");
    // === [ Safeties ] ===
    public static Safety CooperTaylor = new Safety("Cooper Taylor", "Giants");
    public static Safety MalcolmJenkins = new Safety("Malcolm Jenkins", "Eagles");
    public static Safety DonteWhitner = new Safety("Donte Whitner", "Browns");
    public static Safety MikeMitchell = new Safety("Mike Mitchell", "Steelers");
    public static Safety WilliamMoore = new Safety("William Moore", "Falcons");
    public static Safety EarlThomas  = new Safety("Earl Thomas");
    public static Safety KamChancellor = new Safety("Cam Chancellor");

    //~~~~~~~~CONSTRUCTOR~~~~~~~~
    public Team() {
    	week = 1;
    	wins = 0;
    	losses = 0;
    	myPayroll = "";
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
			setDefaultTeam();
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
    			setTeamName(name.toUpperCase());
    			System.out.println("\nWelcome to the " + teamName + " Coach " + userName + "!");
    			setDefaultTeam();
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
			setTeamName(name.toUpperCase());
			System.out.println("\nWelcome to the " + teamName + " Coach " + userName + "!");
			setDefaultTeam();
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
    			setTeamName(name.toUpperCase());
    			System.out.println("\nWelcome to the " + teamName + " Coach " + userName + "!");
    			setDefaultTeam();
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
    			setTeamName(name.toUpperCase());
    			System.out.println("\nWelcome to the " + teamName + " Coach " + userName + "!");
    			setDefaultTeam();
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

    public void setDefaultTeam() {
    	if ( teamName.equals("GIANTS") )
    	{
			// -- Offensive Players --
			setQB(EliManning);
			setWR1(OdellBeckham);
			setWR2(SterlingShepard);
			setWR3(BrandonMarshall);
			setRB(OrleansDarkwa);
			// -- Defensive Players --
			setLB1(JonathanCasillas);
			setLB2(CurtisGrant);
			setCB1(EliApple);
			setCB2(DarrylMorris);
			setSS(CooperTaylor);
    	}
    	if ( teamName.equals("EAGLES") )
    	{
			// -- Offensive Players --
			setQB(CarsonWentz);
			setWR1(AlshonJeffery);
			setWR2(NelsonAgholor);
			setWR3(MackHollins);
			setRB(JayAjayi);
			// -- Defensive Players --
			setLB1(JoeWalker);
			setLB2(MychalKendricks);
			setCB1(PatrickRobinson);
			setCB2(NolanCarroll);
			setSS(MalcolmJenkins);
    	}
    	if ( teamName.equals("BROWNS") )
    	{
			// -- Offensive Players --
			setQB(CodyKessler);
			setWR1(JoshGordon);
			setWR2(CoreyColeman);
			setWR3(KasenWilliams);
			setRB(IsaiahCrowell);
			// -- Defensive Players --
			setLB1(JamieCollins);
			setLB2(JoeSchobert);
			setCB1(JoeHaden);
			setCB2(JasonMccourty);
			setSS(DonteWhitner);
    	}
    	if ( teamName.equals("STEELERS") )
    	{
			// -- Offensive Players --
			setQB(BenRoethlisberger);
			setWR1(AntonioBrown);
			setWR2(JujuSmith);
			setWR3(EliRogers);
			setRB(LeveonBell);
			// -- Defensive Players --
			setLB1(RyanShazier);
			setLB2(TJWatt);
			setCB1(WilliamGay);
			setCB2(IkeTaylor);
			setSS(MikeMitchell);
    	}
    	if ( teamName.equals("FALCONS") )
    	{
			// -- Offensive Players --
			setQB(MattRyan);
			setWR1(JulioJones);
			setWR2(MohamedSanu);
			setWR3(TaylorGabriel);
			setRB(DevontaFreeman);
			// -- Defensive Players --
			setLB1(DeionJones);
			setLB2(DukeRiley);
			setCB1(DesmondTrufant);
			setCB2(RobertMcclain);
			setSS(WilliamMoore);
    	}
    	
    }//End of setDefaultTeam()
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
    
    public void setLB1( Linebacker lb ) {
    	myLB1 = lb;
    }//End of setLB1(lb)
    public Linebacker getLB1(){
    	return myLB1;
    }//End of getLB1()
    
    public void setLB2( Linebacker lb ) {
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
    	System.out.println(this);
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
		dashboard();
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
    	db2 += "3) Return to Dashboard\n";
    	System.out.println(db2);
	
    	String call = Keyboard.readString();
		if ( call.equals("1") )
		{
			System.out.println("\nCoach" + userName + "'s Budget\n");
			balancePrint();
		}//Option 1, Displays Budget
		if ( call.equals("2") )
		{
			System.out.println("\nCoach" + userName + "'s Payroll\n");
			payrollPrint();
		}//Option 2, Displays Payroll
		if ( call.equals("3") )
		{
			System.out.println("\nReturning to Dashboard.\n");
	        dashboard();
		}//Option 3, Returns to Dashboard
		else
	    {
		System.out.println("\nInvalid input. Returning to Dashboard.\n");
		dashboard();
	    }//Returns to Dashboard

    }//End of dashboard2()

    public void balancePrint() {
    	System.out.println("Your balance: $" + balance + "\n");
    	String bp = "\n";
    	bp += "1) Return to Dashboard\n";
    	System.out.println(bp);
	
		String call = Keyboard.readString();
		if ( call.equals("1") )
	    {
			dashboard();
	    }
		else
	    {
			System.out.println("\nInvalid input. Returning to Dashboard.\n");
			dashboard();
	    }//Returns to Dashboard
    
    }//End of balancePrint()
    
    public void payrollPrint() {
    	System.out.println("Your payroll: " + myPayroll + "\n");
    	String pp = "\n";
    	pp += "1) Return to Dashboard\n";
    	System.out.println(pp);
	
		String call = Keyboard.readString();
		if ( call.equals("1") )
	    {
			dashboard();
	    }
		else
	    {
			System.out.println("\nInvalid input. Returning to Dashboard.\n");
			dashboard();
	    }//Returns to Dashboard
		
    }//End of payroll()
    
    public void dashboard3() { //Buy Gear, Equip Gear	
    	String db3 = "\n";
    	db3 += "1) Buy Gear\n";
    	db3 += "2) Equip Gear\n";
    	db3 += "3) Return to Dashboard\n";
    	System.out.println(db3);
    	
    	String call = Keyboard.readString();
    	if ( call.equals("1") ) 
    	{
    		//Shop.openGearShop();
    		return;
    	}
    	if ( call.equals("2") ) 
    	{
    		//Shop.openCloset();
    		return;
    	}
    	if ( call.equals("3") )
		{
			System.out.println("\nReturning to Dashboard.\n");
	        dashboard();
		}//Option 3, Returns to Dashboard
    	else {
    		System.out.println("Invalid input. Try again.\n");
    		dashboard3();
    	}
    }//End of dashboard3()
    
    public void dashboard4() { //Draft Players, Team Roster
    	String db4 = "\n";
    	db4 += "1) Draft Players\n";
    	//db4 += "2) Team Roster\n";
    	db4 += "2) Return to Dashboard\n";
    	System.out.println(db4);
    	
    	String call = Keyboard.readString();
    	if ( call.equals("1") ) 
    	{
    		//Shop.openPlayerDraft();
    		return;
    	}
    	/*if ( call.equals("2") ) 
    	{
    		teamRoster();
    	}*/
    	if ( call.equals("2") )
		{
			System.out.println("\nReturning to Dashboard.\n");
	        dashboard();
		}//Option 2, Returns to Dashboard
    	else {
    		System.out.println("Invalid input. Try again.\n");
    		dashboard4();
    	}
    }//End of dashboard4()
    
    /*public void teamRoster() {
    		String tr = "\n";
    		tr += "Which group would you like to change?\n";
    		tr += "1) Offensive Lineup";
    		tr += "2) Defensive Lineup";
    		tr += "3) Exit Roster";
    		System.out.println(tr);
    		
    		String call = Keyboard.readString();
        	if ( call.equals("1") ) 
        	{
        		changeOffense();
        	}
        	if ( call.equals("2") ) 
        	{
        		changeDefense();
        	}
        	if ( call.equals("3") )
    		{
    			System.out.println("\nReturning to Dashboard.\n");
    	        dashboard();
    		}//Option 3, Returns to Dashboard
        	else
        	{
        		System.out.println("Invalid input. Try again.\n");
        		teamRoster();
        	}
    		
    	}//End of teamRoster()
    	
    	public void changeOffense() {
    		String co = "\n";
    		co += "1) Change QB\n";
    		co += "2) Change WR1\n";
    		co += "3) Change WR2\n";
    		co += "4) Change WR3\n";
    		co += "5) Change RB\n";
    		co += "6) Exit Offensive Lineup";
    		System.out.println(co);
    		
    		String call = Keyboard.readString();
        	if ( call.equals("1") ) 
        	{
        		String c1 = "\n";
        		c1 += "My Quarterbacks:\n";
        		c1 += "1) " + myQB + "\n";
        		c1 += Shop.ownedQB() + "\n";
        		
        		String call1 = Keyboard.readString();
        		if ( call1.equals("1") )
        		{
        			System.out.println()
        		}
        	}
        	if ( call.equals("2") ) 
        	{
        		setWR1();
        	}
        	if ( call.equals("3") ) 
        	{
        		setWR2();
        	}
        	if ( call.equals("4") ) 
        	{
        		setWR3();
        	}
        	if ( call.equals("5") ) 
        	{
        		setRB();
        	}
        	if ( call.equals("6") )
    		{
    			System.out.println("\nReturning to Roster.\n");
    	        teamRoster();
    		}//Option 6, Returns to teamRoster()
        	else
        	{
        		System.out.println("Invalid input. Try again.\n");
        		changeOffense();
        	}
    	}//End of changeOffense()
    	
    	public void changeDefense() {
    		String cd = "\n";
    		cd += "1) Change LB1\n";
    		cd += "2) Change LB2\n";
    		cd += "3) Change CB1\n";
    		cd += "4) Change CB2\n";
    		cd += "5) Change SS\n";
    		cd += "6) Exit Defensive Lineup";
    		System.out.println(cd);
    		
    		String call = Keyboard.readString();
        	if ( call.equals("1") ) 
        	{
        		setLB1();
        	}
        	if ( call.equals("2") ) 
        	{
        		setLB2();
        	}
        	if ( call.equals("3") ) 
        	{
        		setCB1();
        	}
        	if ( call.equals("4") ) 
        	{
        		setCB2();
        	}
        	if ( call.equals("5") ) 
        	{
        		setSS();
        	}
        	if ( call.equals("6") )
    		{
    			System.out.println("\nReturning to Roster.\n");
    	        teamRoster();
    		}//Option 6, Returns to teamRoster()
        	else
        	{
        		System.out.println("Invalid input. Try again.\n");
        		changeDefense();
        	}
    		
    	}//End of changeDefense()*/
    
    public void dashboard5() { //Play Game!!
    	String db5 = "";
    	db5 += "\nYou are about to start a game, are you sure?";
    	db5 += "\nType 'Yes' to play or 'No' to go back\n";
    	System.out.println(db5);
    	
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
    	(myQB.playerRating + myWR1.playerRating + myWR2.playerRating + myWR3.playerRating + myRB.playerRating +
    	 myLB1.playerRating + myLB2.playerRating + myCB1.playerRating + myCB2.playerRating + mySS.playerRating) / 10;
    	return teamRating;
    }
    
    public static int setTeamRating(int i) {
    	teamRating = i;
    }

    public void playGame() {
	setWeek( week + 1 );
    }//End of playGame()
    
    public static void main( String[] args ) {

    }//End of main
    
}//End of Team
