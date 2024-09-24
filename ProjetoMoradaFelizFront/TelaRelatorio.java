package ProjetoMoradaFeliz;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.border.BevelBorder;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

public class TelaRelatorio {

	private JFrame frame;
	private JTable table_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaRelatorio window = new TelaRelatorio();
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
	public TelaRelatorio() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 821, 505);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(89, 38, 4));
		panel.setBorder(new MatteBorder(70, 5, 5, 5, (Color) new Color(53, 70, 43)));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Relatório mensal - Hospedagens");
		lblNewLabel.setForeground(new Color(217, 209, 179));
		lblNewLabel.setFont(new Font("Viner Hand ITC", Font.PLAIN, 22));
		lblNewLabel.setBounds(221, 11, 358, 50);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(217, 209, 179));
		panel_1.setBounds(84, 114, 652, 313);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		table_2 = new JTable();
		table_2.setEnabled(false);
		table_2.setModel(new DefaultTableModel(
			new Object[][] {
				{"Thiago Cardoso", "Quarto", "R$ 350"},
				{"Bianca Pereira", "Quarto", "R$ 350"},
				{"Paulo Bezerra", "Cabana", "R$ 550"},
				{"Lucas Gon\u00E7alves", "Trailer", "R$ 250"},
				{"Beatriz Oliveira", "Trailer", "R$ 250"},
				{"Paolla Carosella", "Quarto", "R$ 350"},
				{"J\u00FAlia Pinheiro", "Cabana", "R$ 550"},
				{"Ant\u00F4nio \u00C2ngelo", "Cabana", "R$ 550"},
				{"Francisco Alves", "Trailer", "R$ 250"},
				{"Osias Baptista", "Quarto", "R$ 350"},
				{"J\u00E9ssica Palhares", "Trailer", "R$ 250"},
				{"Renan Carvalho", "Trailer", "R$ 250"},
				{"R\u00F3ger Silva", "Quarto", "R$ 350"},
				{"Giovanni Disperatti", "Cabana", "R$ 550"},
				{"Robson Lopes", "Quarto", "R$  350"},
				{"----------------", "Subtotal:", "R$ 5550,00"},
			},
			new String[] {
				"Nome:", "Reserva:", "Valor:"
			}
		));
		table_2.setSurrendersFocusOnKeystroke(true);
		table_2.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		table_2.setForeground(Color.BLACK);
		table_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		table_2.setBackground(new Color(249, 241, 200));
		table_2.setBounds(165, 31, 319, 256);
		panel_1.add(table_2);
	}
}
