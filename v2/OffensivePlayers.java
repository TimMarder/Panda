public class OffensivePlayers extends Players {

    //~~~~~~~~INSTANCE VARIABLES~~~~~~~~
    //public String[] yourOffensivePlayers;      //the offensive players you own
    //public String[] draftableOffensivePlayers; //the offensive players you can draft
    public String name;
    public String team;

    //~~~~~~~~CONSTRUCTOR~~~~~~~~
    
    public OffensivePlayers(String playerName) {
        name = playerName;
    }
    
    public OffensivePlayers(String playerName, String playerTeam) {
        name = playerName;
        team = playerTeam;
    }
    //~~~~~~~~METHODS~~~~~~~~

    //have all stats in a csv file
    //import that
    //parse it to get each 
    
    public static void main( String[] args ) {
        // === [ Quarterbacks ] ===
        Quarterback EliManning = new Quarterback("Eli Manning", "Giants");
        EliManning.setStats( 59 , 68 , 72 , 82 , 69 );

        Quarterback CarsonWentz = new Quarterback("Carson Wentz", "Eagles");
        CarsonWentz.setStats( 63 , 66 , 74 , 79 , 68 );

        Quarterback CodyKessler = new Quarterback("Cody Kessler", "Browns");
        CodyKessler.setStats( 61 , 69 , 70 , 84 , 66 );

        Quarterback BenRoethlisberger = new Quarterback("Ben Roethlisberger", "Steelers");
        BenRoethlisberger.setStats( 66 , 62 , 80 , 82 , 60 );

        Quarterback MattRyan = new Quarterback("Matt Ryan", "Falcons");
        MattRyan.setStats( 69 , 61 , 72 , 80 , 68 );

        Quarterback MichaelVick = new Quarterback("Michael Vick");
        MichaelVick.setStats( 71 , 79 , 80 , 94 , 76 );
        Quarterback TomBrady = new Quarterback("Tom Brady");
        TomBrady.setStats( 84 , 87 , 96 , 93 , 90 );

        // === [ Receivers ] ===
        Receiver  OdellBeckham = new Receiver("Odell Beckham", "Giants");
        OdellBeckham.setStats( 67 , 69 , 70 , 73 , 71 );
        Receiver SterlingShepard = new Receiver("Sterling Shepard", "Giants");
        SterlingShepard.setStats( 65 , 71 , 75 , 68 , 71 );
        Receiver BrandonMarshall = new Receiver("Brandon Marshall", "Giants");
        BrandonMarshall.setStats( 69 , 70 , 73 , 69 , 69 );
        
        Receiver AlshonJeffery = new Receiver("Alshon Jeffery", "Eagles");
        AlshonJeffery.setStats( 61 , 69 , 75 , 72 , 73 );
        Receiver NelsonAgholor = new Receiver("Nelson Agholor", "Eagles");
        NelsonAgholor.setStats( 68 , 70 , 71 , 74 , 67 );
        Receiver MackHollins = new Receiver("Mack Hollins", "Eagles");
        MackHollins.setStats( 69 , 68 , 66 , 72 , 75 );
        
        Receiver JoshGordon = new Receiver("Josh Gordon", "Browns");
        JoshGordon.setStats( 50 , 70 , 68 , 82 , 80 );
        Receiver CoreyColeman = new Receiver("Corey Coleman", "Browns");
        CoreyColeman.setStats( 66 , 69 , 73 , 71 , 71 );
        Receiver KasenWilliams = new Receiver("Kasen Williams", "Browns");
        KasenWilliams.setStats( 64 , 71 , 77 , 66 , 72 );
        
        Receiver AntonioBrown = new Receiver("Antonio Brown", "Steelers");
        AntonioBrown.setStats( 68 , 70 , 75 , 67 , 70 );
        Receiver JujuSmith = new Receiver("Juju Smith", "Steelers");
        JujuSmith.setStats( 60 , 69 , 77 , 70 , 74 );
        Receiver EliRogers = new Receiver("Eli Rogers", "Steelers");
        EliRogers.setStats( 67 , 70 , 73 , 72 , 68 );
        
        Receiver JulioJones = new Receiver("Julio Jones", "Falcons");
        JulioJones.setStats( 68 , 68 , 67 , 70 , 76 );
        Receiver MohamedSanu = new Receiver("Mohamed Sanu", "Falcons");
        MohamedSanu.setStats( 70 , 69 , 72 , 69 , 70 );
        Receiver TaylorGabriel = new Receiver("Taylor Gabriel", "Falcons");
        TaylorGabriel.setStats( 68 , 70 , 71 , 74 , 67 );

        Receiver MikeEvans = new Receiver("Mike Evans");
        MikeEvans.setStats( 98 , 86 , 89 , 92 , 85 );
        Receiver DeseanJackson = new Receiver("DeSean Jackson");
        DeseanJackson.setStats( 90 , 89 , 92 , 89 , 90 );
        Receiver DezBryant = new Receiver("Dez Bryant");
        DezBryant.setStats( 88 , 90 , 91 , 94 , 87 );
        
        // === [ Runningbacks ] ===
        Runningback OrleansDarkwa = new Runningback("Orleans Darkwa", "Giants");
        OrleansDarkwa.setStats( 72 , 66 , 77 , 71 , 64 );
        
        Runningback JayAjayi = new Runningback("Jay Ajayi", "Eagles");
        JayAjayi.setStats( 68 , 72 , 73 , 70 , 67 );
        
        Runningback IsaiahCrowell = new Runningback("Isaiah Crowell", "Browns");
        IsaiahCrowell.setStats( 71 , 73 , 70 , 69 , 67 );
        
        Runningback LeveonBell = new Runningback("Leveon Bell", "Steelers");
        LeveonBell.setStats( 66 , 68 , 73 , 74 , 69 );

        Runningback DevontaFreeman = new Runningback("Devonta Freeman", "Falcons");
        DevontaFreeman.setStats( 70 , 72 , 74 , 68 , 66 );
        
        Runningback MattForte = new Runningback("Matt Forte");
        MattForte.setStats( 80 , 82 , 84 , 78 , 76 );
        Runningback ToddGurley = new Runningback("Todd Gurley");
        ToddGurley.setStats( 99 , 82 , 95 , 89 , 85 );
    }
}
