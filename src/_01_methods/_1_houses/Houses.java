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
		rob.setSpeed(2000);
		rob.penDown();
		rob.setX(40);
		rob.setY(500);
		rob.move(200);
		rob.turn(45);
		rob.move(20);
		rob.turn(90);
		rob.move(20);
	}	
	public void run() {


		
	}
}
