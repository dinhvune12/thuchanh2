package baithuchanh2;

import javax.swing.*;
import java.awt.event.*;

public class chucnang2 extends JFrame {

    private JTextField txtSo1, txtSo2, txtKetQua;

    public chucnang2() {
        setTitle("Tìm số lớn nhất giữa hai số");
        setBounds(100, 100, 450, 250);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        JLabel lblSo1 = new JLabel("Nhập số 1:");
        lblSo1.setBounds(30, 30, 80, 25);
        getContentPane().add(lblSo1);

        txtSo1 = new JTextField();
        txtSo1.setBounds(120, 30, 100, 25);
        getContentPane().add(txtSo1);

        JLabel lblSo2 = new JLabel("Nhập số 2:");
        lblSo2.setBounds(30, 70, 80, 25);
        getContentPane().add(lblSo2);

        txtSo2 = new JTextField();
        txtSo2.setBounds(120, 70, 100, 25);
        getContentPane().add(txtSo2);

        JButton btnTimMax = new JButton("Tìm Max");
        btnTimMax.setBounds(120, 110, 100, 30);
        getContentPane().add(btnTimMax);

        JLabel lblKetQua = new JLabel("Kết quả:");
        lblKetQua.setBounds(30, 160, 80, 25);
        getContentPane().add(lblKetQua);

        txtKetQua = new JTextField();
        txtKetQua.setBounds(120, 160, 200, 25);
        txtKetQua.setEditable(false);
        getContentPane().add(txtKetQua);

        // Xử lý sự kiện khi nhấn nút Tìm Max
        btnTimMax.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double so1 = Double.parseDouble(txtSo1.getText().trim());
                    double so2 = Double.parseDouble(txtSo2.getText().trim());

                    double max = Math.max(so1, so2);
                    txtKetQua.setText("Số lớn nhất là: " + max);
                } catch (NumberFormatException ex) {
                    txtKetQua.setText("Vui lòng nhập số hợp lệ.");
                }
            }
        });
    }

    // Test form độc lập
    public static void main(String[] args) {
        chucnang2 frame = new chucnang2();
        frame.setVisible(true);
    }
}
