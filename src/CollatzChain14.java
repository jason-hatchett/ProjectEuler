
public class CollatzChain14 {
	
	public static void main(String[] args){
		
		int[] longest = {2, 2};
		
		
		for (int i=2; i < 1000000; i++){
			long chain = i;
			int length = 1;
			
			while(chain != 1){
				if (chain%2 == 0){
					chain = chain/2;
					
				}
				else chain = (chain*3) + 1;
				
				length++;
			}
			
			
			if (length > longest[1]){
				longest[0] = i;
				longest[1] = length;
			}
			System.out.println("Current: " + longest[0] + ", " + longest[1]);
		}
		
		System.out.println("Solution: " + longest[0] + ", " + longest[1]);
	}
	
}
