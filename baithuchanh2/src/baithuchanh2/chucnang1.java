package baithuchanh2;

import javax.swing.*;
import java.awt.event.*;

public class chucnang1 extends JFrame {

    private JTextField txtA, txtB, txtKetQua;

    public chucnang1() {
        setTitle("Giải phương trình bậc nhất ax + b = 0");
        setBounds(100, 100, 450, 250);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        JLabel lblA = new JLabel("Nhập a:");
        lblA.setBounds(30, 30, 60, 25);
        getContentPane().add(lblA);

        txtA = new JTextField();
        txtA.setBounds(100, 30, 100, 25);
        getContentPane().add(txtA);

        JLabel lblB = new JLabel("Nhập b:");
        lblB.setBounds(30, 70, 60, 25);
        getContentPane().add(lblB);

        txtB = new JTextField();
        txtB.setBounds(100, 70, 100, 25);
        getContentPane().add(txtB);

        JButton btnGiai = new JButton("Giải");
        btnGiai.setBounds(100, 110, 80, 30);
        getContentPane().add(btnGiai);

        JLabel lblKetQua = new JLabel("Kết quả:");
        lblKetQua.setBounds(30, 160, 60, 25);
        getContentPane().add(lblKetQua);

        txtKetQua = new JTextField();
        txtKetQua.setBounds(100, 160, 300, 25);
        txtKetQua.setEditable(false);
        getContentPane().add(txtKetQua);

        // Xử lý sự kiện khi bấm nút "Giải"
        btnGiai.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double a = Double.parseDouble(txtA.getText().trim());
                    double b = Double.parseDouble(txtB.getText().trim());

                    if (a == 0) {
                        if (b == 0) {
                            txtKetQua.setText("Phương trình vô số nghiệm.");
                        } else {
                            txtKetQua.setText("Phương trình vô nghiệm.");
                        }
                    } else {
                        double x = -b / a;
                        txtKetQua.setText("Nghiệm x = " + x);
                    }
                } catch (NumberFormatException ex) {
                    txtKetQua.setText("Vui lòng nhập số hợp lệ cho a và b.");
                }
            }
        });
    }

    // Nếu bạn muốn test chạy form này độc lập
    public static void main(String[] args) {
        chucnang1 frame = new chucnang1();
        frame.setVisible(true);
    }
}
