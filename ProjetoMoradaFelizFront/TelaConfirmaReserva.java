package ProjetoMoradaFeliz;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.JTextField;
import java.awt.Button;

public class TelaConfirmaReserva {

	private JFrame frame;
	private JTable table;
	private JTable table_1;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaConfirmaReserva window = new TelaConfirmaReserva();
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
	public TelaConfirmaReserva() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 820, 503);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(89, 38, 4));
		panel.setBorder(new MatteBorder(70, 5, 5, 5, (Color) new Color(53, 70, 43)));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		
		JLabel lblNewLabel = new JLabel("Hotel - Fazenda");
		lblNewLabel.setBounds(248, 11, 150, 33);
		lblNewLabel.setForeground(new Color(217, 209, 179));
		lblNewLabel.setFont(new Font("Viner Hand ITC", Font.PLAIN, 20));
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Morada Feliz");
		lblNewLabel_1.setBounds(341, 32, 153, 41);
		lblNewLabel_1.setForeground(new Color(217, 209, 179));
		lblNewLabel_1.setFont(new Font("Viner Hand ITC", Font.PLAIN, 25));
		panel.add(lblNewLabel_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(217, 209, 179));
		panel_1.setBounds(76, 114, 652, 313);
		panel.add(panel_1);
		
		table = new JTable();
		table.setBounds(326, 5, 0, 0);
		panel_1.add(table);
		
		table_1 = new JTable();
		table_1.setBounds(165, 167, 120, -96);
		panel_1.add(table_1);
		
		JLabel lblNewLabel_2 = new JLabel("Adicionar pessoa:");
		lblNewLabel_2.setFont(new Font("Viner Hand ITC", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(85, 29, 111, 14);
		panel_1.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(85, 66, 131, 20);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Nome:");
		lblNewLabel_3.setFont(new Font("Viner Hand ITC", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(29, 71, 46, 14);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("E-mail:");
		lblNewLabel_4.setFont(new Font("Viner Hand ITC", Font.PLAIN, 12));
		lblNewLabel_4.setBounds(29, 124, 46, 14);
		panel_1.add(lblNewLabel_4);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(85, 119, 131, 20);
		panel_1.add(textField_1);
		
		JLabel lblNewLabel_4_1 = new JLabel("CPF:");
		lblNewLabel_4_1.setFont(new Font("Viner Hand ITC", Font.PLAIN, 12));
		lblNewLabel_4_1.setBounds(29, 179, 46, 14);
		panel_1.add(lblNewLabel_4_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(85, 174, 131, 20);
		panel_1.add(textField_2);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("Pessoas:");
		lblNewLabel_4_1_1.setFont(new Font("Viner Hand ITC", Font.PLAIN, 12));
		lblNewLabel_4_1_1.setBounds(29, 236, 111, 14);
		panel_1.add(lblNewLabel_4_1_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(85, 231, 131, 20);
		panel_1.add(textField_3);
		
		JLabel lblNewLabel_2_1 = new JLabel("Adicionar hospedagem:");
		lblNewLabel_2_1.setFont(new Font("Viner Hand ITC", Font.PLAIN, 14));
		lblNewLabel_2_1.setBounds(415, 29, 146, 14);
		panel_1.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("Quarto:");
		lblNewLabel_3_1.setFont(new Font("Viner Hand ITC", Font.PLAIN, 12));
		lblNewLabel_3_1.setBounds(346, 71, 46, 14);
		panel_1.add(lblNewLabel_3_1);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(430, 66, 131, 20);
		panel_1.add(textField_4);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Horário:");
		lblNewLabel_3_1_1.setFont(new Font("Viner Hand ITC", Font.PLAIN, 12));
		lblNewLabel_3_1_1.setBounds(346, 124, 66, 14);
		panel_1.add(lblNewLabel_3_1_1);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(430, 119, 131, 20);
		panel_1.add(textField_5);
		
		JLabel lblNewLabel_4_1_2 = new JLabel("Pagamento:");
		lblNewLabel_4_1_2.setFont(new Font("Viner Hand ITC", Font.PLAIN, 12));
		lblNewLabel_4_1_2.setBounds(346, 179, 120, 14);
		panel_1.add(lblNewLabel_4_1_2);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(430, 174, 131, 20);
		panel_1.add(textField_6);
		
		JLabel lblNewLabel_4_1_2_1 = new JLabel("Período:");
		lblNewLabel_4_1_2_1.setFont(new Font("Viner Hand ITC", Font.PLAIN, 12));
		lblNewLabel_4_1_2_1.setBounds(346, 236, 120, 14);
		panel_1.add(lblNewLabel_4_1_2_1);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(430, 231, 131, 20);
		panel_1.add(textField_7);
	}
}
