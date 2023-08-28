package programSecond;

public class NestedLoop {

	public static void main(String[] args) {
		for(int i =1;i<=3;i++) {
			System.out.println("value of i"+i);
			for(int j =1;j<=i;j++) {
				System.out.println("value of j is"+j);
			}
		}

	}

}
