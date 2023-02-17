package com.test.generic.interface2;

import com.test.generic.interface1.Ginterface;

public class GImple2 implements Ginterface<String > {

	private String e;
	@Override
	public void setValue(String e) {
		this.e=e;
		
	}

	@Override
	public String getValue() {
		
		return e;
	}

}
