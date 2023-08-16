package arrays;

public class SecondLargestElement {
	public static int secondLargestElementInArray(int a[]) {
		int max = a[0];
		int max2 = a[0];

		for (int i = 0; i < a.length; i++) {
			if (max < a[i]) {
				max = a[i];
			}
		}
		for (int i = 0; i < a.length; i++) {
			if (max2 < a[i] && a[i] < max) {
				max2 = a[i];
			}
		}
		return max2;
	}

	public static void main(String[] args) {
		int a[] = { 10, 2, 5, 2, 66, 85, 99 };
		System.out.println("the largest of the element in array is  " + secondLargestElementInArray(a));
	}

}
