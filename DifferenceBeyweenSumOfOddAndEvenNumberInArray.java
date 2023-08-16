package arrays;

public class DifferenceBeyweenSumOfOddAndEvenNumberInArray {

	public static int DifferenceBeyweenSumOfOddAndEvenNumberInArray(int a[]) {
		int even_count = 0;
		int odd_count = 0;
		int difference = 0;

		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				even_count = even_count + a[i];
			} else {
				odd_count = odd_count + a[i];
			}

		}
		if (odd_count > even_count) {
			return difference = odd_count - even_count;

		} else if (even_count > odd_count) {
			return difference = even_count - odd_count;
		} else {
			return difference = odd_count - even_count;
		}
	}

	public static void main(String[] args) {
		int a[] = { 2, 22, 45, 65, 78, 210, 19 };
		System.out.println(
				"The difference between even and odd element are " +DifferenceBeyweenSumOfOddAndEvenNumberInArray(a));
	}
}
