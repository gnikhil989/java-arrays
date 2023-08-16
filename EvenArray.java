package arrays;

public class EvenArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,20,52,35,67,97,24};
		int count=0;
		for (int i = 0; i < a.length; i++) {
			if(a[i]%2==0) {
				count++;
			}
		}
		System.out.println(count);

	}

}
