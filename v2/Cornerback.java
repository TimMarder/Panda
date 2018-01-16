public class Cornerback extends DefensivePlayers {

    public int agility;
    public int awareness;
    public int speed;
    public int coverage;
    public int tackling;

    public Cornerback(String cbname) {
	super(cbname);
    }
    
    public Cornerback(String cbname , String cbteam) {
	super(cbname, cbteam);
    }

    public String toString() {
	String retStr = "";
	retStr += "[CB]" + name + "\n";
	retStr += "Agility: " + agility + "\n"; 
	retStr += "Awareness: " + awareness + "\n";
	retStr += "Speed: " + speed + "\n";
	retStr += "Coverage: " + coverage + "\n";
	retStr += "Tackling: " + tackling + "\n";
	return retStr;
    }
    
    public void setStats() {
    	setAgility(70);
    	setAwareness(70);
    	setSpeed(70);
    	setCoverage(70);
    	setTackling(70);
    }
    
    public void setStats(int agile,
			 int aware,
			 int spd,
			 int cover,
			 int tackle) {
	setAgility(agile);
	setAwareness(aware);
	setSpeed(spd);
	setCoverage(cover);
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

    public void setCoverage(int cover) {
	coverage = cover;
    }

    public void setTackling(int tackle) {
	tackling = tackle;
    }

    public static void main(String[] args) {

    }

}
