package exceptions;

public class UserdefinedMovieex {
	//static void validateAge(int age) {
		void validateAge (int age) {
			if(age>18) {
				System.out.println("Welcome to movie");
			}
			else {
				throw new ArithmeticException("invalid age for movie ");
			}
		}
	

	public static void main(String[] args) {
		UserdefinedMovieex u = new UserdefinedMovieex();
		u.validateAge(33);
		// TODO Auto-generated method stub

	}

}
