package chap03;

public class TextNote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mathScore = 20;
		int engScore = 10;
		int korScore = 5;
		
		int totalScore = mathScore + engScore + korScore;
		System.out.println(totalScore);
		
		double avgScore = totalScore / 3.0;
		System.out.println(avgScore);
		int avgScore2 = totalScore / 3;
		System.out.println(avgScore2);
		
		double lastScore = avgScore + 5;
		System.out.println(lastScore);
	}

}
