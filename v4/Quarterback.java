public class Quarterback extends OffensivePlayers {

    public int agility;
    public int awareness;
    public int armPower;
    public int accuracy;
    public int intelligence;
    public int playerRating;

    public Quarterback(String qbname) {
	super(qbname);
    }

    public Quarterback(String qbname , String qbteam) {
	super(qbname, qbteam);
    }


    public String toString() {
	String retStr = "";
	retStr += "[QB]" + name + "\n";
	retStr += "Agility: " + agility + "\n"; 
	retStr += "Awareness: " + awareness + "\n";
	retStr += "Arm Power: " + armPower + "\n";
	retStr += "Accuracy: " + accuracy + "\n";
	retStr += "Intelligence: " + intelligence + "\n";
	return retStr;
    }
    
    public void setStats() {
    	setAgility(70);
    	setAwareness(70);
    	setArmPower(70);
    	setAccuracy(70);
    	setIntelligence(70);
    }
    
    public void setStats(int agile,
			 int aware,
			 int arm,
			 int accurate,
			 int intelligent) {
	setAgility(agile);
	setAwareness(aware);
	setArmPower(arm);
	setAccuracy(accurate);
	setIntelligence(intelligent);
    }
    
    public void setAgility(int agile) {
	agility = agile; 
    }

    public void setAwareness(int aware) {
	awareness = aware;
    }

    public void setArmPower(int arm) {
	armPower = arm;
    }

    public void setAccuracy(int accurate) {
	accuracy = accurate;
    }

    public void setIntelligence(int intelligent) {
	intelligence = intelligent;
    }

    public void setPlayerRating() {
        playerRating = (agility + awareness + armPower + accuracy + intelligence) / 5;
    }

    public static void main(String[] args) {

    }

}
