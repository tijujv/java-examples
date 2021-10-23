package test.st.collections;

import java.util.PriorityQueue;

public class PriorityQueueCheck {
	public static void main(String[] args) {
		PriorityQueue<String> queue = new PriorityQueue<String>();
		queue.add("laundry");
		queue.add("washing");
		queue.add("bills");
		queue.offer("bills");

		System.out.println(queue);

		System.out.println(queue.size() + " " + queue.poll() + " \n " + queue.size() + " " + queue.peek() + " \n "
				+ queue.size() + " " + queue.poll() + " \n" + queue.size() + " " + queue.poll() + " \n" + queue.size()
				+ " " + queue.poll() + " \n" + queue.size() + " " + queue.peek() + " \n" + queue.size() + " "
				+ queue.poll() + " \n" + queue.size() + " " + queue.poll() + " \n");

		System.out.println(queue);
	}

}
