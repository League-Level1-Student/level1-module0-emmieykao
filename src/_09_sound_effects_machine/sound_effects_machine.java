package _09_sound_effects_machine;

import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


@SuppressWarnings("deprecation")
public class sound_effects_machine implements ActionListener {
	JButton dogbark=new JButton();
	JButton alienship=new JButton();
	JButton sawwood=new JButton();
	  public void showButton() {
JFrame frame=new JFrame();
frame.setVisible(true);
JPanel panel=new JPanel();

dogbark.setText("dog bark");
panel.add(dogbark);
dogbark.addActionListener(this);

alienship.setText("alien ship");
panel.add(alienship);
alienship.addActionListener(this);

sawwood.setText("saw wood");
panel.add(sawwood);
sawwood.addActionListener(this);

frame.add(panel);
frame.pack();
     }

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
System.out.println("button clicked");
		JButton buttonPressed = (JButton) e.getSource();
if(buttonPressed==(dogbark)) {
playSound("labrador-barking-daniel_simon.wav");
System.out.println("dogbark clicked");}
else if(buttonPressed==(alienship)) {
	playSound("alien-spaceship_daniel_simion.wav");
	System.out.println("alienship clicked");
}
else if(buttonPressed==(sawwood)) {
	playSound("sawing-wood-daniel_simon.wav");
	System.out.println("sawwood clicked");
}
	}


	private void playSound(String soundFile) {
		String path = "src/_09_sound_effects_machine/";
			File sound = new File(path+soundFile);
			if (sound.exists()) {
				new Thread(() -> {
				try {
					Clip clip = AudioSystem.getClip();
					clip.open(AudioSystem.getAudioInputStream(sound));
					clip.start();
					Thread.sleep(clip.getMicrosecondLength()/1000);
				}
				catch (Exception e) {
					System.out.println("Could not play this sound");
				}}).start();
	 		}
			else {
				System.out.println("File does not exist");
			}

	}
	}


