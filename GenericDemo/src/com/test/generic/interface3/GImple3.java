package com.test.generic.interface3;

import com.test.generic.interface1.Ginterface;

public class GImple3<E,K> implements Ginterface<E> {
	
	private E e;
	private K k;

	public K getK() {
		return k;
	}

	public void setK(K k) {
		this.k = k;
	}

	@Override
	public void setValue(E e) {
	this.e=e;
		
	}

	@Override
	public E getValue() {
		
		return e;
	}

}
