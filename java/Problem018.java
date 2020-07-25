package main;

import java.util.ArrayList;
import java.util.List;

public class Problem018 {

	public Problem018() {
		System.out.println(findMaxTotal(create2DList(Utils.loadFile("p018_triangle"))));
	}
	
	public List<List<Integer>> create2DList(List<String> input) {
		List<List<Integer>> list  = new ArrayList<List<Integer>>();
		for(int i = 0; i < input.size(); i++) {
			List<Integer> temp = new ArrayList<Integer>();
			String[] splitInput = input.get(i).split(" ");
			for(int j = 0; j < splitInput.length; j++) {
				temp.add(Integer.parseInt(splitInput[j]));
			}
			list.add(temp);
		}
		
		return list;
		
	}
	
	public int findMaxTotal(List<List<Integer>> list) {
		for(int i = list.size() - 2; i >= 0; i--) {
			for(int j = 0; j < list.get(i).size(); j++) {
				list.get(i).set(j, list.get(i).get(j) + Math.max(list.get(i + 1).get(j), list.get(i + 1).get(j+1)));
			}
		}
		
		return list.get(0).get(0);
	}
	
	public static void main(String[] args) {
		new Problem018();
	}

}
