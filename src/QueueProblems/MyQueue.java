package QueueProblems;

import java.util.*;
public class MyQueue {
	
	private int front,rear,size,capacity;
	private int array[];
	
	//constructor
	
	public MyQueue(int capacity) {
		this.capacity=capacity;
		front=this.size=0;
		rear=capacity-1;
		array=new int[capacity-1];
	}
	
	/*
	 * All operation are done in O(1) Time Complexity
	 * O(N) extra space where N is the size of the array
	 */
	
	public boolean isFull(MyQueue queue) {
		return (queue.size==queue.capacity);
	}
	
	public boolean isEmpty(MyQueue queue) {
		return (queue.size==0);
	}
	
	public void enqueue(int item) {
		if (isFull(this))
			return;
		this.rear=(this.rear+1)%this.capacity;
		this.array[this.rear]=item;
		this.size=this.size+1;
		System.out.println(item+" enqueed to queuee");
	}
	
	public int dequeue() {
		if (isEmpty(this)) 
			return Integer.MIN_VALUE; 

		int item = this.array[this.front]; 
		this.front = (this.front + 1) 
					% this.capacity; 
		this.size = this.size - 1; 
		return item;
	}
	
	public int getFront() {
		if (isEmpty(this))
			return Integer.MIN_VALUE;
		
		return this.array[this.front];
	}
	
	public int getRear() {
		if (isEmpty(this))
			return Integer.MIN_VALUE;
		
		return this.array[this.rear];
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyQueue queue = new MyQueue(1000); 

		queue.enqueue(10); 
		queue.enqueue(20); 
		queue.enqueue(30); 
		queue.enqueue(40); 

		System.out.println(queue.dequeue() 
						+ " dequeued from queue\n"); 

		System.out.println("Front item is "
						+ queue.getFront()); 

		System.out.println("Rear item is "
						+ queue.getRear()); 

	}

}
