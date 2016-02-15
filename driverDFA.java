import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class driverDFA {

	public static void main(String[] args) throws IOException{
		
		System.out.print(" java driverDFA ");
			ManWolf mw = new ManWolf(); // the DFA
			
			BufferedReader in = 
					new BufferedReader(new InputStreamReader(System.in));
			
			
			String s = in.readLine();
			
			while(s != null){
				
				mw.reset();
				mw.process(s);
				if(mw.accepted()){
					System.out.println("This is a solution");
					
				}
				else{
					System.out.println("This is not a solution");
					//System.out.println("");
					System.out.print(" java driverDFA ");

				}
				s = in.readLine();
				
			}
		}
	}

