package arrays;

public class FindTheLargestElementInArray {

	public static int LargestElementInArray(int a[]) {
		int max = a[0];
		for (int i = 0; i < a.length; i++) {
			if (max < a[i]) {
				max = a[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		int a[] = { 10,2,5,2,66,85};
		System.out.println("the largest of the element in array is  "  + LargestElementInArray(a));
	}
}
