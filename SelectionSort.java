package arrays;

public class SelectionSort {
	
	public static void sort(int a[]) {
		for (int i = 0; i < a.length-1; i++) {
			for (int j = 1+i; j < a.length; j++) {
				if(a[i]>a[j]) {
					int temp=a[j];
					a[j]=a[i];
					a[i]= temp;
				}
				
			}
			
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+ " ");
			
		}
	}
public static void main(String[] args) {
	int a[]= {1,4,9,7,2,8,97,25,45};
	sort(a);
}
}
