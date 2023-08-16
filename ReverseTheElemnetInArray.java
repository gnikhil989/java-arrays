package arrays;

public class ReverseTheElemnetInArray {
	public static int[] reverseElementInArray(int a[]) {
		int b[] = new int[a.length];
		int k = 0;

		for (int i = a.length - 1; i >= 0; i--) {
			b[k] = a[i];
			k++;
		}
		return b;
	}

	public static void main(String[] args) {
		int a[] = { 10, 20, 30, 40, 50, 60 };
		int b[] = reverseElementInArray(a);
//		for (int i = 0; i < b.length; i++) {
//			System.out.print(b[i] + " ");
//		}
//		System.out.println();
//		for (int i = 0; i < a.length; i++) {
//			System.out.print(a[i] + " ");
//
//		}
//		for each loop
		for (int c : b) {
			System.out.println(c + " ");

		}
	}
}