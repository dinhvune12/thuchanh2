package baithuchanh2;

import javax.swing.*;
import java.awt.event.*;

public class chucnang6 extends JFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JLabel lblKetQua;

	public chucnang6() {
		setTitle("Form chuc nang 6");
		setBounds(100, 100, 450, 300);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		getContentPane().setLayout(null);

		JButton btnNewButton = new JButton("Sắp xếp");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int a = Integer.parseInt(textField.getText());
					int b = Integer.parseInt(textField_1.getText());

					int min = Math.min(a, b);
					int max = Math.max(a, b);

					lblKetQua.setText("Kết quả: " + min + ", " + max);
				} catch (NumberFormatException ex) {
					lblKetQua.setText("Kết quả: Vui lòng nhập số nguyên hợp lệ!");
				}
			}
		});
		btnNewButton.setBounds(287, 209, 120, 23);
		getContentPane().add(btnNewButton);

		JLabel lblNewLabel = new JLabel("Số A:");
		lblNewLabel.setBounds(40, 33, 49, 14);
		getContentPane().add(lblNewLabel);

		textField = new JTextField();
		textField.setBounds(161, 30, 96, 20);
		getContentPane().add(textField);
		textField.setColumns(10);

		JLabel lblSB = new JLabel("Số B:");
		lblSB.setBounds(40, 103, 49, 14);
		getContentPane().add(lblSB);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(161, 100, 96, 20);
		getContentPane().add(textField_1);

		lblKetQua = new JLabel("Kết quả:");
		lblKetQua.setBounds(40, 165, 300, 14);
		getContentPane().add(lblKetQua);
	}

	public static void main(String[] args) {
		chucnang6 frame = new chucnang6();
		frame.setVisible(true);
	}
}
