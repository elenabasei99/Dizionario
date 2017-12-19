package VIEW;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;

public class Finestra extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JComboBox comboBox;
	private JLabel lblInserisciTermine;
	private JTextField textField;
	private JLabel lblInserisciLinguaggio;
	private JComboBox comboBox_1;
	private JLabel lblInserisciLaLingua;
	private JLabel lblTraduzione;
	private JLabel lblParolaTradotta;
	private JButton btnTraduci;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Finestra frame = new Finestra();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Finestra() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 586, 451);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("TRADUTTORE");
		lblNewLabel.setForeground(new Color(0, 51, 255));
		lblNewLabel.setFont(new Font("Gisha", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(163, 11, 224, 76);
		contentPane.add(lblNewLabel);
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"italiano", "inglese", "russo", "tedesco", "francese"}));
		comboBox.setBounds(173, 152, 120, 20);
		contentPane.add(comboBox);
		
		lblInserisciTermine = new JLabel("Inserisci termine da tradurre:");
		lblInserisciTermine.setBounds(10, 98, 158, 14);
		contentPane.add(lblInserisciTermine);
		
		textField = new JTextField();
		textField.setBounds(173, 98, 120, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		lblInserisciLinguaggio = new JLabel("Linguaggio di traduzione:");
		lblInserisciLinguaggio.setBounds(10, 206, 158, 14);
		contentPane.add(lblInserisciLinguaggio);
		
		comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"italiano", "inglese", "russo", "tedesco", "francese"}));
		comboBox_1.setBounds(173, 206, 120, 20);
		contentPane.add(comboBox_1);
		
		lblInserisciLaLingua = new JLabel("Inserisci la lingua del termine:");
		lblInserisciLaLingua.setBounds(10, 152, 158, 14);
		contentPane.add(lblInserisciLaLingua);
		
		lblTraduzione = new JLabel("Traduzione:");
		lblTraduzione.setBounds(10, 260, 158, 14);
		contentPane.add(lblTraduzione);
		
		lblParolaTradotta = new JLabel("");
		lblParolaTradotta.setBounds(173, 260, 120, 14);
		contentPane.add(lblParolaTradotta);
		
		btnTraduci = new JButton("Traduci");
		btnTraduci.setBounds(120, 314, 89, 23);
		contentPane.add(btnTraduci);
	}
}
