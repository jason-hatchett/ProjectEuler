
public class TrigDivisors12 {

	public static void main(String[] args){
		
		long trig = 0;
		boolean found = false;
		
		long add=0;
		while (!found){
			
			int div = 0;
			add++;
			trig = trig + add;
			System.out.println("added " + add);
			System.out.println("Testing number " + trig + "...");
			for (long i=1; i <= Math.sqrt(trig); i++){
				if (trig%i == 0) div += 2;
			}
			
			if ( Math.sqrt(trig) * Math.sqrt(trig) == trig){
				div--;
			}
			System.out.println("Divisors :" + div );
			
			if (div > 500){
				System.out.println("" + trig);
				found = true;
			}
			
		}
		
		
	}
	
}
