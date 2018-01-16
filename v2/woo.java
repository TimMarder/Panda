//~~~~~~~~IMPORTS~~~~~~~~
import cs1.Keyboard;


public class woo {


	
	//~~~~~~~~METHODS~~~~~~~~	
	public static void main( String[] args ) {
		Team You = new Team();
		You.setupUser();
		You.setupTeam();
		System.out.println(You);
		Team T1 = new Team("Coach 1");
		System.out.println(T1);
		Team T2 = new Team("Coach 2");
		System.out.println(T2);
		Team T3 = new Team("Coach 3");
		System.out.println(T3);
		Team T4 = new Team("Coach 4");
		System.out.println(T4);
	}//End of main
	
}//End of woo