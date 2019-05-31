import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;
import javax.swing.JSpinner;

public class regForm {
	

	public JFrame frame;
	private JTextField sub;
	public JTextField doi;
	public JTextField toi;
	public JTextField complaint;
	public JTextField name;
	public JTextField mob;
	public JTextField email;
	public JTextField address;
	public JTextField captcha;
	public JComboBox typecom;
	
	public String date = "";
	public String time = "";
	public Object type="";
	public String name2="";
	public String mob2="";
	public String email2="";
	public String addrss="";
	
	int a[] = {1111,1112,1113}; 
	
	WriteFile wf;
	

	/**
	 * Launch the application.
	 */
	
	
	
	
	public void regForm1() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					regForm window = new regForm();
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
	public regForm() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().setLayout(null);
		
		JLabel lblComplaintRegistrationForm = new JLabel("Complaint Registration Form");
		lblComplaintRegistrationForm.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 16));
		lblComplaintRegistrationForm.setHorizontalAlignment(SwingConstants.CENTER);
		lblComplaintRegistrationForm.setBounds(10, 47, 445, 20);
		frame.getContentPane().add(lblComplaintRegistrationForm);
		
		JLabel label = new JLabel("Cyber Crime Bureau");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Trajan Pro", Font.BOLD, 17));
		label.setBounds(22, 15, 414, 29);
		frame.getContentPane().add(label);
		
		JLabel lblRegistrar = new JLabel("Complaint Details");
		lblRegistrar.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblRegistrar.setBackground(Color.BLUE);
		lblRegistrar.setBounds(10, 79, 110, 14);
		frame.getContentPane().add(lblRegistrar);
		
		JLabel label_1 = new JLabel("__________________________");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setBounds(62, 54, 347, 14);
		frame.getContentPane().add(label_1);
		
		JLabel subject = new JLabel("Subject:");
		subject.setFont(new Font("Arial", Font.PLAIN, 11));
		subject.setBounds(22, 104, 46, 14);
		frame.getContentPane().add(subject);
		
		sub = new JTextField();
		sub.setBounds(141, 101, 198, 20);
		frame.getContentPane().add(sub);
		sub.setColumns(10);
		
		JLabel lblDateOfIncident = new JLabel("Date of Incident:");
		lblDateOfIncident.setFont(new Font("Arial", Font.PLAIN, 11));
		lblDateOfIncident.setBounds(22, 129, 98, 14);
		frame.getContentPane().add(lblDateOfIncident);
		
		doi = new JTextField(20);
		doi.setToolTipText("DD/MM/YYYY");
		doi.setBounds(141, 126, 198, 20);
		frame.getContentPane().add(doi);
		doi.setColumns(10);
		frame.getContentPane().add(doi);
		
		
		JLabel lblddmmyyyy = new JLabel("(DD/MM/YYYY)");
		lblddmmyyyy.setFont(new Font("Arial", Font.PLAIN, 11));
		lblddmmyyyy.setHorizontalAlignment(SwingConstants.CENTER);
		lblddmmyyyy.setBounds(338, 129, 98, 14);
		frame.getContentPane().add(lblddmmyyyy);
		
		JLabel lblTimeOfIncident = new JLabel("Time of Incident:");
		lblTimeOfIncident.setFont(new Font("Arial", Font.PLAIN, 11));
		lblTimeOfIncident.setBounds(22, 154, 98, 14);
		frame.getContentPane().add(lblTimeOfIncident);
		
		toi = new JTextField(20);
		toi.setBounds(141, 151, 198, 20);
		frame.getContentPane().add(toi);
		toi.setColumns(10);
		
		JLabel lblanyFormat = new JLabel("(Any format)");
		lblanyFormat.setFont(new Font("Arial", Font.PLAIN, 11));
		lblanyFormat.setHorizontalAlignment(SwingConstants.CENTER);
		lblanyFormat.setBounds(348, 154, 75, 14);
		frame.getContentPane().add(lblanyFormat);
		
		JLabel lblTypeOfComplaint = new JLabel("Type of Complaint:");
		lblTypeOfComplaint.setFont(new Font("Arial", Font.PLAIN, 11));
		lblTypeOfComplaint.setBounds(22, 185, 98, 14);
		frame.getContentPane().add(lblTypeOfComplaint);
		
		typecom = new JComboBox();
		typecom.setFont(new Font("Arial", Font.PLAIN, 11));
		typecom.setBackground(Color.LIGHT_GRAY);
		typecom.setModel(new DefaultComboBoxModel(new String[] {"Choose anyone", "Identity theft", "Transaction fraud", "Advance fee fraud", "Hacking", "Piracy", "Other"}));
		typecom.setBounds(141, 182, 110, 20);
		frame.getContentPane().add(typecom);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.CYAN);
		panel.setBounds(10, 78, 160, 15);
		frame.getContentPane().add(panel);
		
		JLabel lblPersonalDetails = new JLabel("Personal Details");
		lblPersonalDetails.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblPersonalDetails.setBackground(Color.BLUE);
		lblPersonalDetails.setBounds(10, 301, 110, 14);
		frame.getContentPane().add(lblPersonalDetails);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.CYAN);
		panel_1.setBounds(10, 300, 160, 15);
		frame.getContentPane().add(panel_1);
		
		JLabel lblWriteComplaint = new JLabel("Write Complaint:");
		lblWriteComplaint.setFont(new Font("Arial", Font.PLAIN, 11));
		lblWriteComplaint.setBounds(22, 221, 98, 14);
		frame.getContentPane().add(lblWriteComplaint);
		
		complaint = new JTextField();
		complaint.setBounds(141, 221, 295, 68);
		frame.getContentPane().add(complaint);
		complaint.setColumns(10);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setFont(new Font("Arial", Font.PLAIN, 11));
		lblName.setBounds(22, 329, 46, 14);
		frame.getContentPane().add(lblName);
		
		name = new JTextField("",30);
//		name2 = name.getText();
		name.setBounds(141, 326, 198, 20);
		frame.getContentPane().add(name);
		name.setColumns(10);
		
		JLabel lblMobileNo = new JLabel("Mobile No:");
		lblMobileNo.setFont(new Font("Arial", Font.PLAIN, 11));
		lblMobileNo.setBounds(22, 354, 75, 14);
		frame.getContentPane().add(lblMobileNo);
		
		mob = new JTextField("",10); 
		mob.setBounds(141, 351, 198, 20);
		frame.getContentPane().add(mob);
		mob.setColumns(10);
		
		JLabel lblEmailId = new JLabel("Email id:");
		lblEmailId.setFont(new Font("Arial", Font.PLAIN, 11));
		lblEmailId.setBounds(22, 379, 46, 14);
		frame.getContentPane().add(lblEmailId);
		
		email = new JTextField("",30);
		email.setBounds(141, 376, 198, 20);
		frame.getContentPane().add(email);
		email.setColumns(10);
		
		JLabel lblAddress = new JLabel("Address:");
		lblAddress.setFont(new Font("Arial", Font.PLAIN, 11));
		lblAddress.setBounds(22, 406, 75, 14);
		frame.getContentPane().add(lblAddress);
		
		address = new JTextField(50);
		address.setBounds(141, 407, 295, 42);
		frame.getContentPane().add(address);
		address.setColumns(10);
		
		JLabel lblEnterCaptcha = new JLabel("Enter CAPTCHA:");
		lblEnterCaptcha.setFont(new Font("Arial", Font.PLAIN, 11));
		lblEnterCaptcha.setBounds(22, 545, 98, 14);
		frame.getContentPane().add(lblEnterCaptcha);
		
		captcha = new JTextField(10);
		captcha.setBounds(141, 542, 198, 20);
		frame.getContentPane().add(captcha);
		captcha.setColumns(10);
		
		JLabel lblCaptcha = new JLabel("CAPTCHA");
		Image img = new ImageIcon(this.getClass().getResource("/captcha.jpg")).getImage();
		lblCaptcha.setIcon(new ImageIcon(img));
		lblCaptcha.setFont(new Font("Arial", Font.PLAIN, 11));
		lblCaptcha.setBounds(141, 464, 268, 51);
		frame.getContentPane().add(lblCaptcha);
		
		JLabel label_2 = new JLabel("");
		label_2.setBounds(197, 682, 46, 14);
		frame.getContentPane().add(label_2);
		frame.setBounds(100, 100, 481, 746);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setFont(new Font("Arial", Font.PLAIN, 11));
		btnSubmit.addActionListener((e) -> {
			date = doi.getText();
			time = toi.getText();
			type = typecom.getSelectedItem();
			name2 = name.getText();
			mob2 = mob.getText().toString();
			email2 = email.getText().toString();
			addrss = address.getText();
			label_2.setText(name2);
			Random rand = new Random();
			int id = rand.nextInt(10000);
			action a = new action(id,date,time,type,name2,mob2,email2,addrss);
			a.takeComp();
     		a.writeFile();
			submitAction1();
		});
//		btnSubmit.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				main m = new main();
//				action a = new action();
//				a.takeComp();
//				a.writeFile();
//				WriteFile www = new WriteFile(date,time,type,name2,mob2,email2,addrss);
//				test t = new test();
//				name2 = name.getName();
////				t.name;
////			    www.WriteFile(date,time,type,name2,mob2,email2,addrss);
//          //	www.coml();
//				
//				m.frame.setVisible(true);
//				//frame.setVisible(false);
//				
//				
//			}
//		});
		btnSubmit.setBackground(Color.LIGHT_GRAY);
		btnSubmit.setBounds(197, 604, 89, 23);
		frame.getContentPane().add(btnSubmit);
		
		JButton btnAbort = new JButton("Abort");
		btnAbort.setFont(new Font("Arial", Font.PLAIN, 11));
		btnAbort.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main main = new main();
				main.frame.setVisible(true);
				main.frame.setLocationRelativeTo(null);
				frame.setVisible(false);
			}
		});
		btnAbort.setBackground(Color.LIGHT_GRAY);
		btnAbort.setBounds(348, 653, 75, 23);
		frame.getContentPane().add(btnAbort);
		
		JLabel lblOr = new JLabel((String) null);
		lblOr.setHorizontalAlignment(SwingConstants.CENTER);
		lblOr.setBounds(218, 628, 46, 29);
		frame.getContentPane().add(lblOr);
		
		JLabel lblNewLabel = new JLabel("To cancel Registration press this button");
		lblNewLabel.setFont(new Font("SansSerif", Font.PLAIN, 11));
		lblNewLabel.setBounds(141, 657, 198, 14);
		frame.getContentPane().add(lblNewLabel);
		
	}
	
	

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	

	public void submitAction1()
	{
		
		
		main m = new main();
		
//		
//		WriteFile www = new WriteFile();
//		test t = new test();
		
//		
		
		m.frame.setVisible(true);
		//frame.setVisible(false);
	}
}

