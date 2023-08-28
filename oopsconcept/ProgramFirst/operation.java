package ProgramFirst;
import java.util.*;  

public class operation{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter first number- ");  
		int a= sc.nextInt();  
		System.out.print("Enter second number- ");  
		int b= sc.nextInt();  
		System.out.print("Enter third number- ");  
		int c= sc.nextInt();  
		int d=a+b+c;  
		System.out.println("Total= " +d);  
      /* System.out.println("hello world");
       operation op=new operation();
       op.addition(5,5,5);
       int divdeResult=op.divide(10, 5);
		System.out.println("Divide Result:"+divdeResult);
	    String firstname = ("nirmmal");
	    System.out.println("firstname:"+firstname);*/
		

	}
	void addition(int a,int b,int c) {
		System.out.println("Addition of 3 numbers :"+(a+b+c));
	}
	int divide(int a, int b) {
		return a/b;
	}
	public static int add(int a,int b) {
		return a + b;
	}
	
	public static int multiply (int a, int b) {
		return a * b;
	}

}
