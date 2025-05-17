package baithuchanh2;

import javax.swing.*;
import java.awt.event.*;

public class chucnang7 extends JFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JLabel lblKetQua;

	public chucnang7() {
		setTitle("Đảo Ngược 2 Số");
		setBounds(100, 100, 450, 300);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		getContentPane().setLayout(null);

		JLabel lblSoA = new JLabel("Số A:");
		lblSoA.setBounds(66, 55, 46, 14);
		getContentPane().add(lblSoA);

		JLabel lblSoB = new JLabel("Số B:");
		lblSoB.setBounds(66, 110, 46, 14);
		getContentPane().add(lblSoB);

		textField = new JTextField();
		textField.setBounds(180, 52, 86, 20);
		getContentPane().add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setBounds(180, 107, 86, 20);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);

		JButton btnDoiCho = new JButton("Đổi chỗ");
		btnDoiCho.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					// Lấy giá trị gốc
					String aStr = textField.getText();
					String bStr = textField_1.getText();

					// Parse số để chắc là số hợp lệ
					int a = Integer.parseInt(aStr);
					int b = Integer.parseInt(bStr);

					// In kết quả đảo mà không đổi trong ô
					lblKetQua.setText("<html>Trước: A = " + a + ", B = " + b +
									  "<br>Sau khi đổi chỗ: A = " + b + ", B = " + a + "</html>");
				} catch (NumberFormatException ex) {
					lblKetQua.setText("Vui lòng nhập đúng số nguyên!");
				}
			}
		});
		btnDoiCho.setBounds(142, 162, 120, 23);
		getContentPane().add(btnDoiCho);

		lblKetQua = new JLabel("Kết quả:");
		lblKetQua.setBounds(80, 210, 300, 50);
		getContentPane().add(lblKetQua);
	}

	public static void main(String[] args) {
		chucnang7 frame = new chucnang7();
		frame.setVisible(true);
	}
}
