package ex01;

public class P_3 {

	public static void main(String...args) {
//		한 학생의 점수가 78점이다.
//		이 때, 아래의 점수대에 따라 등급을 부여하라.
//		100 ~ 90 : A, 80 ~ 89 : B, 70 ~ 79 : C, 그 외 : D
		
/*        step 1.  학생의 점수와 등급을 부여, 두가지의 변수를 조건식을 만들어야 한다.
	      step 2.  변수 score에 78점을 넣자.
	      step 3.  변수 grade를 만들자
	      step 4.  점수대별 나누자 (100~90= A , 89~80=B , 79~70= C , D)
	      step 5.  결과값을 도출하자.      */
	      int score = 78;
	      char grade = ( score >= 90 ) ? 'A' :
	    	  			( score >= 80 ) ? 'B' : 
	             		( score >= 70 ) ? 'C' : 'D';
	       
	       System.out.println("찬하의 점수는 " + score + "입니다. " 
	       + "그래서 등급은 "+ grade + "입니다.");
	   } //main
	   
	} //end class