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
