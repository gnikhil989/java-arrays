package arrays;

public class PairSum {
	public static int pairSum(int a[], int sum) {
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] + a[j] == sum) {
					System.out.println("(" + a[i] + "," + a[j] + ")");
					count++;
				}
			}
		}
		if (count > 0) {
			return count;
		} else {
			return 0;
		}

	}

	public static void main(String[] args) {
		int a[] = { 1, 2, 24, 15, 4, 3, 5 };
		System.out.println(pairSum(a, 7));

	}
}
