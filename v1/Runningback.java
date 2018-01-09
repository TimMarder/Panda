public class Runningback {

	public int agility;
	public int awareness;
	public int speed;
	public int strength;
	public int explosiveness;
	public String name;

	public Runningback(String rbname) {
		name = rbname;
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
