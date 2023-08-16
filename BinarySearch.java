package arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

 public class BinarySearch {

	public static int binarySearch(int a[], int key) {
		int low = 0;
		int high = a.length;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (a[mid] == key) {
//				System.out.print(mid + 1);
				return mid+1;
				
			} else if (a[mid] < key) {
				low = mid + 1;
			} else if (a[mid] > key) {
				high = mid - 1;
			}
			
		}	return -1;
		
		
		
	}

	public static void main(String[] args) {
		int a[] = { 1, 5, 64, 78, 656, 21, 445 };
		Arrays.sort(a);
		int b=binarySearch(a, 5);
		if(b==-1) {
			System.out.println("Element not found");
		}else {
			System.out.println("Element found at " +b+"th  index");
		}
	}
}