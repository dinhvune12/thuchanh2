package baithuchanh2;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class chucnang4 extends JFrame{

	public chucnang4() {
        setTitle("Form chuc nang 4");
        setBounds(100, 100, 450, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Đóng form này không ảnh hưởng main app
        getContentPane().setLayout(null);

            }

    // Nếu bạn muốn test chạy form này độc lập
    public static void main(String[] args) {
    	chucnang4 frame = new chucnang4();
        frame.setVisible(true);
    }

}
