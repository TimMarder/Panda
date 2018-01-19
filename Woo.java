//~~~~~~~~IMPORTS~~~~~~~~
import cs1.Keyboard;


public class Woo {


    private String[] teamList = {"Giants" , "Eagles" , "Browns" , "Steelers" , "Falcons"};
	
    //~~~~~~~~METHODS~~~~~~~~	
    
    public static void main( String[] args ) {
	Team You = new Team();
	You.setupUser();
	You.setupTeam();
	//System.out.println(You);
	/*
	  Team T1 = new Team("Coach 1", "Eagles");
	  System.out.println(T1);
		
	  Team T2 = new Team("Coach 2", "Browns"); 
	  System.out.println(T2);
		
	  Team T3 = new Team("Coach 3", "Steelers");
	  System.out.println(T3);
		
	  Team T4 = new Team("Coach 4", "Falcons");
	  System.out.println(T4);
	*/
		
	You.dashboard();
    }//End of main
	
}//End of woo
