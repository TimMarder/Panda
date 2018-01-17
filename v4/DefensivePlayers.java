public class DefensivePlayers extends Team {

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

    public void setName(String s) {
	name = s;
    }
    
    public static void setDefensivePlayerStats() {
        // === [ Linebackers ] ===
        //Linebacker JonathanCasillas = new Linebacker("Jonathan Casillas", "Giants");
        JonathanCasillas.setStats( 59, 68, 72 , 82 , 69 );
        JonathanCasillas.setPlayerRating();

        //Linebacker CurtisGrant = new Linebacker("Curtis Grant", "Giants");
        CurtisGrant.setStats( 63 , 66 , 74 , 79 , 68 );
        CurtisGrant.setPlayerRating();



        //Linebacker JoeWalker = new Linebacker("Joe Walker", "Eagles");
        JoeWalker.setStats( 61 , 69 , 70 , 84 , 66 );
        JoeWalker.setPlayerRating();

        //Linebacker MychalKendricks = new Linebacker("Mychal Kendricks", "Eagles");
        MychalKendricks.setStats( 66 , 62 , 80 , 82 , 60 );
        MychalKendricks.setPlayerRating();



        //Linebacker JamieCollins = new Linebacker("Jamie Collins", "Browns");
        JamieCollins.setStats( 69 , 61 , 72 , 80 , 68 );
        JamieCollins.setPlayerRating();

        //Linebacker JoeSchobert = new Linebacker("Joe Schobert", "Browns");
        JoeSchobert.setStats( 71 , 79 , 80 , 94 , 76 );
        JoeSchobert.setPlayerRating();



        //Linebacker RyanShazier = new Linebacker("Ryan Shazier", "Steelers");
        RyanShazier.setStats( 84 , 87 , 96 , 93 , 90 );
        RyanShazier.setPlayerRating();

        //Linebacker TJWatt = new Linebacker("T.J. Watt", "Steelers");
        TJWatt.setStats( 67 , 69 , 70 , 73 , 71 );
        TJWatt.setPlayerRating();



        //Linebacker DeionJones = new Linebacker("Deion Jones", "Falcons");
        DeionJones.setStats( 65 , 71 , 75 , 68 , 71 );
        DeionJones.setPlayerRating();

        //Linebacker DukeRiley = new Linebacker("Duke Riley", "Falcons");
        DukeRiley.setStats( 69 , 70 , 73 , 69 , 69 );
        DukeRiley.setPlayerRating();



        //Linebacker LukeKuechly = new Linebacker("Luke Kuechly");
        LukeKuechly.setStats( 88 , 90 , 91 , 94 , 87 );
        LukeKuechly.setPlayerRating();

        //Linebacker RayLewis = new Linebacker("Ray Lewis");
        RayLewis.setStats( 99 , 82 , 95 , 89 , 85 );
        RayLewis.setPlayerRating();

        // === [ Cornerbacks ] ===
        //Cornerback EliApple = new Cornerback("Eli Apple", "Giants");
        EliApple.setStats( 66 , 62 , 80 , 82 , 60 );
        EliApple.setPlayerRating();

        //Cornerback DarrylMorris = new Cornerback("Darryl Morris", "Giants");
        DarrylMorris.setStats( 61 , 69 , 75 , 72 , 73 );
        DarrylMorris.setPlayerRating();



        //Cornerback PatrickRobinson = new Cornerback("Patrick Robinson", "Eagles");
        PatrickRobinson.setStats( 59 , 68 , 72 , 82 , 69 );
        PatrickRobinson.setPlayerRating();

        //Cornerback NolanCarroll = new Cornerback("Nolan Carroll", "Eagles");
        NolanCarroll.setStats( 69 , 61 , 72 , 80 , 68 );
        NolanCarroll.setPlayerRating();



        //Cornerback JoeHaden = new Cornerback("Joe Haden", "Browns");
        JoeHaden.setStats( 65 , 71 , 75 , 68 , 71 );
        JoeHaden.setPlayerRating();

        //Cornerback JasonMccourty = new Cornerback("Jason McCourty", "Browns");
        JasonMccourty.setStats( 67 , 69 , 70 , 73 , 71 );
        JasonMccourty.setPlayerRating();



        //Cornerback WilliamGay = new Cornerback("William Gay", "Steelers");
        WilliamGay.setStats( 69 , 61 , 72 , 80 , 68 );
        WilliamGay.setPlayerRating();

        //Cornerback IkeTaylor = new Cornerback("Ike Taylor", "Steelers");
        IkeTaylor.setStats( 63 , 66 , 74 , 79 , 68 );
        IkeTaylor.setPlayerRating();



        //Cornerback DesmondTrufant = new Cornerback("Desmond Trufant", "Falcons");
        DesmondTrufant.setStats( 66 , 62 , 80 , 82 , 60 );
        DesmondTrufant.setPlayerRating();

        //Cornerback RobertMcclain = new Cornerback("Robert McClain", "Falcons");
        RobertMcclain.setStats( 59 , 68 , 72 , 82 , 69 );
        RobertMcclain.setPlayerRating();



        //Cornerback RichardSherman = new Cornerback("Richard Sherman");
        RichardSherman.setStats( 84 , 87 , 96 , 93 , 90 );
        RichardSherman.setPlayerRating();

        //Cornerback PatrickPeterson = new Cornerback("Patrick Peterson");
        PatrickPeterson.setStats( 88 , 90 , 91 , 94 , 87 );
        PatrickPeterson.setPlayerRating();




        // === [ Safeties ] ===
        //Safety CooperTaylor = new Safety("Cooper Taylor", "Giants");
        CooperTaylor.setStats( 66 , 62 , 80 , 82 , 60 );
        CooperTaylor.setPlayerRating();



        //Safety MalcolmJenkins = new Safety("Malcolm Jenkins", "Eagles");
        MalcolmJenkins.setStats( 67 , 69 , 70 , 73 , 71 );
        MalcolmJenkins.setPlayerRating();



        //Safety DonteWhitner = new Safety("Donte Whitner", "Browns");
        DonteWhitner.setStats( 63 , 66 , 74 , 79 , 68 );
        DonteWhitner.setPlayerRating();



        //Safety MikeMitchell = new Safety("Mike Mitchell", "Steelers");
        MikeMitchell.setStats( 69 , 61 , 72 , 80 , 68 );
        MikeMitchell.setPlayerRating();



        //Safety WilliamMoore = new Safety("William Moore", "Falcons");
        WilliamMoore.setStats( 59 , 68 , 72 , 82 , 69 ); 
        WilliamMoore.setPlayerRating();



        //Safety EarlThomas  = new Safety("Earl Thomas");
        EarlThomas.setStats( 86 , 85 , 92 , 97 , 90);
        EarlThomas.setPlayerRating();

        //Safety KamChancellor = new Safety("Cam Chancellor");
        KamChancellor.setStats( 84 , 87 , 96 , 93 , 90 );
        KamChancellor.setPlayerRating();
    }

    public static void main( String[] args ) {
        /*
        // === [ Linebackers ] ===
        Linebacker JonathanCasillas = new Linebacker("Jonathan Casillas", "Giants");
        JonathanCasillas.setStats( 59, 68, 72 , 82 , 69 );
        JonathanCasillas.setPlayerRating();

        Linebacker CurtisGrant = new Linebacker("Curtis Grant", "Giants");
        CurtisGrant.setStats( 63 , 66 , 74 , 79 , 68 );
        CurtisGrant.setPlayerRating();



        Linebacker JoeWalker = new Linebacker("Joe Walker", "Eagles");
        JoeWalker.setStats( 61 , 69 , 70 , 84 , 66 );
        JoeWalker.setPlayerRating();

        Linebacker MychalKendricks = new Linebacker("Mychal Kendricks", "Eagles");
        MychalKendricks.setStats( 66 , 62 , 80 , 82 , 60 );
        MychalKendricks.setPlayerRating();



        Linebacker JamieCollins = new Linebacker("Jamie Collins", "Browns");
        JamieCollins.setStats( 69 , 61 , 72 , 80 , 68 );
        JamieCollins.setPlayerRating();

        Linebacker JoeSchobert = new Linebacker("Joe Schobert", "Browns");
        JoeSchobert.setStats( 71 , 79 , 80 , 94 , 76 );
        JoeSchobert.setPlayerRating();



        Linebacker RyanShazier = new Linebacker("Ryan Shazier", "Steelers");
        RyanShazier.setStats( 84 , 87 , 96 , 93 , 90 );
        RyanShazier.setPlayerRating();

        Linebacker TJWatt = new Linebacker("T.J. Watt", "Steelers");
        TJWatt.setStats( 67 , 69 , 70 , 73 , 71 );
        TJWatt.setPlayerRating();



        Linebacker DeionJones = new Linebacker("Deion Jones", "Falcons");
        DeionJones.setStats( 65 , 71 , 75 , 68 , 71 );
        DeionJones.setPlayerRating();

        Linebacker DukeRiley = new Linebacker("Duke Riley", "Falcons");
        DukeRiley.setStats( 69 , 70 , 73 , 69 , 69 );
        DukeRiley.setPlayerRating();



        Linebacker LukeKuechly = new Linebacker("Luke Kuechly");
        LukeKuechly.setStats( 88 , 90 , 91 , 94 , 87 );
        LukeKuechly.setPlayerRating();

        Linebacker RayLewis = new Linebacker("Ray Lewis");
        RayLewis.setStats( 99 , 82 , 95 , 89 , 85 );
        RayLewis.setPlayerRating();

        // === [ Cornerbacks ] ===
        //Cornerback EliApple = new Cornerback("Eli Apple", "Giants");
        EliApple.setStats( 66 , 62 , 80 , 82 , 60 );
        EliApple.setPlayerRating();

        //Cornerback DarrylMorris = new Cornerback("Darryl Morris", "Giants");
        DarrylMorris.setStats( 61 , 69 , 75 , 72 , 73 );
        DarrylMorris.setPlayerRating();



        //Cornerback PatrickRobinson = new Cornerback("Patrick Robinson", "Eagles");
        PatrickRobinson.setStats( 59 , 68 , 72 , 82 , 69 );
        PatrickRobinson.setPlayerRating();

        //Cornerback NolanCarroll = new Cornerback("Nolan Carroll", "Eagles");
        NolanCarroll.setStats( 69 , 61 , 72 , 80 , 68 );
        NolanCarroll.setPlayerRating();



        //Cornerback JoeHaden = new Cornerback("Joe Haden", "Browns");
        JoeHaden.setStats( 65 , 71 , 75 , 68 , 71 );
        JoeHaden.setPlayerRating();

        //Cornerback JasonMccourty = new Cornerback("Jason McCourty", "Browns");
        JasonMccourty.setStats( 67 , 69 , 70 , 73 , 71 );
        JasonMccourty.setPlayerRating();



        //Cornerback WilliamGay = new Cornerback("William Gay", "Steelers");
        WilliamGay.setStats( 69 , 61 , 72 , 80 , 68 );
        WilliamGay.setPlayerRating();

        //Cornerback IkeTaylor = new Cornerback("Ike Taylor", "Steelers");
        IkeTaylor.setStats( 63 , 66 , 74 , 79 , 68 );
        IkeTaylor.setPlayerRating();



        //Cornerback DesmondTrufant = new Cornerback("Desmond Trufant", "Falcons");
        DesmondTrufant.setStats( 66 , 62 , 80 , 82 , 60 );
        DesmondTrufant.setPlayerRating();

        //Cornerback RobertMcclain = new Cornerback("Robert McClain", "Falcons");
        RobertMcclain.setStats( 59 , 68 , 72 , 82 , 69 );
        RobertMcclain.setPlayerRating();



        //Cornerback RichardSherman = new Cornerback("Richard Sherman");
        RichardSherman.setStats( 84 , 87 , 96 , 93 , 90 );
        RichardSherman.setPlayerRating();

        //Cornerback PatrickPeterson = new Cornerback("Patrick Peterson");
        PatrickPeterson.setStats( 88 , 90 , 91 , 94 , 87 );
        PatrickPeterson.setPlayerRating();




        // === [ Safeties ] ===
        //Safety CooperTaylor = new Safety("Cooper Taylor");
        CooperTaylor.setStats( 66 , 62 , 80 , 82 , 60 );
        CooperTaylor.setPlayerRating();



        //Safety MalcolmJenkins = new Safety("Malcolm Jenkins");
        MalcolmJenkins.setStats( 67 , 69 , 70 , 73 , 71 );
        MalcolmJenkins.setPlayerRating();



        //Safety DonteWhitner = new Safety("Donte Whitner");
        DonteWhitner.setStats( 63 , 66 , 74 , 79 , 68 );
        DonteWhitner.setPlayerRating();



        //Safety MikeMitchell = new Safety("Mike Mitchell");
        MikeMitchell.setStats( 69 , 61 , 72 , 80 , 68 );
        MikeMitchell.setPlayerRating();



        //Safety WilliamMoore = new Safety("William Moore");
        WilliamMoore.setStats( 59 , 68 , 72 , 82 , 69 ); 
        WilliamMoore.setPlayerRating();



		//Safety EarlThomas  = new Safety("Earl Thomas");
		EarlThomas.setStats( 86 , 85 , 92 , 97 , 90);
        EarlThomas.setPlayerRating();

		//Safety KamChancellor = new Safety("Cam Chancellor");
		KamChancellor.setStats( 84 , 87 , 96 , 93 , 90 );
        KamChancellor.setPlayerRating();
        */
    }
}
