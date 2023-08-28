package oopsconcept;
abstract class A {

	abstract static void func();
}
class B extends A {

	
	static void func()
	{
		System.out.println("Static abstract method implemented.");
	}
}


public class AbstractStaticmethod {
	public static void main(String args[])
	{
		B.func();
	}
}


