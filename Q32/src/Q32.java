import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Q32 extends JFrame {

	public Q32() {
		setTitle("+,-키로 폰트 키우기");
		setSize(600, 300);
		setVisible(true);

		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		// 컨텐트팬이 키 입력을 강제로 받을 수 있도록 지정
		c.setFocusable(true);
		c.requestFocus();

		JLabel la = new JLabel("Love Java");
		la.setFont(new Font("Arial", Font.PLAIN, 10));
		c.add(la);

		c.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				Font f = la.getFont(); // 현재 폰트 알아내기
				int size = f.getSize(); // 현재 폰트의 사이즈 알아내기

				if (e.getKeyCode() == KeyEvent.VK_ADD || e.getKeyCode() == KeyEvent.VK_EQUALS) {
					la.setFont(new Font("Arial", Font.PLAIN, size + 5));

				}
				if (e.getKeyCode() == KeyEvent.VK_MINUS) {
					la.setFont(new Font("Arial", Font.PLAIN, size - 5));
					if (size <= 5)
						la.setFont(new Font("Arial", Font.PLAIN, 5));
				}
			}

		});
		revalidate();
	}

	public static void main(String[] args) {
		Q32 q = new Q32();
	}
}
