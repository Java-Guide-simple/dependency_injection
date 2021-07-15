package in.stcak.Didemo.model;

public class Student {
	
	private String name ;
	private int rollNo;
	private Department department;
	public Student() {
		super();
	}
	public Student(String name, int rollNo, Department department) {
		super();
		this.name = name;
		this.rollNo = rollNo;
		this.department = department;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNo=" + rollNo + ", department=" + department + "]";
	}
	
	

}
