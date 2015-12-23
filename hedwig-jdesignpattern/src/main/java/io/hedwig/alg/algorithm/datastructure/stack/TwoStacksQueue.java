/* 
 * Cracking the coding interview (5th edition)
 * Chapter 3 - Stacks and Queues
 * 
 * Question 3.5
 * Implement a MyQueue class which implements a queue using two stacks.
 * 
 * Solution - pg 213
 * 
 */
package io.hedwig.alg.algorithm.datastructure.stack;


import com.hedwig.algorithm.datastructure.queue.IQueue;

public class TwoStacksQueue<AT> implements IQueue<AT> {
	
	private IStack<AT> stack1;
	private IStack<AT> stack2;
	
	public TwoStacksQueue() {
		stack1 = new ArrayStack<AT>();
		stack2 = new ArrayStack<AT>();
	}

	@Override
	public void enqueue(AT item) {
		while (!stack2.isEmpty()) {
			stack1.push(stack2.pop());
		}
		stack1.push(item);
		while (!stack1.isEmpty()) {
			stack2.push(stack1.pop());
		}
	}

	@Override
	public AT dequeue() {
		return stack2.pop();
	}

	@Override
	public AT peekFront() {
		return stack2.peek();
	}

	@Override
	public boolean isEmpty() {
		return stack2.isEmpty();
	}
	
	@Override
	public String toString() {
		return stack2.toString();
	}

	public static void main(String[] args) {
		IQueue<Integer> queue = new TwoStacksQueue<Integer>();
		queue.enqueue(16);
		queue.enqueue(22);
		queue.enqueue(13);
		queue.enqueue(44);
		System.out.println(queue);
		queue.dequeue();
		System.out.println(queue);
		queue.dequeue();
		System.out.println(queue);
		queue.dequeue();
		System.out.println(queue);
		queue.dequeue();
		System.out.println(queue);
	}

}
