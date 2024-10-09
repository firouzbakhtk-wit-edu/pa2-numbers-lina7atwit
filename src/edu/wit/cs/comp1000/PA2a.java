package edu.wit.cs.comp1000;
import java.util.Scanner;
// TODO: document this class
public class PA2a {

	// TODO: document this function
	public static void main(String[] args) {
		// TODO: write your code here
		Scanner input = new Scanner(System.in);
		
		int N1,N2,N3,N4,N5;
		double sum=0, positive_sum=0,non_positive_sum=0;
		double average=0, positive_average=0, non_positive_average=0;
		int positive_numbers=0 ,non_positive_numbers=0;
		int i = 0;
		System.out.printf("Enter five whole numbers:");
		
		while (i<5) {
			N1=input.nextInt(); 
			i = i+1;
			sum = sum+N1;
			average = sum/i;
			if (N1>=0) {
				positive_numbers = positive_numbers+1;
				positive_sum = positive_sum+N1;
				positive_average = positive_sum/positive_numbers;
			}
			else {
				non_positive_numbers = non_positive_numbers+1;
				non_positive_sum = non_positive_sum+N1;
				non_positive_average = non_positive_sum/non_positive_numbers;
			}
				
		}
			
		System.out.printf("The sum of the %d positive numbers: %.0f%n",positive_numbers,positive_sum);
		System.out.printf("The sum of the %d non-positive numbers: %.0f%n",non_positive_numbers,non_positive_sum);
		System.out.printf("The sum of the 5 numbers: %.0f%n", sum);
		
		System.out.printf("The average of the %d positive numbers: %.2f%n",positive_numbers,positive_average);
		System.out.printf("The average of the %d non-positive numbers: %.2f%n",non_positive_numbers,non_positive_average);
		System.out.printf("The average of the 5 numbers: %.2f%n", average);
		
		
		
		
		
		
	}

}
