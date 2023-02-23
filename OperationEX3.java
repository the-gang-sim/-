package chap03;

public class OperationEX3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 조건식 
		//// mum > 0 ----> Ture
		
		
		int num1 = 10;
		int num2 = 20;
		
		boolean flag = (num1 > 0) && (num2 > 0);
		System.out.println(flag); // true != "ture"
		
		flag = (num1 < 0) && (num2 > 0);
		System.out.println(flag);
		
		flag = (num1 <0) || (num2 > 0);
		System.out.println(flag);
	}

}
