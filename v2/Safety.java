public class Safety extends DefensivePlayers {

	public int catching;
	public int awareness;
	public int speed;
	public int coverage;
	public int tackling;

    public Safety(String ssname) {
	super(ssname);
    }
    
    public Safety(String ssname , String ssteam) {
	super(ssname, ssteam);
    }
    
	public void setStats(int hands,
			 int aware,
			 int spd,
			 int cover,
			 int tackle) {
		setCatching(hands);
		setAwareness(aware);
		setSpeed(spd);
		setCoverage(cover);
		setTackling(tackle);
	}
    
	public void setCatching(int hands) {
		catching = hands; 
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
