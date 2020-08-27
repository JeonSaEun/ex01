package Chap3;

public class DenyLogicOperatorExample {

	
	public static void main(String... args) {
		boolean play = true;
		System.out.println(play);
	
		//-----------------------//
		
		play = !play; 				//toggle
		System.out.println(play);
		
		//-----------------------//
		
		play = !play;				//toggle
		System.out.println(play);
		
		boolean isStopped = false;
		while(!isStopped) {
			;;
		} //while
	} //main
} //end class
