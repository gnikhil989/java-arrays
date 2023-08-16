package arrays;

public class UniqueElementInArray {
//	only for one unique value in array, if multiple unique elements are present then it wom't work
	public static int uniqueElement(int a[]) {
		int unique=a[0];
		for (int i = 1; i < a.length; i++) {
			unique=unique^a[i];
			
		}return unique;
		
	}
	public static void main(String[] args) {
		int a[]= {1,1,2,2,5,5,4};
		int unique= uniqueElement(a);
		System.out.println(unique);
	}
	

}
