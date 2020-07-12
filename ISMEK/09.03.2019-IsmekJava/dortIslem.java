package canEgrisi;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class dortIslem {

	private JFrame frame;
	private JTextField sayi2;
	private JTextField sayi1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					dortIslem window = new dortIslem();
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
	public dortIslem() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"TOPLA", "CIKART", "BOL", "CARP"}));
		comboBox.setBounds(239, 98, 106, 20);
		frame.getContentPane().add(comboBox);
		
		sayi2 = new JTextField();
		sayi2.setBounds(143, 98, 86, 20);
		frame.getContentPane().add(sayi2);
		sayi2.setColumns(10);
		
		sayi1 = new JTextField();
		sayi1.setColumns(10);
		sayi1.setBounds(47, 98, 86, 20);
		frame.getContentPane().add(sayi1);
		
		JLabel lblNewLabel = new JLabel("Say\u0131lar\u0131 Giriniz :");
		lblNewLabel.setBounds(47, 73, 106, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("HESAPLA");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String islemTipi = comboBox.getSelectedItem().toString();
				
				String sayi1Al = sayi1.getText();
				Byte sayi1 = Byte.valueOf(sayi1Al);
				
				String sayi2Al = sayi2.getText();
				Byte sayi2 = Byte.valueOf(sayi2Al);
				
				if(islemTipi == "CIKART") {
					float cikanSonuc = sayi1 - sayi2;
					JOptionPane.showMessageDialog(frame, cikanSonuc + " çýkarma iþlemi baþarýlý.");
				}else if(islemTipi == "TOPLA") {
					float cikanSonuc = sayi1 + sayi2;
					JOptionPane.showMessageDialog(frame, cikanSonuc + " toplama iþlemi baþarýlý.");
				}else if(islemTipi == "BOL") {
					float cikanSonuc = sayi1 / sayi2;
					JOptionPane.showMessageDialog(frame, cikanSonuc + " bölme iþlemi baþarýlý.");
				}else if(islemTipi == "CARP") {
				float cikanSonuc = sayi1 * sayi2;
				JOptionPane.showMessageDialog(frame, cikanSonuc + " çarpma iþlemi baþarýlý.");
			}
		}
		});
		btnNewButton.setBounds(256, 140, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
