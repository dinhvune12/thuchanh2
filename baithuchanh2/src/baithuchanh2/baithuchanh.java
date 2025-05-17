package baithuchanh2;

import java.awt.EventQueue;
import java.awt.Window;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class baithuchanh {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					baithuchanh window = new baithuchanh();
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
	public baithuchanh() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 888, 572);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("chucnang1");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 chucnang1 x = new chucnang1();
			        x.setVisible(true); 
			}
		});
		btnNewButton.setBounds(59, 271, 85, 21);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("chucnang2");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 chucnang2 x = new chucnang2();
			        x.setVisible(true); 
			}
		});
		btnNewButton_1.setBounds(261, 271, 85, 21);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("chucnang3");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 chucnang3 x = new chucnang3();
			        x.setVisible(true); 
			}
		});
		btnNewButton_2.setBounds(464, 271, 85, 21);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("chucnang4");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				chucnang4 x = new chucnang4();
		        x.setVisible(true); 
			}
		});
		btnNewButton_3.setBounds(660, 271, 85, 21);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("minhkhoa");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 chucnang5 x = new chucnang5();
			        x.setVisible(true); 
			}
		});
		btnNewButton_4.setBounds(72, 352, 85, 21);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("minhkhoa");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				chucnang6 x = new chucnang6();
		        x.setVisible(true); 
			}
		});
		btnNewButton_5.setBounds(261, 352, 85, 21);
		frame.getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("chucnang7");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				chucnang7 x = new chucnang7();
		        x.setVisible(true); 
			}
		});
		btnNewButton_6.setBounds(464, 352, 85, 21);
		frame.getContentPane().add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("chucnang8");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				chucnang8 x = new chucnang8();
		        x.setVisible(true); 
			}
		});
		btnNewButton_7.setBounds(660, 352, 85, 21);
		frame.getContentPane().add(btnNewButton_7);
		
		JLabel lblNewLabel = new JLabel("tong hop chuc nang");
		lblNewLabel.setBounds(140, 79, 295, 13);
		frame.getContentPane().add(lblNewLabel);
	}
}
