
public class SmallestDivisible5 {
	public static void main(String[] args){
		
		int smallest = 20;
		int current = 20;
		
		boolean test = false;
		
		while(test == false){
			//System.out.println("Current: " + current);
			int counter = 0;
			for (int i=1; i < 21; i++){
				if (current%i == 0){
					counter++;
				}
				//System.out.println("Counter: " + counter);
				if (counter == 20){
					smallest = current;
					test = true;
				}
			}
			counter = 0;
			current++;
		}
		
		System.out.println("Smallest is " + smallest);
	}
}
