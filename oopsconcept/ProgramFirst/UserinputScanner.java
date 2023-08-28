package ProgramFirst;

import java.util.Scanner;

public class UserinputScanner {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter ur name:");
		String name=scanner.nextLine();
		System.out.println("Name:"+name);
		System.out.println("Enter ur age:");
		int age=scanner.nextInt();
		System.out.println("age:"+age);
		
		

	}

}
