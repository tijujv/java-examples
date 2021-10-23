package test.financial;

import java.util.ArrayList;
import java.util.Stack;

public class StacktoList {

	public static <T> ArrayList<T> stacktoList(Stack<T> stack, boolean reverseItems) {

		ArrayList<T> items = new ArrayList<T>(stack.size());

		while (stack.size() > 0) {
			T item = stack.pop();
			if (reverseItems) {
				items.add(0, item);
			} else {
				items.add(item);
			}
		}
		return items;
	}
}
