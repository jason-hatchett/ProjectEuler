
public class NaturalSum1 {
	
	public static void main(String[] args){
		int sum = 0;
		for (int i=1; i < 1000; i++){
			System.out.println("At value: " + i);
			double current = (i/3.0);
			if (current == ((int) current)){
				sum = (int) (sum + i);
			
				System.out.println("Div by 3 passed");
			}
			else{
				current = (i/5.0);
				if (current == ((int) current)){
					sum = (int) (sum + i);
				
					System.out.println("Div by 5 passed");
				}
			}
		}
		
		System.out.println("" + sum);
	}
	
	
}


