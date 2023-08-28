package inheritance;

class Learner{
	public void lname() {
		System.out.println("My name is niru");
	}
	
	void courseName()
	{
		System.out.println("Java full Stack");
		}
	}
class Lcourse extends Learner{
	void courseName()
	{
		super.courseName();
		System.out.println("data analytics");
		}
	
	void courseDuration() {
		System.out.println("2 months");
	}
	
}

public class MethodOveriding {

	public static void main(String[] args) {
Lcourse l=new Lcourse();
l.courseName();
l.lname();
//Learner le=new Learner();
//le.courseName();
//le.lname();
}

	}


