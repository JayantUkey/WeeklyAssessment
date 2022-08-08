package com.college.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.college.model.Student;

public class StudentDao {

	public Connection getConnection()throws Exception
	 {
		 Class.forName("com.mysql.cj.jdbc.Driver");
		 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/students", "root", "root");
		 return con;
	 }
	
	public String insert(Student st) {
		
		int i=0;
		
		try {
			String query="insert into student values(?,?,?,?,?)"; 
			PreparedStatement ps=getConnection().prepareStatement(query);
			
			 ps.setInt(1, st.getRollNo() );
			 ps.setString(2, st.getName());
			 ps.setString(3, st.getStd());
			 ps.setString(4, st.getDob());
			 ps.setFloat(5, st.getFee());
			 
			 i=ps.executeUpdate();
		}
		
		catch(Exception e) {
			System.out.println(e);
		}
		
		if(i>0)
		 {
		  return "successfully inserted data";
		 }
		
		 else
		 {
		  return "fail";
		 }
		
	}
	
	public void displayAll(Student st) {
		int i=0;
		
		try {
			Statement stt = getConnection().createStatement();
			String query = "select * from student;";
			ResultSet rs1;
			rs1 = stt.executeQuery(query);

			while (rs1.next()) {
				System.out.println("RollNo: " + rs1.getInt(1) + ", Name: " + rs1.getString(2) + ", Standard: "
						+ rs1.getString(3) + ", DOB: " + rs1.getString(4) + ", Fees: " + rs1.getString(5));
			}

		}
		
		catch(Exception e) {
			System.out.println(e);
		}
		
	
	}
	
}
