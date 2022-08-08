package com.college.controller;

/*
2)Inserting a record
ABC International School wants to computerize students details
The school maintains a database of students in MYSQL.
The student table contains information related to students and is shown in the following student table structure.
Column Name Type Constraint
Rollno Number (4) Primary Key
StudentName Varchar (20) Not Null
Standard Varchar (2) Not Null
Date_Of_Birth Date
Fees Number (9,2)
 When a new student joins the school, the student record is inserted in the student table.
The valid student details are as follows:
• Rollno: Valid value is a 4-digit number
• StudentName: Valid value can contain maximum 20 letters in uppercase
• Standard : Valid values are Roman Letters representing I to X(I, II, III, IV….IX, X)
Display Student details
Write the code to display details of all the students, if no roll no. is passed, while executing the main program.
If while executing the main program, the roll no. is passed, then it should display the record of that particular student
Write a Java program to insert some records to the table and display all the records from student table

*/


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import com.college.model.Student;
import com.college.service.StudentService;

public class ABC {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		//roll No
		int rollno = 0;
		do {
			System.out.print("Enter rollno: ");
			String rollstr = sc.nextLine();
			
			rollno = Integer.parseInt(rollstr);
			if (String.valueOf(rollno).length() != 4) 
				rollno = 0;
			
		} while (rollno == 0);
		
		
		//Student Name
		String studentName = "";
		
		boolean lowercasefound;
		do {
			System.out.print("Enter name: ");
			studentName = sc.nextLine();
			
			lowercasefound = false;
			for (int i = 0; i < studentName.length(); i++) {
				if (Character.isLowerCase(studentName.charAt(i))) {
					lowercasefound = true;
					break;
				}
			}
			
		} while (studentName.length() > 20 || lowercasefound);
		
		
		//std
		String standard = "";
		String[] standards = {"I", "II", "III", "IV", "V", "Vi", "VII", "VIII", "IX", "X"};
		ArrayList<String> list = new ArrayList(Arrays.asList(standards));
		do {
			System.out.print("Enter standard: ");
			standard = sc.nextLine();
		} while (!list.contains(standard));
		
		
		//dob
		System.out.println("Enter DOB in yy-mm-dd format");
		String dob = sc.nextLine();
		 
		 //fees
		System.out.println("Enter fees");
		float fee = sc.nextFloat();
		
		Student student = new Student(rollno, studentName, standard, dob, fee );
		StudentService service=new StudentService();
		String res=service.insert(student);
		System.out.println(res);
		
		System.out.println("\n\n for displaying all the entries in a table");
		service.displayAll(student);
	}
}
