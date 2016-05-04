import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JEditorPane;

import java.awt.Color;

import javax.swing.JTextPane;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import javax.swing.JTextField;
import javax.swing.JLabel;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


public class JFrameMilestone2Editor extends JFrame {

	/**
	 * 
	 */
  private static final long serialVersionUID = 3558562366524671422L;
  private JPanel contentPane;
  public static JEditorPane dtrpnHello = new JEditorPane();
  private final JButton btnSave = new JButton("Save");
  private final JButton btnLoad = new JButton("Load");
  private final JTextField fileNameField = new JTextField();
  private final JLabel lblFileName = new JLabel("File Name:");
  private final JButton btnColorizeMeCaptain = new JButton("Colorize");

	/**
	 * Launch the application.
	 */
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          JFrameMilestone2Editor frame = new JFrameMilestone2Editor();
          frame.setVisible(true);
          } catch (Exception e) {
            e.printStackTrace();
          }
      }
    });
		
		
  }

	/**
	 * Create the frame.
	 */
  public JFrameMilestone2Editor() {
    fileNameField.setBounds(76, 78, 112, 26);
    fileNameField.setColumns(10);
    jBInit();
  }
  private void jBInit() {
    setTitle("Connor's Editor");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBounds(100, 100, 791, 405);
    contentPane = new JPanel();
    contentPane.setBorder(new LineBorder(new Color(0, 0, 0)));
    setContentPane(contentPane);
    contentPane.setLayout(null);
    dtrpnHello.setForeground(Color.BLACK);
    dtrpnHello.setBounds(192, 5, 593, 374);
    dtrpnHello.setBackground(Color.WHITE);
    dtrpnHello.setBorder(new LineBorder(new Color(0, 0, 0)));
		
    contentPane.add(dtrpnHello);
    btnSave.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent arg0) {
        do_btnSave_actionPerformed(arg0);
      }
    });
    btnSave.setBounds(5, 5, 75, 29);
    btnSave.setHorizontalAlignment(SwingConstants.LEFT);
    contentPane.add(btnSave);
    btnLoad.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent arg0) {
      do_btnLoad_actionPerformed(arg0);
    }
    });
    btnLoad.setBounds(105, 6, 75, 29);
		
    contentPane.add(btnLoad);
		
    contentPane.add(fileNameField);
    lblFileName.setBounds(5, 77, 75, 29);
		
    contentPane.add(lblFileName);
    btnColorizeMeCaptain.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent arg0) {
        do_btnColorizeMeCaptain_actionPerformed(arg0);
      }
      });
    btnColorizeMeCaptain.setBounds(37, 152, 117, 29);
		
    contentPane.add(btnColorizeMeCaptain);
	}
  protected void do_btnSave_actionPerformed(ActionEvent arg0){
		
			
    try {
      FileWriter fw = new FileWriter(fileNameField.getText());
      PrintWriter pw = new PrintWriter(fw);
					
      pw.println(dtrpnHello.getText());
      pw.close();
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
				
  }
	

  protected void do_btnLoad_actionPerformed(ActionEvent arg0) {
    try{
      FileReader fr = new FileReader(fileNameField.getText());
      BufferedReader br = new BufferedReader(fr);
			
      String text;
      while((text = br.readLine()) != null){
        dtrpnHello.setText(text);
      }
      br.close();
      }catch (IOException e){
        System.out.println("File not found");
      }
  }
  

  protected void do_btnColorizeMeCaptain_actionPerformed(ActionEvent arg0) {
	  
    System.out.print(" java driverDFA ");
    Milestone2DFA mw = new Milestone2DFA(); // the DFA
	    
    String text = dtrpnHello.getText();
    while(text != null){
      mw.reset();
      mw.process(text);
	  mw.accepted();
      text = null;
    }
}
}
