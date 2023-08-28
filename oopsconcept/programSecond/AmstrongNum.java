package programSecond;

public class AmstrongNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 121, originalNum, rem, result = 0;
		
			originalNum = number;
		while (originalNum!=0) {
			rem =originalNum % 10;
			result +=Math.pow(rem,3);
			originalNum /=10;
		}
		if(result ==number)
			System.out.println(number+" is an amstrong number");
		else
			System.out.println(number+" is not an amstrong number");
		}

	}


