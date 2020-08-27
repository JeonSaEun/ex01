package Chap10;

public class TryCatchFinally {

	public static void main(String...args) {
		try {
			System.out.println("----- try -----");
			
			//NullPointerException 예외 발생 코드
			String name = null;
			System.out.println(name.length());
			
			// ClassNotFoundException 예외를 발생시키는 코드
			Class clazz = Class.forName("java.lang.String2");
			
		} catch(NullPointerException e) {
			System.out.println("----- catch1 -----");
			
			System.out.println("NullPointerException");
		} catch(ClassNotFoundException e) {
			System.out.println("----- catch2 -----");
			
			System.out.println("ClassNotFoundException");
		} // try-catch (finally block 생략)
		
		System.out.println("----- Done -----");
	} // main
	
} // end class
