
public class Problem006 {

	public static void main(String args[]) {
		System.out.println(new Problem006().run());
	}
	
	public String run() {
		int sumOfSquares = 0;
		int squareOfSums = 0;
		int max = 100;
		
		int count = 0;
		for(int i = 0; i <= max; i++) {
			count += i;
			sumOfSquares += i * i;
		}
		squareOfSums = count * count;
		
		return "Answer: " + (squareOfSums - sumOfSquares);
	}
}
