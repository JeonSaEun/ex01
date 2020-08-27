package Chap3;

public class ForSumFrom1To100 {

	public static void main(String...args) {
		int sum = 0;
		
		for(int i=1; i<=100; i++) {
			
			if(i%7==0) {
			sum += i;
			} // if
			
		} // for
		
		System.out.println("1~100 중 7의 배수의 합 " + sum);
		
		//---------------------------//
		
		
	} // main
	
} // end class
