import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Q9 extends JFrame{
	
	JPanel upPanel = new JPanel();
	MidPanel midPanel = new MidPanel();
	JPanel downPanel = new JPanel();
	JButton[] bt = new JButton[4];
	Container c = null;
	int cup = 10, coffee = 10, water = 10, sugar = 10, cream = 10;
	ButtonListener buttonListener = new ButtonListener();
	
	public Q9() {
		
		c = getContentPane();
		c.setLayout(new BorderLayout(3,3));
		setDesign();
		
		setTitle("Question 9");
		setVisible(true);
		setSize(450,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void setDesign() {
		c.add(upPanel,BorderLayout.NORTH);
		upPanel.add(new JLabel("Welcome, Hot Coffee !!"));
		upPanel.setBackground(Color.pink);
		
		c.add(midPanel,BorderLayout.CENTER);
		midPanel.setLayout(null);
		
		c.add(downPanel,BorderLayout.SOUTH);
		bt[0] = new JButton("Black Coffee");
		bt[1] = new JButton("Sugar Coffee");
		bt[2] = new JButton("Dabang Coffee");
		bt[3] = new JButton("Reset");
		for(int i=0;i<bt.length;i++) {
			downPanel.add(bt[i]);
			bt[i].addActionListener(buttonListener);
		}
	}
	
	class ButtonListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			String action = e.getActionCommand();
			if(action.equals("Black Coffee")) {
				if(cup > 0 && coffee> 0 && water >0) {
					cup--;	coffee--;	water--;
					repaint();
					JOptionPane.showMessageDialog(null, "블랙 커피 나왔습니다 ^^.", "커피 나왔습니다~", JOptionPane.INFORMATION_MESSAGE);
				}
				else
					JOptionPane.showMessageDialog(null, "부족한 것이 있습니다. 채워주세요", "커피 자판기 경고!", JOptionPane.ERROR_MESSAGE);
			}
			else if(action.equals("Sugar Coffee")) {
				if(cup > 0 && coffee> 0 && water >0 && sugar > 0) {
					cup--;	coffee--;	water--;	sugar--;
					repaint();
					JOptionPane.showMessageDialog(null, "설탕 커피 나왔습니다 ^^.", "커피 나왔습니다~", JOptionPane.INFORMATION_MESSAGE);
				}
				else
					JOptionPane.showMessageDialog(null, "부족한 것이 있습니다. 채워주세요", "커피 자판기 경고!", JOptionPane.ERROR_MESSAGE);
			}
			else if(action.equals("Dabang Coffee")) {
				if(cup > 0 && coffee> 0 && water >0 && sugar > 0 && cream > 0) {
					cup--;	coffee--;	water--;	sugar--;	cream--;
					repaint();
					JOptionPane.showMessageDialog(null, "다방 커피 나왔습니다 ^^.", "커피 나왔습니다~", JOptionPane.INFORMATION_MESSAGE);
				}
				else
					JOptionPane.showMessageDialog(null, "부족한 것이 있습니다. 채워주세요", "커피 자판기 경고!", JOptionPane.ERROR_MESSAGE);
			}
			else if(action.equals("Reset")) {
				cup = 10;	coffee = 10;	water = 10;	sugar = 10;	cream = 10;
				repaint();
				JOptionPane.showMessageDialog(null, "재료가 충전되었습니다.", "커피 제공", JOptionPane.INFORMATION_MESSAGE);
			}
		}
	}
	
	class MidPanel extends JPanel{
		
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.PINK);
			g.fillRect(20, 160-(cup*14), 50, (cup*14));
			g.fillRect(100, 160-(coffee*14), 50, (coffee*14));
			g.fillRect(180, 160-(water*14), 50, (water*14));
			g.fillRect(260, 160-(sugar*14), 50, (sugar*14));
			g.fillRect(340, 160-(cream*14), 50, (cream*14));
			g.setColor(Color.black);
			g.drawRect(20, 20, 50, 140);
			g.drawRect(100, 20, 50, 140);
			g.drawRect(180, 20, 50, 140);
			g.drawRect(260, 20, 50, 140);
			g.drawRect(340, 20, 50, 140);
			g.drawString("Cup", 30, 180);
			g.drawString("Coffee", 110, 180);
			g.drawString("Water", 190, 180);
			g.drawString("Sugar", 270, 180);
			g.drawString("Cream", 350, 180);
		}
	}
	
	public static void main(String[] args) {
		new Q9();
	}
}