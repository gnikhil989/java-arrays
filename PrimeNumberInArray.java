package arrays;

public class PrimeNumberInArray {
	public static boolean isPrime(int a) {
		if (a <= 1) {
			return false;
		}
		for (int i = 2; i <= a / 2; i++) {
			if (a % 2 == 0) {
				return false;
			}
		}
		return true;
	}

	public static int primeInArray(int a[]) {
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (isPrime(a[i]) == true) {
				count++;
			}

		}
		return count;

	}

	public static void main(String[] args) {
		int a[] = { 3, 1, 5, 7, 19, 11, 12, 14, 20 };
		System.out.println("Number of prime numbers present in array are " + primeInArray(a));

//	 System.err.println("is number is prime "+ isPrime(8));
	}
}
