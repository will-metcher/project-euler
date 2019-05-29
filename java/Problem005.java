import java.util.ArrayList;
import java.util.List;

public class Problem005 {

	public static void main(String args[]) {
		System.out.println(new Problem005().run());
	}
	
	int ceiling = 20;
	List<Integer> checklist = new ArrayList<Integer>();
	
	public String run() {
		generateChecklist();
		for(int i = 2520; i < 999999999; i += 2520) {
			if(isEvenlyDivisible(i)) {
				return "Answer: "+i;
			}
		}
		return "";
	}
	
	public void generateChecklist() {
		for(int i = 1; i < ceiling; i++) {
			if(2520 % i != 0) {
				checklist.add(i);
			}
		}
	}
	
	public boolean isEvenlyDivisible(int num) {
		if(num % 2520 != 0) {
			return false;
		}
		for(int i = 0; i < checklist.size(); i++) {
			if(num % checklist.get(i) != 0) {
				return false;
			}
		}
		return true;
	}
}
