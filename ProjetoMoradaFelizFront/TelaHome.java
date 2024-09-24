package ProjetoMoradaFeliz;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.MatteBorder;

public class TelaHome {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaHome window = new TelaHome();
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
	public TelaHome() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 805, 492);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(70, 5, 5, 5, (Color) new Color(53, 70, 43)));
		panel.setBackground(new Color(89, 38, 4));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		Image img = new ImageIcon(this.getClass() .getResource("/transferir.jpg")).getImage();
		
		JButton btnNewButton = new JButton("Alu. Quarto");
		Image img = new ImageIcon(this.getClass() .getResource("/quarto.jpg")).getImage();
		btnNewButton.setIcon(new ImageIcon(img));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(113, 147, 116, 144);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("Hotel - Fazenda");
		lblNewLabel_1.setForeground(new Color(217, 209, 179));
		lblNewLabel_1.setBackground(new Color(41, 62, 32));
		lblNewLabel_1.setFont(new Font("Viner Hand ITC", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(252, 11, 195, 31);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Morada Feliz");
		lblNewLabel_1_1.setForeground(new Color(226, 216, 192));
		lblNewLabel_1_1.setFont(new Font("Viner Hand ITC", Font.PLAIN, 25));
		lblNewLabel_1_1.setBounds(340, 38, 159, 31);
		panel.add(lblNewLabel_1_1);
		
		JButton btnAluCabana = new JButton("Alu. Cabana");
		Image img = new ImageIcon(this.getClass() .getResource("/cabana.jpg")).getImage();
		btnAluCabana.setIcon(new ImageIcon(img));
		btnAluCabana.setVerticalAlignment(SwingConstants.TOP);
		btnAluCabana.setBounds(314, 147, 116, 144);
		panel.add(btnAluCabana);
		
		JButton btnAluChal = new JButton("Alu. Trailer");
		Image img = new ImageIcon(this.getClass() .getResource("/trailer.jpg")).getImage();
		btnAluChal.setIcon(new ImageIcon(img));
		btnAluChal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAluChal.setVerticalAlignment(SwingConstants.TOP);
		btnAluChal.setBounds(522, 147, 116, 144);
		panel.add(btnAluChal);
		
		JLabel lblNewLabel_2 = new JLabel("- Ar - condicionado");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(113, 340, 116, 20);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("- Suíte");
		lblNewLabel_2_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2_1.setBounds(113, 302, 100, 20);
		panel.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("- WIFI");
		lblNewLabel_2_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2_2.setBounds(113, 322, 91, 20);
		panel.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_3 = new JLabel("- Serviço de quarto");
		lblNewLabel_2_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_2_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2_3.setBounds(113, 360, 116, 20);
		panel.add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_2_4 = new JLabel("- Café da manhã incluso");
		lblNewLabel_2_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_2_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2_4.setBounds(113, 381, 134, 20);
		panel.add(lblNewLabel_2_4);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("- Suíte");
		lblNewLabel_2_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2_1_1.setBounds(314, 305, 100, 20);
		panel.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_1_2 = new JLabel("- Cama casal king size");
		lblNewLabel_2_1_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2_1_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2_1_2.setBounds(314, 325, 133, 20);
		panel.add(lblNewLabel_2_1_2);
		
		JLabel lblNewLabel_2_1_3 = new JLabel("- Lareira");
		lblNewLabel_2_1_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_2_1_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2_1_3.setBounds(314, 343, 100, 20);
		panel.add(lblNewLabel_2_1_3);
		
		JLabel lblNewLabel_2_1_4 = new JLabel("- Copa gourmet");
		lblNewLabel_2_1_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_2_1_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2_1_4.setBounds(314, 363, 100, 20);
		panel.add(lblNewLabel_2_1_4);
		
		JLabel lblNewLabel_2_1_5 = new JLabel("- Duas camas solteiro");
		lblNewLabel_2_1_5.setForeground(new Color(255, 255, 255));
		lblNewLabel_2_1_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2_1_5.setBounds(314, 384, 133, 20);
		panel.add(lblNewLabel_2_1_5);
		
		JLabel lblNewLabel_2_1_6 = new JLabel("- Ar condicionado");
		lblNewLabel_2_1_6.setForeground(new Color(255, 255, 255));
		lblNewLabel_2_1_6.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2_1_6.setBounds(522, 340, 100, 20);
		panel.add(lblNewLabel_2_1_6);
		
		JLabel lblNewLabel_2_1_7 = new JLabel("- Cama de casal");
		lblNewLabel_2_1_7.setForeground(new Color(255, 255, 255));
		lblNewLabel_2_1_7.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2_1_7.setBounds(522, 322, 100, 20);
		panel.add(lblNewLabel_2_1_7);
		
		JLabel lblNewLabel_2_1_8 = new JLabel("- Cozinha");
		lblNewLabel_2_1_8.setForeground(new Color(255, 255, 255));
		lblNewLabel_2_1_8.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2_1_8.setBounds(522, 302, 100, 20);
		panel.add(lblNewLabel_2_1_8);
		
		JLabel lblNewLabel_2_1_9 = new JLabel("- Varanda com tenda");
		lblNewLabel_2_1_9.setForeground(new Color(255, 255, 255));
		lblNewLabel_2_1_9.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2_1_9.setBounds(522, 360, 122, 20);
		panel.add(lblNewLabel_2_1_9);
		
		JLabel lblNewLabel_2_1_10 = new JLabel("- Café da manhã incluso");
		lblNewLabel_2_1_10.setForeground(new Color(255, 255, 255));
		lblNewLabel_2_1_10.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2_1_10.setBounds(522, 381, 134, 20);
		panel.add(lblNewLabel_2_1_10);
		
		JLabel lblNewLabel_2_1_11 = new JLabel("Duas Pessoas");
		lblNewLabel_2_1_11.setForeground(new Color(255, 255, 255));
		lblNewLabel_2_1_11.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2_1_11.setBounds(113, 116, 91, 20);
		panel.add(lblNewLabel_2_1_11);
		
		JLabel lblNewLabel_2_1_12 = new JLabel("Quatro Pessoas");
		lblNewLabel_2_1_12.setForeground(new Color(255, 255, 255));
		lblNewLabel_2_1_12.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2_1_12.setBounds(314, 116, 100, 20);
		panel.add(lblNewLabel_2_1_12);
		
		JLabel lblNewLabel_2_1_13 = new JLabel("Duas Pessoas");
		lblNewLabel_2_1_13.setForeground(new Color(255, 255, 255));
		lblNewLabel_2_1_13.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2_1_13.setBounds(522, 119, 83, 20);
		panel.add(lblNewLabel_2_1_13);
		
		JLabel lblNewLabel_2_1_14 = new JLabel("R$ 350");
		lblNewLabel_2_1_14.setForeground(new Color(255, 255, 255));
		lblNewLabel_2_1_14.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2_1_14.setBounds(186, 294, 43, 20);
		panel.add(lblNewLabel_2_1_14);
		
		JLabel lblNewLabel_2_1_14_1 = new JLabel("R$ 550");
		lblNewLabel_2_1_14_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_2_1_14_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2_1_14_1.setBounds(389, 294, 51, 20);
		panel.add(lblNewLabel_2_1_14_1);
		
		JLabel lblNewLabel_2_1_14_2 = new JLabel("R$ 250");
		lblNewLabel_2_1_14_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2_1_14_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2_1_14_2.setBounds(601, 294, 43, 20);
		panel.add(lblNewLabel_2_1_14_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(128, 128, 0));
		panel_1.setBounds(108, 75, 96, -46);
		panel.add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
	}

}
