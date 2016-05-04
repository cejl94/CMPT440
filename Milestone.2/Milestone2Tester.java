

	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;

	public class Milestone2Tester {

	  public static void main(String[] args) throws IOException{
			
	    System.out.print(" java driverDFA ");
	    Milestone2DFA mw = new Milestone2DFA(); // the DFA
	    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
	    String s = in.readLine();
	      while(s != null){
	        mw.reset();
	        mw.process(s);
	        mw.accepted();
	        s = in.readLine();
					
	      }
	  }
	}

