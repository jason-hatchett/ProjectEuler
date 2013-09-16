
public class ExponentSum16 {
	public static void main(String[] args){
		
		String current = "2";
		
		//start at 2, because 2^1 is done already
		for (int i = 2; i <= 1000; i++){
			
			String place;
			String temp = "";
			int rem = 0;
			
			for(int j = current.length()-1; j >= 0; j--){
				
				place = "" + (rem + 2* Integer.parseInt("" + current.charAt(j)));
				//System.out.println("place: " + place);
				if (place.length() == 1){
					temp = place + temp;
					rem = 0;
				}
				
				else{
					temp = place.charAt(1) + temp;
					rem = Integer.parseInt("" + place.charAt(0));
				}
				
				
				if (j == 0 && rem != 0) temp = rem + temp;
				
			}
			current = temp;
			System.out.println("temp: " + current);
		}
		
		
		//Sum result
		int sum = 0;
		for (int i= current.length()-1; i >= 0; i--){
			
			sum = sum + Integer.parseInt("" + current.charAt(i));
			
		}
		
		System.out.println("Result is: " + current);
		System.out.println("Sum is: " + sum);
	}
}
