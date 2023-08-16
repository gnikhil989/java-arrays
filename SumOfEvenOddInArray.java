package arrays;

public class SumOfEvenOddInArray {
// method
	public static void SumOfEvenOddElementInArray(int a[]) {
		int odd_count = 0;
		int even_count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				even_count = even_count + a[i];
			} else {
				odd_count = odd_count + a[i];
			}
		}
		System.out.println("sum of even numbers in arrays are " + even_count);
		System.out.println("sum of odd numbers in arrays are " + odd_count);

	}

	public static void main(String[] args) {
		int a[] = { 102, 12, 45, 32, 47 };
		SumOfEvenOddElementInArray(a);
	}
}