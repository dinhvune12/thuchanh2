package baithuchanh2;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class chucnang4 extends JFrame {

	private JTextField txtSo1;
	private JTextField txtSo2;

	public chucnang4() {
		setTitle("Tìm số nhỏ nhất");
		setBounds(100, 100, 450, 300);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		getContentPane().setLayout(null);

		JLabel lblSo1 = new JLabel("Nhập số thứ 1:");
		lblSo1.setBounds(50, 50, 100, 13);
		getContentPane().add(lblSo1);

		txtSo1 = new JTextField();
		txtSo1.setBounds(160, 47, 150, 19);
		getContentPane().add(txtSo1);
		txtSo1.setColumns(10);

		JLabel lblSo2 = new JLabel("Nhập số thứ 2:");
		lblSo2.setBounds(50, 90, 100, 13);
		getContentPane().add(lblSo2);

		txtSo2 = new JTextField();
		txtSo2.setBounds(160, 87, 150, 19);
		getContentPane().add(txtSo2);
		txtSo2.setColumns(10);

		JButton btnTimMin = new JButton("Tìm số nhỏ nhất");
		btnTimMin.setBounds(140, 140, 150, 25);
		getContentPane().add(btnTimMin);

		btnTimMin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int so1 = Integer.parseInt(txtSo1.getText().trim());
					int so2 = Integer.parseInt(txtSo2.getText().trim());

					int min = Math.min(so1, so2);

					JOptionPane.showMessageDialog(null, "Số nhỏ nhất là: " + min);

				} catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(null, "Vui lòng nhập đúng định dạng số nguyên!");
				}
			}
		});
	}

	// Nếu bạn muốn test chạy form này độc lập
	public static void main(String[] args) {
		chucnang4 frame = new chucnang4();
		frame.setVisible(true);
	}
}
