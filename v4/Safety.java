public class Safety extends DefensivePlayers {

	public int catching;
	public int awareness;
	public int speed;
	public int coverage;
	public int tackling;
	public int playerRating;

    public Safety(String ssname) {
	super(ssname);
    }
    
    public Safety(String ssname , String ssteam) {
	super(ssname, ssteam);
    }

    public String toString() {
	String retStr = "";
	retStr += "[SS]" + name + "\n";
	retStr += "Catching: " + catching + "\n"; 
	retStr += "Awareness: " + awareness + "\n";
	retStr += "Speed: " + speed + "\n";
	retStr += "Coverage: " + coverage + "\n";
	retStr += "Tackling: " + tackling + "\n";
	return retStr;
    }
	    
    public void setStats() {
    	setCatching(70);
    	setAwareness(70);
    	setSpeed(70);
    	setCoverage(70);
    	setTackling(70);
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

	public void setPlayerRating() {
        playerRating = (catching + awareness + speed + coverage + tackling) / 5;
    }

	public static void main(String[] args) {
	    // Safety yo = new Safety("Bob Dylan");
	    // System.out.println(yo);
	    

	}

}
