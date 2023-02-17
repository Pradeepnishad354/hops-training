package com.test.genericc.classs;

public class GenericClass22 {
	public static void main(String[] args) {
		
GenericClass2<Integer,String > g1=new GenericClass2<Integer,String >(100,"rahul");
		
		System.out.println(g1.getKey()+" " + g1.getValue());
		GenericClass2<Integer,String > g2=new GenericClass2<Integer,String >(200,"mukesh");
		System.out.println(g2.getKey()+" " + g2.getValue());
		GenericClass2<Integer,String > g3=new GenericClass2<Integer,String >(300,"rakesh");
		System.out.println(g3.getKey()+" " + g3.getValue());
	}

}
