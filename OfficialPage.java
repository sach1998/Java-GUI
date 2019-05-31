import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class OfficialPage {

	public JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OfficialPage window = new OfficialPage();
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
	public OfficialPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 473, 386);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("Cyber Crime Bureau");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Trajan Pro", Font.BOLD, 17));
		label.setBounds(10, 11, 437, 29);
		frame.getContentPane().add(label);
		
		JButton btnCheckComplaints = new JButton("CHECK COMPLAINTS");
		btnCheckComplaints.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				viewCompl viewCompl = new viewCompl();
				frame.setVisible(false);
				viewCompl.frame.setVisible(true);
			}
		});
		btnCheckComplaints.setBackground(Color.LIGHT_GRAY);
		btnCheckComplaints.setBounds(147, 85, 165, 23);
		frame.getContentPane().add(btnCheckComplaints);
		
		JButton btnLogout = new JButton("LOGOUT");
		btnLogout.setBackground(Color.LIGHT_GRAY);
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int temp = JOptionPane.showConfirmDialog(null, "Logout?");
				if(temp == JOptionPane.OK_OPTION) {
				Login log = new Login();
				log.frame.setVisible(true);
				log.frame.setLocationRelativeTo(null);
				frame.setVisible(false);
				}
			}
		});
		btnLogout.setBounds(181, 313, 89, 23);
		frame.getContentPane().add(btnLogout);
	}
}
