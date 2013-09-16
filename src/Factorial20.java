import java.math.BigInteger;


public class Factorial20 {

	public static void main(String[] args){
		
		
		int fac = 100;
		
		BigInteger result = BigInteger.valueOf(fac);
		
		for (int i = (fac - 1); i > 0; i--){
			result = result.multiply(BigInteger.valueOf(i));
			//System.out.println(result);
			//System.out.println(i);
		}
		
		System.out.println(result);
		
		String value = (result + "");
		int sum = 0;
		
		for (int i = value.length()-1; i >= 0; i--){
			sum = sum + Integer.parseInt("" + value.charAt(i));
		}
		
		System.out.println(sum);
	}
	
}
