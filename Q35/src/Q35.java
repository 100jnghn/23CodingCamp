import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Q35 extends JFrame {
	
	private MyPanel panel = new MyPanel();
	
	public Q35() {
		setTitle("원을 0.5초 간격으로 그리기");
		setSize(400,400);
		setVisible(true);
		setContentPane(panel);
		
		MyThread th = new MyThread(panel);
		th.start();
		
	}
	
	class MyPanel extends JPanel {
		private int x,y;
		private boolean flag = false;
		
		public MyPanel() {
			this.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					flag = true;
					repaint();
				}
			});
		}
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			if(flag==true) {
				g.setColor(Color.PINK);
				x = (int)(Math.random()*this.getWidth()-50);
				y = (int)(Math.random()*this.getHeight()-50);
				g.drawOval(x, y, 50, 50);
			}
			
		}
	}
	
	class MyThread extends Thread {
		private MyPanel panel;
		public MyThread(MyPanel panel) {
			this.panel=panel;
		}
		
		public void run() {
			while(true) {
				panel.repaint();
				
				try {
					Thread.sleep(500);
				}
				catch(InterruptedException e) {
					return;
				}
			}
		}
	}

	public static void main(String[] args) {
		new Q35();

	}

}
