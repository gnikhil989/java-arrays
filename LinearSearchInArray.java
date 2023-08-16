package arrays;

import java.util.Scanner;

public class LinearSearchInArray {
	public static String linearSearch(int a[], int key) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] == key) {
				return key + " is present at " + (i + 1) + "th" + " index";

			}
		}
		return "key is not present in this array";
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array");
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the element");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();

		}
//	int a[]= {1,2,3,4,5,6,99,78,88,42};

//	
//	System.out.println("2 is present at which index "+ linearSearch(a, 99));

		System.out.println("enter the number you want to search ");
		int key = sc.nextInt();
		System.out.println(linearSearch(a, key));
	}
}
