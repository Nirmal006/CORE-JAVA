package multithreading;
class Mythread1 implements Runnable{
@Override
public void run() {
	for(int i = 0;i < 5; i++) {
		System.out.println("Thread1");
		try {
			Thread.sleep(1000);
		}
		catch(Exception e) {
	}
	}
}
	
}
class Mythread2 implements Runnable{

	@Override
	public void run() {
		for(int i = 0; i < 5; i++) {
			System.out.println("Thread2");
			try {
				Thread.sleep(1000);
			}
			catch (Exception e) {
		}
	}
	}
}
public class RunnableInterface {

	public static void main(String[] args) {
		Runnable obj1 = new Mythread1();
		Runnable obj2 = new Mythread2();
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		t1.start();
		t2.start();
		
	}
		
	}
		

	
