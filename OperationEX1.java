package chap03;

public class OperationEX1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 중괄호 블럭 : 쌍이 맞아야 함. {}{} Nested.
		// 변수명이 틀렸을때 cannot be resolved.
		// 개발자 폰트 -> 대소문자 구분
		// Type varible = value;
		// 타입 변수명;
		// 타입 변수명 = 값;
		// [네이밍 룰]
		//// 패키지명 : 소문자 : chap03 
		//// 클래스명 : 대문자 연결문자 대문자 : OperationEX1
		//// 메소드명 : 소문자 연결문자 대문자() : main(String[] args)
		//// 변수명 : 소문자 연결문자 대문자 : mathScore
		// 2.0으로 나눈것과 2로 나눈것은 소수점 버림과 관련이 있음.
		
		int mathScore = 90;		
		int engScore = 70;
		int korScore = 100;
		
		int totalScore = mathScore + engScore + korScore;
		System.out.println(totalScore);
		
		double avgScore = totalScore / 3.0;
		System.out.println(avgScore);
		double avgScore2 = totalScore / 3;
		System.out.println(avgScore2);
	}

}
