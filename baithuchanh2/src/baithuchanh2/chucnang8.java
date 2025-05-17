package baithuchanh2;

import javax.swing.*;
import java.awt.event.*;

public class chucnang8 extends JFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JLabel lblKetQua;

	public chucnang8() {
		setTitle("Tính BCNN");
		setBounds(100, 100, 450, 300);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		getContentPane().setLayout(null);

		JLabel lblSoA = new JLabel("Số A:");
		lblSoA.setBounds(75, 70, 46, 14);
		getContentPane().add(lblSoA);

		JLabel lblSoB = new JLabel("Số B:");
		lblSoB.setBounds(75, 104, 46, 14);
		getContentPane().add(lblSoB);

		textField = new JTextField();
		textField.setBounds(199, 67, 86, 20);
		getContentPane().add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setBounds(199, 101, 86, 20);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);

		JButton btnTinhBCNN = new JButton("Tính BCNN");
		btnTinhBCNN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int a = Integer.parseInt(textField.getText());
					int b = Integer.parseInt(textField_1.getText());

					if (a <= 0 || b <= 0) {
						lblKetQua.setText("Vui lòng nhập số nguyên dương!");
						return;
					}

					int bcnn = (a * b) / gcd(a, b); // công thức BCNN
					lblKetQua.setText("Bội chung nhỏ nhất là: " + bcnn);
				} catch (NumberFormatException ex) {
					lblKetQua.setText("Vui lòng nhập đúng số nguyên!");
				}
			}
		});
		btnTinhBCNN.setBounds(159, 156, 110, 23);
		getContentPane().add(btnTinhBCNN);

		lblKetQua = new JLabel("Kết quả:");
		lblKetQua.setBounds(120, 213, 250, 14);
		getContentPane().add(lblKetQua);
	}

	// Hàm tìm ước chung lớn nhất (GCD) dùng thuật toán Euclid
	private int gcd(int a, int b) {
		while (b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}

	public static void main(String[] args) {
		chucnang8 frame = new chucnang8();
		frame.setVisible(true);
	}
}
