package homework_17_02;

import java.util.Scanner;

public class problem1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		int end = scan.nextInt();
		System.out.println(sumNumbers(end,0,0));
		scan.close();
	}
	
	public static int sumNumbers(int end,int current,int sum) {
		if(current==end) {
			sum+=end;
			return sum;
		}
		if(current != end) {
			sum+=current;
			return sumNumbers(end,current+1,sum);
		}
		return 0;
	}
}
