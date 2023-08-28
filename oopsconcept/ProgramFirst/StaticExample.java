package ProgramFirst;
class Student{
	public static int fee;
	public static String name="niru"; 
}
public class StaticExample {

	public static void main(String[] args) {
		
		Student.fee=2000;
		System.out.println("fee:"+Student.fee);
		//Student.name="ganesh";
		System.out.println("Name :"+Student.name);
		

	}

}
