
public class SumPrimes10 {
	public static void main(String[] args){
		
		long sum = 2L;
		
		for (int i=3; i < 2000000; i++){
			if (isPrime(i)) sum = sum + (long)i;
		}
		
		System.out.println(sum);
		
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
