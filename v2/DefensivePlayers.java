public class DefensivePlayers extends Players {

    //~~~~~~~~INSTANCE VARIABLES~~~~~~~~
    //public String[] yourDefensivePlayers;      //the offensive players you own
    //public String[] draftableDefensivePlayers; //the offensive players you can draft
    public String name;
    public String team;

    //~~~~~~~~CONSTRUCTOR~~~~~~~~
    public DefensivePlayers(String playerName) {
        name = playerName;
    }

    public DefensivePlayers(String playerName, String playerTeam) {
        name = playerName;
	team = playerTeam;
    }
    //~~~~~~~~METHODS~~~~~~~~

    public static void main( String[] args ) {
        // === [ Linebackers ] ===
        Linebacker JonathanCasillas = new Linebacker("Jonathan Casillas", "Giants");
        JonathanCasillas.setStats( 59, 68, 72 , 82 , 69 );
        Linebacker CurtisGrant = new Linebacker("Curtis Grant", "Giants");
        CurtisGrant.setStats( 63 , 66 , 74 , 79 , 68 );

        Linebacker JoeWalker = new Linebacker("Joe Walker", "Eagles");
        JoeWalker.setStats( 61 , 69 , 70 , 84 , 66 );
        Linebacker MychalKendricks = new Linebacker("Mychal Kendricks", "Eagles");
        MychalKendricks.setStats( 66 , 62 , 80 , 82 , 60 );
	
        Linebacker JamieCollins = new Linebacker("Jamie Collins", "Browns");
        JamieCollins.setStats( 69 , 61 , 72 , 80 , 68 );
        Linebacker JoeSchobert = new Linebacker("Joe Schobert", "Browns");
        JoeSchobert.setStats( 71 , 79 , 80 , 94 , 76 );

        Linebacker RyanShazier = new Linebacker("Ryan Shazier", "Steelers");
        RyanShazier.setStats( 84 , 87 , 96 , 93 , 90 );
        Linebacker TJWatt = new Linebacker("T.J. Watt", "Steelers");
        TJWatt.setStats( 67 , 69 , 70 , 73 , 71 );

        Linebacker DeionJones = new Linebacker("Deion Jones", "Falcons");
        DeionJones.setStats( 65 , 71 , 75 , 68 , 71 );
        Linebacker DukeRiley = new Linebacker("Duke Riley", "Falcons");
        DukeRiley.setStats( 69 , 70 , 73 , 69 , 69 );

        Linebacker LukeKuechly = new Linebacker("Luke Kuechly");
        LukeKuechly.setStats( 61 , 69 , 75 , 72 , 73);
	
        Linebacker RayLewis = new Linebacker("Ray _Lewis");
        Raylewis.setStats();

        // === [ Cornerbacks ] ===
        Cornerback EliApple = new Cornerback("Eli Apple", "Giants");
        EliApple.setStats();
        Cornerback DarrylMorris = new Cornerback("Darryl Morris", "Giants");
        DarrylMorris.setStats();

        Cornerback PatrickRobinson = new Cornerback("Patrick Robinson", "Eagles");
        PatrickRobinson.setStats();
        Cornerback NolanCarroll = new Cornerback("Nolan Carroll", "Eagles");
        NolanCarroll.setStats();

        Cornerback JoeHaden = new Cornerback("Joe Haden", "Browns");
        JoeHaden.setStats();
        Cornerback JasonMccourty = new Cornerback("Jason McCourty", "Browns");
        JasonMccourty.setStats();

        Cornerback WilliamGay = new Cornerback("William Gay", "Steelers");
        WilliamGay.setStats();
        Cornerback IkeTaylor = new Cornerback("Ike Taylor", "Steelers");
        IkeTaylor.setStats();

        Cornerback DesmondTrufant = new Cornerback("Desmond Trufant", "Falcons");
        DesmondTrufant.setStats(); 
        Cornerback RobertMcclain = new Cornerback("Robert McClain", "Falcons");
        RobertMcclain.setStats();

        Cornerback RichardSherman = new Cornerback("Richard Sherman");
        RichardSherman.setStats();
        Cornerback PatrickPeterson = new Cornerback("Patrick Peterson");
        PatrickPeterson.setStats();


        // === [ Safeties ] ===
        Safety CooperTaylor = new Safety("Cooper Taylor");
        CooperTaylor.setStats();

        Safety MalcolmJenkins = new Safety("Malcolm Jenkins");
        MalcolmJenkins.setStats();

        Safety DonteWhitner = new Safety("Donte Whitner");
        DonteWhitner.setStats();

        Safety MikeMitchell = new Safety("Mike Mitchell");
        MikeMitchell.setStats();

        Safety WilliamMoore = new Safety("William Moore");
        WilliamMoore.setStats(); 

		Safety EarlThomas  = new Safety("Earl Thomas");
		EarlThomas.setStats();
		Safety KamChancellor = new Safety("Cam Chancellor");
		KamChancellor.setStats();
    }
}
