
package com.test.generic.method;

public class MethodTest {
	public static void main(String[] args) {
		
		 Integer[] arr= {12,4,5,56};
		 String[] arr2= {"saurabh","pradeep",};
		 
		 // pass Integer array
		MyGenericClass<Integer> myGenericClass = new MyGenericClass<>(arr);
		
		Integer[] arr1 = myGenericClass.getArr();
		
		myGenericClass.printElement(arr1);
		
		
		// pass string array
		MyGenericClass<String> myGenericClass2 = new MyGenericClass<>(arr2);
		
		String [] strarr3 = myGenericClass2.getArr();
		
		myGenericClass2.printElement(strarr3);
		
		//non generic class 
		
		 NonGenericClass nonGenericClass = new NonGenericClass();
		 
		 nonGenericClass.printElement(arr1);
		 nonGenericClass.printElement(strarr3);
	}

}
