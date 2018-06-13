package model;

public class Calification {

	private Student student;
	private Exam test;
	private String result;
	private Integer score;

	public Calification(Student student, Exam test, Integer score) {
		this.student = student;
		this.test = test;

		if (score >= 0 && score <= 4) {
			this.result = "FAIL";
		} else if (score >= 4 && score <= 7) {
			this.result = "PASS";
		} else if (score > 7 && score <= 10) {
			this.result = "PASS WITH MERIT";
		}
		this.score = score;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Exam getTest() {
		return test;
	}

	public void setTest(Exam test) {
		this.test = test;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

}
