package arrays;

public class DifferenceBetweenLargestAndSmallestInArray {

	public static int DifferenceBetweenLargestAndSmallestInArray(int a[]) {
		int max = a[0];
		int min = a[0];

		for (int i = 0; i < a.length; i++) {
			if (max < a[i]) {
				max = a[i];
			}
			if (min > a[i]) {
				min = a[i];
			}
		}
		return max - min;

	}

	public static void main(String[] args) {
		int a[] = { 10, 45, 42, 85, 97, 34, 1 };
		System.out.println(
				"Difference between largest and smallest number is " + DifferenceBetweenLargestAndSmallestInArray(a));
	}
}