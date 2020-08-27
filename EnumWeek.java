package Chap4;

import java.util.Calendar;

public class EnumWeek {

	public static void main(String...args) {
		Week today = null;	// 열거타입 변수의 정의
		
		// 달력(Calendar) 객체의 생성
		Calendar cal = Calendar.getInstance();
		// 오늘이 무슨 요일인지 알고자 할 때..
		int week = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println(" - week: " + week);
		
		// 위에서 구한 요일이 과연 무슨 요일인지 판단
		switch(week) {
			case 1: today = Week.SUNDAY; break;
			case 2: today = Week.MONDAY; break;
			case 3: today = Week.TUESDAY; break;
			case 4: today = Week.WEDNESDAY; break;
			case 5: today = Week.THURSDAY; break;
			case 6: today = Week.FRIDAY; break;
			case 7: today = Week.SATURDAY; break;
		} // switch
		
		System.out.println("오늘 요일: " + today);
		
		// 열거타입 == 열거타입별로 비교
		if(today == Week.SUNDAY) {
			System.out.println("일요일에는 축구를 합니다.");
		} else {
			System.out.println("열심히 자바 공부합니다.");
		} // if-else
	} // main
	
} // end class
