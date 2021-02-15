package homework_17_02;

public class problem4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 12345;
		digits(n);

	}
	
	public static void digits(int number) {
		if(number/10<1) {
			System.out.print(number);
			return;
		}
		if(number/10>=1) {
			System.out.print(number%10+" ");
			digits(number/10);
			return;
		}
	}

}
