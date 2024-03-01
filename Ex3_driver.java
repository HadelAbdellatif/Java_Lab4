package com.sun;

public class Ex3_driver {

	public static void main(String[] args) {
 
		//To create an array of 4 Students 
		Ex3_Students [] array = new Ex3_Students[4];
		
		//To create a new student
		array[0]= new Ex3_Students(119, "Hadeel Abdellatif");
		array[1]= new Ex3_Students(119, "Hana Kafri");
		array[2]= new Ex3_Students(120, "Ahmad Abdullah");
		array[3]= new Ex3_Students(118, "Murad Omer");

		//Printing array data
		for(int i=0 ; i<array.length ; i++) {
			System.out.println("Student ID : "+array[i].getStudentId()+" Student Name : "+array[i].getStudentName());
		}
	}

}
