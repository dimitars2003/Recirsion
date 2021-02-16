package homework_17_02;

public class problem7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(gcd(3,21));
	}
	
	public static int gcd(int a, int b) {
		if(a%b==0) {
			return b;
		}
		if(b%a==0) {
			return a;
		}
		if(a!=b&&a>b) {
			return gcd(b,a%b);
		}
		if(a!=b&&a<b)
			return gcd(b%a,a);
		return 0;
	}

}
