package com.sun;

import java.util.Scanner;

public class Ex2_LinearSearch {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of elements you want to enter");
		int elements = input.nextInt();

		int[] matrix = new int[elements];

		for (int i = 0; i < matrix.length; i++) {
			System.out.println("Enter element number " + (i + 1));
			matrix[i] = input.nextInt();
		}

		System.out.println("\n");

		// for(int h=0 ; h<matrix.length ; h++)
		// {
		// System.out.print(matrix[h]+" ");
		// }

		System.out.println("\nEnter number you want to search");
		int key = input.nextInt();

		int num = LinearSearch(matrix, key);
		System.out.println("Number is in index "+num);
		
		input.close();


	}

	public static int LinearSearch(int[] matrix, int key) {
		for (int h = 0; h < matrix.length; h++) {
			if (matrix[h] == key)
				return h;
		}
			return -1;

	}

}
