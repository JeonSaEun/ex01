package Chap4;

public class EnumMethod {

	public static void main(String...args) {
		//-- 1. name() 메소드
		Week today = Week.SUNDAY;
		String name = today.name();
		
		System.out.println(name);
		
//		------------------------------------
		
		//-- 2. ordinal() 메소드
		int ordinal = today.ordinal();
		
		System.out.println(ordinal);
		
		//-- compareTo() 메소드
		Week day1 = Week.MONDAY;
		Week day2 = Week.WEDNESDAY;
		
		int result1 = day1.compareTo(day2);
		int result2 = day2.compareTo(day1);
		
		System.out.println(result1);
		System.out.println(result2);
		
//		------------------------------------
		
		//valueOf() 메소드
		Week weekDay = Week.valueOf("SUNDAY");
		
		if(weekDay == Week.SATURDAY || weekDay == Week.SUNDAY) {
			System.out.println("주말 이군요");
		} else {
			System.out.println("평일 이군요");
		} // if-else
		
//		-------------------------------------
		
		//values() 메소드
		Week[] days = Week.values();
		for(Week day : days) {
			System.out.println(day);
		} // enhanced for
	} // main
	
} // end class