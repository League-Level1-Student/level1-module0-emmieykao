package _10_cuteness_tv;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class cuteness_tv implements ActionListener {
	JFrame frame= new JFrame();
	JPanel panel= new JPanel();
	JButton duck= new JButton();
	JButton frog= new JButton();
	JButton unicorn= new JButton();
	public void showButton() {
		// TODO Auto-generated method stub
	
		duck.setText("Duck");
		duck.addActionListener(this);
		panel.add(duck);
		frog.setText("Frog");
		frog.addActionListener(this);
		panel.add(frog);
		unicorn.setText("Fluffy Unicorns!");
		unicorn.addActionListener(this);
		panel.add(unicorn);
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
		frame.pack();
	}
	void showDucks() {
	     playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
	}

	void showFrog() {
	     playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
	}

	void showFluffyUnicorns() {
	     playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
	}

	void playVideo(String videoID) {
	     
	     // Workaround for Linux because "Desktop.getDesktop().browse()" doesn't 
	     //work on some Linux implementations 
	     try {
	     if (System.getProperty("os.name").toLowerCase().contains("linux")) {
	     if (Runtime.getRuntime().exec(new String[] { 
	      "which", "xdg- open" }).getInputStream().read() != -1) {
	     Runtime.getRuntime().exec(new String[] { "xdg-open", videoID }); 
	     }
	     } else {
	          URI uri = new URI(videoID);
	          java.awt.Desktop.getDesktop().browse(uri);
	     }      } catch (Exception e) {
	          e.printStackTrace();
	     }
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) e.getSource();
		if(buttonPressed==(duck)) {
			showDucks();
			System.out.println("duck");
		}
		if(buttonPressed==(frog)) {
			showFrog();
			System.out.println("frog");
		}
		if(buttonPressed==(unicorn)){
		showFluffyUnicorns();
		System.out.println("unicorn");
	}
}}
