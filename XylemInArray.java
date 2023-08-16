package arrays;

public class XylemInArray {
	public static boolean isXylem(int n) {

		int e_sum = n % 10;
		int m_sum = 0;
		n = n / 10;
		while (n > 9) {
			int d = n % 10;
			m_sum = m_sum + d;
			n = n / 10;
		}
		e_sum = e_sum + n;
		if (e_sum == m_sum) {
			return true;
		} else {
			return false;
		}
	}

	public static int XylemInArray(int a[]) {
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (isXylem(a[i]) == true) {
				count++;
			}
		}
		return count;

	}

	public static void main(String[] args) {
		int a[] = { 1447, 2, 45, 1234 };

		System.out.println("the number of  xylem element in array are " + XylemInArray(a));
	}
}
