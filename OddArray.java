package arrays;

public class OddArray {
	public static int oddArray(int arr[]) {
		int odd_count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (!(arr[i] % 2 == 0)) {
				odd_count++;
			}
		}
		return odd_count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 45, 85, 98, 75, 65, 81, 2, 4, 6 };
		System.out.println(oddArray(a));

	}

}
