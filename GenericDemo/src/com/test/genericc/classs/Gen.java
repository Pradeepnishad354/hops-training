package com.test.genericc.classs;

// generic class example 
// we can create our own generic class as per our requirement
public class Gen<T> {
	
	
	T ob;
	Gen (T ob){
		
		this.ob=ob;
		
	}
	
	public void show() {
		
		System.out.println(" the type of ob is :+"+ob.getClass().getName());
	}
	public T getOb() {
		
		return ob;
	}
	
	public static void main(String[] args) {
		
		//String take as class parameter
		Gen<String> g1=new Gen<String>("pradeep");
		g1.show();
	System.out.println(	g1.getOb());
		
		
	//Integer take as class parameter
	
	Gen<Integer> g2=new Gen<Integer>(10);
	g2.show();
	System.out.println(g2.getOb());
	

	//Double take as class parameter
	Gen<Double> g3=new Gen<Double>(10.0);
	g3.show();
	System.out.println(g3.getOb());
	
		}
}
