public class Runningback extends OffensivePlayers {

	public int agility;
	public int awareness;
	public int speed;
	public int strength;
	public int explosiveness;
    
    public Runningback(String rbname) {
	super(rbname);
    }
    
    public Runningback(String rbname , String rbteam) {
	super(rbname, rbteam);
    }
    
    public void setStats() {
    	setAgility(70);
    	setAwareness(70);
    	setSpeed(70);
    	setStrength(70);
    	setExplosiveness(70);
    }
    
	public void setStats(int agile,
			 int aware,
			 int spd,
			 int strong,
			 int explode) {
		setAgility(agile);
		setAwareness(aware);
		setSpeed(spd);
		setStrength(strong);
		setExplosiveness(explode);
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

	public void setExplosiveness(int explode) {
		explosiveness = explode;
	}

	public static void main(String[] args) {

	}

}
