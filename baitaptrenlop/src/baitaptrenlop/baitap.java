import javax.swing.JButton;
import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame();
		f.setTitle("Vi du JFrame");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(300, 200);
		
		JButton btnOK = new JButton("Nhấn tôi đi!");
		JButton btnKhac = new JButton("Nhấn em đi");
		f.add(btnOK);
		f.add(btnKhac);
		f.setVisible(true);
	}
}