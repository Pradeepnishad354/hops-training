package com.test.generic.bounded.type.parameter;

public class GenericBoundTest {
	
	public static void main(String[] args) {
		
		
		Integer intArr[]= {10,20,39,42};
		Long longArr[]= {10L,30L,1L,8L};
		Double doubleArr[]= {5.0,11.0,3.4+5.6};
		
		// integer
		MyGenericBound<Number> m=new MyGenericBound<>(intArr);
		
		double averageInt = m.getAverage();
		System.out.println(averageInt);
		
		// long
		MyGenericBound<Number> m1=new MyGenericBound<>(longArr);
		
		double averageLong = m1.getAverage();
		
		System.out.println(averageLong);
		
		//double
		
        MyGenericBound<Number> m2=new MyGenericBound<>(doubleArr);
		
		double averageDouble = m1.getAverage();
		
		System.out.println(averageDouble);
		
		//find specified element 
		int countGreaterThanSpecifiedElment = countGreaterThanSpecifiedElment(intArr,15);
		System.out.println(countGreaterThanSpecifiedElment);
		
		
		
	}

	public static <T extends Comparable<T>> int countGreaterThanSpecifiedElment(T[] arr,T element) {
		
		int count=0;
		
		for(T t: arr) {
			
			if(t.compareTo(element)>0) {
				
				count++;
			}
		}
		return count;
		
		
		
		
	}
}
