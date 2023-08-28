package multithreading;
class MyThread1 extends Thread{
	public void run() {
		System.out.println("Thread 1 is running");
	}
}
class MyThread2 extends Thread{
	public void show() {
		System.out.println("Thread 2");
	}
}

public class ThreadDemo {

	public static void main(String[] args) {
		MyThread1 obj1 = new MyThread1();
		MyThread2 obj2 = new MyThread2();
		obj1.start();
		obj2.show();
		// TODO Auto-generated method stub

	}

}
