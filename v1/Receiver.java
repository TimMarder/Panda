public class Receiver {

	public int agility;
	public int awareness;
	public int speed;
	public int vertical;
	public int catching;
	public String name;

	public Receiver(String wrname) {
		name = wrname;
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

	public static void main(String[] args) {

	}

}