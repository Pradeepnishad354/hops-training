package com.test.generic.interface1;

public class GImple1<E> implements Ginterface<E> {
	private E e;

	@Override
	public void setValue(E e) {
		this.e=e;
		
	}

	@Override
	public E getValue() {
		
		return e;
	}

}
