package crossword_puzzle;


import java.awt.BorderLayout;
import java.awt.*;
import java.awt.event.*;

import javax.swing.JFrame;
import javax.swing.*;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class frame1 extends JFrame {

	private JPanel contentPane;
   
    
   
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame1 frame = new frame1();
					frame.setVisible(true);
					frame.setTitle("welcome");
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public frame1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 300);
		JLabel label = new JLabel("Welcome To CrossWord Game");
		JButton btn1=new JButton("START");
		btn1.addActionListener(new ActionListener()  
		{  
		    public void actionPerformed(ActionEvent e)   {
		            frame1.this.setVisible(false);
		            frame2 second=new frame2();
		            second.setVisible(true); // Main Form to show after the Login Form..
		           
		            
		        }
		    });
		btn1.setBounds(150,150,100,40);
		label.setBounds(95,100,210,30);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		contentPane.setBackground(Color.GREEN);
		contentPane.add(label);
		contentPane.add(btn1);
		
		setContentPane(contentPane);
	}

}