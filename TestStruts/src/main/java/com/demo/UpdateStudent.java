package com.demo;

import java.sql.SQLException;

import com.demo.dao.StudentDao;
import com.opensymphony.xwork2.ActionSupport;

public class UpdateStudent extends ActionSupport{

	
	

	
	
	
	public String execute(int id, AddStudent updateddata) throws SQLException {
		StudentDao d=new StudentDao();
	
		
		AddStudent existingdata = d.fetchDataById(id);
		
		System.out.println("=-=======================>>>>"+existingdata.getName());
		
		
		if(existingdata !=null) {
			
			Integer Pkid = id;
			String name = updateddata.getName()!=null ? updateddata.getName() : existingdata.getName();
			int age = updateddata.getAge()!=0? updateddata.getAge() : existingdata.getAge();
			String email=updateddata.getEmail()!=null ? updateddata.getName():existingdata.getEmail();
			String city=updateddata.getCity()!=null ? updateddata.getCity():existingdata.getCity();
			
			existingdata.setId(Pkid);
			existingdata.setName(name);
			existingdata.setAge(age);
			existingdata.setEmail(email);
			existingdata.setCity(city);
		
			d.updateStudentDetails( existingdata );
			
			System.out.println("Test ==============================");
		}
		else
		{
			//Exception given id not found
		}
	

		return "success";

		
	}

	

}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//		
//		
//	}
//	
//}
//	

//	public String execute(AddStudent student) throws SQLException {
//		
//		StudentDao d=new StudentDao();
//		
//		  d.updateStudentDetails(student.getId(),student.getName(),student.getAge(),student.getEmail(),student.getCity());
//		
//		return "success";
//	}

//}
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		

//
//
//	public String execute(int id) throws SQLException{
//		
//		 Connection con = ConnectionProvider.getConnection();
//		
//		 PreparedStatement ps = con.prepareStatement("update student1 set name=?,age=?,email=?,city=? where="+id);
//			 System.out.println("TEsting ===========================>>>>>>>>>>>>>>>>>>>>>>");
//			 ps.setString(1, student.getName());
//			 ps.setInt(2,student.getAge());
//			 ps.setString(3, student.getEmail());
//			 ps.setString(4, student.getCity());
//		 
//			 ps.executeQuery();
//			 
//			 return "success";
//		 }
//		 
//	}
		
		
		
		
		
		
		
		
		
		
		
		
//		private int id;
		//
//			private String name;
		//
//			private int age;
		//
//			private String email;
		//
//			private String city;
		//
//			String submitType;
		//
//			private String msg;
//			private int idhidden;
		//
//			ResultSet rs = null;
		//
//			StudentDao d = new StudentDao();
		//
//			public int getId() {
//				return id;
//			}
		//
//			public void setId(int id) {
//				this.id = id;
//			}
		//
//			public String getName() {
//				return name;
//			}
		//
//			public void setName(String name) {
//				this.name = name;
//			}
		//
//			public int getAge() {
//				return age;
//			}
		//
//			public void setAge(int age) {
//				this.age = age;
//			}
		//
//			public String getEmail() {
//				return email;
//			}
		//
//			public void setEmail(String email) {
//				this.email = email;
//			}
		//
//			public String getCity() {
//				return city;
//			}
		//
//			public void setCity(String city) {
//				this.city = city;
//			}
		//
//			public String getSubmitType() {
//				return submitType;
//			}
		//
//			public void setSubmitType(String submitType) {
//				this.submitType = submitType;
//			}
		//
//			public String getMsg() {
//				return msg;
//			}
		//
//			public void setMsg(String msg) {
//				this.msg = msg;
//			}
		//
//			public int getIdhidden() {
//				return idhidden;
//			}
		//
//			public void setIdhidden(int idhidden) {
//				this.idhidden = idhidden;
//			}
		//
//			public ResultSet getRs() {
//				return rs;
//			}
		//
//			public void setRs(ResultSet rs) {
//				this.rs = rs;
//			}
		//
//			public StudentDao getD() {
//				return d;
//			}
		//
//			public void setD(StudentDao d) {
//				this.d = d;
//			}
		//
//			@Override
//			public String execute() throws Exception {
		//
//				if (submitType.equals("updatedata")) {
//					rs = d.fetchUserDetails(id);
		//
//					if (rs != null) {
		//
//						while (rs.next()) {
		//
//							rs.getInt(id);
//							rs.getString("email");
//							rs.getInt(age);
//							rs.getString("email");
//							rs.getString("city");
//						}
//					}
//				} 
		//
//				return "success";
//			}
		//
		//}
		//


