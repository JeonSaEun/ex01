package Chap10;

public class TTT {
	public static void main(String...args) {
		
		try {
			method1();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	} // main
	
	public static void method1() throws Exception {
		System.out.println("- method1 -");
		
		method2();
	} // method1
	
	public static void method2() throws Exception {
		System.out.println("- method2 -");
		
		method3();
	} // method2
	
	public static void method3() throws Exception {
		System.out.println("- method3 -");
		
		throw new Exception("method3");
	} // method3
	
} // end class
