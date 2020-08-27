package Chap3;

public class WhilePrintFrom1To10 {

	public static void main(String...args) {
		int sum = 0;
		int i = 1;
		
		while(i<=100) {
			sum+=i; // i변수의 값을 누적+	
			
			i++;
		} // while
		
		System.out.printf("1~%d 합: %d\n", (i-1), sum);
	} // main
	
} // end class
