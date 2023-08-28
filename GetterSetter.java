
public class GetterSetter {
	static String EmployeeName;
	static float Employeesalary;
	static void set(String n,float p) {
		EmployeeName = n;
		Employeesalary = p;
	}
	static void get() {
		System.out.println("Employee Name is :"+EmployeeName);
		System.out.println("Employee CTC is :" +Employeesalary);
		
	}

	public static void main(String[] args) {
		GetterSetter.set("niru", 5000.0f);
		GetterSetter.get();
	}

}
