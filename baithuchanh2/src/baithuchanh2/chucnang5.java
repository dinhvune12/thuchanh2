package baithuchanh2;

import javax.swing.*;
import java.awt.event.*;

public class chucnang5 extends JFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JLabel lblKetQua;

	public chucnang5() {
		setTitle("Form chuc nang 5");
		setBounds(100, 100, 450, 300);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		getContentPane().setLayout(null);

		JButton btnNewButton = new JButton("Tìm ƯCLN");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int a = Integer.parseInt(textField.getText());
					int b = Integer.parseInt(textField_1.getText());

					int ucln = timUCLN(a, b);
					lblKetQua.setText("Kết quả: ƯCLN của " + a + " và " + b + " là " + ucln);
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
		lblKetQua.setBounds(40, 165, 300, 14); // Tăng chiều rộng để đủ hiển thị kết quả dài
		getContentPane().add(lblKetQua);
	}

	// Hàm tính ƯCLN sử dụng thuật toán Euclid
	private int timUCLN(int a, int b) {
		a = Math.abs(a); // Đảm bảo dương
		b = Math.abs(b);
		while (b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}

	public static void main(String[] args) {
		chucnang5 frame = new chucnang5();
		frame.setVisible(true);
	}
}
