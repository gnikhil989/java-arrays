package arrays;

public class BubbleSort {
	public static void sort(int a[]) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length - i - 1; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j + 1];
					a[j + 1] = a[j];
					a[j] = temp;
				}

			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

	}

	public static void main(String[] args) {
		int a[] = { 1, 2, 4, 6, 2, 3, 9, 8, 11, 25, 12, 88, 16 };
		sort(a);
	}
}
