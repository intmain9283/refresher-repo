import java.util.Scanner;

public class StudentGrades {
	public boolean isPassed (int studentGrade) {
		if (studentGrade >= 60){
			return true;
		}
		else{
			return false;
		}
	}
	
	public double classAvg() {
		int total = 0;
		int gradeCounter = 1;
		double avg = 0.0
		Scanner myScan = new Scanner(System.in);
		String gradeStr = "";
		
		for (gradeCounter = 1; gradeCounter < 11; gradeCounter++) {
			System.out.println("Enter grade number " + gradeCounter);
			gradeStr = myScan.nextLine();
			total += Integer.parseInt(gradeStr);
		}
		avg = total / 10;
		return avg;
	}
}