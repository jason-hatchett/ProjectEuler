

public class LargePrime3 {
	public static void main(String[] args){
		long checkme = 600851475143L;
		long range = (long)Math.sqrt(checkme);
		int largest = 0;
		
		
		for(long i = 2; i < range; i++){
			if ((isPrime(i)) && (checkme%i == 0)){
				largest = (int) i;
			}
			
		}
		
		System.out.println(largest + " is the largest factor");
		
		
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
