import java.awt.Color;


public class Milestone2DFA {
	/*
	   * Constants representing all the states contained
	   * in the Milestone2 DFA 
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
  private static final int q10 = 10;
  private static final int q11 = 11;
  private static final int q12 = 12;
  private static final int q13 = 13;
  private static final int q14 = 14;
  private static final int q15 = 15;
  private static final int q16 = 16;
  private static final int q17 = 17;
  private static final int q18 = 18;
  private static final int q19 = 19;
  private static final int q20 = 20;
  private static final int q21 = 21;
  private static final int q22 = 22;
  private static final int q23 = 23;
  private static final int q24 = 24;
  private static final int q25 = 25;
  private static final int q26 = 26;
  private static final int q27 = 27;
  private static final int q28 = 28;
  private static final int q29 = 29;
  private static final int q30 = 30;
  private static final int q31 = 31;
  private static final int q32 = 32;
  private static final int q33 = 33;
  private static final int q34 = 34;
  private static final int q35 = 35;
  private static final int q36 = 36;
  private static final int q37 = 37;
  private static final int q38 = 38;
  private static final int q39 = 39;
  private static final int q40 = 40;
  private static final int qerror = 41;
	  
  private static final int v = 0;
  private static final int a = 1;
  private static final int r = 2;
  private static final int p = 3;
  private static final int letteri = 4;
  private static final int n = 5;
  private static final int t = 6;
  private static final int space = 7;
  private static final int star = 8;
  private static final int dash = 9;
  private static final int oparen = 10;
  private static final int cparen = 11;
  private static final int quote = 12;
  private static final int digit = 13;  
  private static final int plus = 14;
  private static final int groupchar = 15;
  private static final int equal = 16;
	  
	  
	  
  private int state;
	  
	  /*
	   * Represents the transitions for each state given
	   * a certain character (v, a, r, p, i, n, t, space, *, dash, oparen, cparen,
	   * quote, 0-9, plus, b-h j-m o q s u w-z, equals)
	   * 
	   */
  private static int[][] delta = {
    {q1, q6, q6, q18, q6, q6, q6, qerror, q36, qerror, qerror, qerror, qerror, qerror, qerror, q6, qerror},    //q0 transitions 
    {qerror, q2, qerror, qerror, qerror, qerror, qerror, q7, qerror, qerror, qerror, qerror, qerror, qerror, qerror, qerror, qerror},    //q1 transitions 
    {qerror, qerror, q3, qerror, qerror, qerror, qerror, qerror, qerror, qerror, qerror, qerror, qerror, qerror, qerror, qerror, qerror},    //q2 transitions 
    {qerror, q2, qerror, qerror, qerror, qerror, qerror, q4, qerror, qerror, qerror, qerror, qerror, qerror, qerror, qerror, qerror},    //q3 transitions 
    {q5, q5, q5, q5, q5, q5, q5, qerror, qerror, qerror, qerror, qerror, qerror, qerror, qerror, q5, qerror},    //q4 transitions 
    {qerror, qerror, qerror, qerror, qerror, qerror, qerror, q0, qerror, qerror, qerror, qerror, qerror, qerror, qerror, q5, qerror},    //q5 transitions 
    {qerror, qerror, qerror, qerror, qerror,	qerror,	qerror,	q7,	qerror,	qerror,	qerror,	qerror,	qerror,	qerror,	qerror,	qerror,	qerror}, //q6 transitions
    {qerror, qerror, qerror, qerror, qerror,	qerror,	qerror,	qerror,	qerror,	qerror,	qerror,	qerror,	qerror,	qerror,	qerror,	qerror,	q8},     //q7 transitions
    {qerror,	qerror,	qerror,	qerror,	qerror,	qerror,	qerror,	q9,	qerror,	qerror,	qerror,	qerror,	qerror,	qerror,	qerror,	qerror,	qerror}, //q8 transitions
    {q10, q10, q10, q10, q10, q10, q10, qerror, qerror,qerror,	qerror,	qerror,	q15, q11, qerror, q10, qerror}, //q9 transitions
    {qerror,	qerror,	qerror,	qerror,	qerror,	qerror,	qerror,	q0,	qerror,	qerror,	qerror,	qerror,	qerror,	qerror,	qerror,	qerror,	qerror}, //q10 transitions
    {qerror,	qerror,	qerror,	qerror,	qerror,	qerror,	qerror,	q12,	qerror,	qerror,	qerror,	qerror,	qerror,	qerror,	qerror,	qerror,	qerror}, //q11
    {qerror,	qerror,	qerror,	qerror,	qerror,	qerror,	qerror,	qerror,	qerror,	qerror,	qerror,	qerror,	qerror,	qerror,	q13,	qerror,	qerror}, //q12
    {qerror,	qerror,	qerror,	qerror,	qerror,	qerror,	qerror,	q14,	qerror,	qerror,	qerror,	qerror,	qerror,	qerror,	qerror,	qerror,	qerror}, //q13
    {qerror,	qerror,	qerror,	qerror,	qerror,	qerror,	qerror,	q9,	qerror,	qerror,	qerror,	qerror,	qerror,	qerror,	qerror,	qerror,	qerror}, //q14
    {q16,	q16,	q16,	q16,	q16, q16,	q16,	q16,	q16,	q16,	q16,	q16,	qerror,	q16,	q16,	q16,q16}, //q15
    {q16,	q16,	q16,	q16,	q16,	q16,	q16,	q16, q16,	q16,	q16,	q16,	q17,	q16,	q16,	q16, 	q16}, //q16
    {qerror,	qerror,	qerror,	qerror,	qerror,	qerror,	qerror,	q0,	qerror,	qerror,	qerror,	qerror,	qerror,	qerror,	qerror,	qerror,	qerror}, //q17
    {qerror,	qerror,	q19,	qerror,	qerror,	qerror,	qerror,	q7,	qerror,	qerror,	qerror,	qerror,	qerror,	qerror,	qerror,	qerror,	qerror}, //q18
    {qerror,	qerror,	qerror,	qerror,	q20,	qerror,	qerror,	qerror,	qerror,	qerror,	qerror,	qerror,	qerror,	qerror,	qerror,	qerror,	qerror}, //q19
    {qerror,	qerror,	qerror,	qerror,	qerror,	q21,	qerror,	qerror,	qerror,	qerror,	qerror,	qerror,	qerror,	qerror,	qerror,	qerror,	qerror}, //q20
    {qerror,	qerror,	qerror,	qerror,	qerror,	qerror,	q22, qerror,	qerror,	qerror,	qerror,	qerror,	qerror,	qerror,	qerror,	qerror,	qerror}, //q21
    {qerror,	qerror,	qerror,	qerror,	qerror,	qerror,	qerror,	q23,	qerror,	qerror,	qerror,	qerror,	qerror,	qerror,	qerror,	qerror,	qerror}, //q22
    {qerror,	qerror,	qerror,	qerror,	qerror,	qerror,	qerror,	qerror,	qerror,	qerror,	q24,	qerror,	qerror,	qerror,	qerror,	qerror,	qerror}, //q23
    {qerror,	qerror,	qerror,	qerror,	qerror,	qerror,	qerror,	q25,	qerror,	qerror,	qerror,	qerror,	qerror,	qerror,	qerror,	qerror,	qerror}, //q24
    {q26,	q26,	q26,	q26,	q26,	q26,	q26,	qerror,	qerror,	qerror,	qerror,	qerror,	q31,	q27,	qerror,	q26 ,qerror}, //q25
    {qerror,	qerror,	qerror,	qerror,	qerror,	qerror,	qerror,	q34,	qerror,	qerror,	qerror,	qerror,	qerror,	qerror,	qerror,	qerror,	qerror}, //q26
    {qerror,	qerror,	qerror,	qerror,	qerror,	qerror,	qerror,	q28,	qerror,	qerror,	qerror,	qerror,	qerror,	qerror,	qerror,	qerror,	qerror}, //q27
    {qerror,	qerror,	qerror,	qerror,	qerror,	qerror,	qerror,	qerror,	qerror,	qerror,	qerror,	q35,	qerror,	qerror,	q29,	qerror,	qerror}, //q28
    {qerror,	qerror,	qerror,	qerror,	qerror,	qerror,	qerror,	q30,	qerror,	qerror,	qerror,	qerror,	qerror,	qerror,	qerror,	qerror,	qerror}, //q29
    {qerror,	qerror,	qerror,	qerror,	qerror,	qerror,	qerror,	q25,	qerror,	qerror,	qerror,	qerror,	qerror,	qerror,	qerror,	qerror,	qerror}, //q30
    {q32,	q32,	q32,	q32,	q32,	q32,	q32,	q32,	q32,	q32,	q32,	q32,	qerror,	q32,	q32,	q32,	q32}, //q31
    {q32,	q32,	q32,	q32,	q32,	q32,	q32,	q32,	q32,	q32,	q32,	q32,	q33,	q32,	q32,	q32, q32}, //q32
    {qerror,	qerror,	qerror,	qerror,	qerror,	qerror,	qerror,	q34,	qerror,	qerror,	qerror,	qerror,	qerror,	qerror,	qerror,	qerror,	qerror}, //q33
    {qerror,	qerror,	qerror,	qerror,	qerror,	qerror,	qerror,	qerror,	qerror,	qerror,	qerror,	q35,	qerror,	qerror,	qerror,	qerror,	qerror}, //q34
    {qerror,	qerror,	qerror,	qerror,	qerror,	qerror,	qerror,	q0,	qerror,	qerror,	qerror,	qerror,	qerror,	qerror,	qerror,	qerror,	qerror}, //q35
    {qerror,	qerror,	qerror,	qerror,	qerror,	qerror,	qerror,	qerror,	qerror,	q37,	qerror,	qerror,	qerror,	qerror,	qerror,	qerror,	qerror}, //q36
    {q38,	q38,	q38,	q38,	q38,	q38,	q38,	q38,	q38,	q38,	q38,	q38,	q38,	q38,	q38,	q38,	q38}, //q37
    {q38,	q38,	q38,	q38,	q38,	q38,	q38,	q38,	q38,	q39,	q38,	q38,	q38,	q38,	q38,	q38,	q38}, //q38
    {qerror,	qerror,	qerror,	qerror,	qerror,	qerror,	qerror,	qerror,	q40,	qerror,	qerror,	qerror,	qerror,	qerror,	qerror,	qerror,	qerror}, //q39
    {qerror,	qerror,	qerror,	qerror,	qerror,	qerror,	qerror,	q0,	qerror,	qerror,	qerror,	qerror,	qerror,	qerror,	qerror,	qerror,	qerror}, //q40
    {qerror,	qerror,	qerror,	qerror,	qerror,	qerror,	qerror,	qerror,	qerror,	qerror,	qerror,	qerror,	qerror,	qerror,	qerror,	qerror,	qerror} //qerror
	    
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
  public void accepted(){
    if(state == q5){
      JFrameMilestone2Editor.dtrpnHello.setForeground(Color.PINK);
		  }
    else if(state == q10){
      JFrameMilestone2Editor.dtrpnHello.setForeground(Color.pink);
    }
    else if(state == q11){
      JFrameMilestone2Editor.dtrpnHello.setForeground(Color.pink);
    }
    else if(state == q17){
      JFrameMilestone2Editor.dtrpnHello.setForeground(Color.pink);
    }
    else if(state == q35){
      JFrameMilestone2Editor.dtrpnHello.setForeground(Color.blue);
    }
    else if(state == q40){
      JFrameMilestone2Editor.dtrpnHello.setForeground(Color.green);
    }
    else {
      JFrameMilestone2Editor.dtrpnHello.setForeground(Color.red);
    }
  }
	  
	  /*
	   * Make one transition on each char in the entered string
	   * @param in the String to use
	   */
  public void process(String in){
		  
    int start = 0;
    int end= 0;
    for(int i =0; i< in.length(); i++){
      System.out.println("STATE IS " + this.state);
      char ch = in.charAt(i);
      System.out.println("CHAR IS " + ch);
      end++;
			
      try {
        // if you get a certain character go to a certain
        // character in the transition table
        if( ch == 'v'){
          state = delta[state][v];  
        }
        if( ch == 'a'){
          state = delta[state][a];  
        }
        if( ch == 'r'){
          state = delta[state][r];  
        }
        if( ch == 'p'){
          state = delta[state][p];  
        }
        if( ch == 'i'){
          state = delta[state][letteri];  
        }
        if( ch == 'n'){
          state = delta[state][n];  
        }
        if( ch == 't'){
          state = delta[state][t];  
        }
        if( ch == ' '){
          state = delta[state][space];  
        }
        if( ch == '*'){
        state = delta[state][star];  
        }
        if( ch == '-'){
          state = delta[state][dash];  
        }
        if( ch == '('){
          state = delta[state][oparen];  
        }
        if( ch == ')'){
          state = delta[state][cparen];  
        }
        if( ch == '"'){
          state = delta[state][quote];  
        }
        if( ch == '0' || ch == '1' || ch == '2' || ch == '3' || ch=='4' || ch=='5' || ch=='6' || ch=='7' || ch=='8' || ch=='9'){
          state = delta[state][digit];  
        }
        if( ch == '+'){
          state = delta[state][plus];  
        }
        if( ch == 'b' || ch =='c' || ch=='d' || ch =='e' || ch=='f' || ch =='g' || ch == 'h' || ch =='j' || ch =='k' || ch == 'l' || ch =='m'
            || ch =='o' || ch=='q' || ch=='s' || ch =='u' || ch=='w' || ch == 'x' || ch =='y' || ch =='z'){
          state = delta[state][groupchar];  
        }
        if( ch == '='){
          state = delta[state][equal];  
        }
		}
      catch (ArrayIndexOutOfBoundsException ex){
				  state = qerror;
      }
    }  
  }
}
