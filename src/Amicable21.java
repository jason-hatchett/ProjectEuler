
public class Amicable21 {

	public static void main(String[] args){
		
		// create list of d(n) values
		
		// find amicable pairs
		
		//divide count by two, because going through the list will find numbers, not pairs
		
		int[] ami = new int[10000];
		
		for (int i=1; i < 10000; i++){
			int current = 0;
			
			for (int j=1; j<i; j++){
				if (i%j == 0) current = current + j;
			}
			
			ami[i] = current;
			
		}
		
		int sum = 0;
		
		for (int i=1; i <10000; i++){
			if (ami[i] < 10000){
				if (i == ami[ami[i]] && ami[i] != i){
					System.out.println(i + ", " + ami[i]);
					sum = sum + i;
				}
			}
		}
		
		System.out.println(sum);
		
	}
	
}
