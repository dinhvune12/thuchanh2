package baithuchanh2;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class chucnang3 extends JFrame {

    private JTextField txtSo;

    public chucnang3() {
        setTitle("Kiểm tra số đối xứng");
        setBounds(100, 100, 450, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        JLabel lblNhapSo = new JLabel("Nhập số:");
        lblNhapSo.setBounds(50, 50, 60, 13);
        getContentPane().add(lblNhapSo);

        txtSo = new JTextField();
        txtSo.setBounds(120, 47, 150, 19);
        getContentPane().add(txtSo);
        txtSo.setColumns(10);

        JButton btnKiemTra = new JButton("Kiểm tra");
        btnKiemTra.setBounds(120, 90, 100, 21);
        getContentPane().add(btnKiemTra);

        btnKiemTra.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    String soStr = txtSo.getText().trim();
                    int n = Integer.parseInt(soStr);

                    if (n < 0) {
                        JOptionPane.showMessageDialog(null, "Vui lòng nhập số nguyên dương!");
                        return;
                    }

                    String reversed = new StringBuilder(soStr).reverse().toString();

                    if (soStr.equals(reversed)) {
                        JOptionPane.showMessageDialog(null, n + " là số đối xứng.");
                    } else {
                        JOptionPane.showMessageDialog(null, n + " không phải là số đối xứng.");
                    }

                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Vui lòng nhập đúng định dạng số nguyên!");
                }
            }
        });
    }
//xssssd
    public static void main(String[] args) {
        chucnang3 frame = new chucnang3();
        frame.setVisible(true);
    }
}
