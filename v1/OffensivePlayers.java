public class OffensivePlayers extends Players {

    //~~~~~~~~INSTANCE VARIABLES~~~~~~~~
    //public String[] yourOffensivePlayers;      //the offensive players you own
    //public String[] draftableOffensivePlayers; //the offensive players you can draft
    public String name;

    //~~~~~~~~CONSTRUCTOR~~~~~~~~
    public OffensivePlayers(String playerName) {
        name = playerName;
    }
    
    //~~~~~~~~METHODS~~~~~~~~
    public static void main( String[] args ) {
        // === [ Quarterbacks ] ===

        OffensivePlayers EliManning = new OffensivePlayers("Eli Manning");
        EliManning.setStats( 59 , 68 , 72 , 82 , 69 );
        /*OffensivePlayers CarsonWentz = new Quarterback("Carson Wentz");
        CarsonWentz.setStats( 63 , 66 , 74 , 79 , 68 );
        OffensivePlayers CodyKessler = new Quarterback("Cody Kessler");
        CodyKessler.setStats( 61 , 69 , 70 , 84 , 66 );
        OffensivePlayers BenRoethlisberger = new Quarterback("Ben Roethlisberger");
        BenRoethlisberger.setStats( 66 , 62 , 80 , 82 , 60 );
        OffensivePlayers MattRyan = new Quarterback("Matt Ryan");
        MattRyan.setStats( 69 , 61 , 72 , 80 , 68 );
        OffensivePlayers MichaelVick = new Quarterback("Michael Vick");
        MichaelVick.setStats( 71 , 79 , 80 , 94 , 76 );
        OffensivePlayers TomBrady = new Quarterback("Tom Brady");
        TomBrady.setStats( 84 , 87 , 96 , 93 , 90 );

        // === [ Receivers ] ===
        OffensivePlayers OdellBeckham = new Receiver("Odell Beckham");
        OdellBeckham.setStats(67, 69, 70, 73, 71);
        OffensivePlayers SterlingShepard = new Receiver("Sterling Shepard");
        SterlingShepard.setStats(65, 71, 75, 68, 71);
        OffensivePlayers BrandonMarshall = new Receiver("Brandon Marshall");
        BrandonMarshall.setStats(69, 70, 73, 69, 69);
        OffensivePlayers AlshonJeffery = new Receiver("Alshon Jeffery");
        AlshonJeffery.setStats(61, 69, 75, 72, 73);
        OffensivePlayers NelsonAgholor = new Receiver("Nelson Agholor");
        NelsonAgholor.setStats(68, 70, 71, 74, 67);
        OffensivePlayers MackHollins = new Receiver("Mack Hollins");
        MackHollins.setStats(69, 68, 66, 72, 75);
        OffensivePlayers JoshGordon = new Receiver("Josh Gordon");
        JoshGordon.setStats(50, 70, 68, 82, 80);
        OffensivePlayers CoreyColeman = new Receiver("Corey Coleman");
        CoreyColeman.setStats(66, 69, 73, 71, 71);
        OffensivePlayers KasenWilliams = new Receiver("Kasen Williams");
        KasenWilliams.setStats(64, 71, 77, 66, 72);
        OffensivePlayers AntonioBrown = new Receiver("Antonio Brown");
        AntonioBrown.setStats(68, 70, 75, 67, 70);
        OffensivePlayers JujuSmith = new Receiver("Juju Smith");
        JujuSmith.setStats(60, 69, 77, 70, 74);
        OffensivePlayers EliRogers = new Receiver("Eli Rogers");
        EliRogers.setStats(67, 70, 73, 72, 68);
        OffensivePlayers JulioJones = new Receiver("Julio Jones");
        JulioJones.setStats(68, 68, 67, 70, 76);
        OffensivePlayers MohamedSanu = new Receiver("Mohamed Sanu");
        MohamedSanu.setStats(70, 69, 72, 69, 70);
        OffensivePlayers TaylorGabriel = new Receiver("Taylor Gabriel");
        TaylorGabriel.setStats(68, 70, 71, 74, 67);*/
    }
    
}
