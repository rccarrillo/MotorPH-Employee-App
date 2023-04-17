import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login {

	private JFrame frmMotorph;
	private JPasswordField passwordField;
	private JButton btnLogin;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frmMotorph.setVisible(true);
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
		frmMotorph = new JFrame();
		frmMotorph.setTitle("MotorPH");
		frmMotorph.setBounds(100, 100, 450, 300);
		frmMotorph.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMotorph.getContentPane().setLayout(null);
		
		JLabel lblEmployeeNumber = new JLabel("Employee Number");
		lblEmployeeNumber.setFont(new Font("Nirmala UI", Font.PLAIN, 14));
		lblEmployeeNumber.setBounds(32, 38, 130, 23);
		frmMotorph.getContentPane().add(lblEmployeeNumber);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(177, 37, 226, 29);
		frmMotorph.getContentPane().add(passwordField);
		
		btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			// for string data type (password) only
				String psd=passwordField.getText();
				
				if (psd.equals("password"))  // input "password" to have a successful login
				{
					JOptionPane.showMessageDialog(frmMotorph, "You have successfully logged in.");
				}
				else
				{
					JOptionPane.showMessageDialog(frmMotorph, "Invalid Input.");
				}
			}
		});
		btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnLogin.setBounds(314, 88, 89, 29);
		frmMotorph.getContentPane().add(btnLogin);
	}
}
