package com.college.model;

public class Student {
	
	private int rollNo;
	private String name;
	private String std;
	private String dob;
	private float fee;
	
	public Student(int rollNo, String name, String std, String dob, float fee) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.std = std;
		this.dob = dob;
		this.fee = fee;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStd() {
		return std;
	}

	public void setStd(String std) {
		this.std = std;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public float getFee() {
		return fee;
	}

	public void setFee(float fee) {
		this.fee = fee;
	}
	
	
	
}
