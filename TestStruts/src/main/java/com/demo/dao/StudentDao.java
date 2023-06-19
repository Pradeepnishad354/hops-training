package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.demo.AddStudent;
import com.test.ConnectionProvider;

public class StudentDao {
static // add student 
	
	Connection connection = ConnectionProvider.getConnection();
	
	public String addStudent(AddStudent student) throws SQLException {

		Connection connection = ConnectionProvider.getConnection();
	
			PreparedStatement ps = connection.prepareStatement("insert into student1  values(?,?,?,?,?)");
			ps.setInt(1, student.getId());
			ps.setString(2, student.getName());
			ps.setInt(3, student.getAge());
			ps.setString(4, student.getEmail());
			ps.setString(5, student.getCity());

			int r = ps.executeUpdate();
		
			//connection.close();
			if (r > 0) {
				
				return "success";
			} else {
				
				return "fail";
			}
		

		

	}
	
	// fetch the record of student
	public static List<AddStudent> getAllStudent() throws SQLException  {
        List<AddStudent> student = new ArrayList<>();
        String sql = "SELECT * FROM student1";

      
      
        	//Connection connection = ConnectionProvider.getConnection();
        	  PreparedStatement ps=connection.prepareStatement(sql);
             ResultSet resultSet = ps.executeQuery() ;

            while (resultSet.next()) {
                AddStudent s = new AddStudent();
                s.setId(resultSet.getInt(1));
               s.setName(resultSet.getString(2));
               s.setAge(resultSet.getInt(3));
               s.setEmail(resultSet.getString(4));
               s.setCity(resultSet.getString(5));
                student.add(s);
            }
               
                
            
            //connection.close();
             
       
      

        
        return student;
    }

	
	
	// delete the student 
	
	public void  deleteStudent(int id) throws SQLException {
		
		String sql="delete from student1 where id="+id;
		//Connection c= ConnectionProvider.getConnection();
		
		   		
		PreparedStatement ps = connection.prepareStatement(sql);
		   
		    ps.executeUpdate(sql);
		    
		   
		  
	
            //connection.close();
            
		
	}
	
	// fetch the old data by Id to be update 

	public AddStudent fetchDataById(int id) throws SQLException{
		
		
		AddStudent s=new AddStudent();
		
		String sql="select id ,name,age,email,city from student1 where id=?";
		
		Connection con = ConnectionProvider.getConnection();
		
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1,id);
			ResultSet rs = ps.executeQuery();
			   System.out.println("Testing for name =========>>"+ rs.getString(2));
			
			
			return s;
			
		
		
	}
	
	
	// update student details
	
	public void updateStudentDetails(AddStudent s) throws SQLException{ 
		  //int i=0; 
		  String sql="update student1 set name=?,age=?,email=?,city=? where id=?";
	  
	  
	  Connection con = ConnectionProvider.getConnection();
	  
	  PreparedStatement ps = con.prepareStatement(sql); 
	 ps.setInt(1,s.getId());
	  ps.setString(1, s.getName());
	  ps.setInt(2, s.getAge());
	  ps.setString(3, s.getEmail());
	  ps.setString(4,s.getCity());	
	  
	    ps.executeUpdate(); 
	  System.out.println("Test =======");
	  
	  
	 
	 
	  
	  }
	  
}

























//	public void updateStudentDetails(AddStudent s) throws SQLException{ 
//		  //int i=0; 
//		//  String sql="update student1 set name=?,age=?,email=?,city=? where id=?";
//	  
//		
//		  String sql="update student1 set name="+ s.getName()+",age="+s.getAge()+",email="+s.getEmail()+",city="+s.getCity()+" where id="+s.getId();
//
//	  
//	  Connection con = ConnectionProvider.getConnection();
//	 // AddStudent s=new AddStudent();
//	  PreparedStatement ps = con.prepareStatement(sql); 
//	//  ps.setInt(1,id);
//	  ps.setString(1,s.getName());
//	  ps.setInt(2,s.getAge());
//	  ps.setString(3,s.getEmail());
//	  ps.setString(4,s.getCity());
//	  
//	    ps.executeUpdate(); 
//	  
//	  
//	  
//	 
//	 
//	  
//	  }
	
	
//	public ResultSet fetchUserDetails(int id) throws SQLException, Exception {
//		ResultSet rs = null;
//		
//			String sql = "SELECT id,name,age,email,city FROM student1 WHERE id= ?";
//			
//			 Connection con = ConnectionProvider.getConnection();
//			PreparedStatement ps = con.prepareStatement(sql);
//			ps.setInt(1, id);
//			rs = ps.executeQuery();
//			return rs;
//		
//		
//	}
//	
	
	
	// 
//	public int updateUserDetails(int id,String name, int age, String email, String city, int idhidden)
//			throws SQLException, Exception {
//		
//		int i = 0;
//		
//			String sql = "UPDATE student1 SET id=?,name=?,age=?,email=?,city=? WHERE id=?";
//			Connection con = ConnectionProvider.getConnection();
//			
//			PreparedStatement ps = con.prepareStatement(sql);
//			ps.setInt(1, id);
//			ps.setString(2, name);
//			ps.setInt(3, age);
//			ps.setString(4,email);
//			ps.setString(5, city);
//			ps.setInt(6, idhidden);
//			i = ps.executeUpdate();
//			return i;
//		
//		}
//	}
//	
//	
//
