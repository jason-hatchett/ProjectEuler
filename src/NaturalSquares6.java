// Find the difference between the sum of the squares
// of the first one hundred natural numbers and the square of the sum
public class NaturalSquares6 {

	public static void main(String[] args){
		
		int sumSquare = 0;
		int squareSum = 0;
		
		for (int i=1; i <= 100; i++){
			sumSquare = sumSquare + (i*i);
			squareSum = squareSum + i;
		}
		
		squareSum = squareSum * squareSum;
		
		System.out.println("Difference: " + (squareSum - sumSquare));
		
	}
}
