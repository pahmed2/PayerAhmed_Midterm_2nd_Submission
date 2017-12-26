package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */


		Queue<Integer> newQue = new LinkedList<Integer>();
		// Add elements to Queue.
		newQue.add(200);
		newQue.add(230);
		newQue.add(400);
		newQue.add(300);
		newQue.add(500);
		//Using peek, poll, remove
		System.out.println(newQue.peek());
		System.out.println(newQue.poll());
		System.out.println(newQue.peek());
		System.out.println(newQue.remove());
		System.out.println(newQue.peek());

		//For Each loop  to retrieve data.
		System.out.println("retrieve data by for each loop: ");
		for (Integer in : newQue) {
			System.out.println(in);
		}

		//Here using while loop with Iterator to retrieve data.
		System.out.println("retrieve data using while loop: ");
		Iterator itr = newQue.iterator();
		while (itr.hasNext()) {
			Integer it = (Integer) itr.next();
			System.out.println(it);
		}
	}
}
