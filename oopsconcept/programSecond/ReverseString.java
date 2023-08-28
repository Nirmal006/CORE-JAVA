package programSecond;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string="nirmal";
		String reversedStr = "";
		for(int i=string.length()-1;i>=0;i--) {
			reversedStr = reversedStr + string.charAt(i);
			//System.out.println(string.charAt(i));
			
			System.out.println("reverse of given string:"+reversedStr);
			
		}

	}

}
