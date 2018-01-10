public class DefensivePlayers extends Players {

    //~~~~~~~~INSTANCE VARIABLES~~~~~~~~
    //public String[] yourDefensivePlayers;      //the offensive players you own
    //public String[] draftableDefensivePlayers; //the offensive players you can draft
    public String name;

    //~~~~~~~~CONSTRUCTOR~~~~~~~~
    public DefensivePlayers(String playerName) {
        name = playerName;
    }
    
    //~~~~~~~~METHODS~~~~~~~~

    public static void main( String[] args ) {
        // === [ Linebackers ] ===
        Linebacker JonathanCasillas = new Linebacker("Jonathan Casillas");
        // JonathanCasillas.setStats();
        Linebacker CurtisGrant = new Linebacker("Curtis Grant");
        // CurtisGrant.setStats();

        Linebacker JoeWalker = new Linebacker("Joe Walker");
        // JoeWalker.setStats();
        Linebacker MychalKendricks = new Linebacker("Mychal Kendricks");
        // MychalKendricks.setStats();

        Linebacker JamieCollins = new Linebacker("Jamie Collins");
        // JamieCollins.setStats();
        Linebacker JoeSchobert = new Linebacker("Joe Schobert");
        // JoeSchobert.setStats();

        Linebacker RyanShazier = new Linebacker("Ryan Shazier");
        // RyanShazier.setStats();
        Linebacker TJWatt = new Linebacker("T.J. Watt");
        // TJWatt.setStats();

        Linebacker DeionJones = new Linebacker("Deion Jones");
        // DeionJones.setStats();
        Linebacker DukeRiley = new Linebacker("Duke Riley");
        // DukeRiley.setStats();


        // === [ Cornerbacks ] ===
        Cornerback EliApple = new Cornerback("Eli Apple");
        // EliApple.setStats();
        Cornerback DarrylMorris = new Cornerback("Darryl Morris");
        // DarrylMorris.setStats();

        Cornerback PatrickRobinson = new Cornerback("Patrick Robinson");
        // PatrickRobinson.setStats();
        Cornerback NolanCarroll = new Cornerback("Nolan Carroll");
        // NolanCarroll.setStats();

        Cornerback JoeHaden = new Cornerback("Joe Haden");
        // JoeHaden.setStats();
        Cornerback JasonMccourty = new Cornerback("Jason McCourty");
        // JasonMccourty.setStats();

        Cornerback WilliamGay = new Cornerback("William Gay");
        // WilliamGay.setStats();
        Cornerback IkeTaylor = new Cornerback("Ike Taylor");
        // IkeTaylor.setStats();

        Cornerback DesmondTrufant = new Cornerback("Desmond Trufant");
        // DesmondTrufant.setStats(); 
        Cornerback RobertMcclain = new Cornerback("Robert McClain");
        // RobertMcclain.setStats();


        // === [ Safeties ] ===
        Safety CooperTaylor = new Safety("Cooper Taylor");
        // CooperTaylor.setStats();

        Safety MalcolmJenkins = new Safety("Malcolm Jenkins");
        // MalcolmJenkins.setStats();

        Safety DonteWhitner = new Safety("Donte Whitner");
        // DonteWhitner.setStats();

        Safety MikeMitchell = new Safety("Mike Mitchell");
        // MikeMitchell.setStats();

        Safety WilliamMoore = new Safety("William Moore");
        // WilliamMoore.setStats(); 

    }
}
