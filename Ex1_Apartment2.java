package com.sun;

import java.util.Scanner;

public class Ex1_Apartment2 {

	public static void main(String[] args) {

		int NumOfApartments;
		int NumOfPeople = 0;
		int AgeOfPerson;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Number Of Apartment ");
		NumOfApartments = input.nextInt();

		int[][] apartment = new int[NumOfApartments][];

		for (int i = 0; i < NumOfApartments; i++) {

			System.out.println("Enter Number Of people who live in Apartment " + (i + 1));
			NumOfPeople = input.nextInt();

			apartment[i] = new int[NumOfPeople]; // ??

			for (int h = 0; h < NumOfPeople; h++) {
				System.out.println("Enter Age of person " + (h + 1));
				AgeOfPerson = input.nextInt();
				apartment[i][h] = AgeOfPerson;

			}

		}

		for (int i = 0; i < apartment.length; i++) {
			for (int j = 0; j < apartment[i].length; j++) {
				System.out.print(apartment[i][j] + "     ");
			}
			System.out.println("\n");

		}
		
		averageAges(apartment);
		
		input.close();

	}

	public static void averageAges(int [][] apartment)
	{
		
		double Avg;
		int count = 0;
		int sum = 0;

		for(int i=0 ; i<apartment.length ; i++)
		{
			for(int j=0 ; j<apartment[i].length ; j++)
			{
				count++;
				sum += apartment[i][j];
			}
		}
		
		Avg = sum/count;
		System.out.print("The avg is"+Avg);
	}
}
