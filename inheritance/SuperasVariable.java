package inheritance;

	class A{
		int age=40;
	    int rno=1;
	}
	class B extends A{
		int age =20;
		void display() {
			System.out.println("Super class age:"+super.age);
			System.out.println(age);
		}
	}
	public class SuperasVariable {
	public static void main(String[] args) {
			B b = new B();
			b.display();
		}
	}
			
			
		
