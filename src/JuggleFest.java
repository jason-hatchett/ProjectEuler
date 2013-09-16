import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;


public class JuggleFest {

	public static void main(String[] args) throws Exception{
		
		inputReader("input.txt");

		//place jugglers by order of preference first
		//when circuit full, compare next juggler to worst juggler in circuit
		//if better fit, switch
		//current juggler must then be placed in next order of circuit
		//when place, move to next juggler in queue and repeat
		
		
			
	}
	

	
	private static void inputReader(String fileName) throws Exception {
		
		ArrayList<String> input;
		FileReader fr = new FileReader(fileName);
		BufferedReader br = new BufferedReader(fr);

		
	}
	
	
	
	public class Juggler{
		//J J0 H:3 E:9 P:2 C2,C0,C1
		String name;
		int handeye;
		int endure;
		int pizzaz;
		
		//dictionary use?
		String pref;
		String pointdot;
		
		
		public Juggler(String n, int h, int e, int p, String pref)
		{
			this.name = n;
			this.handeye = h;
			this.endure = e;
			this.pizzaz = p;
			this.pref = pref;
			
		}
		
	}

	public class Circuit{
		//C C0 H:7 E:7 P:10
		String name;
		int handeye;
		int endure;
		int pizzaz;
		ArrayList<String> jugglers;
		int worst = -1; //place of worst juggler
		
		public Circuit(String n, int h, int e, int p)
		{
			this.name = n;
			this.handeye = h;
			this.endure = e;
			this.pizzaz = p;
			this.jugglers = null;
		}
	}
	
}


