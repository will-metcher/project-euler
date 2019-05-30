
public class Problem010 {

	public static void main(String args[]) {
		System.out.println(new Problem010().run());
	}
	
	public String run() {
		long sum = 0L;
		int max = 2000000;
		
		for(int i = 2; i < max; i++) {
			if(Utils.isPrime(i)) {
				sum += i;
			}
		}
		
		return "Answer: "+sum;
	}
}
