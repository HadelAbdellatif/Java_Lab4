package com.sun;

import java.util.Scanner;

public class Ex1_Apartment {

	public static void main(String[] args) {

		int NumOfApartments;
		int NumOfPeople = 0;
		int total;

		Scanner input = new Scanner(System.in);
		System.out.println("Enter Number Of Apartment ");
		NumOfApartments = input.nextInt();

		int[] apartment = new int[NumOfApartments];

		for (int i = 0; i < NumOfApartments; i++) {
			System.out.println("Enter Number Of people who live in Apartment " + (i + 1));
			NumOfPeople = input.nextInt();
			apartment[i] = NumOfPeople;
		}

		total = NumberOfPeople(apartment);
		System.out.println("Number Of people who live in the building " + total);

		int Avg = total / apartment.length;
		System.out.println("Avg Number Of people who live in the building " + Avg);

		for (int h = 0; h < apartment.length; h++) {
			if(apartment[h] > Avg)
				System.out.println("Apartment " +(h+1)+" is above average");
			else if(apartment[h] < Avg)
				System.out.println("Apartment " +(h+1)+" is below average");
		}
		
		input.close();

	}

	public static int NumberOfPeople(int[] matrix) {
		int total = 0;

		for (int i = 0; i < matrix.length; i++) {
			total += matrix[i];
		}

		return total;
	}

}
