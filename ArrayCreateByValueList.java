package Chap4;

public class ArrayCreateByValueList {

	public static void main(String...args) {
//		int[] scores = {83, 90, 87};	// 값의 목록으로 배열객체 생성
		int[] scores;
		scores = new int[] {83, 90, 87};
		
		//Indexing을 통한 배열의 각 원소의 참조(사용)
		System.out.println("scores[0] : " + scores[0]);
		System.out.println("scores[1] : " + scores[1]);
		System.out.println("scores[2] : " + scores[2]);
		
		int sum = 0;
//		for(int i = 0; i<scores.length; i++) {	// 배열의 순회(traverse)
//			sum += scores[i];
//		} // for
		
		for(int i : scores) {
			sum += i;
		} // enhanced for
		
		System.out.println("종합 : " + sum);
		
		double avg = (double)sum / scores.length;
		System.out.println("평균 : " + avg);
	} // main
	
} // end class
