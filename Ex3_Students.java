package com.sun;

public class Ex3_Students {

	private int studentId;
	private String studentName;
	
	// Constructor
	
	Ex3_Students(int studentId, String studentName){
		this.studentId = studentId;
		this.studentName = studentName;
	}

	// setters & getters
	
	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	

}
