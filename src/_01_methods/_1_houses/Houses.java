package _01_methods._1_houses;

import org.jointheleague.graphical.robot.Robot;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2021
 *    Level 1
 */
public class Houses {
	public static void main(String[] args) {
		Robot rob = new Robot();
		rob.hide();
		rob.setSpeed(20);
		rob.penDown();
		rob.setPenColor(0,255,255);
		rob.setX(40);
		rob.setY(500);
		BH(rob);
		rob.move(56);
		SH(rob);
		
	}	
	public void run() {

		
		
	}
	public static void BH(Robot R) {
		

		R.move(400);
		R.turn(45);
		R.move(40);
		R.turn(90);
		R.move(40);
		R.turn(45);
		R.move(400);
		R.turn(-90);
	}
	public static void SH(Robot R) {
		R.setAngle(0);
		R.move(28);
		R.turn(45);
		R.move(40);
		R.turn(90);
		R.move(40);
		R.turn(45);
		R.move(28);
	}
}
