import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextPane;
import java.awt.Color;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.Font;
import java.io.Serializable;
import java.util.Hashtable;

import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class viewCompl {

	public JFrame frame;

	/**
	 * Launch the application.
	 */
	
	class compDetails implements Serializable{
		public int ID;
		public String Date;
		public String Time;
		public String Type;
		public String Name;
		public String Mob;
		public String Email;
		public String Address;
	}
	
	
	String all1;
	action a = new action();
	
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					viewCompl window = new viewCompl();
					window.frame.setLocationRelativeTo(null);
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public viewCompl() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 535, 590);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("Cyber Crime Bureau");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Trajan Pro", Font.BOLD, 17));
		label.setBounds(10, 10, 499, 29);
		frame.getContentPane().add(label);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 76, 519, 419);
		frame.getContentPane().add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Baskerville Old Face", Font.PLAIN, 13));
		textArea.setEditable(true);
		scrollPane.setViewportView(textArea);
		
		JLabel lblRegisteredComplaints = new JLabel("REGISTERED COMPLAINTS");
		lblRegisteredComplaints.setFont(new Font("Arial", Font.PLAIN, 12));
		lblRegisteredComplaints.setHorizontalAlignment(SwingConstants.CENTER);
		lblRegisteredComplaints.setBounds(10, 51, 499, 14);
		frame.getContentPane().add(lblRegisteredComplaints);
		
		JButton btnUpdate = new JButton("Update");
			btnUpdate.addActionListener((e) -> {
				all1 = a.viewComplaints();
				textArea.setText(all1);
				textArea.setEditable(true);
				System.out.println(all1);
				});
		btnUpdate.setBackground(Color.LIGHT_GRAY);
		btnUpdate.setBounds(408, 517, 89, 23);
		frame.getContentPane().add(btnUpdate);
	}
}
