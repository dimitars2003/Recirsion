package homework_17_02;

public class problem6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int searched = 7;
		int [] numbers = new int [] {6,4,5,1,2,6,7,1};
		System.out.println(isFound(searched,sortArray(numbers)));
	}
	
	public static boolean isFound(int searched, int [] numbers) {
		
		if(searched == numbers [numbers.length/2]) {
			
			 return true;
		}
		
		if(searched <numbers [numbers.length/2] && numbers.length/2==1) {
			
			if(numbers.length%2==1&&numbers[numbers.length/2-1]==searched)
				return true;
			if(numbers.length%2==0)
				return false;
		}
		
		if(searched > numbers [numbers.length/2]&& numbers.length/2==1) {
			
			if(numbers.length%2==1&&numbers[numbers.length/2+1]==searched)
				return true;
			if(numbers.length%2==1&&numbers[numbers.length/2+1]!=searched)
				return false;
			if(numbers.length%2==0)
				return false;
		}
		
		if(searched <numbers [numbers.length/2] ) {
			
			return isFound(searched,getPartArray(numbers,false));
		}
		
		if(searched > numbers [numbers.length/2]) {
			
			return isFound(searched,getPartArray(numbers,true));
		}
		
		if(searched != numbers[numbers.length/2] && numbers.length/2<=1) {
			
			return false;
		}
		
		
		
		return true;
	}
	
	public static int [] getPartArray(int [] numbers,boolean bigger) {
		int [] temp = new int [numbers.length/2];
		int tempIndex=0;
		if(bigger == true) {
			for (int i = numbers.length/2; i < numbers.length; i++) {
				
				
				temp[tempIndex] = numbers[i];
				tempIndex++;
			}
			
		}
		else {
			for (int i = 0; i < numbers.length/2; i++) {
				
				
				temp[tempIndex] = numbers[i];
				tempIndex++;
			}
			
		}
		
		return temp;
	}
	
	public static int[] sortArray(int []numbers) {
		int [] tempArray = numbers;
		for (int i = 0; i < tempArray.length; i++) {  
			for (int j = i + 1; j < tempArray.length; j++) {  
				int tmp = 0;  
				if (tempArray[i] > tempArray[j]) {  
					tmp = tempArray[i];  
					tempArray[i] = tempArray[j];  
					tempArray[j] = tmp;  
				}
			}  
		}
		return tempArray;
	}
}
