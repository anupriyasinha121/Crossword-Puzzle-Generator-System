package crossword_puzzle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.*;
import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;


class JTextFieldLimit extends PlainDocument {
  private int limit;
  JTextFieldLimit(int limit) {
    super();
    this.limit = limit;
  }

  JTextFieldLimit(int limit, boolean upper) {
    super();
    this.limit = limit;
  }

  public void insertString(int offset, String str, AttributeSet attr) throws BadLocationException {
    if (str == null)
      return;

    if ((getLength() + str.length()) <= limit) {
      super.insertString(offset, str, attr);
    }
  }
}
/*
 Actual Class for frame implementation
  */
public class frame2 extends JFrame implements ActionListener {

	 JPanel contentPane;
	 JButton btn,sub;
	 JTextField txt1=new JTextField();
	 
	 ///// Cross word grid
	   public javax.swing.JTextField c1= new JTextField();
	    public javax.swing.JTextField c10= new JTextField();
	    public javax.swing.JTextField c100= new JTextField();
	    public javax.swing.JTextField c11= new JTextField();
	    public javax.swing.JTextField c12= new JTextField();
	    public javax.swing.JTextField c13= new JTextField();
	    public javax.swing.JTextField c14= new JTextField();
	    public javax.swing.JTextField c15= new JTextField();
	    public javax.swing.JTextField c16= new JTextField();
	    public javax.swing.JTextField c17= new JTextField();
	    public javax.swing.JTextField c18= new JTextField();
	    public javax.swing.JTextField c19= new JTextField();
	    public javax.swing.JTextField c2= new JTextField();
	    public javax.swing.JTextField c20= new JTextField();
	    public javax.swing.JTextField c21= new JTextField();
	    public javax.swing.JTextField c22= new JTextField();
	    public javax.swing.JTextField c23= new JTextField();
	    public javax.swing.JTextField c24= new JTextField();
	    public javax.swing.JTextField c25= new JTextField();
	    public javax.swing.JTextField c26= new JTextField();
	    public javax.swing.JTextField c27= new JTextField();
	    public javax.swing.JTextField c28= new JTextField();
	    public javax.swing.JTextField c29= new JTextField();
	    public javax.swing.JTextField c3= new JTextField();
	    public javax.swing.JTextField c30= new JTextField();
	    public javax.swing.JTextField c31= new JTextField();
	    public javax.swing.JTextField c32= new JTextField();
	    public javax.swing.JTextField c33= new JTextField();
	    public javax.swing.JTextField c34= new JTextField();
	    public javax.swing.JTextField c35= new JTextField();
	    public javax.swing.JTextField c36= new JTextField();
	    public javax.swing.JTextField c37= new JTextField();
	    public javax.swing.JTextField c38= new JTextField();
	    public javax.swing.JTextField c39= new JTextField();
	    public javax.swing.JTextField c4= new JTextField();
	    public javax.swing.JTextField c40= new JTextField();
	    public javax.swing.JTextField c41= new JTextField();
	    public javax.swing.JTextField c42= new JTextField();
	    public javax.swing.JTextField c43= new JTextField();
	    public javax.swing.JTextField c44= new JTextField();
	    public javax.swing.JTextField c45= new JTextField();
	    public javax.swing.JTextField c46= new JTextField();
	    public javax.swing.JTextField c47= new JTextField();
	    public javax.swing.JTextField c48= new JTextField();
	    public javax.swing.JTextField c49= new JTextField();
	    public javax.swing.JTextField c5= new JTextField();
	    public javax.swing.JTextField c50= new JTextField();
	    public javax.swing.JTextField c51= new JTextField();
	    public javax.swing.JTextField c52= new JTextField();
	    public javax.swing.JTextField c53= new JTextField();
	    public javax.swing.JTextField c54= new JTextField();
	    public javax.swing.JTextField c55= new JTextField();
	    public javax.swing.JTextField c56= new JTextField();
	    public javax.swing.JTextField c57= new JTextField();
	    public javax.swing.JTextField c58= new JTextField();
	    public javax.swing.JTextField c59= new JTextField();
	    public javax.swing.JTextField c6= new JTextField();
	    public javax.swing.JTextField c60= new JTextField();
	    public javax.swing.JTextField c61= new JTextField();
	    public javax.swing.JTextField c62= new JTextField();
	    public javax.swing.JTextField c63= new JTextField();
	    public javax.swing.JTextField c64= new JTextField();
	    public javax.swing.JTextField c65= new JTextField();
	    public javax.swing.JTextField c66= new JTextField();
	    public javax.swing.JTextField c67= new JTextField();
	    public javax.swing.JTextField c68= new JTextField();
	    public javax.swing.JTextField c69= new JTextField();
	    public javax.swing.JTextField c7= new JTextField();
	    public javax.swing.JTextField c70= new JTextField();
	    public javax.swing.JTextField c71= new JTextField();
	    public javax.swing.JTextField c72= new JTextField();
	    public javax.swing.JTextField c73= new JTextField();
	    public javax.swing.JTextField c74= new JTextField();
	    public javax.swing.JTextField c75= new JTextField();
	    public javax.swing.JTextField c76= new JTextField();
	    public javax.swing.JTextField c77= new JTextField();
	    public javax.swing.JTextField c78= new JTextField();
	    public javax.swing.JTextField c79= new JTextField();
	    public javax.swing.JTextField c8= new JTextField();
	    public javax.swing.JTextField c80= new JTextField();
	    public javax.swing.JTextField c81= new JTextField();
	    public javax.swing.JTextField c82= new JTextField();
	    public javax.swing.JTextField c83= new JTextField();
	    public javax.swing.JTextField c84= new JTextField();
	    public javax.swing.JTextField c85= new JTextField();
	    public javax.swing.JTextField c86= new JTextField();
	    public javax.swing.JTextField c87= new JTextField();
	    public javax.swing.JTextField c88= new JTextField();
	    public javax.swing.JTextField c89= new JTextField();
	    public javax.swing.JTextField c9= new JTextField();
	    public javax.swing.JTextField c90= new JTextField();
	    public javax.swing.JTextField c91= new JTextField();
	    public javax.swing.JTextField c92= new JTextField();
	    public javax.swing.JTextField c93= new JTextField();
	    public javax.swing.JTextField c94= new JTextField();
	    public javax.swing.JTextField c95= new JTextField();
	    public javax.swing.JTextField c96= new JTextField();
	    public javax.swing.JTextField c97= new JTextField();
	    public javax.swing.JTextField c98= new JTextField();
	    public javax.swing.JTextField c99= new JTextField();
	 ////////--------------------
	 
	 JTextArea txta1=new JTextArea(20,1);
	 JScrollPane scr1 = new JScrollPane(txta1); 
	
	 JTextArea txta2=new JTextArea("ANSWERS WILL BE DISPLAYED AFTER SUBMITTING THE RESPONSE",12,1);
	 JScrollPane scr2 = new JScrollPane(txta2); 
	 static char[][] game1 = new char[10][10];
	 static char[][] game2 = new char[10][10];
	 static String[]   gamehint=new String[10];
	 static int breakpoint;
	 /*/ this part is not working well for icon creation of joptionpane
	 ImageIcon icon1 = createImageIcon("/home/kshitiz/eclipse-workspace/CrossWordGame/images/cwg_img1.jpg","winning");
	 protected ImageIcon createImageIcon(String path,String description) {
		 java.net.URL imgURL = getClass().getResource(path);
		 if (imgURL != null) {
			 return new ImageIcon(imgURL, description);
		 } 
		 else {
			 System.err.println("Couldn't find file: " + path);
			 return null;
		 }
	 }
	 /////*/
	 
	 public void actionPerformed(ActionEvent event)
	 {
		 try {
			database();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }
	 public void database() throws ClassNotFoundException, SQLException
	 {
		 Class.forName("org.postgresql.Driver");
		 Connection conn = null;
	        try {
	            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/dbms_project","postgres","postgres");   //postgres
	            System.out.println("Connected to the PostgreSQL server successfully.");
	        } catch (SQLException e) {
	            System.out.println(e.getMessage());
	        }
	        Statement stmt=conn.createStatement();
	        
	        String sql="select commands,description from commands_list";
	        
	        ResultSet rs=stmt.executeQuery(sql);
	        
	        String[][] test=new String[100][2];// this array will keep in itself all command names and their 
	         
	       // description by extracting directly from database                                    
	       
	        
	        
	        //************************************8
	        int i=0;
	        while(rs.next())
	        {
	        	test[i][0]=rs.getString("commands");
	        	test[i][1]=rs.getString("description");
	        	System.out.println(test[i][0]+"\t"+test[i][1]);
	        	i++;
	        }
	        System.out.println(i);
	        int size= 8;  //  HERE , I AM SETTING VARIABLE SIZE ;;; BUT AFETR IMPROVEMENT IT WILL ONLY TAKE 10 WORDS FOR QUIZ GENERATION ;;;CHANGE
	                        // CODE HERE OTHERWISE ERROR MAY OCCUR
	        
	        String[] str1=new String[size];
	        String[] hint=new String[size];
	        String[] str=new String[size];// this array is for keeping the command names in itself
                                          //  I have used this array because the algo provided to me also had 
                                          // a same array which was used to generate the required puzzle .
            
	        
	        Random rand = new Random();
            int si = rand.nextInt(22);
            int sf = 0;	        

             for(int j=si;j<size+si;j++)
             {
            	 hint[sf]= test[j][1];
                 str[sf]=test[j][0];
                 str1[sf]=test[j][0];//   copying command names to str from test array as per the provided algo
                 //System.out.println(str[j]);
                 
                 sf++;
             }
	        
             //*********************
            
	        
	        //String[] str = {"hostname", "chown",  "sudo", "ls", "telnet", "mkdir", "whatis"};
	        //String[] str1 = {"hostname", "chown",  "sudo", "ls", "telnet", "mkdir", "whatis"};
	        //String[] str = {"df" , "du", "addgroup", "unexpand", "locate", "expr", "info"}; 
	        //String[] str1 = {"df" , "du", "addgroup", "unexpand", "locate", "expr", "info"}; 
	        //hint array for game
	        //String[] hint = {"show or set the system host name", "change file owner and group", "execute a command as another user", "list directory contents", "user interface to the TELNET protocol", "create directory", "display one-line manual page descriptions"};
	        //System.out.println(hint.length);
	        
	        //String[] words = sortStrArray(str1); 
	        //System.out.println(Arrays.toString(str));
	        //System.out.println(Arrays.toString(sortStrArray(str)));
	        gameGenerator(sortStrArray(str), hint, str1); 
	        
	        
	        
	        //#$$$#$#$#$$###$$$#$##$#$#$##$#$#$$
	     /*   
	        String[] str=new String[size];// this array is for keeping the command names in itself
	        String[] hint=new String[size];//  I have used this array because the algo provided to me also had 
	                                      // a same array which was used to generate the required puzzle .
	        for(int j=0;j<size;j++)
	        {
	        	str[j]=test[j][0];//   copying command names to str from test array as per the provided algo
	        	hint[j]=test[j][1];
	        	System.out.println(str[j]);
	        	//l++;
	        }
	        */
	        //String[] str = {"hostname", "chown",  "sudo", "ls", "telnet", "mkdir", "whatis"};
	        //String[] str = {"df" , "du", "addgroup", "unexpand", "locate", "expr", "info"}; 
	        
	        //Calling function hint for game
	        //String[] hint = {"show or set the system host name", "change file owner and group", "execute a command as another user", "list directory contents", "user interface to the TELNET protocol", "create directory", "display one-line manual page descriptions"};
	        
	        
	        //String[] words = sortStrArray(str);
             System.out.println(Arrays.toString(str));
             System.out.println(Arrays.toString(sortStrArray(str)));
             gameGenerator(sortStrArray(str), hint, str1);
	         //System.out.println(Arrays.toString(sortStrArray(str)));	        
	         //gameGenerator(words,hint);
	        
	       txta2.setText("ANSWERS WILL BE DISPLAYED AFTER SUBMITTING THE RESPONSE");
	       txta1.setText("");
	       txta1.append("HINTS :"+"\n");
	       txta1.append("ACROSS :~\n");
	       String setStr=new String();
			for(int z=0,k=1;z<=breakpoint;z++,k++)
			{	
			    setStr="("+k+") "+gamehint[z]+"\n";
				txta1.append(setStr);
			
			}
			txta1.append("DOWN :~\n");
			for(int z=breakpoint+1,k=1;z<7;z++,k++)  // it should be "z<10"
			{	
			    setStr="("+k+") "+gamehint[z]+"\n";
				txta1.append(setStr);
			
			}
	        if(game1[0][0]=='*')
	        {
	        	c1.setText("*");
	        	c1.setEditable(false);
	        }
	        else
	        {
	        	c1.setText(" ");
c1.setEditable(true);
	        }
 if(game1[0][1]=='*')
	        {
	        	c2.setText("*");
	        	c2.setEditable(false);
	        }
	        else
	        {
	        	c2.setText(" ");
c2.setEditable(true);
	        }
 if(game1[0][2]=='*')
	        {
	        	c3.setText("*");
	        	c3.setEditable(false);
	        }
	        else
	        {
	        	c3.setText(" ");
c3.setEditable(true);
	        }
 if(game1[0][3]=='*')
	        {
	        	c4.setText("*");
	        	c4.setEditable(false);
	        }
	        else
	        {
	        	c4.setText(" ");
c4.setEditable(true);
	        }
 if(game1[0][4]=='*')
	        {
	        	c5.setText("*");
	        	c5.setEditable(false);
	        }
	        else
	        {
	        	c5.setText(" ");
c5.setEditable(true);
	        }
 if(game1[0][5]=='*')
	        {
	        	c6.setText("*");
	        	c6.setEditable(false);
	        }
	        else
	        {
	        	c6.setText(" ");
c6.setEditable(true);
	        }
 if(game1[0][6]=='*')
	        {
	        	c7.setText("*");
	        	c7.setEditable(false);
	        }
	        else
	        {
	        	c7.setText(" ");
c7.setEditable(true);
	        }
 if(game1[0][7]=='*')
	        {
	        	c8.setText("*");
	        	c8.setEditable(false);
	        }
	        else
	        {
	        	c8.setText(" ");
c8.setEditable(true);
	        }
 if(game1[0][8]=='*')
	        {
	        	c9.setText("*");
	        	c9.setEditable(false);
	        }
	        else
	        {
	        	c9.setText(" ");
c9.setEditable(true);
	        }
 if(game1[0][9]=='*')
	        {
	        	c10.setText("*");
	        	c10.setEditable(false);
	        }
	        else
	        {
	        	c10.setText(" ");
c10.setEditable(true);
	        }
 if(game1[1][0]=='*')
	        {
	        	c11.setText("*");
	        	c11.setEditable(false);
	        }
	        else
	        {
	        	c11.setText(" ");
c11.setEditable(true);
	        }
 if(game1[1][1]=='*')
	        {
	        	c12.setText("*");
	        	c12.setEditable(false);
	        }
	        else
	        {
	        	c12.setText(" ");
c12.setEditable(true);
	        }
 if(game1[1][2]=='*')
	        {
	        	c13.setText("*");
	        	c13.setEditable(false);
	        }
	        else
	        {
	        	c13.setText(" ");
c13.setEditable(true);
	        }
 if(game1[1][3]=='*')
	        {
	        	c14.setText("*");
	        	c14.setEditable(false);
	        }
	        else
	        {
	        	c14.setText(" ");
c14.setEditable(true);
	        }
 if(game1[1][4]=='*')
	        {
	        	c15.setText("*");
	        	c15.setEditable(false);
	        }
	        else
	        {
	        	c15.setText(" ");
c15.setEditable(true);
	        }
 if(game1[1][5]=='*')
	        {
	        	c16.setText("*");
	        	c16.setEditable(false);
	        }
	        else
	        {
	        	c16.setText(" ");
c16.setEditable(true);
	        }
 if(game1[1][6]=='*')
	        {
	        	c17.setText("*");
	        	c17.setEditable(false);
	        }
	        else
	        {
	        	c17.setText(" ");
c17.setEditable(true);
	        }
 if(game1[1][7]=='*')
	        {
	        	c18.setText("*");
	        	c18.setEditable(false);
	        }
	        else
	        {
	        	c18.setText(" ");
c18.setEditable(true);
	        }
 if(game1[1][8]=='*')
	        {
	        	c19.setText("*");
	        	c19.setEditable(false);
	        }
	        else
	        {
	        	c19.setText(" ");
c19.setEditable(true);
	        }
 if(game1[1][9]=='*')
	        {
	        	c20.setText("*");
	        	c20.setEditable(false);
	        }
	        else
	        {
	        	c20.setText(" ");
c20.setEditable(true);
	        }
 if(game1[2][0]=='*')
	        {
	        	c21.setText("*");
	        	c21.setEditable(false);
	        }
	        else
	        {
	        	c21.setText(" ");
c21.setEditable(true);
	        }
 if(game1[2][1]=='*')
	        {
	        	c22.setText("*");
	        	c22.setEditable(false);
	        }
	        else
	        {
	        	c22.setText(" ");
c22.setEditable(true);
	        }
 if(game1[2][2]=='*')
	        {
	        	c23.setText("*");
	        	c23.setEditable(false);
	        }
	        else
	        {
	        	c23.setText(" ");
c23.setEditable(true);
	        }
 if(game1[2][3]=='*')
	        {
	        	c24.setText("*");
	        	c24.setEditable(false);
	        }
	        else
	        {
	        	c24.setText(" ");
c24.setEditable(true);
	        }
 if(game1[2][4]=='*')
	        {
	        	c25.setText("*");
	        	c25.setEditable(false);
	        }
	        else
	        {
	        	c25.setText(" ");
c25.setEditable(true);
	        }
 if(game1[2][5]=='*')
	        {
	        	c26.setText("*");
	        	c26.setEditable(false);
	        }
	        else
	        {
	        	c26.setText(" ");
c26.setEditable(true);
	        }
 if(game1[2][6]=='*')
	        {
	        	c27.setText("*");
	        	c27.setEditable(false);
	        }
	        else
	        {
	        	c27.setText(" ");
c27.setEditable(true);
	        }
 if(game1[2][7]=='*')
	        {
	        	c28.setText("*");
	        	c28.setEditable(false);
	        }
	        else
	        {
	        	c28.setText(" ");
c28.setEditable(true);
	        }
 if(game1[2][8]=='*')
	        {
	        	c29.setText("*");
	        	c29.setEditable(false);
	        }
	        else
	        {
	        	c29.setText(" ");
c29.setEditable(true);
	        }
 if(game1[2][9]=='*')
	        {
	        	c30.setText("*");
	        	c30.setEditable(false);
	        }
	        else
	        {
	        	c30.setText(" ");
c30.setEditable(true);
	        }
 if(game1[3][0]=='*')
	        {
	        	c31.setText("*");
	        	c31.setEditable(false);
	        }
	        else
	        {
	        	c31.setText(" ");
c31.setEditable(true);
	        }
 if(game1[3][1]=='*')
	        {
	        	c32.setText("*");
	        	c32.setEditable(false);
	        }
	        else
	        {
	        	c32.setText(" ");
c32.setEditable(true);
	        }
 if(game1[3][2]=='*')
	        {
	        	c33.setText("*");
	        	c33.setEditable(false);
	        }
	        else
	        {
	        	c33.setText(" ");
c33.setEditable(true);
	        }
 if(game1[3][3]=='*')
	        {
	        	c34.setText("*");
	        	c34.setEditable(false);
	        }
	        else
	        {
	        	c34.setText(" ");
c34.setEditable(true);
	        }
 if(game1[3][4]=='*')
	        {
	        	c35.setText("*");
	        	c35.setEditable(false);
	        }
	        else
	        {
	        	c35.setText(" ");
c35.setEditable(true);
	        }
 if(game1[3][5]=='*')
	        {
	        	c36.setText("*");
	        	c36.setEditable(false);
	        }
	        else
	        {
	        	c36.setText(" ");
c36.setEditable(true);
	        }
 if(game1[3][6]=='*')
	        {
	        	c37.setText("*");
	        	c37.setEditable(false);
	        }
	        else
	        {
	        	c37.setText(" ");
c37.setEditable(true);
	        }
 if(game1[3][7]=='*')
	        {
	        	c38.setText("*");
	        	c38.setEditable(false);
	        }
	        else
	        {
	        	c38.setText(" ");
c38.setEditable(true);
	        }
 if(game1[3][8]=='*')
	        {
	        	c39.setText("*");
	        	c39.setEditable(false);
	        }
	        else
	        {
	        	c39.setText(" ");
c39.setEditable(true);
	        }
 if(game1[3][9]=='*')
	        {
	        	c40.setText("*");
	        	c40.setEditable(false);
	        }
	        else
	        {
	        	c40.setText(" ");
c40.setEditable(true);
	        }
 if(game1[4][0]=='*')
	        {
	        	c41.setText("*");
	        	c41.setEditable(false);
	        }
	        else
	        {
	        	c41.setText(" ");
c41.setEditable(true);
	        }
 if(game1[4][1]=='*')
	        {
	        	c42.setText("*");
	        	c42.setEditable(false);
	        }
	        else
	        {
	        	c42.setText(" ");
c42.setEditable(true);
	        }
 if(game1[4][2]=='*')
	        {
	        	c43.setText("*");
	        	c43.setEditable(false);
	        }
	        else
	        {
	        	c43.setText(" ");
c43.setEditable(true);
	        }
 if(game1[4][3]=='*')
	        {
	        	c44.setText("*");
	        	c44.setEditable(false);
	        }
	        else
	        {
	        	c44.setText(" ");
c44.setEditable(true);
	        }
 if(game1[4][4]=='*')
	        {
	        	c45.setText("*");
	        	c45.setEditable(false);
	        }
	        else
	        {
	        	c45.setText(" ");
c45.setEditable(true);
	        }
 if(game1[4][5]=='*')
	        {
	        	c46.setText("*");
	        	c46.setEditable(false);
	        }
	        else
	        {
	        	c46.setText(" ");
c46.setEditable(true);
	        }
 if(game1[4][6]=='*')
	        {
	        	c47.setText("*");
	        	c47.setEditable(false);
	        }
	        else
	        {
	        	c47.setText(" ");
c47.setEditable(true);
	        }
 if(game1[4][7]=='*')
	        {
	        	c48.setText("*");
	        	c48.setEditable(false);
	        }
	        else
	        {
	        	c48.setText(" ");
c48.setEditable(true);
	        }
 if(game1[4][8]=='*')
	        {
	        	c49.setText("*");
	        	c49.setEditable(false);
	        }
	        else
	        {
	        	c49.setText(" ");
c49.setEditable(true);
	        }
 if(game1[4][9]=='*')
	        {
	        	c50.setText("*");
	        	c50.setEditable(false);
	        }
	        else
	        {
	        	c50.setText(" ");
c50.setEditable(true);
	        }
 if(game1[5][0]=='*')
	        {
	        	c51.setText("*");
	        	c51.setEditable(false);
	        }
	        else
	        {
	        	c51.setText(" ");
c51.setEditable(true);
	        }
 if(game1[5][1]=='*')
	        {
	        	c52.setText("*");
	        	c52.setEditable(false);
	        }
	        else
	        {
	        	c52.setText(" ");
c52.setEditable(true);
	        }
 if(game1[5][2]=='*')
	        {
	        	c53.setText("*");
	        	c53.setEditable(false);
	        }
	        else
	        {
	        	c53.setText(" ");
c53.setEditable(true);
	        }
 if(game1[5][3]=='*')
	        {
	        	c54.setText("*");
	        	c54.setEditable(false);
	        }
	        else
	        {
	        	c54.setText(" ");
c54.setEditable(true);
	        }
 if(game1[5][4]=='*')
	        {
	        	c55.setText("*");
	        	c55.setEditable(false);
	        }
	        else
	        {
	        	c55.setText(" ");
c55.setEditable(true);
	        }
 if(game1[5][5]=='*')
	        {
	        	c56.setText("*");
	        	c56.setEditable(false);
	        }
	        else
	        {
	        	c56.setText(" ");
c56.setEditable(true);
	        }
 if(game1[5][6]=='*')
	        {
	        	c57.setText("*");
	        	c57.setEditable(false);
	        }
	        else
	        {
	        	c57.setText(" ");
c57.setEditable(true);
	        }
 if(game1[5][7]=='*')
	        {
	        	c58.setText("*");
	        	c58.setEditable(false);
	        }
	        else
	        {
	        	c58.setText(" ");
c58.setEditable(true);
	        }
 if(game1[5][8]=='*')
	        {
	        	c59.setText("*");
	        	c59.setEditable(false);
	        }
	        else
	        {
	        	c59.setText(" ");
c59.setEditable(true);
	        }
 if(game1[5][9]=='*')
	        {
	        	c60.setText("*");
	        	c60.setEditable(false);
	        }
	        else
	        {
	        	c60.setText(" ");
c60.setEditable(true);
	        }
 if(game1[6][0]=='*')
	        {
	        	c61.setText("*");
	        	c61.setEditable(false);
	        }
	        else
	        {
	        	c61.setText(" ");
c61.setEditable(true);
	        }
 if(game1[6][1]=='*')
	        {
	        	c62.setText("*");
	        	c62.setEditable(false);
	        }
	        else
	        {
	        	c62.setText(" ");
c62.setEditable(true);
	        }
 if(game1[6][2]=='*')
	        {
	        	c63.setText("*");
	        	c63.setEditable(false);
	        }
	        else
	        {
	        	c63.setText(" ");
c63.setEditable(true);
	        }
 if(game1[6][3]=='*')
	        {
	        	c64.setText("*");
	        	c64.setEditable(false);
	        }
	        else
	        {
	        	c64.setText(" ");
c64.setEditable(true);
	        }
 if(game1[6][4]=='*')
	        {
	        	c65.setText("*");
	        	c65.setEditable(false);
	        }
	        else
	        {
	        	c65.setText(" ");
c65.setEditable(true);
	        }
 if(game1[6][5]=='*')
	        {
	        	c66.setText("*");
	        	c66.setEditable(false);
	        }
	        else
	        {
	        	c66.setText(" ");
c66.setEditable(true);
	        }
 if(game1[6][6]=='*')
	        {
	        	c67.setText("*");
	        	c67.setEditable(false);
	        }
	        else
	        {
	        	c67.setText(" ");
c67.setEditable(true);
	        }
 if(game1[6][7]=='*')
	        {
	        	c68.setText("*");
	        	c68.setEditable(false);
	        }
	        else
	        {
	        	c68.setText(" ");
c68.setEditable(true);
	        }
 if(game1[6][8]=='*')
	        {
	        	c69.setText("*");
	        	c69.setEditable(false);
	        }
	        else
	        {
	        	c69.setText(" ");
c69.setEditable(true);
	        }
 if(game1[6][9]=='*')
	        {
	        	c70.setText("*");
	        	c70.setEditable(false);
	        }
	        else
	        {
	        	c70.setText(" ");
c70.setEditable(true);
	        }
 if(game1[7][0]=='*')
	        {
	        	c71.setText("*");
	        	c71.setEditable(false);
	        }
	        else
	        {
	        	c71.setText(" ");
c71.setEditable(true);
	        }
 if(game1[7][1]=='*')
	        {
	        	c72.setText("*");
	        	c72.setEditable(false);
	        }
	        else
	        {
	        	c72.setText(" ");
c72.setEditable(true);
	        }
 if(game1[7][2]=='*')
	        {
	        	c73.setText("*");
	        	c73.setEditable(false);
	        }
	        else
	        {
	        	c73.setText(" ");
c73.setEditable(true);
	        }
 if(game1[7][3]=='*')
	        {
	        	c74.setText("*");
	        	c74.setEditable(false);
	        }
	        else
	        {
	        	c74.setText(" ");
c74.setEditable(true);
	        }
 if(game1[7][4]=='*')
	        {
	        	c75.setText("*");
	        	c75.setEditable(false);
	        }
	        else
	        {
	        	c75.setText(" ");
c75.setEditable(true);
	        }
 if(game1[7][5]=='*')
	        {
	        	c76.setText("*");
	        	c76.setEditable(false);
	        }
	        else
	        {
	        	c76.setText(" ");
c76.setEditable(true);
	        }
 if(game1[7][6]=='*')
	        {
	        	c77.setText("*");
	        	c77.setEditable(false);
	        }
	        else
	        {
	        	c77.setText(" ");
c77.setEditable(true);
	        }
 if(game1[7][7]=='*')
	        {
	        	c78.setText("*");
	        	c78.setEditable(false);
	        }
	        else
	        {
	        	c78.setText(" ");
c78.setEditable(true);
	        }
 if(game1[7][8]=='*')
	        {
	        	c79.setText("*");
	        	c79.setEditable(false);
	        }
	        else
	        {
	        	c79.setText(" ");
c79.setEditable(true);
	        }
 if(game1[7][9]=='*')
	        {
	        	c80.setText("*");
	        	c80.setEditable(false);
	        }
	        else
	        {
	        	c80.setText(" ");
c80.setEditable(true);
	        }
 if(game1[8][0]=='*')
	        {
	        	c81.setText("*");
	        	c81.setEditable(false);
	        }
	        else
	        {
	        	c81.setText(" ");
c81.setEditable(true);
	        }
 if(game1[8][1]=='*')
	        {
	        	c82.setText("*");
	        	c82.setEditable(false);
	        }
	        else
	        {
	        	c82.setText(" ");
c82.setEditable(true);
	        }
 if(game1[8][2]=='*')
	        {
	        	c83.setText("*");
	        	c83.setEditable(false);
	        }
	        else
	        {
	        	c83.setText(" ");
c83.setEditable(true);
	        }
 if(game1[8][3]=='*')
	        {
	        	c84.setText("*");
	        	c84.setEditable(false);
	        }
	        else
	        {
	        	c84.setText(" ");
c84.setEditable(true);
	        }
 if(game1[8][4]=='*')
	        {
	        	c85.setText("*");
	        	c85.setEditable(false);
	        }
	        else
	        {
	        	c85.setText(" ");
c85.setEditable(true);
	        }
 if(game1[8][5]=='*')
	        {
	        	c86.setText("*");
	        	c86.setEditable(false);
	        }
	        else
	        {
	        	c86.setText(" ");
c86.setEditable(true);
	        }
 if(game1[8][6]=='*')
	        {
	        	c87.setText("*");
	        	c87.setEditable(false);
	        }
	        else
	        {
	        	c87.setText(" ");
c87.setEditable(true);
	        }
 if(game1[8][7]=='*')
	        {
	        	c88.setText("*");
	        	c88.setEditable(false);
	        }
	        else
	        {
	        	c88.setText(" ");
c88.setEditable(true);
	        }
 if(game1[8][8]=='*')
	        {
	        	c89.setText("*");
	        	c89.setEditable(false);
	        }
	        else
	        {
	        	c89.setText(" ");
c89.setEditable(true);
	        }
 if(game1[8][9]=='*')
	        {
	        	c90.setText("*");
	        	c90.setEditable(false);
	        }
	        else
	        {
	        	c90.setText(" ");
c90.setEditable(true);
	        }
 if(game1[9][0]=='*')
	        {
	        	c91.setText("*");
	        	c91.setEditable(false);
	        }
	        else
	        {
	        	c91.setText(" ");
c91.setEditable(true);
	        }
 if(game1[9][1]=='*')
	        {
	        	c92.setText("*");
	        	c92.setEditable(false);
	        }
	        else
	        {
	        	c92.setText(" ");
c92.setEditable(true);
	        }
 if(game1[9][2]=='*')
	        {
	        	c93.setText("*");
	        	c93.setEditable(false);
	        }
	        else
	        {
	        	c93.setText(" ");
c93.setEditable(true);
	        }
 if(game1[9][3]=='*')
	        {
	        	c94.setText("*");
	        	c94.setEditable(false);
	        }
	        else
	        {
	        	c94.setText(" ");
c94.setEditable(true);
	        }
 if(game1[9][4]=='*')
	        {
	        	c95.setText("*");
	        	c95.setEditable(false);
	        }
	        else
	        {
	        	c95.setText(" ");
c95.setEditable(true);
	        }
 if(game1[9][5]=='*')
	        {
	        	c96.setText("*");
	        	c96.setEditable(false);
	        }
	        else
	        {
	        	c96.setText(" ");
c96.setEditable(true);
	        }
 if(game1[9][6]=='*')
	        {
	        	c97.setText("*");
	        	c97.setEditable(false);
	        }
	        else
	        {
	        	c97.setText(" ");
c97.setEditable(true);
	        }
 if(game1[9][7]=='*')
	        {
	        	c98.setText("*");
	        	c98.setEditable(false);
	        }
	        else
	        {
	        	c98.setText(" ");
c98.setEditable(true);
	        }
 if(game1[9][8]=='*')
	        {
	        	c99.setText("*");
	        	c99.setEditable(false);
	        }
	        else
	        {
	        	c99.setText(" ");
c99.setEditable(true);
	        }
 if(game1[9][9]=='*')
	        {
	        	c100.setText("*");
	        	c100.setEditable(false);
	        }
	        else
	        {
	        	c100.setText(" ");
c100.setEditable(true);
	        }
	     //   c1.setText(Character.toString(game1[0][0]));  WILL BE NEEDED IN SUBMIT BUTTON ACTION LISTENER
	       sub.setEnabled(true);
	        
	  
	 }
	 /*Inserting the algorithm 
	   */
	 public static String[] sortStrArray(String[] array){
		   
		    Arrays.sort(array, new Comparator<String>() {
		        @Override
		        public int compare(String a, String b) {
		            return -(Integer.compare(a.length(),b.length()));
		        }
		    });
		     return array;
		}

	//Game generator function
	 private static void gameGenerator(String[] words, String[] hint, String str1[]) {
	        
	        String[] x = new String[8]; 
	        ArrayList<Integer> list = new ArrayList<Integer>();
	        int l=0,j,i,o=0,h=0,n=0,t=0;
	        int[] f = new int[8];
	        int[] hint_orint = new int[hint.length];
	        
	        for(i =0; i<10;i++){
	            //System.out.println();
	            for(j=0;j<10;j++){
	                game1[i][j]='*';
	            }
	        }
	        
	        //System.out.println(words.length);
	        
	      //System.out.println(words.length);
	        
	        for (int k=0;k<words.length;k++) {             //For each word
	            
	            //System.out.println(words[k].charAt(0));
	            
	            if((10-o) >= words[k].length()){
	                //System.out.println("h");
	                for(j=0;j<words[k].length();j++){
	                    game1[0][o] = words[k].charAt(j);    
	                    o=o+1;                    
	                } 
	                //System.out.println(words[k]);
	                o++;
	                ++t;
	                f[k] = 1;
	                hint_orint[Arrays.asList(str1).indexOf(words[k])] = 0;
	                //System.out.println(Arrays.asList(str1).indexOf(words[k]));
	                //System.out.println(hint_orint[Arrays.asList(str1).indexOf(words[k])]);
	                //System.out.println(f[k]);
	                
	            }else{
	                for(i=0;i<(o-1);i++){
	                    if(game1[0][i]==words[k].charAt(0) && !list.contains(i)){
	                        //System.out.println("v");
	                        for(j=1;j<words[k].length();j++){
	                            game1[j][i] = words[k].charAt(j); 
	                            if(j>h){  h=j;  }
	                        }
	                        //System.out.println(words[k]);
	                      f[k] = 1;
	                      hint_orint[Arrays.asList(str1).indexOf(words[k])] = 1;
	                      //System.out.println(Arrays.asList(str1).indexOf(words[k]));
	                      //System.out.println(hint_orint[Arrays.asList(str1).indexOf(words[k])]);
	                      //System.out.println(f[k]);
	                      list.add(i);
	                      ++t;
	                      break;
	                    }
	                   
	                }
	                
	                if(f[k]==0){
	                    x[n]= words[k];
	                    //System.out.println(x[n]);
	                    //System.out.println(f[k]);
	                    n++;
	                }
	            }
	            //System.out.println(f[k]);
	        }
	        
	        //System.out.println(x.length);
	        
	      
	        
	        for(i=(n/2);i<n;i++){
	            for(int k=(o-2);k>=0;k--){
	               if(!list.contains(k) && x[i]!=null){
	                    
	                    for(j=1;j<=x[i].length();j++){
	                    game1[j+1][k] = x[i].charAt(j-1);
	                    if(j+1>h){
	                        h=j+1;
	                    }
	                    //System.out.println(x[i].charAt(j));
	                }
	                  //System.out.println(x[i]); 
	                  hint_orint[Arrays.asList(str1).indexOf(x[i])] = 1;
	                  //System.out.println(Arrays.asList(str1).indexOf(x[i]));
	                  //System.out.println(hint_orint[Arrays.asList(str1).indexOf(x[i])]);
	                  ++t;
	                  list.add(k);
	                  break;
	               }
	            }
	        }        
	        
	         for(i=0;i<(n/2);i++){
	            h++;
	            if(h<10 && x[i]!=null){
	                
	                Random rand = new Random();
	                int s = rand.nextInt(10-x[i].length());
	                
	                for(j=0;j<x[i].length();j++){
	                    
	                    game1[h][s] = x[i].charAt(j);
	                    s++;
	                    //System.out.println(x[i].charAt(j));
	                }
	                //System.out.println(x[i]);
	                ++t;
	                hint_orint[Arrays.asList(str1).indexOf(x[i])] = 0;
	                //System.out.println(Arrays.asList(str1).indexOf(x[i]));
	                //System.out.println(hint_orint[Arrays.asList(str1).indexOf(x[i])]);
	            }
	        }
	        
	        
	        
	        for(i =0; i<10;i++){
	            System.out.println();
	            for(j=0;j<10;j++){
	                //System.out.print(i); System.out.print(j);
	                System.out.print(game1[i][j]);
	            }
	      
	        }
	        
	        //System.out.print(i); 
	        //System.out.print(hint.length);        
	        //Printing Hints
	        for(j=0;j<hint.length;j++){
	            
	               // System.out.println(hint_orint[j]);
	            
	        }
	        
	        int len=0;
	        System.out.println("\n\n/*-----Horizontal Word Hints-----*/\n"); 
	        for(j=0;j<hint.length;j++){
	            if(hint_orint[j]==0){
	            	gamehint[len]=hint[j];
	            	len++;
	                System.out.println(hint[j]);
	            }
	        }
	        breakpoint=len-1;
	        System.out.println("\n\n/*-----vertical Word Hints-----*/\n"); 
	        for(j=0;j<hint.length;j++){
	            if(hint_orint[j]==1){
	            	gamehint[len]=hint[j];
	            	len++;
	                System.out.println(hint[j]);
	            }
	        }
	        
	        //System.out.printf("\n\n%d Words are sucessfully generated",t);
	        
	    }
	    
	 
		    
		
	 /* Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame2 frame = new frame2();
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
	public frame2() {
		txta1.setForeground(Color.DARK_GRAY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 10,400,540);
		contentPane = new JPanel();
		contentPane.setLayout(null);
		contentPane.setBackground(Color.LIGHT_GRAY);
		
		JLabel label=new JLabel("TEST");
		label.setBounds(100,100,210,705);
		
		btn =new JButton("Generate Game");
		sub=new JButton("SUBMIT");
		sub.setEnabled(false);
		btn.addActionListener(this);
		btn.setBounds(130,451, 140, 20);
		sub.setBounds(130,481, 140, 20);
		sub.addActionListener(new ActionListener()
				{
			public void actionPerformed(ActionEvent e)
			{
				String str;
				txta2.setText("");
				txta2.append("SOLUTION :"+"\n");
				for(int i=0;i<10;i++)
				{
					str="    ";	
					for(int j=0;j<10;j++)
					{
						str=str.concat(Character.toString(game1[i][j])+" ");
					}
					txta2.append(str+"\n");
					str="";
				
				}
				// CODE FOR MATCHING THE CORRECT ANSWER AND PRODUCING THE RESULT ( put this code above )
				// IF THE ANSWER MATCHES CORRECTLY THEN , flag IS SET TO 1 OTHERWISE IT WILL BE SET TO 0
				int flag=1;
				game2[0][0]=(c1.getText()).charAt(0);
				game2[0][1]=(c2.getText()).charAt(0);
				game2[0][2]=(c3.getText()).charAt(0);
				game2[0][3]=(c4.getText()).charAt(0);
				game2[0][4]=(c5.getText()).charAt(0);
				game2[0][5]=(c6.getText()).charAt(0);
				game2[0][6]=(c7.getText()).charAt(0);
				game2[0][7]=(c8.getText()).charAt(0);
				game2[0][8]=(c9.getText()).charAt(0);
				game2[0][9]=(c10.getText()).charAt(0);
				game2[1][0]=(c11.getText()).charAt(0);
				game2[1][1]=(c12.getText()).charAt(0);
				game2[1][2]=(c13.getText()).charAt(0);
				game2[1][3]=(c14.getText()).charAt(0);
				game2[1][4]=(c15.getText()).charAt(0);
				game2[1][5]=(c16.getText()).charAt(0);
				game2[1][6]=(c17.getText()).charAt(0);
				game2[1][7]=(c18.getText()).charAt(0);
				game2[1][8]=(c19.getText()).charAt(0);
				game2[1][9]=(c20.getText()).charAt(0);
				game2[2][0]=(c21.getText()).charAt(0);
				game2[2][1]=(c22.getText()).charAt(0);
				game2[2][2]=(c23.getText()).charAt(0);
				game2[2][3]=(c24.getText()).charAt(0);
				game2[2][4]=(c25.getText()).charAt(0);
				game2[2][5]=(c26.getText()).charAt(0);
				game2[2][6]=(c27.getText()).charAt(0);
				game2[2][7]=(c28.getText()).charAt(0);
				game2[2][8]=(c29.getText()).charAt(0);
				game2[2][9]=(c30.getText()).charAt(0);
				game2[3][0]=(c31.getText()).charAt(0);
				game2[3][1]=(c32.getText()).charAt(0);
				game2[3][2]=(c33.getText()).charAt(0);
				game2[3][3]=(c34.getText()).charAt(0);
				game2[3][4]=(c35.getText()).charAt(0);
				game2[3][5]=(c36.getText()).charAt(0);
				game2[3][6]=(c37.getText()).charAt(0);
				game2[3][7]=(c38.getText()).charAt(0);
				game2[3][8]=(c39.getText()).charAt(0);
				game2[3][9]=(c40.getText()).charAt(0);
				game2[4][0]=(c41.getText()).charAt(0);
				game2[4][1]=(c42.getText()).charAt(0);
				game2[4][2]=(c43.getText()).charAt(0);
				game2[4][3]=(c44.getText()).charAt(0);
				game2[4][4]=(c45.getText()).charAt(0);
				game2[4][5]=(c46.getText()).charAt(0);
				game2[4][6]=(c47.getText()).charAt(0);
				game2[4][7]=(c48.getText()).charAt(0);
				game2[4][8]=(c49.getText()).charAt(0);
				game2[4][9]=(c50.getText()).charAt(0);
				game2[5][0]=(c51.getText()).charAt(0);
				game2[5][1]=(c52.getText()).charAt(0);
				game2[5][2]=(c53.getText()).charAt(0);
				game2[5][3]=(c54.getText()).charAt(0);
				game2[5][4]=(c55.getText()).charAt(0);
				game2[5][5]=(c56.getText()).charAt(0);
				game2[5][6]=(c57.getText()).charAt(0);
				game2[5][7]=(c58.getText()).charAt(0);
				game2[5][8]=(c59.getText()).charAt(0);
				game2[5][9]=(c60.getText()).charAt(0);
				game2[6][0]=(c61.getText()).charAt(0);
				game2[6][1]=(c62.getText()).charAt(0);
				game2[6][2]=(c63.getText()).charAt(0);
				game2[6][3]=(c64.getText()).charAt(0);
				game2[6][4]=(c65.getText()).charAt(0);
				game2[6][5]=(c66.getText()).charAt(0);
				game2[6][6]=(c67.getText()).charAt(0);
				game2[6][7]=(c68.getText()).charAt(0);
				game2[6][8]=(c69.getText()).charAt(0);
				game2[6][9]=(c70.getText()).charAt(0);
				game2[7][0]=(c71.getText()).charAt(0);
				game2[7][1]=(c72.getText()).charAt(0);
				game2[7][2]=(c73.getText()).charAt(0);
				game2[7][3]=(c74.getText()).charAt(0);
				game2[7][4]=(c75.getText()).charAt(0);
				game2[7][5]=(c76.getText()).charAt(0);
				game2[7][6]=(c77.getText()).charAt(0);
				game2[7][7]=(c78.getText()).charAt(0);
				game2[7][8]=(c79.getText()).charAt(0);
				game2[7][9]=(c80.getText()).charAt(0);
				game2[8][0]=(c81.getText()).charAt(0);
				game2[8][1]=(c82.getText()).charAt(0);
				game2[8][2]=(c83.getText()).charAt(0);
				game2[8][3]=(c84.getText()).charAt(0);
				game2[8][4]=(c85.getText()).charAt(0);
				game2[8][5]=(c86.getText()).charAt(0);
				game2[8][6]=(c87.getText()).charAt(0);
				game2[8][7]=(c88.getText()).charAt(0);
				game2[8][8]=(c89.getText()).charAt(0);
				game2[8][9]=(c90.getText()).charAt(0);
				game2[9][0]=(c91.getText()).charAt(0);
				game2[9][1]=(c92.getText()).charAt(0);
				game2[9][2]=(c93.getText()).charAt(0);
				game2[9][3]=(c94.getText()).charAt(0);
				game2[9][4]=(c95.getText()).charAt(0);
				game2[9][5]=(c96.getText()).charAt(0);
				game2[9][6]=(c97.getText()).charAt(0);
				game2[9][7]=(c98.getText()).charAt(0);
				game2[9][8]=(c99.getText()).charAt(0);
				game2[9][9]=(c100.getText()).charAt(0);
				for(int i=0;i<10;i++)
				{
					for(int j=0;j<10;j++)
					{
						if(game2[i][j]!=game1[i][j])
							flag=0;
					}
				}
//             ----------------------------------------------------------&&&&&&&&&&&&&&&
				sub.setEnabled(false);
				if(flag==1)
					JOptionPane.showMessageDialog(null, "CONGRATS !!!!"+"\n"+"You have solve the puzzle successfully...", "RESULT TIME",JOptionPane.INFORMATION_MESSAGE);
				else
					JOptionPane.showMessageDialog(null, "SORRY !!!!"+"\n"+"You have lost the game...", "RESULT TIME",JOptionPane.INFORMATION_MESSAGE);
			}
				});
		
		
		//txt1.setBounds(11,11,20,20);// test text field
		//txt1.setDocument(new JTextFieldLimit(1));
		// setting input size of all textfields
		c1.setDocument(new JTextFieldLimit(1));

		c2.setDocument(new JTextFieldLimit(1));

		c3.setDocument(new JTextFieldLimit(1));

		c4.setDocument(new JTextFieldLimit(1));

		c5.setDocument(new JTextFieldLimit(1));

		c6.setDocument(new JTextFieldLimit(1));

		c7.setDocument(new JTextFieldLimit(1));

		c8.setDocument(new JTextFieldLimit(1));

		c9.setDocument(new JTextFieldLimit(1));

		c10.setDocument(new JTextFieldLimit(1));

		c11.setDocument(new JTextFieldLimit(1));

		c12.setDocument(new JTextFieldLimit(1));

		c13.setDocument(new JTextFieldLimit(1));

		c14.setDocument(new JTextFieldLimit(1));

		c15.setDocument(new JTextFieldLimit(1));

		c16.setDocument(new JTextFieldLimit(1));

		c17.setDocument(new JTextFieldLimit(1));

		c18.setDocument(new JTextFieldLimit(1));

		c19.setDocument(new JTextFieldLimit(1));

		c20.setDocument(new JTextFieldLimit(1));

		c21.setDocument(new JTextFieldLimit(1));

		c22.setDocument(new JTextFieldLimit(1));

		c23.setDocument(new JTextFieldLimit(1));

		c24.setDocument(new JTextFieldLimit(1));

		c25.setDocument(new JTextFieldLimit(1));

		c26.setDocument(new JTextFieldLimit(1));

		c27.setDocument(new JTextFieldLimit(1));

		c28.setDocument(new JTextFieldLimit(1));

		c29.setDocument(new JTextFieldLimit(1));

		c30.setDocument(new JTextFieldLimit(1));

		c31.setDocument(new JTextFieldLimit(1));

		c32.setDocument(new JTextFieldLimit(1));

		c33.setDocument(new JTextFieldLimit(1));

		c34.setDocument(new JTextFieldLimit(1));

		c35.setDocument(new JTextFieldLimit(1));

		c36.setDocument(new JTextFieldLimit(1));

		c37.setDocument(new JTextFieldLimit(1));

		c38.setDocument(new JTextFieldLimit(1));

		c39.setDocument(new JTextFieldLimit(1));

		c40.setDocument(new JTextFieldLimit(1));

		c41.setDocument(new JTextFieldLimit(1));

		c42.setDocument(new JTextFieldLimit(1));

		c43.setDocument(new JTextFieldLimit(1));

		c44.setDocument(new JTextFieldLimit(1));

		c45.setDocument(new JTextFieldLimit(1));

		c46.setDocument(new JTextFieldLimit(1));

		c47.setDocument(new JTextFieldLimit(1));

		c48.setDocument(new JTextFieldLimit(1));

		c49.setDocument(new JTextFieldLimit(1));

		c50.setDocument(new JTextFieldLimit(1));

		c51.setDocument(new JTextFieldLimit(1));

		c52.setDocument(new JTextFieldLimit(1));

		c53.setDocument(new JTextFieldLimit(1));

		c54.setDocument(new JTextFieldLimit(1));

		c55.setDocument(new JTextFieldLimit(1));

		c56.setDocument(new JTextFieldLimit(1));

		c57.setDocument(new JTextFieldLimit(1));

		c58.setDocument(new JTextFieldLimit(1));

		c59.setDocument(new JTextFieldLimit(1));

		c60.setDocument(new JTextFieldLimit(1));

		c61.setDocument(new JTextFieldLimit(1));

		c62.setDocument(new JTextFieldLimit(1));

		c63.setDocument(new JTextFieldLimit(1));

		c64.setDocument(new JTextFieldLimit(1));

		c65.setDocument(new JTextFieldLimit(1));

		c66.setDocument(new JTextFieldLimit(1));

		c67.setDocument(new JTextFieldLimit(1));

		c68.setDocument(new JTextFieldLimit(1));

		c69.setDocument(new JTextFieldLimit(1));

		c70.setDocument(new JTextFieldLimit(1));

		c71.setDocument(new JTextFieldLimit(1));

		c72.setDocument(new JTextFieldLimit(1));

		c73.setDocument(new JTextFieldLimit(1));

		c74.setDocument(new JTextFieldLimit(1));

		c75.setDocument(new JTextFieldLimit(1));

		c76.setDocument(new JTextFieldLimit(1));

		c77.setDocument(new JTextFieldLimit(1));

		c78.setDocument(new JTextFieldLimit(1));

		c79.setDocument(new JTextFieldLimit(1));

		c80.setDocument(new JTextFieldLimit(1));

		c81.setDocument(new JTextFieldLimit(1));

		c82.setDocument(new JTextFieldLimit(1));

		c83.setDocument(new JTextFieldLimit(1));

		c84.setDocument(new JTextFieldLimit(1));

		c85.setDocument(new JTextFieldLimit(1));

		c86.setDocument(new JTextFieldLimit(1));

		c87.setDocument(new JTextFieldLimit(1));

		c88.setDocument(new JTextFieldLimit(1));

		c89.setDocument(new JTextFieldLimit(1));

		c90.setDocument(new JTextFieldLimit(1));

		c91.setDocument(new JTextFieldLimit(1));

		c92.setDocument(new JTextFieldLimit(1));

		c93.setDocument(new JTextFieldLimit(1));

		c94.setDocument(new JTextFieldLimit(1));

		c95.setDocument(new JTextFieldLimit(1));

		c96.setDocument(new JTextFieldLimit(1));

		c97.setDocument(new JTextFieldLimit(1));

		c98.setDocument(new JTextFieldLimit(1));

		c99.setDocument(new JTextFieldLimit(1));

		c100.setDocument(new JTextFieldLimit(1));
		////
		txta2.setEditable(false);
		scr1.setBounds(11, 221, 180, 200);
		scr2.setBounds(211,221,180,200);
		//contentPane.add(label);
		contentPane.add(btn);
		contentPane.add(sub);
		//contentPane.add(txt1);
		///SETTING BOUNDS FOR GRID UNITS
		c1.setBounds(4,4,39,19);
		c2.setBounds(43,4,39,19);
		c3.setBounds(82,4,39,19);
		c4.setBounds(121,4,39,19);
		c5.setBounds(160,4,39,19);
		c6.setBounds(199,4,39,19);
		c7.setBounds(238,4,39,19);
		c8.setBounds(277,4,39,19);
		c9.setBounds(316,4,39,19);
		c10.setBounds(355,4,39,19);
		c11.setBounds(4,23,39,19);
		c12.setBounds(43,23,39,19);
		c13.setBounds(82,23,39,19);
		c14.setBounds(121,23,39,19);
		c15.setBounds(160,23,39,19);
		c16.setBounds(199,23,39,19);
		c17.setBounds(238,23,39,19);
		c18.setBounds(277,23,39,19);
		c19.setBounds(316,23,39,19);
		c20.setBounds(355,23,39,19);
		c21.setBounds(4,42,39,19);
		c22.setBounds(43,42,39,19);
		c23.setBounds(82,42,39,19);
		c24.setBounds(121,42,39,19);
		c25.setBounds(160,42,39,19);
		c26.setBounds(199,42,39,19);
		c27.setBounds(238,42,39,19);
		c28.setBounds(277,42,39,19);
		c29.setBounds(316,42,39,19);
		c30.setBounds(355,42,39,19);
		c31.setBounds(4,61,39,19);
		c32.setBounds(43,61,39,19);
		c33.setBounds(82,61,39,19);
		c34.setBounds(121,61,39,19);
		c35.setBounds(160,61,39,19);
		c36.setBounds(199,61,39,19);
		c37.setBounds(238,61,39,19);
		c38.setBounds(277,61,39,19);
		c39.setBounds(316,61,39,19);
		c40.setBounds(355,61,39,19);
		c41.setBounds(4,80,39,19);
		c42.setBounds(43,80,39,19);
		c43.setBounds(82,80,39,19);
		c44.setBounds(121,80,39,19);
		c45.setBounds(160,80,39,19);
		c46.setBounds(199,80,39,19);
		c47.setBounds(238,80,39,19);
		c48.setBounds(277,80,39,19);
		c49.setBounds(316,80,39,19);
		c50.setBounds(355,80,39,19);
		c51.setBounds(4,99,39,19);
		c52.setBounds(43,99,39,19);
		c53.setBounds(82,99,39,19);
		c54.setBounds(121,99,39,19);
		c55.setBounds(160,99,39,19);
		c56.setBounds(199,99,39,19);
		c57.setBounds(238,99,39,19);
		c58.setBounds(277,99,39,19);
		c59.setBounds(316,99,39,19);
		c60.setBounds(355,99,39,19);
		c61.setBounds(4,118,39,19);
		c62.setBounds(43,118,39,19);
		c63.setBounds(82,118,39,19);
		c64.setBounds(121,118,39,19);
		c65.setBounds(160,118,39,19);
		c66.setBounds(199,118,39,19);
		c67.setBounds(238,118,39,19);
		c68.setBounds(277,118,39,19);
		c69.setBounds(316,118,39,19);
		c70.setBounds(355,118,39,19);
		c71.setBounds(4,137,39,19);
		c72.setBounds(43,137,39,19);
		c73.setBounds(82,137,39,19);
		c74.setBounds(121,137,39,19);
		c75.setBounds(160,137,39,19);
		c76.setBounds(199,137,39,19);
		c77.setBounds(238,137,39,19);
		c78.setBounds(277,137,39,19);
		c79.setBounds(316,137,39,19);
		c80.setBounds(355,137,39,19);
		c81.setBounds(4,156,39,19);
		c82.setBounds(43,156,39,19);
		c83.setBounds(82,156,39,19);
		c84.setBounds(121,156,39,19);
		c85.setBounds(160,156,39,19);
		c86.setBounds(199,156,39,19);
		c87.setBounds(238,156,39,19);
		c88.setBounds(277,156,39,19);
		c89.setBounds(316,156,39,19);
		c90.setBounds(355,156,39,19);
		c91.setBounds(4,175,39,19);
		c92.setBounds(43,175,39,19);
		c93.setBounds(82,175,39,19);
		c94.setBounds(121,175,39,19);
		c95.setBounds(160,175,39,19);
		c96.setBounds(199,175,39,19);
		c97.setBounds(238,175,39,19);
		c98.setBounds(277,175,39,19);
		c99.setBounds(316,175,39,19);
		c100.setBounds(355,175,39,19);
		/// Adding cross word grid =====
		contentPane.add( c1);
	    contentPane.add( c10);
	    contentPane.add( c100);
	    contentPane.add( c11);
	    contentPane.add( c12);
	    contentPane.add( c13);
	    contentPane.add( c14);
	    contentPane.add( c15);
	    contentPane.add( c16);
	    contentPane.add( c17);
	    contentPane.add( c18);
	    contentPane.add( c19);
	    contentPane.add( c2);
	    contentPane.add( c20);
	    contentPane.add( c21);
	    contentPane.add( c22);
	    contentPane.add( c23);
	    contentPane.add( c24);
	    contentPane.add( c25);
	    contentPane.add( c26);
	    contentPane.add( c27);
	    contentPane.add( c28);
	    contentPane.add( c29);
	    contentPane.add( c3);
	    contentPane.add( c30);
	    contentPane.add( c31);
	    contentPane.add( c32);
	    contentPane.add( c33);
	    contentPane.add( c34);
	    contentPane.add( c35);
	    contentPane.add( c36);
	    contentPane.add( c37);
	    contentPane.add( c38);
	    contentPane.add( c39);
	    contentPane.add( c4);
	    contentPane.add( c40);
	    contentPane.add( c41);
	    contentPane.add( c42);
	    contentPane.add( c43);
	    contentPane.add( c44);
	    contentPane.add( c45);
	    contentPane.add( c46);
	    contentPane.add( c47);
	    contentPane.add( c48);
	    contentPane.add( c49);
	    contentPane.add( c5);
	    contentPane.add( c50);
	    contentPane.add( c51);
	    contentPane.add( c52);
	    contentPane.add( c53);
	    contentPane.add( c54);
	    contentPane.add( c55);
	    contentPane.add( c56);
	    contentPane.add( c57);
	    contentPane.add( c58);
	    contentPane.add( c59);
	    contentPane.add( c6);
	    contentPane.add( c60);
	    contentPane.add( c61);
	    contentPane.add( c62);
	    contentPane.add( c63);
	    contentPane.add( c64);
	    contentPane.add( c65);
	    contentPane.add( c66);
	    contentPane.add( c67);
	    contentPane.add( c68);
	    contentPane.add( c69);
	    contentPane.add( c7);
	    contentPane.add( c70);
	    contentPane.add( c71);
	    contentPane.add( c72);
	    contentPane.add( c73);
	    contentPane.add( c74);
	    contentPane.add( c75);
	    contentPane.add( c76);
	    contentPane.add( c77);
	    contentPane.add( c78);
	    contentPane.add( c79);
	    contentPane.add( c8);
	    contentPane.add( c80);
	    contentPane.add( c81);
	    contentPane.add( c82);
	    contentPane.add( c83);
	    contentPane.add( c84);
	    contentPane.add( c85);
	    contentPane.add( c86);
	    contentPane.add( c87);
	    contentPane.add( c88);
	    contentPane.add( c89);
	    contentPane.add( c9);
	    contentPane.add( c90);
	    contentPane.add( c91);
	    contentPane.add( c92);
	    contentPane.add( c93);
	    contentPane.add( c94);
	    contentPane.add( c95);
	    contentPane.add( c96);
	    contentPane.add( c97);
	    contentPane.add( c98);
	    contentPane.add( c99);
		//#################################
		contentPane.add(scr1);
		contentPane.add(scr2);
		setContentPane(contentPane);
	}

}