package edu.wit.cs.comp1000;
import java.util.Scanner;
// TODO: document this class
public class PA2b {

	// TODO: document this function
	public static void main(String[] args) {
		// TODO: write your code here
		Scanner input = new Scanner (System.in);
		
		int a,b,c,d;
		double root,root2,root3;
		
		System.out.printf("Enter a b c: ");
		
		a = input.nextInt();
		b = input.nextInt();
		c = input.nextInt();
		
		d = (b*b)-(4*a*c);
		
		if (d<0) {
			System.out.printf("Roots: imaginary");	
		}
		else if (d==0) {
			root = -b/2*a;
			System.out.printf("Root: %.2f%n", root);
		}
		else {
			root2 = (-b+ Math.sqrt(d))/2*a;
			root3 = (-b- Math.sqrt(d))/2*a;
		
			if (root2<root3) {
				System.out.printf("Roots: %.2f, %.2f%n", root2,root3);
			}
			else {
				System.out.printf("Roots: %.2f, %.2f%n", root3,root2);
			}
		}	
	}
	
	

}
