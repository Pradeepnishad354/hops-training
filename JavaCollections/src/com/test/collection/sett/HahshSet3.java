package com.test.collection.sett;

import java.util.HashSet;

public class HahshSet3 {

	public static void main(String[] args) {

		// union ,intersection, difference

		HashSet<Integer> h = new HashSet<>();

		h.add(1);
		h.add(2);
		h.add(3);
		h.add(4);
		h.add(5);

		System.out.println(h);

		HashSet<Integer> hs = new HashSet<>();

		hs.add(3);
		hs.add(4);
		hs.add(5);
//		System.out.println(hs);
		// union
//		hs.addAll(h);
//		System.out.println("union" + hs);

		// intersection : return all the element except hs set
		System.out.println("++++++++++++++++");
		hs.retainAll(h);
		System.out.println("Intersection"+hs);
		
		//difference
		
		h.removeAll(hs);
		System.out.println("Diffrence"+h);
	}

}
