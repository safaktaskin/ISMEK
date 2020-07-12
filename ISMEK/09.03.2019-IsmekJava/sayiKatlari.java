package canEgrisi;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class sayiKatlari {

	private JFrame frame;
	private JTextField kullanicidanAlinacakSayi;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					sayiKatlari window = new sayiKatlari();
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
	public sayiKatlari() {
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
		
		kullanicidanAlinacakSayi = new JTextField();
		kullanicidanAlinacakSayi.setBounds(203, 39, 157, 20);
		frame.getContentPane().add(kullanicidanAlinacakSayi);
		kullanicidanAlinacakSayi.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Sayi Giriniz: ");
		lblNewLabel.setBounds(85, 42, 92, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("SONU\u00C7");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sayiyiAl = kullanicidanAlinacakSayi.getText();
				Byte kullanicidanAlinacakSayi = Byte.valueOf(sayiyiAl);
				
				if(kullanicidanAlinacakSayi >= 0 && kullanicidanAlinacakSayi <= 50) {
					if(kullanicidanAlinacakSayi % 2 == 0) {
						JOptionPane.showMessageDialog(frame, "2'nin katýdýr.");
					}
					else if(kullanicidanAlinacakSayi % 3 == 0) {
						JOptionPane.showMessageDialog(frame, "3'nin katýdýr.");
					}
					else if(kullanicidanAlinacakSayi % 4 == 0) {
						JOptionPane.showMessageDialog(frame, "4'nin katýdýr.");
					}
					else if(kullanicidanAlinacakSayi % 5 == 0) {
						JOptionPane.showMessageDialog(frame, "5'nin katýdýr.");
					}
					else {
						JOptionPane.showMessageDialog(frame, "Girdiðiniz sayýnýn katý yoktur.");
					}
				}
				else {
					JOptionPane.showMessageDialog(frame, "Girdiðiniz sayý 0 ve 50 arasýnda deðildir.");
				}
				
				
			}
		});
		btnNewButton.setBounds(271, 70, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}

}
