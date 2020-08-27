package Chap4;

public class ArrayInArray {

	public static void main(String...args) {
		// 기본타입별 초기값을 컴파일러가 할당 : int -> 0으로 원소의 값 초기화
//		int[][] mathScores = new int[2][3];
//		
//		// 1차원 배열의 순회(Traverse)
//		for(int i=0; i<mathScores.length; i++) {
//			
//			// 2차원 배열의 순회(Traverse)
//			for(int k=0; k<mathScores[i].length; k++) {
//				System.out.println(
//						"mathScores["+i+"]["+k+"]="+mathScores[i][k]);
//			} // inner for
//			
//		} // outer for
		
		System.out.println("--------------------------");
//		
//		int[][] englishScores = new int[2][];
//		
//		englishScores[0] = new int[2];
//		englishScores[1] = new int[3];
//		
//		for(int i=0; i<englishScores.length; i++) {
//			
//			for(int k=0; k<englishScores[i].length; k++) {
//				System.out.println(
//						"englishScores["+i+"]["+k+"]="+englishScores[i][k]);
//			} // inner for
//			
//		} // outer for
//		
		System.out.println("-------------------------");
		
		int[][] javaScores = { {95, 80}, {92, 96, 80} };
		
		for(int i=0; i<javaScores.length; i++) {
			
			for(int k=0; k<javaScores[i].length; k++) {
				System.out.println("javaScores["+i+"]["+k+"]="
						+javaScores[i][k]);
			} // inner for
			
		} // outer for
	} // main
	
} // end class