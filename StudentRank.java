package arrays;

public class StudentRank {

	    private String[] students;
	    private int[] ranks;

	    public StudentRank(String[] students, int[] ranks) {
	        this.students = students;
	        this.ranks = ranks;
	    }

	    public String highestRank() {
	        int maxIndex = 0;
	        for (int i = 1; i < ranks.length; i++) {
	            if (ranks[i] > ranks[maxIndex]) {
	                maxIndex = i;
	            }
	        }
	        return students[maxIndex];
	    }

	    public String lowestRank() {
	        int minIndex = 0;
	        for (int i = 1; i < ranks.length; i++) {
	            if (ranks[i] < ranks[minIndex]) {
	                minIndex = i;
	            }
	        }
	        return students[minIndex];
	    }
}
