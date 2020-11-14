package _01_houses;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	static Robot robot=new Robot();
	public void run() {
		
		robot.setSpeed(50);
		robot.moveTo(900, 500);
		robot.turn(-90);
		
		for (int i = 0; i < 10; i++) {
			Random ran=new Random();
			int x=ran.nextInt(250);
			if (x<=60) {
			drawHouse(small);
		}
			else if (i<=125) {
				drawHouse(medium);
			}
			else {
				drawHouse(large);
			}
		}
	}
	static void drawHouse(String height) {
		if(height.equals("small")) {
			
		
		robot.penDown();
		robot.setPenColor(32, 108, 58);
		robot.move(25);
		robot.setPenColor(0, 0, 0);
		robot.turn(90);
		robot.move(height);
		robot.turn(-90);
		robot.move(50);
		robot.turn(-90);
		robot.move(height);
		robot.turn(90);
		robot.setPenColor(32, 108, 58);
		robot.move(25);}
	}
}
