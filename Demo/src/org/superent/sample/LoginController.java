package org.superent.sample;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//import javax.swing.JFrame;
import javax.swing.UIManager;

public class LoginController implements ActionListener {

	//private JFrame j;
	private Login l;
	private SystemAdmin sa;
	
	//@Override
	public void actionPerformed(ActionEvent e) {
		/**
		 *  verify the user is a system administrator 
		 */
		if (true){
			if(e.getActionCommand().equals("Login")) {
				l.dispose();
				sa = new SystemAdmin();
				sa.setVisible(true);
			}
			
			if(e.getActionCommand().equals("Log Out")) {
				/* verify the user is a system administrator */
				sa.dispose();
				l = new Login();
				l.setVisible(true);
			}
		}
	}	
		public LoginController(Login l) {	
			this.l = l;				
		}
		/*
		public LoginController(Home h) {	
			this.h = h;				
		}*/
		
		public LoginController(SystemAdmin sa){
			this.sa = sa;
		}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		 try {
	            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
	        } catch(Exception e) {
	            e.printStackTrace();
	        }
	        
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login l = new Login();
					//LoginController lc = new LoginController(l);
					l.setVisible(true);					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}

}
