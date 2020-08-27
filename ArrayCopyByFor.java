package Chap4;

import java.util.Arrays;

public class ArrayCopyByFor {

	public static void main(String...args) {
		int[] oldIntArray = {1,2,3};
		int[] newIntArray = new int[5];
		
//		----------------------------
//		배열 복사
		for(int i=0; i<oldIntArray.length; i++) {
			newIntArray[i] = oldIntArray[i];
		} // for
		
//		----------------------------
		
		System.out.println(Arrays.toString(newIntArray));
		
//		for(int i=0; i<newIntArray.length; i++) {
//			System.out.print(newIntArray[i] + ", ");
//		} // for
	} // main
	
} // end class
