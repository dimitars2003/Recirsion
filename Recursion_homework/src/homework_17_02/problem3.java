package homework_17_02;

public class problem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 12345;
		digits(number,String.valueOf(number).length());
		
	}

	public static void digits(int number, int current) {
		if(current==1) {
			System.out.print(number);
			return ;
		}
		if(current!=1) {
			System.out.print((int)(number/Math.pow(10, current-1))+" ");
			digits ( (int) (number%Math.pow(10, current-1)),current-1);
			return;
		}
		
	}
}
