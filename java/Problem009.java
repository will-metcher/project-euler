
public class Problem009 {

	public static void main(String args[]) {
		System.out.println(new Problem009().run());
	}

	public String run() {
		for(int a = 1; a < 1000; a++) {
			for(int b = a; b < 1000 - a; b++) {
				int c = 1000 - a - b;
				if(c < b) {
					break;
				}
				if(isTriplet(a, b, c)) {
					return "Answer: "+(a*b*c);
				}
			}
		}
		return "None";
	}

	public boolean isTriplet(int a, int b, int c) {
		return (a * a) + (b * b) == c * c;
	}
}
