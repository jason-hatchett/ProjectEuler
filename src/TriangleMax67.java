import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;


public class TriangleMax67 {
public static void main(String[] args) throws Exception{
		
	int[][] trig = textToArray("triangle.txt", 100);

	for (int i = 98; i>= 0; i--){
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
	
private static int[][] textToArray(String fileName, int depth) throws Exception {
	
	int[][] triangle = new int[depth][];
	FileReader fr = new FileReader(fileName);
	BufferedReader br = new BufferedReader(fr);

	String s;
	int i = 0;
	while ((s = br.readLine()) != null) {
		triangle[i] = new int[i + 1];
		int j = 0;
		Scanner tokens = new Scanner(s);
		while (tokens.hasNext()) {
			int value = tokens.nextInt();
			triangle[i][j++] = value;
		}
		i++;
	}

	return triangle;
}
	
}
