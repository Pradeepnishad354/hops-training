package com.jackson.annotation;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ManageReferenceBackReferenceAnno {

	public static void main(String[] args) throws JsonProcessingException {

		BackReference testBean = new BackReference(111, "jay");
		ManageReference m = new ManageReference(100, "mahadev", testBean);

		testBean.addEmployee(m);

		ObjectMapper mapper = new ObjectMapper();
		String jsonString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(m);
		
		System.out.println(jsonString);

	}

}

class ManageReference {

	public int empId = 114;
	public String empName = "pradeep";
@JsonManagedReference 
	public BackReference manager;

	public ManageReference(int empId, String empName, BackReference manager) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.manager =manager;
	}

}

class BackReference {
	public int empId = 115;
	public String empName = "amit";

	@JsonBackReference
	public List<ManageReference> list;

	public BackReference(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
		list = new ArrayList<ManageReference>();

	}

	public void addEmployee(ManageReference manageReference) {
		list.add(manageReference);
	}
}