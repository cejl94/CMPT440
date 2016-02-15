/*
 * Represents the ManWolfGoatCabbage DFA
 * 
 */
public class ManWolf {
	
  /*
   * Constants representing all the states contained
   * in the man wolf goat cabbage DFA. 
   * Additionally, the int state holds the code
   * for the current state
   * 
   */

  private static final int q0 = 0;
  private static final int q1 = 1;
  private static final int q2 = 2;
  private static final int q3 = 3;
  private static final int q4 = 4;
  private static final int q5 = 5;
  private static final int q6 = 6;
  private static final int q7 = 7;
  private static final int q8 = 8;
  private static final int q9 = 9;
  private static final int qerror = 10;
  
  private static final int g = 0;
  private static final int n = 1;
  private static final int c = 2;
  private static final int w = 3;
 
  private int state;
  
  /*
   * Represents the transitions for each state given
   * a certain character (g,n,c,w)
   * 
   */
  private static int[][] delta = {
    {q1, qerror, qerror, qerror},    //q0 transitions 
    {q0, q2, qerror, qerror},     //q1 transitions
    {qerror, q1, q5, q3},      //q2 transitions
    {q4, qerror, qerror, q2},     //q3 transitions
    {q3, qerror, q7, qerror},     //q4 transitions
    {q6, qerror, q2, qerror},     //q5 transitions
    {q5, qerror, qerror, q7},     //q6 transitions
    {qerror, q8, q4, q6},      //q7 transitions
    {q9, q7, qerror, qerror},     //q8 transitions
    {q8, qerror, qerror, qerror},    //q9 transitions
    {qerror, qerror, qerror, qerror}    //qerror transitions
  };



  
  /*
   * Reset the current state back to the start state
   * 
   * 
   */
  public void reset(){
	  state = q0;
	  	  
  }
  
  /*
   * Test to see if the entered string was accepted
   * by the DFA
   * @return true if the end state was accepting
   */
  public boolean accepted(){
	  return state == q9;
  }
  
  /*
   * Make one transition on each char in the entered string
   * @param in the String to use
   */
  public void process(String in){
	  for(int i =0; i< in.length(); i++){
		  char ch = in.charAt(i);
		  try {
			  // if you get a certain character go to a certain
			  // character in the transition table
			  if( ch == 'g'){
				  state = delta[state][g];  
			  }
			  if( ch == 'n'){
				  state = delta[state][n];  
			  }
			  if( ch == 'c'){
				  state = delta[state][c];  
			  }
			  if( ch == 'w'){
				  state = delta[state][w];  
			  }
			 
			  
		  }
		  catch (ArrayIndexOutOfBoundsException ex){
			  state = qerror;
		  }
	  }  
  }
}
