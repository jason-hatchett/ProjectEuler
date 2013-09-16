
public class Palindrome4 {
	public static void main(String[] args){
		
		int largest = 0;
		
		for (int i=999; i > 400; i--){
			for (int j = 999; j > 400; j--){
				
				int check = i*j;
				String pal = "" + check;
				
				if (pal.charAt(0) == pal.charAt(5) && pal.charAt(1) == pal.charAt(4) && pal.charAt(2) == pal.charAt(3)){
					if (largest < check)
					largest = check;
				}
				
			}
		}
		
		System.out.println(largest + " is the largest");
	}
}
