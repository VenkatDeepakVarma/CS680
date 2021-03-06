package edu.umb.cs680.hw04;

public class Student {
	private float tuition;
	private int i20;
	private int yearsInState;
	private String state;
	private String foreignAddress;
	private String name;
	private String usAddress;

	
	private Student(String name, String usAddress, int yearsInState, String state, int i20, String foreignAddress,
			StudentFactory status) {
		this.name = name;
		this.i20 = i20;
		this.usAddress = usAddress;
		this.yearsInState = yearsInState;
		this.state = state;
		this.foreignAddress = foreignAddress;
		if (status.equals(StudentFactory.INSTATE))
			this.tuition = 6500;
		else if (status.equals(StudentFactory.OUTSTATE))
			this.tuition = 5400;
		else
			this.tuition = 4300;
		
	}
	
	public float getTuition() {
		return tuition;
	}

	public String getName() {
		return name;
	}

	public int getI20() {
		return i20;
	}

	public String getUsAddress() {
		return usAddress;
	}

	public int getYearsInState() {
		return yearsInState;
	}

	public String getState() {
		return state;
	}

	public String getForeignAddress() {
		return foreignAddress;
	}

	public static Student createInStateStudent(String name, String usAddress) {
		return new Student(name, usAddress, 0, null, 0, null, StudentFactory.INSTATE);
	}

	public static Student createOutStateStudent(String name, String usAddress, int yearsInState,String state) {
		return new Student(name, usAddress, yearsInState, state, 0, null, StudentFactory.OUTSTATE);
	}

	public static Student createIntlStudent(String name, String usAddress, int i20, String foreignAddress) {
		return new Student(name, usAddress, 0, null, i20, foreignAddress, StudentFactory.INTL);
	}

	public static void main(String[] args) {
		
		Student outStudent = createOutStateStudent("deepak", "charolotte", 12,"Northcarolina");
		System.out.println("Student Tuition Fee is: "
				+ outStudent.getTuition());
		System.out.println("Student US Address is: "
				+ outStudent.getUsAddress());
		System.out.println("Student I20 Number is: "
				+ outStudent.getI20());
		System.out.println("Student state is: "
				+ outStudent.getState());
		System.out.println("Student class has been implemented successfully");
	}
}