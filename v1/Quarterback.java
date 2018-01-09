public class Quarterback extends OffensivePlayers {

	public int agility;
	public int awareness;
	public int armPower;
	public int accuracy;
	public int intelligence;
	public String name;

	public Quarterback(String qbname) {
		name = qbname;
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

	public static void main(String[] args) {
		//Quarterback EliManning = new Quarterback("Eli Manning");
        //EliManning.setStats( 59 , 68 , 72 , 82 , 69 );

	}

}
