import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Q31 extends JFrame{
	
	Color color[] = {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN,
			Color.CYAN, Color.BLUE, Color.MAGENTA, Color.GRAY, Color.PINK,
			Color.LIGHT_GRAY};
	
	//생성자
	Q31(){
		setTitle("Ten Color Button Frame");
		setSize(600,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		Container contentPane = getContentPane();
		contentPane.setLayout(new GridLayout(1,10)); //그리드10
		
		for(int i=0; i<10; i++) {
			JButton button = new JButton(Integer.toString(i)); //버튼 생성과 숫자 작성
			button.setOpaque(true); //배경색 보이게 함
			button.setBackground(color[i]); //각 버튼의 색 설정
			contentPane.add(button); //컨텐트팬에 부착
		}
	}

	
	public static void main(String[] args) {
		Q31 q = new Q31();
	}

}
