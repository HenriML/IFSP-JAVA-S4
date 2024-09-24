package ProjetoMoradaFeliz;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.BevelBorder;

public class TelaCrudOperador {

	private JFrame frame;
	private JTable table_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCrudOperador window = new TelaCrudOperador();
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
	public TelaCrudOperador() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 824, 507);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(89, 38, 4));
		panel.setBorder(new MatteBorder(70, 5, 5, 5, (Color) new Color(53, 70, 43)));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Hotel - Fazenda");
		lblNewLabel.setForeground(new Color(217, 209, 179));
		lblNewLabel.setFont(new Font("Viner Hand ITC", Font.PLAIN, 20));
		lblNewLabel.setBounds(249, 11, 155, 24);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Morada Feliz");
		lblNewLabel_1.setForeground(new Color(217, 209, 179));
		lblNewLabel_1.setFont(new Font("Viner Hand ITC", Font.PLAIN, 25));
		lblNewLabel_1.setBounds(340, 41, 183, 24);
		panel.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Adicionar Reserva");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(10, 125, 167, 35);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Remover Reserva");
		btnNewButton_1.setBounds(10, 195, 167, 35);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Editar Reserva");
		btnNewButton_2.setBounds(10, 273, 167, 35);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Listar Reserva");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_3.setBounds(10, 350, 167, 35);
		panel.add(btnNewButton_3);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(217, 209, 179));
		panel_1.setBounds(239, 97, 522, 313);
		panel.add(panel_1);
		
		table_2 = new JTable();
		table_2.setEnabled(false);
		table_2.setSurrendersFocusOnKeystroke(true);
		table_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		table_2.setForeground(new Color(0, 0, 0));
		table_2.setModel(new DefaultTableModel(
			new Object[][] {
				{"Tiago Cardoso", "03/02/2023", "Quarto", "1"},
				{"Bianca Pereira", "07/03/2023", "Quarto", "2"},
				{"Paulo Bezerra", "14/02/2023", "Cabana", "3"},
				{"Lucas Gon\u00E7alves", "21/02/2023", "Trailer", "1"},
				{"Beatriz Oliveira", "28/02/2023", "Trailer", "3"},
				{"Paola Carosella", "31/01/2023", "Quarto", "2"},
				{"J\u00FAlia Pinheiro", "15/02/2023", "Cabana", "1"},
				{"Ant\u00F4nio Angelo", "08/03/2023", "Cabana", "2"},
				{"Francisco Alves", "12/02/2023", "Trailer", "2"},
				{"Osias Baptista", "24/03/2023", "Quarto", "2"},
				{"J\u00E9ssica Palhares", "18/02/2023", "Trailer", "1"},
				{"Renan Carvalho", "22/02/2023", "Trailer", "3"},
				{"R\u00F3ger Silva", "13/02/2023", "Quarto", "2"},
				{"Giovanni Disperati", "08/03/2023", "Cabana", "2"},
				{"Robson Lopes", "24/03/2023", "Quarto", "2"},
			},
			new String[] {
				"Nome:", "Data", "Reserva", "Qtd:"
			}
		));
		table_2.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		table_2.setBackground(new Color(249, 241, 200));
		table_2.setBounds(27, 45, 471, 240);
		panel_1.add(table_2);
		
		JLabel lblNewLabel_2 = new JLabel("Nome:");
		lblNewLabel_2.setFont(new Font("Viner Hand ITC", Font.PLAIN, 11));
		lblNewLabel_2.setBounds(44, 20, 62, 14);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Data:");
		lblNewLabel_2_1.setFont(new Font("Viner Hand ITC", Font.PLAIN, 11));
		lblNewLabel_2_1.setBounds(151, 20, 62, 14);
		panel_1.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Hospedagem:");
		lblNewLabel_2_2.setFont(new Font("Viner Hand ITC", Font.PLAIN, 11));
		lblNewLabel_2_2.setBounds(274, 20, 74, 14);
		panel_1.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_3 = new JLabel("Pessoas:");
		lblNewLabel_2_3.setFont(new Font("Viner Hand ITC", Font.PLAIN, 11));
		lblNewLabel_2_3.setBounds(401, 20, 62, 14);
		panel_1.add(lblNewLabel_2_3);
	}
}
