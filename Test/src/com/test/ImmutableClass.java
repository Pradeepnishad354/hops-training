package com.test;

public final class ImmutableClass {
	
	 final String panNumber ;
	
	
	
	public String getPanNumber() {
		
		return panNumber;
	}
	
	
	
	
	public ImmutableClass(String panNumber) {
		super();
		this.panNumber = panNumber;
	}




	public static void main(String[] args) {
		

		ImmutableClass immutableClass = new ImmutableClass("BJUPN3363");
	    String panNumber2 = immutableClass.getPanNumber() ;    
		System.out.println(panNumber2);
	}

}
