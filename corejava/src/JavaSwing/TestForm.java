package JavaSwing;

import javax.swing.JButton;
import javax.swing.JFrame;

public class TestForm {
	public static void main(String[] args) {
		JFrame form =  new  JFrame();
		form.setSize(600, 500);
		form.setTitle("TestForm");
		form.setLayout(null);//non default placement
		JButton btn = new JButton("Wellcome");
		btn.setBounds(200, 100, 150, 50);
		form.add(btn);
		form.setVisible(true);
	}
	
}
