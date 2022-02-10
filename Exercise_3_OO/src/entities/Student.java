package entities;

public class Student {
	public String name;
	public double score1;
	public double score2;
	public double score3;
	
	public double finalGrade() {
		return score1 + score2 + score3;
	}
	
	public String isPassed() {
		if(finalGrade() > 60) {
			return "PASS";
			
		}else {
			return "FAILED";
		}
	}
	
	public double missingPoints() {
		if (finalGrade() > 60) {
			return 0;
		}else {
		return 60 - finalGrade();
		}
	}
	
	public String toString() {
		
		return "FINAL GRADE = "
			   +String.format("%.2f",finalGrade())+"\n"
			   +isPassed()+"\n"
			   +"MISSING POINTS "+String.format("%.2f",missingPoints());
	}

}
