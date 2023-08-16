package arrays;

public class InsertionSort {

	public static int[] insertionSort(int[] a) {
		for (int i = 1; i < a.length; i++) {
			int check = a[i];
			int j = i - 1;
			while (j >= 0 && a[j] > check) {
				a[j + 1] = a[j];
				j--;
			}
			a[j + 1] = check;
		}

		return a;
	}

	public static void main(String[] args) {
		int a[] = { 1, 8, 6, 7, 10, 12, 1, 99, 54, 45 };
		int b[] = insertionSort(a);
		for (int i : b) {
			System.out.print(i + " ");
		}
	}
}
