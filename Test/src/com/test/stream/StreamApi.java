package com.test.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Employee {

	int id;
	String name;
	double salary;
	int age;

	public Employee(int id, String name, double salary, int age) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.age = age;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

}

public class StreamApi {

	public static void main(String[] args) {

		List<Employee> list = new ArrayList<>();

		list.add(new Employee(21, "ashu", 20000, 26));
		list.add(new Employee(25, "vikas", 20500, 25));
		list.add(new Employee(27, "nirmal", 24000, 23));
		list.add(new Employee(10, "vinayak", 40000, 33));
		list.add(new Employee(1, "roshan", 30000, 26));
		list.add(new Employee(2, "pritesh", 44000, 30));
		list.add(new Employee(15, "pradeep", 18000, 22));

//		List<Double> employeeSalaryList=new ArrayList<>();		
//		for(Employee l:list) {
//			
//			
//			if(l.salary>30000) {
//				
//				employeeSalaryList.add(l.salary);
//			}
//		}
//		
//		System.out.println(employeeSalaryList);
		
		
		//using lambdaExpression
		
		
		List<Double> collect = list.stream()
				.filter(s->s.salary>30000)
				.map(s->s.salary)
				.collect(Collectors.toList());
		
		System.out.println(collect);
	}

}
