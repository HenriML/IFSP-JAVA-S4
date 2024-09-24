package ProjetoMoradaFeliz;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

public class TelaCrudAdmin {

	private JFrame frame;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField;
	private JTextField textField_1;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCrudAdmin window = new TelaCrudAdmin();
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
	public TelaCrudAdmin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 821, 506);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(89, 38, 4));
		panel.setForeground(new Color(128, 128, 64));
		panel.setBorder(new MatteBorder(70, 5, 5, 5, (Color) new Color(53, 70, 43)));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Hotel - Fazenda");
		lblNewLabel.setBounds(253, 11, 150, 33);
		lblNewLabel.setForeground(new Color(217, 209, 179));
		lblNewLabel.setFont(new Font("Viner Hand ITC", Font.PLAIN, 20));
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Morada Feliz");
		lblNewLabel_1.setBounds(343, 35, 153, 41);
		lblNewLabel_1.setForeground(new Color(217, 209, 179));
		lblNewLabel_1.setFont(new Font("Viner Hand ITC", Font.PLAIN, 25));
		panel.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Add Operador");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(549, 79, 122, 33);
		panel.add(btnNewButton);
		
		JButton btnRemovOperador = new JButton("Remov. Operador");
		btnRemovOperador.setBounds(673, 79, 122, 33);
		panel.add(btnRemovOperador);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(217, 209, 179));
		panel_1.setBounds(70, 120, 652, 313);
		panel.add(panel_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(470, 239, 144, 20);
		panel_1.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(470, 68, 144, 20);
		panel_1.add(textField_3);
		
		JLabel lblNewLabel_2_1 = new JLabel("Adicionar operador:");
		lblNewLabel_2_1.setFont(new Font("Viner Hand ITC", Font.PLAIN, 14));
		lblNewLabel_2_1.setBounds(415, 21, 139, 14);
		panel_1.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_3 = new JLabel("Nome:");
		lblNewLabel_3.setFont(new Font("Viner Hand ITC", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(366, 73, 46, 14);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("E-mail:");
		lblNewLabel_4.setFont(new Font("Viner Hand ITC", Font.PLAIN, 12));
		lblNewLabel_4.setBounds(366, 187, 46, 14);
		panel_1.add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("Cadastro:");
		lblNewLabel_4_1.setFont(new Font("Viner Hand ITC", Font.PLAIN, 12));
		lblNewLabel_4_1.setBounds(366, 127, 117, 14);
		panel_1.add(lblNewLabel_4_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(470, 182, 144, 20);
		panel_1.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(470, 122, 144, 20);
		panel_1.add(textField_1);
		
		JLabel lblNewLabel_4_2 = new JLabel("Telefone:");
		lblNewLabel_4_2.setFont(new Font("Viner Hand ITC", Font.PLAIN, 12));
		lblNewLabel_4_2.setBounds(366, 244, 76, 14);
		panel_1.add(lblNewLabel_4_2);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"admin", "1", "admin@hotmail.com", "4002-8922"},
				{"Guilherme", "2", "gui@hotmail.com", "4002-8923"},
				{"Sabrina", "3", "sa@hotmail.com", "4002-8924"},
				{"Lorrayne", "4", "lo@hotmail.com", "4002-8925"},
			},
			new String[] {
				"Nome:", "Cadastro:", "E-mail:", "Telefone:"
			}
		));
		table.setSurrendersFocusOnKeystroke(true);
		table.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		table.setForeground(Color.BLACK);
		table.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		table.setBackground(new Color(249, 241, 200));
		table.setBounds(38, 137, 269, 64);
		panel_1.add(table);
		
		JLabel lblNewLabel_2 = new JLabel("Nome:");
		lblNewLabel_2.setFont(new Font("Viner Hand ITC", Font.PLAIN, 11));
		lblNewLabel_2.setBounds(38, 112, 62, 14);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_2 = new JLabel("Cadastro:");
		lblNewLabel_2_2.setFont(new Font("Viner Hand ITC", Font.PLAIN, 11));
		lblNewLabel_2_2.setBounds(110, 112, 62, 14);
		panel_1.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_3 = new JLabel("E-mail:");
		lblNewLabel_2_3.setFont(new Font("Viner Hand ITC", Font.PLAIN, 11));
		lblNewLabel_2_3.setBounds(182, 112, 62, 14);
		panel_1.add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_2_4 = new JLabel("Telefone:");
		lblNewLabel_2_4.setFont(new Font("Viner Hand ITC", Font.PLAIN, 11));
		lblNewLabel_2_4.setBounds(245, 112, 62, 14);
		panel_1.add(lblNewLabel_2_4);
		
		JButton btnHospedagens = new JButton("Hospedagens");
		btnHospedagens.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnHospedagens.setBounds(425, 79, 122, 33);
		panel.add(btnHospedagens);
	}
}


