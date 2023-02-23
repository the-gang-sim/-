package chap03;

public class OperationEX4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int fatherAge = 45;
		int motherAge = 47;
		
		char ch;
		ch = (fatherAge > motherAge) ? 'T' : 'F';
		
		System.out.println(ch);
		
		String str;
		str = (fatherAge > motherAge) ? "아빠가 엄마보다 나이가 많다" : "엄마가 아빠보다 나이가 많다";
		System.out.println(str);
		
	}

}
