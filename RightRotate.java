package arrays;

import java.util.Scanner;

public class RightRotate {
	public static int[] rightRotate(int a[], int n) {
		for (int i = 0; i < n; i++) {
			int first = a[a.length - 1];
			int j = 0;
			for (j = a.length - 1; j > 0; j--) {
				a[j] = a[j - 1];
			}
			a[j] = first;
		}
		return a;
	}

	public static void main(String[] args) {
//		for user input
		Scanner sc = new Scanner(System.in);
		System.err.println("Enter the length of array ");
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the element in the array");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();

		}

		System.out.println("Enter the number of right rotation");
		int right_rotate = sc.nextInt();
		int b[] = rightRotate(a, right_rotate);

//		by using for each
		for (int i : b) {
			System.out.print(i + " ");
		}
//		========================================================================
//		for predefined input
//		int a[] = { 9, 2,3,4,5,6,7};		
//		by using for loop
//		for (int i = 0; i < b.length; i++) {
//			System.out.print(b[i] + " ");
//		}
	}
}
