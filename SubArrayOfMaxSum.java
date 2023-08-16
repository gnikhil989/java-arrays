package arrays;

public class SubArrayOfMaxSum {

	public static void main(String[] args) {
		int a[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
		int n = a.length;
		maxSubArraySum(a, n);
	}
	static void maxSubArraySum(int a[], int size) {
		int max_so_far = Integer.MIN_VALUE, max_ending_here = 0, start = 0, end = 0, s = 0;

		for (int i = 0; i < size; i++) {
			max_ending_here = max_ending_here + a[i];
			System.out.println(i+"      iteration  :"+"0 =" + max_ending_here);

			if (max_so_far < max_ending_here) {
				System.out.println("1 =" +max_so_far);
				max_so_far = max_ending_here;
				System.out.println("2 =" +max_so_far);
				start = s;
				end = i;
			}
			if (max_ending_here < 0) {
				max_ending_here = 0;
				s = i + 1;
				System.out.println("3 =" +s);
			}
		}
		System.out.println("Maximum contiguous sum is " + max_so_far);
		System.out.println("Starting index " + start);
		System.out.println("Ending index " + end);
		System.out.print("Subarray: ");
		for (int i = start; i <= end; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
