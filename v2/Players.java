public class Players {

    //~~~~~~~~INSTANCE VARIABLES~~~~~~~~
    public int playerRating;   //the overall rating of the player
    
    //~~~~~~~~CONSTRUCTOR~~~~~~~~
    public Players() {
    }
    
    //~~~~~~~~METHODS~~~~~~~~
    public void setPlayerRating( int rating ) {
	playerRating = rating;
    }

    public void showStats() {

    }

    public void setDefaultTeam( String team ) {
	if( team.equals("Giants") ) {
		Quarterback EliManning = new Quarterback("Eli Manning", "Giants");
	    EliManning.setStats( 59 , 68 , 72 , 82 , 69 );
	    setQB( EliManning );
	    setWR1( OdellBeckham );
	    setWR2( SterlingShepard );
	    setWR3( BrandonMarshall );
	    setRB( OrleansDarkwa );
	    setLB1( JonathanCasillas );
	    setLB2( CurtisGrant );
	    setCB1( EliApple );
	    setCB2( DarrylMorris );
	    setSS( CooperTaylor );
	}
	if( team.equals("Eagles") ) {
        Quarterback CarsonWentz = new Quarterback("Carson Wentz", "Eagles");
        CarsonWentz.setStats( 63 , 66 , 74 , 79 , 68 );
	    setQB( CarsonWentz );
	    setWR1( AlshonJeffery );
	    setWR2( NelsoNAgolor );
	    setWR3( MackHollins );
	    setRB( JayAjayi );
	    setLB1( JoeWalker );
	    setLB2( MychalKendricks );
	    setCB1( PatrickRobinson );
	    setCB2( NolanCarroll );
	    setSS( MalcolmJenkins );
	}
	if( team.equals("Browns") ) {
	    setQB( CodyKessler );
	    setWR1( JoshGordon );
	    setWR2( CoreyColeman );
	    setWR3( KasenWilliams );
	    setRB( IsaiahCrowell );
	    setLB1( JamieCollins );
	    setLB2( JoeSchobert );
	    setCB1( JoeHaden );
	    setCB2( JasonMccourty );
	    setSS( DonteWhitner );
	}
	if( team.equals("Steelers") ) {
	    setQB( BenRoethlisberger );
	    setWR1( AntonioBrown );
	    setWR2( JujuSmith );
	    setWR3( EliRogers );
	    setRB( LeveonBell );
	    setLB1( RyanShazier );
	    setLB2( TJWatt );
	    setCB1( WilliamGay );
	    setCB2( IkeTaylor );
	    setSS( MikeMitchell );
	}
	if( team.equals("Falcons") ) {
	    setQB( MattRyan );
	    setWR1( JulioJones );
	    setWR2( MohamedSanu );
	    setWR3(TaylorGabriel );
	    setRB( DevontaFreeman );
	    setLB1( DieonJones );
	    setLB2( DukeRiley );
	    setCB1( DesmondTrufant );
	    setCB2( RobertMcclain );
	    setSS( WilliamMoore );
	}
	else {

	}
	
    }
    
    public void setQB( Quarterback qb ) {
	myQB = qb;
    }
    public void setWR1( Receiver wr1 ) {
	myWR1 = wr1;
    }
    public void setWR2( Receiver wr2 ) {
	myWR2 = wr2;
    }
    public void setWR3( Receiver wr3 ) {
	myWR3 = wr3;
    }
    public void setRB( Runningback rb ) {
	myRB = rb;
    }
    public void setLB1( Linebacker lb1 ) {
	myLB1 = lb1;
    }
    public void setLB2( Linebacker lb2 ) {
	myLB2 = lb2;
    }
    public void setCB1( Cornerback cb1 ) {
	myCB1 = cb1;
    }
    public void setCB2( Cornerback cb2 ) {
	myCB2 = cb2;
    }
    public void setSS( Safety ss ) {
	mySS = ss;
    }
    
    
    public static void main( String[] args ) {

    }
    
}
