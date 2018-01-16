public class Linebacker extends DefensivePlayers {

    public int agility;
    public int awareness;
    public int speed;
    public int strength;
    public int tackling;

    public Linebacker(String lbname) {
	super(lbname);
    }

    public Linebacker(String lbname , String lbteam) {
	super(lbname, lbteam);
    }

    public String toString() {
	String retStr = "";
	retStr += "[LB]" + name + "\n";
	retStr += "Agility: " + agility + "\n"; 
	retStr += "Awareness: " + awareness + "\n";
	retStr += "Speed: " + speed + "\n";
	retStr += "Strength: " + strength + "\n";
	retStr += "Tackling: " + tackling + "\n";
	return retStr;
    }

    public void setStats() {
    	setAgility(70);
    	setAwareness(70);
    	setSpeed(70);
    	setStrength(70);
    	setTackling(70);
    }
    
    public void setStats(int agile,
			 int aware,
			 int spd,
			 int strong,
			 int tackle) {
	setAgility(agile);
	setAwareness(aware);
	setSpeed(spd);
	setStrength(strong);
	setTackling(tackle);
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

    public void setStrength(int strong) {
	strength = strong;
    }

    public void setTackling(int tackle) {
	tackling = tackle;
    }

    public static void main(String[] args) {

    }

}
