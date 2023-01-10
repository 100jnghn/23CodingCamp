import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import javax.swing.JFrame;

public class Q34 extends JFrame {

	ArrayList<Location> list = new ArrayList<Location>();
	int mouseX, mouseY; // 마우스로 찍을 점 위치
	int height = 500, width = 500; // 창 크기
	int count; // 점 찍은 횟수

	// 생성자. 처음 시작 좌표: (10,10)
	Q34() {
		list.add(new Location(100, 100)); // 시작점 리스트에 삽입
		this.count = 1; // 시작점 찍음 -> 카운트
		setTitle("마우스로 폐다각형 그리기");
		setSize(width, height); //창 크기 설정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 종료시 프로세스 종료
		setVisible(true);

		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		myMouseListener listener = new myMouseListener(); // 리스너 객체 생성
		c.addMouseListener(listener); // MouseListener 리스너 등록
		c.addMouseMotionListener(listener); // MouseMotionListener 리스너 등록
	}

	// 도형 그리는 함수
	public void paint(Graphics g) {
		super.paint(g);
		g.setColor(Color.BLACK);
		for (int i = 1; i < list.size(); i++) {
			g.drawLine((int)list.get(i).x, (int)list.get(i).y, (int)list.get(i-1).x, (int)list.get(i-1).y);
		}
		g.drawLine((int)list.get(list.size()-1).x, (int)list.get(list.size()-1).y, (int)list.get(0).x, (int)list.get(0).y);
	}

	class myMouseListener implements MouseListener, MouseMotionListener {

		@Override // 마우스 드래그 되는 동안
		public void mouseDragged(MouseEvent e) {
		}

		@Override // 마우스 움직이는 동안
		public void mouseMoved(MouseEvent e) {
		}

		@Override // 마우스로 컴포넌트를 눌렸을 때
		public void mouseClicked(MouseEvent e) {
		}

		@Override // 마우스 눌렀을 때
		public void mousePressed(MouseEvent e) {
			mouseX = e.getX()+7;
			mouseY = e.getY()+30;
			list.add(new Location(mouseX, mouseY));

			// 테스트용. 좌표들 출력
			for (int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i).x + " " + list.get(i).y);
			}
			System.out.println();

			repaint(); // 선 그리기
		}

		@Override // 눌린 마우스 버튼 뗄 때
		public void mouseReleased(MouseEvent e) {
		}

		@Override // 마우스가 컴포넌트에 올라갈 때
		public void mouseEntered(MouseEvent e) {
		}

		@Override // 마우스가 컴포넌트에서 내려올 때
		public void mouseExited(MouseEvent e) {
		}

	}

	public static void main(String[] args) {
		Q34 q34 = new Q34();
	}
}
