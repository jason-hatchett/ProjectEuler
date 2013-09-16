
public class FibSum2 {
	
	public static void main(String[] args){
		int sum = 0;
		int current = 1;
		int next = 2;
		while (next < 4000000){
			int temp = current;
			current = next;
			next = temp + current;
			
			if ((current % 2) == 0){
				sum = (sum + current);
				System.out.println(current + " was added"); 
			}
		}
		
		System.out.println("" + sum);
	}
}
