package homework_17_02;

import java.util.Scanner;

public class problem2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int number = scan.nextInt();
		System.out.println(digitsSum(number,0));
		
		scan.close();;
	}
	
	public static int digitsSum(int number, int sum) {
		if(number/10<1) {
			sum+=number;
			return sum;
		}
		if(number/10>=1) {
			sum +=number%10;
			return digitsSum(number/10,sum);
			
		}
		return 0;
	}

}
