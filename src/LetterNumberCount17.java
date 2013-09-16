
public class LetterNumberCount17 {

	public static void main(String[] args){
		
		int sum = 0;
		for(int i=1; i <1000; i++){
			String word = "" + i;
			if (i < 10){
				if (word == "1" || word == "2" || word == "6") sum = sum + 3;
				else if (word == "4" || word == "5" || word == "9") sum = sum + 4;
				else if (word == "3" || word == "7" || word == "8") sum = sum + 5;
			}
			
			if (i >= 20 && i < 100){ 
				
				if (word.charAt(0) == '2' || word.charAt(0) == '3' ||
						word.charAt(0) == '8' || word.charAt(0) == '9') sum = sum + 6;
				else if (word.charAt(0) == '4' || word.charAt(0) == '5' || word.charAt(0) == '6') sum = sum + 5;
				else if (word.charAt(0) == '7') sum = sum + 7;
				
				if (word.charAt(1) == '1' || word.charAt(1) == '2' || word.charAt(1) == '6') sum = sum + 3;
				else if (word.charAt(1) == '4' || word.charAt(1) == '5' || word.charAt(1) == '9') sum = sum + 4;
				else if (word.charAt(1) == '3' || word.charAt(1) == '7' ||word.charAt(1) == '8') sum = sum + 5;
			}
			
			if (i >= 100 && i < 1000){
				
				if (word.charAt(0) == '1' || word.charAt(0) == '2' || word.charAt(0) == '6') sum = sum + 3;
				else if (word.charAt(0) == '4' || word.charAt(0) == '5' || word.charAt(0) == '9') sum = sum + 4;
				else if (word.charAt(0) == '3' || word.charAt(0) == '7' ||word.charAt(0) == '8') sum = sum + 5;
				
				//add the word 'hundred' with the word 'and'
				//however, subtract 9*3 because and is not always used...
				sum = sum + 10;
				
				if (word.charAt(1) == '2' || word.charAt(1) == '3' ||
						word.charAt(1) == '8' || word.charAt(1) == '9') sum = sum + 6;
				else if (word.charAt(1) == '4' || word.charAt(1) == '5' || word.charAt(1) == '6') sum = sum +5;
				else if (word.charAt(1) == '7') sum = sum + 7;
				
				// take account for teens again?
				if (word.charAt(1) == '1'){
					if (word.charAt(2) == '0') sum = sum +3;
					else if (word.charAt(2) == '1' || word.charAt(2) == '2') sum = sum + 6;
					else if (word.charAt(2) == '5' || word.charAt(2) == '6') sum = sum + 7;
					else if (word.charAt(2) == '3' || word.charAt(2) == '4' || word.charAt(2) == '9' || word.charAt(2) == '8') sum = sum + 8;
					else if (word.charAt(2) == '7') sum = sum + 9;
				}
				
				else{
					if (word.charAt(2) == '1' || word.charAt(2) == '2' || word.charAt(2) == '6') sum = sum + 3;
					else if (word.charAt(2) == '4' || word.charAt(2) == '5' || word.charAt(2) == '9') sum = sum + 4;
					else if (word.charAt(2) == '3' || word.charAt(2) == '7' ||word.charAt(2) == '8') sum = sum + 5;
				}
				
			}
		}
		//add the teens here
		// 3 + 6 + 6 + 8 + 8 + 7 + 7 + 9 + 8 + 8 = 70
		sum = sum + 70;
		
		//for "one thousand" add 3 + 8
		sum = sum + 11;
		
		System.out.println("Sum is: " + sum);
	}
	
}
