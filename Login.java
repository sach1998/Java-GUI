import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.*;
import java.awt.event.*;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	public JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;
	JLabel message;
	
	public String user;
	public String pass;
	
	
	public void close()
	{
		//WindowEvent winCloseEvent = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
		//Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winCloseEvent);
	}

	/**
	 * Launch the application.
	 */
	public void login() {
		
		Login ll = new Login();
		ll.setLocationRelativeTo(null);
		ll.setSize(400,400);
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					Image icon = Toolkit.getDefaultToolkit().getImage("F:\\cyber.png");    
					window.frame.setIconImage(icon);
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
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 471, 301);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("Cyber Crime Bureau");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Trajan Pro", Font.BOLD, 17));
		label.setBounds(10, 11, 435, 29);
		frame.getContentPane().add(label);
		
		JLabel lblLogin = new JLabel("LOGIN");
		lblLogin.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogin.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 15));
		lblLogin.setBounds(10, 41, 435, 20);
		frame.getContentPane().add(lblLogin);
		
		JLabel lblNewLabel = new JLabel("User name:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 11));
		lblNewLabel.setBounds(121, 85, 63, 14);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(194, 82, 136, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPassword.setBounds(131, 123, 53, 14);
		frame.getContentPane().add(lblPassword);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(194, 120, 136, 20);
		frame.getContentPane().add(passwordField);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setBackground(Color.LIGHT_GRAY);
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				user = textField.getText();
				pass = passwordField.getText();
				
				if(user.equals("user") && pass.equals("pass"))
				{
					
					OfficialPage op = new OfficialPage();
					op.frame.setLocationRelativeTo(null);
					op.frame.setVisible(true);
					frame.setVisible(false);
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Incorrect username or password", "Error!", JOptionPane.ERROR_MESSAGE);
					 message.setText("Unable to login!!!");
				}
			}
		});
		btnLogin.setBounds(194, 165, 89, 23);
		frame.getContentPane().add(btnLogin);
		
	    message = new JLabel("");
	    message.setForeground(Color.RED);
	    message.setHorizontalAlignment(SwingConstants.CENTER);
		message.setBounds(10, 197, 435, 14);
		frame.getContentPane().add(message);
		
		JButton btnMainMenu = new JButton("Main Menu");
		btnMainMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				main main = new main();
				main.frame.setVisible(true);
				main.frame.setLocationRelativeTo(null);
				frame.setVisible(false);
			}
		});
		btnMainMenu.setBackground(Color.LIGHT_GRAY);
		btnMainMenu.setBounds(183, 228, 111, 23);
		frame.getContentPane().add(btnMainMenu);
		
		
	}
}
