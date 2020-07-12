package canEgrisi;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class safak {

	private JFrame frame;
	private JTextField txtOgrenci1;
	private JTextField txtOgrenci2;
	private JTextField txtOgrenci3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					safak window = new safak();
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
	public safak() {
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
		
		JButton btnNewButton = new JButton("HESAPLA");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String ogrenci1Text = txtOgrenci1.getText();
				String ogrenci2Text = txtOgrenci2.getText();
				String ogrenci3Text = txtOgrenci3.getText();
				
				Byte ogrenci1Not = Byte.valueOf(ogrenci1Text);
				Byte ogrenci2Not = Byte.valueOf(ogrenci2Text);
				Byte ogrenci3Not = Byte.valueOf(ogrenci3Text);
				
				float ortalama = (ogrenci1Not + ogrenci2Not + ogrenci3Not) / 3f;
				
				if (ogrenci1Not >= ortalama) {
					JOptionPane.showMessageDialog(frame, "GEÇTÝ");

				}else {
					float kalmaNotu = ortalama - ogrenci1Not;
					JOptionPane.showMessageDialog(frame, kalmaNotu + " puan altýnda KALDI.");
				}
			}
		});
		btnNewButton.setBounds(265, 142, 121, 23);
		frame.getContentPane().add(btnNewButton);
		
		txtOgrenci1 = new JTextField();
		txtOgrenci1.setBounds(216, 49, 170, 20);
		frame.getContentPane().add(txtOgrenci1);
		txtOgrenci1.setColumns(10);
		
		txtOgrenci2 = new JTextField();
		txtOgrenci2.setColumns(10);
		txtOgrenci2.setBounds(216, 80, 170, 20);
		frame.getContentPane().add(txtOgrenci2);
		
		txtOgrenci3 = new JTextField();
		txtOgrenci3.setColumns(10);
		txtOgrenci3.setBounds(216, 111, 170, 20);
		frame.getContentPane().add(txtOgrenci3);
		
		JLabel lblrenciNotu = new JLabel("1. \u00D6\u011Frenci Notu :");
		lblrenciNotu.setBounds(70, 52, 109, 14);
		frame.getContentPane().add(lblrenciNotu);
		
		JLabel lblrenciNotu_1 = new JLabel("2. \u00D6\u011Frenci Notu :");
		lblrenciNotu_1.setBounds(70, 83, 109, 14);
		frame.getContentPane().add(lblrenciNotu_1);
		
		JLabel lblrenciNotu_2 = new JLabel("3. \u00D6\u011Frenci Notu :");
		lblrenciNotu_2.setBounds(70, 114, 109, 14);
		frame.getContentPane().add(lblrenciNotu_2);
	}
}
