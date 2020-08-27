package Chap4;

import java.util.Arrays;

public class ArrayCopy {

	public static void main(String...args) {
//		String[] oldStrArray = { "java", "array", "copy" };
//		String[] newStrArray = new String[5];
		
		int[] srcArray = {0,1,2,3,4,5,6,7,8,9};
		int[] targetArray = new int[10];	//더이상 참조 X, Garbage
		
		//배열복사 by System.arraycopy() method
		System.arraycopy(
				srcArray,
				3,			// offset
				targetArray,
				0,
				5			// length
				); // arrayCopy
		
		System.out.println(Arrays.toString(targetArray));
		
//		------------------------------------
		
		targetArray = Arrays.copyOf(srcArray, 15);
		
		System.out.println(Arrays.toString(targetArray));
	} // main
	
} // end class
