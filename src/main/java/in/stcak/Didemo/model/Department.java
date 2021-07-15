package in.stcak.Didemo.model;

public class Department {
	
	private int code;
	private String departmentName;
	
	public Department() {
		super();
	}

	public Department(int code, String departmentName) {
		super();
		this.code = code;
		this.departmentName = departmentName;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	@Override
	public String toString() {
		return "Department [code=" + code + ", DepartmentName=" + departmentName + "]";
	}
	
	

}
