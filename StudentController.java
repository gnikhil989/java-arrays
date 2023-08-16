package arrays;

public class StudentController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] str = {"nikhil", "sujit", "xyz"};
		int [] rank= {1,2,3};
StudentRank studentRank= new StudentRank(str, rank);
System.out.println(studentRank.highestRank());
System.out.println(studentRank.lowestRank());
	}

}
 	