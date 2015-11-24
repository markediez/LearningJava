/* 
 * Text Code
 * Introduction to nested if else
 */

public class Student {
	private String name;
	private double average;

	public Student(String name, double average) {
		this.name = name;

		if(average > 0.0) {
			if(average <= 100.0) 
				this.average = average;
		}
	}

	// setter
	public void setName(String name) {
		this.name = name;
	}

	// getter
	public String getName() {
		return name;
	}

	// setter
	// ** changed studentAverage to average due to author error
	public void setAverage(double average) {
		// validate
		if (average > 0.0)
			if (average < 100.0)
				this.average = average;
	}

	// getter
	public String getLetterGrade() {
		String letterGrade = "";
		if (average >= 90.0)
			letterGrade = "A";
		else if (average >= 80.0)
			letterGrade = "B";
		else if (average >= 70.0)
			letterGrade = "C";
		else if (average >= 60.0)
			letterGrade = "D";
		else
			letterGrade = "F";

		return letterGrade;
	}

}