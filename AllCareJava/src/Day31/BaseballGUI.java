package Day31;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

class RCom{
	private int[] com;
	RCom(){
		Random r = new Random();
		com = new int[3];

		for(int i=0; i<com.length; i++) {
			com[i] = r.nextInt(9)+1;
			for(int j=0; j<i; j++) { //중복제거 
				if(com[i]==com[j]) {
					i--;
					break;
				}
			}
		}
	}

	int[] getCom() {
		return com;
	}
}

class UserCheck{
	int strike;
	int ball;
	boolean out;

	UserCheck(int[] com, int[] user){
		for(int i=0; i<user.length; i++) {
			for(int j=0; j<com.length; j++) {
				if(user[i]==com[j]) {
					if(i==j) {
						strike++; //값과 인덱스가 같으면 스트라이크 
					}
					else {
						ball++; //값은 같지만 인덱스가 다르면 볼 
					}
				}
			}
		}
	}

	int getStrike() {
		return strike;

	}

	int getBall() {
		return ball;

	}

	boolean getOut() {
		if(strike == 0 && ball ==0) {
			return true;
		}
		else {
			return false;
		}
	}
}

class NumberBaseBallPanel extends JPanel{
	int strike = 0;
	int ball = 0;
	boolean out = false;

	void setData(int strike, int ball, boolean out) {
		this.strike=strike;
		this.ball=ball;
		this.out=out;
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		g.setFont(new Font("맑은 고딕", Font.BOLD, 20));

		if(strike == 3) {
			g.setFont(new Font("맑은 고딕", Font.BOLD, 60));
			g.drawString("Home Run!",30, 180);
		}

		else {
			if(strike ==0) {
				g.setColor(Color.red);
				g.drawString("S", 30, 222);
				g.drawOval(50, 200,30,30);
				g.drawOval(90, 200, 30, 30);
			}

			else if (strike ==1) {
				g.setColor(Color.red);
				g.drawString("S", 30, 222);
				g.fillOval(50, 200, 30, 30);
				g.drawOval(90, 200, 30, 30);

			}

			else {

				g.setColor(Color.red);
				g.drawString("S", 30, 222);
				g.fillOval(50, 200, 30, 30);
				g.fillOval(90, 200, 30, 30);

			}


			if(ball ==0) {
				g.setColor(Color.blue);
				g.drawString("B", 30,262);
				g.drawOval(50, 240, 30, 30);
				g.drawOval(90, 240, 30, 30);
				g.drawOval(130, 240, 30, 30);


			}
			else if(ball==1) {
				g.setColor(Color.blue);
				g.drawString("B", 30,262);
				g.fillOval(50, 240, 30, 30);
				g.drawOval(90, 240, 30, 30);
				g.drawOval(130, 240, 30, 30);
			}

			else if(ball==2) {
				g.setColor(Color.blue);
				g.drawString("B", 30,262);
				g.fillOval(50, 240, 30, 30);
				g.fillOval(90, 240, 30, 30);
				g.drawOval(130, 240, 30, 30);
			}

			else {
				g.setColor(Color.blue);
				g.drawString("B", 30,262);
				g.fillOval(50, 240, 30, 30);
				g.fillOval(90, 240, 30, 30);
				g.fillOval(130, 240, 30, 30);
			}

			if(out == false) {
				g.setColor(Color.orange);
				g.drawString("O", 30, 302);
				g.drawOval(50, 280, 30, 30);
			}
			else {
				g.setColor(Color.orange);
				g.drawString("O", 30, 302);
				g.fillOval(50, 280, 30, 30);
			}	
		}
	}
}

public class BaseballGUI extends JFrame implements ActionListener{

	NumberBaseBallPanel np;
	JTextField jt;
	JButton jb;
	RCom rc;

	BaseballGUI(RCom rc){
		this.rc = rc;
		System.out.println(rc.getCom()[0] + " , "+rc.getCom()[1]+ " , "+rc.getCom()[2]);
		Container c = getContentPane();
		c.setLayout(new BorderLayout());

		np=new NumberBaseBallPanel();
		jt = new JTextField(15);
		jb = new JButton("입력");
		jb.addActionListener(this);
		jb.setFont(new Font("맑은 고딕", Font.BOLD, 18));


		np.add(jt);
		np.add(jb);

		c.add(np);

		setSize(400,400);
		setVisible(true);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new BaseballGUI(new RCom());
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int[] user = new int[3];
		String[] temp = jt.getText().split("");
		for(int i=0; i<temp.length; i++) {
			user[i] = Integer.parseInt(temp[i]);
		}

		UserCheck u = new UserCheck(rc.getCom(), user);
		System.out.println(u.getBall()+ " , "+u.getStrike());

		np.setData(u.getStrike(), u.getBall(), u.getOut());
		np.repaint();

	}

}
