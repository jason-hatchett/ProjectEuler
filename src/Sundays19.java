
public class Sundays19 {
	public static void main(String[] args){
		
		
		//year is from 1900 to 2000 so, 100 iterations (do not count until 1901)
		
		// 1st of each month count
		
		int count = 0;
		
		int day = 1;
		
		day = ((day + 365) % 7) ; //find initial day on the month in 1901
		
		//start in 1901
		for (int i=1901; i<2001;i++){
			for (int m=1; m<=12;m++){
				if (m==1 || m==3 || m ==5 || m == 7 || m==8 || m== 10 || m == 12){
					day = ((day + 31) % 7);
				}
				else if (m==4 || m==6 || m ==9 || m == 11){
					day = ((day + 30) % 7);
				}
				else if (m==2 && i%4 == 0){ //February Leap Year
					day = ((day + 29) % 7);
				}
				else day = ((day + 28) % 7);
				
				if (day == 0) count++;
			}
			
		}
		
		System.out.println(count);
	}
}
