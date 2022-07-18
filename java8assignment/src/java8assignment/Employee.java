package java8assignment;

public class Employee {
	
	 int empid;
	 String name,  date_of_birth , date_of_joining, date_of_resign, work_loc, department;
	 double salary;
	 
	 public Employee(int i, String string, String string2, String string3, String string4, String string5, String string6, int j, int k, int l) {
			super();
	}
	 
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDate_of_birth() {
		return date_of_birth;
	}
	public void setDate_of_birth(String date_of_birth) {
		this.date_of_birth = date_of_birth;
	}
	public String getDate_of_joining() {
		return date_of_joining;
	}
	public void setDate_of_joining(String date_of_joining) {
		this.date_of_joining = date_of_joining;
	}
	public String getDate_of_resign() {
		return date_of_resign;
	}
	public void setDate_of_resign(String date_of_resign) {
		this.date_of_resign = date_of_resign;
	}
	public String getWork_loc() {
		return work_loc;
	}
	public void setWork_loc(String work_loc) {
		this.work_loc = work_loc;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	 
	public String toString() {
        return "Item [empid=" + empid + ", employee_name=" + name + ", date_of_birth=" + date_of_birth + ", date_of_joining="
                + date_of_joining + ", date_of_resign=" + date_of_resign + ", work_loc=" + work_loc+"department="+department+"salary="+salary
                + "]";
    } 

}
