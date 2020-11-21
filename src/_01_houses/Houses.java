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
			int x=ran.nextInt(3);
			if (x==0) {
			drawHouse("small");
		}
			else if (x==1) {
				drawHouse("medium");
			}
			else if (x==2){
				drawHouse("large");
			}
		}
	}
	static void drawFlatRoof(String height) {
		int y=0;
		if(height.equals("small")) {
		y=60;
		}
else if(height.equals("medium")) {
			y=125;
		}
else if (height.equals("large")){
	y=200;
	}
	
		robot.penDown();
		robot.setPenColor(32, 108, 58);
		robot.move(25);
		robot.setRandomPenColor();
		robot.turn(90);
		robot.move(y);
		
		
		robot.move(y);
		robot.turn(90);
		robot.setPenColor(32, 108, 58);
		robot.move(25);}
		
	
static void drawPointyRoof(){
	robot.turn(-45);
	robot.move(50);
	robot.turn(-90);
	robot.move(50);
	robot.turn(-45);
}

static void drawFlatRoof() {
	robot.turn(-90);
	robot.move(50);
	robot.turn(-90);
}}
