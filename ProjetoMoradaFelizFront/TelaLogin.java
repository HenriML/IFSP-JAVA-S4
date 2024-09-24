package ProjetoMoradaFeliz;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JRadioButton;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

public class TelaLogin {

	private JFrame frame;
	private JPasswordField passwordField;
	private static JTextField username;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaLogin window = new TelaLogin();
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
	public TelaLogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 256, 396);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(43, 67, 39));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(217, 209, 179));
		panel_1.setBounds(23, 11, 195, 335);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		passwordField = new JPasswordField();
		passwordField.setForeground(new Color(0, 0, 0));
		passwordField.setToolTipText("Senha...");
		passwordField.setBackground(new Color(214, 214, 214));
		passwordField.setBounds(43, 204, 121, 24);
		panel_1.add(passwordField);
		
		JLabel lblNewLabel = new JLabel("Morada  Feliz");
		lblNewLabel.setForeground(new Color(128, 64, 0));
		lblNewLabel.setFont(new Font("Viner Hand ITC", Font.PLAIN, 18));
		lblNewLabel.setBounds(43, 34, 142, 24);
		panel_1.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Entrar");
		btnNewButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setForeground(new Color(58, 79, 57));
		btnNewButton.setBackground(new Color(128, 64, 0));
		btnNewButton.setFont(new Font("Viner Hand ITC", Font.PLAIN, 11));
		btnNewButton.setBounds(67, 265, 67, 24);
		panel_1.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("Senha:");
		lblNewLabel_1.setFont(new Font("Viner Hand ITC", Font.PLAIN, 11));
		lblNewLabel_1.setBounds(43, 179, 46, 14);
		panel_1.add(lblNewLabel_1);
		
		// Username TextField constructor
		username = new JTextField();
		username.setBackground(new Color(214, 214, 214));
		username.setBounds(43, 129, 121, 24);
		panel_1.add(username);
		
		JLabel lblNewLabel_1_1 = new JLabel("E-mail:");
		lblNewLabel_1_1.setFont(new Font("Viner Hand ITC", Font.PLAIN, 11));
		lblNewLabel_1_1.setBounds(43, 104, 46, 14);
		panel_1.add(lblNewLabel_1_1);
	}

}
