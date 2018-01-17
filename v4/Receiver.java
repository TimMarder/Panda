public class Receiver extends OffensivePlayers{

    public int agility;
    public int awareness;
    public int speed;
    public int vertical;
    public int catching;
    public int playerRating;

    public Receiver(String wrname) {
	   super(wrname);
    }

    public Receiver(String wrname , String wrteam) {
	super(wrname, wrteam);
    }

    public String toString() {
	String retStr = "";
	retStr += "[WR]" + name + "\n";
	retStr += "PLAYER RATING < " + playerRating + " >\n";
	retStr += "Agility: " + agility + "\n"; 
	retStr += "Awareness: " + awareness + "\n";
	retStr += "Speed: " + speed + "\n";
	retStr += "Vertical: " + vertical + "\n";
	retStr += "Catching: " + catching + "\n";
	return retStr;
    }
    
    public void setStats() {
    	setAgility(70);
    	setAwareness(70);
    	setSpeed(70);
    	setVertical(70);
    	setCatching(70);
    }
    
    public void setStats(int agile,
			 int aware,
			 int spd,
			 int vert,
			 int hands) {
	setAgility(agile);
	setAwareness(aware);
	setSpeed(spd);
	setVertical(vert);
	setCatching(hands);
    }
    
    public void setAgility(int agile) {
	   agility = agile; 
    }

    public void setAwareness(int aware) {
	   awareness = aware;
    }

    public void setSpeed(int spd) {
	   speed = spd;
    }

    public void setVertical(int vert) {
	   vertical = vert;
    }

    public void setCatching(int hands) {
	   catching = hands;
    }

    public void setPlayerRating() {
        playerRating = (agility + awareness + speed + vertical + catching) / 5;
    }

    public static void main(String[] args) {

    }

}
