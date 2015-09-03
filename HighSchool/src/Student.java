
public class Student extends Person{
	protected String myIdNum;
	protected double myGpa;
	
	public Student(String name, int age, String gender, String idNum, double gpa) {
		super(name, age, gender);
		myIdNum = idNum;
		myGpa = gpa;
	}
	
	public String getIdNum() {
		return myIdNum;
	}
	
	public double getGpa() {
		return myGpa;
	}
	
	public void setIdNum(String idNum) {
		myIdNum = idNum;
	}
	
	public void setGpa(double gpa) {
		myGpa = gpa;
	}

	@Override
	public String toString() {
		return super.toString() + "  ID: " + myIdNum + " GPA: " + myGpa;
	}
}
