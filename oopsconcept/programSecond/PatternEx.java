package programSecond;

import java.util.Scanner;
		

public class PatternEx {
	int a = 1;
	int b = 2;
	int c = 3;
		static void pattern(int n) {
			int rowCount = 1;
			for(int i = n;i>0;i--) {
				for(int j=1;j<i;j++) {
					System.out.println(" ");
				}
				for (int j=1;j<=rowCount;j++) {
					System.out.println(rowCount+" ");
				}
				System.out.println();
				rowCount++;
			}
		}
			

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		pattern(a);
		pattern(b);
		pattern(c);

	}

}
