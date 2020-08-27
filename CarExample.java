package Chap4;

public class CarExample {

	public static void main(String...args) {
		// default 생성자를 이용하여 객체 생성
		Car myCar = new Car();
		
		// 도트(.)연산자(객체멤버참조연산자)를 이용하여 필드 값 읽기
		// 필드 값 읽기
		System.out.println("제작회사: " + myCar.company);
		System.out.println("모델명: " + myCar.model);
		System.out.println("색깔: " + myCar.color);
		System.out.println("최고속도: " + myCar.maxSpeed);
		System.out.println("현재속도: " + myCar.speed);
		
		// 도트(.)연산자(객체멤버참조연산자)를 이용하여 필드 값 변경
		myCar.speed = 60;
		// 도트(.)연산자(객체멤버참조연산자)를 이용하여 필드 값 출력
		System.out.println("수정된 속도: " + myCar.speed);
		
	} // main
	
} // end class
