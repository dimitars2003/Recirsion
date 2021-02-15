package homework_17_02;

public class problem5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		pow10(1,n);
	}
	
	
	public static void pow10(int current, int end) {
		if(end==0) {
			System.out.print((int)Math.pow(10, 1));
			return;
		}
		if(current<end) {
			System.out.print((int)Math.pow(10, current)+", ");
			pow10(current+1,end);
			return;
		}
		if(current == end) {
			System.out.print((int)Math.pow(10, end)+", ");
			pow10(current,end-1);
			return;
		}
		if(current>end) {
			System.out.print((int)Math.pow(10, end+1)+", ");
			pow10(current,end-1);
			return;
		}
		
	}
}
