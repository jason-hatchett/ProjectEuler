
public class TriangleMax18 {
	public static void main(String[] args){
		
		int[][] trig = new int[15][15];
		int[] t1 = {75};
		int[] t2 = {95, 64};
		int[] t3 = {17, 47, 82};
		int[] t4 = {18, 35, 87, 10};
		int[] t5 = {20, 04, 82, 47, 65};
		int[] t6 = {19, 01, 23, 75, 03, 34};
		int[] t7 = {88, 02, 77, 73, 07, 63, 67};
		int[] t8 = {99, 65, 04, 28, 06, 16, 70, 92};
		int[] t9 = {41, 41, 26, 56, 83, 40, 80, 70, 33};
		int[] t10 = {41, 48, 72, 33, 47, 32, 37, 16, 94, 29};
		int[] t11 = {53, 71, 44, 65, 25, 43, 91, 52, 97, 51, 14};
		int[] t12 = {70, 11, 33, 28, 77, 73, 17, 78, 39, 68, 17, 57};
		int[] t13 = {91, 71, 52, 38, 17, 14, 91, 43, 58, 50, 27, 29, 48};
		int[] t14 = {63, 66, 04, 68, 89, 53, 67, 30, 73, 16, 69, 87, 40, 31};
		int[] t15 = {04, 62, 98, 27, 23, 9, 70, 98, 73, 93, 38, 53, 60, 04, 23};
		
		trig[0] = t1;
		trig[1] = t2;
		trig[2] = t3;
		trig[3] = t4;
		trig[4] = t5;
		trig[5] = t6;
		trig[6] = t7;
		trig[7] = t8;
		trig[8] = t9;
		trig[9] = t10;
		trig[10] = t11;
		trig[11] = t12;
		trig[12] = t13;
		trig[13] = t14;
		trig[14] = t15;
		
		for (int i = 13; i>= 0; i--){
			trig[i] = maxSum(trig[i], trig[i+1]);
		}
		
		System.out.println("Max total is: " + trig[0][0]);
	}
	
	public static int[] maxSum(int[] row, int[] prev){
		
		for (int i=0; i < row.length; i++){
			row[i] = Math.max(row[i] + prev[i], row[i] + prev[i+1]);
		}
		
		return row;
	}
}
