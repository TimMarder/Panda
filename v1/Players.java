public class Players {

    //~~~~~~~~INSTANCE VARIABLES~~~~~~~~
    public int playerRating;   //the overall rating of the player
    public Players[] team;
    public Quarterback myQB;
    public Receiver myWR1;
    public Receiver myWR2;
    public Receiver myWR3;
    public Runningback myRB;
    public Linebacker myLB1;
    public Linebacker myLB2;
    public Cornerback myCB1;
    public Cornerback myCB2;
    public Safety mySS;

    
    //~~~~~~~~CONSTRUCTOR~~~~~~~~
    public Players() {
	team = new Players[10];
    }
    
    //~~~~~~~~METHODS~~~~~~~~
    public void setPlayerRating( int rating ) {
	playerRating = rating;
    }

    public void showStats() {

    }

    public void setTeam( String team ) {

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
