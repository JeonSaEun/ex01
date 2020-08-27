package Chap4;

public class ArrayCreateByValueList2 {

	public static void main(String...args) {
		int[] scores;
		scores = new int[] {83, 90, 87};
		
		int sum1 = 0;
		for(int i = 0; i<3; i++) { //배열의 순회(Traverse)
			sum1 += scores[i];
		} // for
		
		System.out.println("총합 : " + sum1);
		
//		int sum2 = add(new int[] {83, 90, 87});	 // 배열객체 정의
		int sum2 = add(scores);		// 이미 생성된 배열의 값을 주고 싶을때
		System.out.println("총합 : " + sum2);
		System.out.println();
	} // main
	 
	
	public static int add(int[] scores) { // 배열객체 선언
		int sum = 0;
		
		for(int i = 0; i<3; i++) {
			sum += scores[i];
		} // for
		
		return sum;
	}
}
