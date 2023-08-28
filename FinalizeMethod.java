
public class FinalizeMethod {
	public class FinalizeMethod1 
	{
		String s;
	public FinalizeMethod1(String s) {
		this.s = s;
	}
	public static void main(String[] args) {
		 t1 = new FinalizeMethod1("t1");
		FinalizeMethod t2 = new FinalizeMethod();
		t1 = t2;
		System.gc();
	}
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Object previously referenced by " + this.s + " is successfully garbage collected.");
	}
}


}
