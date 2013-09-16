import java.util.ArrayList;


public class FindPrime7 {
	public static void main(String[] args){
		
		ArrayList primes = new ArrayList();
		primes.add(2);
		
		int counter = 3;
		while (primes.size() <= 10001){
			if (isPrime(counter)) primes.add(counter);
			
			counter++;
			
		}
		
		System.out.println("" + primes.get(10000));
	}
	
	public static boolean isPrime(long num) {
		  if ((num & 1) == 0) {
		    return false; // checks divisibility by 2
		  }
		  for (long i=3; i*i<=num; i+=2) {
		    if (num % i == 0) {
		      return false;
		    }
		  }
		  return true;
	}
	
}
