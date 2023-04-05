package com.test.collection.queue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class QueueeDemo {

	public static void main(String[] args) {

		PriorityQueue p = new PriorityQueue<>();

		// adding elements add(), offer();

		p.add(12);
		p.add(14);
		p.add(14);
		p.add(18);
		p.offer(14);
	//	p.offer("n");// it can store only same type data item

		System.out.println(p);// insertion order is preserve #dublicacate allowed

		// get head element(),peek()

		System.out.println(p.element());//it returns head element if it empty then give 
//		exception no such element
		System.out.println(p.peek());//if returns empty if element is not present

		
		//return & remove element  from queue remove(),poll()
		System.out.println(p.remove());//12
		System.out.println(p);//14,14,18,14
		System.out.println(p.poll());//14
		System.out.println(p);//14,18,14
		
		// traverse the element 
		Iterator<Integer> itr = p.iterator();
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
		}
	
	}

}
