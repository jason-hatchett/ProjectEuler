import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class NameScore22 {

	public static void main(String[] args) throws Exception{
		
		ArrayList<String> names = textToArray("names.txt");
		
		names = quickSort(names);
		
		//System.out.println(names.get(0));
		
		int magicSum = sumIt(names);
		
		System.out.println("" + magicSum);
	}
	
	private static int sumIt(ArrayList<String> names) {
		// make "name score"
		// alphabetical value * position
		String alpha = " ABCDEFGHIJKLMNOPQRSTUVWXYZ"; //first char is space
		int totalSum = 0;
		
		for (int j=0; j < names.size(); j++){
			int wordSum = 0;
			String word = (names.get(j));
			System.out.println(word);
			for (int i=0; i < word.length(); i++){
				wordSum = wordSum + alpha.indexOf(word.charAt(i));
			}
			System.out.println("" + wordSum);
			totalSum = totalSum + (wordSum * (j+1));
		}
		
		
		return totalSum;
	}

	private static ArrayList<String> quickSort(ArrayList<String> listy){
		
		//standard quicksort algorithm
		
		if (listy.size() <= 1) return listy;
		
		int pivNum = listy.size()/2;
		String pivot = listy.remove(pivNum);
		
		ArrayList<String> begin = new ArrayList<String>();
		ArrayList<String> end =  new ArrayList<String>();
		
		for (String x: listy){
			//if (alphaValue(x) <= alphaValue(pivot)) begin.add(x);
			if (x.compareTo(pivot) < 0) begin.add(x);
			else end.add(x);
		}
		
		ArrayList<String> sorted = new ArrayList<String>();
		sorted.addAll(quickSort(begin));
		sorted.add(pivot);
		sorted.addAll(quickSort(end));
		
		return sorted;
		
	}
	
	
	
	

	private static ArrayList<String> textToArray(String fileName) throws Exception {
		
		ArrayList<String> names = null;
		FileReader fr = new FileReader(fileName);
		BufferedReader br = new BufferedReader(fr);

		String s;
		while ((s = br.readLine()) != null) {
			
			
			//regex to remove all double quotes
			s = s.replaceAll("\"", "");
			
			//turn into list separated by commas
			
			
			//convert to arraylist
			names =new ArrayList<String>(Arrays.asList(s.split(",")));
			
		}

		return names;
	}
	
}
