package chap03;

public class EX01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1. Java 프로그램 class명과 파일 이름이 동일하다.
		// 2. 형식
		//// - 위쪽에 변수선언
		//// - 아래쪽에는 비지니스로직(연산, 논술, 출력 등)
		//// 
		
		int myAge =23;
		int teacherAge = 38;
		
		boolean value = (myAge > 25);
		System.out.println(value);
		
		System.out.println(myAge <=25);
		System.out.println(myAge == teacherAge);
		
		char ch;
		ch = (myAge > teacherAge) ? 'T' : 'F';
		
		System.out.println(ch);
		
		String str;
		str = (myAge > teacherAge) ? "내가 선생님보다 나이가 많다" : "내가 선생님보다 어리다";
		System.out.println(str);
	}
}

