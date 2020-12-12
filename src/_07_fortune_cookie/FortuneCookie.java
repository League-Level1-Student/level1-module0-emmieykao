package _07_fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener {
public void showButton(){
	JFrame frame= new JFrame();
	frame.setVisible(true);
	JButton button = new JButton();
	frame.add(button);
	frame.pack();
	button.addActionListener(this);
	System.out.println("Button clicked");
	
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	int rand=new Random().nextInt(5);
	if(rand==0) {
		JOptionPane.showMessageDialog(null, "You will get an A+!");
	}
	if(rand==1) {
		JOptionPane.showMessageDialog(null, "Your lucky numbers are 4, 34, 64, and 77.");
	}
	if(rand==2) {
		JOptionPane.showMessageDialog(null, "Make sure no black cats cross your path.");
	}
	if(rand==3) {
		JOptionPane.showMessageDialog(null, "Your dog will eat your socks.");
	}
	if(rand==4) {
		JOptionPane.showMessageDialog(null, "Eat your veggies!");
	}
}
}

