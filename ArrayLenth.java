package Chap4;

public class ArrayLenth {

	public static void main(String...args) {
		int[] scores = {83, 90, 87};
		
		int sum = 0;
		
//		for(int i=0; i<scores.length; i++) {
//			sum += scores[i];
//		} // for
//		
		
		for(int i : scores) {
			sum += i;
		} // enhanced for
		
		System.out.println("총합 : " + sum);
		
		double avg = (double) sum / scores.length;
		System.out.println("평균 : " + avg);
	} // main
	
} // end class
