package homework_17_02;

public class problem8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = new int[] { 12, 21, 27, 81, 9, 24, 3 };
		while (numbers.length != 1) {
			numbers = findgcd(numbers);
		}
		System.out.println(numbers[0]);
	}

	public static int gcd(int a, int b) {
		if (a % b == 0) {
			return b;
		}
		if (b % a == 0) {
			return a;
		}
		if (a != b && a > b) {
			return gcd(b, a % b);
		}
		if (a != b && a < b)
			return gcd(b % a, a);
		return 0;
	}

	public static int[] findgcd(int[] numbers) {

		int index = 0;
		if (numbers.length % 2 == 0) {
			int[] temp = new int[numbers.length / 2];
			for (int i = 0; index < numbers.length; i++) {

				temp[i] = gcd(numbers[index], numbers[index + 1]);
				index += 2;
			}

			return temp;
		}

		else {
			int[] temp = new int[numbers.length / 2 + 1];
			for (int i = 0; index < numbers.length - 1; i++) {
				temp[i] = gcd(numbers[index], numbers[index + 1]);
				index += 2;
			}

			temp[temp.length - 1] = numbers[numbers.length - 1];
			return temp;
		}

	}
}
