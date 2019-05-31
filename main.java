import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.Window;

import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class main extends JFrame {


	public JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					main window = new main();
					Image icon = Toolkit.getDefaultToolkit().getImage("F:\\cyber.png");    
					window.frame.setIconImage(icon);    
					window.frame.setLayout(null);      
					window.frame.setVisible(true);
					window.frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblCyberCrimeBureau = new JLabel("Cyber Crime Bureau");
		lblCyberCrimeBureau.setHorizontalAlignment(SwingConstants.CENTER);
		lblCyberCrimeBureau.setFont(new Font("Trajan Pro", Font.BOLD, 17));
		lblCyberCrimeBureau.setBounds(10, 11, 414, 29);
		frame.getContentPane().add(lblCyberCrimeBureau);
		
		JButton btnLogin = new JButton("LOGIN");
		btnLogin.setFont(new Font("Arial", Font.PLAIN, 11));
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login log = new Login();
				log.login();
				frame.setVisible(false);
			}
		});
		btnLogin.setBackground(Color.LIGHT_GRAY);
		btnLogin.setBounds(175, 227, 89, 23);
		frame.getContentPane().add(btnLogin);
		
		JLabel lblRegisterAComplaint = new JLabel("Register a complaint?");
		lblRegisterAComplaint.setHorizontalAlignment(SwingConstants.CENTER);
		lblRegisterAComplaint.setBounds(20, 51, 404, 14);
		frame.getContentPane().add(lblRegisterAComplaint);
		
		JButton btnRegister = new JButton("REGISTER");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int res = JOptionPane.showConfirmDialog(null, "Do you really want to register a complaint?");
				if(res == JOptionPane.YES_OPTION)
				{
					regForm reg = new regForm();
					reg.regForm1();
					frame.setVisible(false);
				}
				else
				{
					
				}
			}
		});
		btnRegister.setFont(new Font("Arial", Font.PLAIN, 10));
		btnRegister.setBackground(Color.LIGHT_GRAY);
		btnRegister.setBounds(175, 71, 89, 23);
		frame.getContentPane().add(btnRegister);
		
		JLabel lblCheckStatus = new JLabel("Check status");
		lblCheckStatus.setHorizontalAlignment(SwingConstants.CENTER);
		lblCheckStatus.setBounds(20, 131, 404, 14);
		frame.getContentPane().add(lblCheckStatus);
		
		JButton btnClickHere = new JButton("STATUS");
		btnClickHere.setFont(new Font("Arial", Font.PLAIN, 11));
		btnClickHere.setBackground(Color.LIGHT_GRAY);
		btnClickHere.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnClickHere.setBounds(175, 150, 89, 23);
		frame.getContentPane().add(btnClickHere);
		
		JLabel lblCyberSecurityOfficer = new JLabel("Cyber Security Officer Login");
		lblCyberSecurityOfficer.setHorizontalAlignment(SwingConstants.CENTER);
		lblCyberSecurityOfficer.setBounds(10, 210, 414, 14);
		frame.getContentPane().add(lblCyberSecurityOfficer);
	}
}
