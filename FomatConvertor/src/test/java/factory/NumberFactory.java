package factory;

import java.util.ArrayList;

public class NumberFactory {
	public static ArrayList<Integer> getNumberList() {
		ArrayList<Integer> numberList = new ArrayList<Integer>();
		numberList.add(-3);
		numberList.add(0);
		numberList.add(4);
		return numberList;
	}
}
