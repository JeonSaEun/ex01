package Chap3;

public class P_2 {

	public static void main(String...args) {
		for(int x=2; x<=100; x++) {
			boolean isPrime = true;
			
			for(int y=2; y<=x-1; y++) {
				if(x%y == 0) { 
					// not prime
					isPrime = false;
					
					break;
				} // if
				
			} // 2nd for
			
			if(isPrime) { 
			System.out.print(x+", ");
			} // if
		} // 1st for
		
	} // main
	
} // end class