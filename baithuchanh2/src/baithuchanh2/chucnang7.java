package baithuchanh2;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class chucnang7 extends JFrame{

	public chucnang7() {
        setTitle("Form chuc nang 7");
        setBounds(100, 100, 450, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Đóng form này không ảnh hưởng main app
        getContentPane().setLayout(null);

            }

    // Nếu bạn muốn test chạy form này độc lập
    public static void main(String[] args) {
    	chucnang7 frame = new chucnang7();
        frame.setVisible(true);
    }

}
