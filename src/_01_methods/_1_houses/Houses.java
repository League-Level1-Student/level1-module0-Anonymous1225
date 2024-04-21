package _01_methods._1_houses;
import java.util.Random;
import org.jointheleague.graphical.robot.Robot;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2021
 *    Level 1
 */
public class Houses {
	public static void main(String[] args) {
		Robot rob = new Robot();
		Random rng = new Random();
		rob.setSpeed(2000);
		rob.penDown();
		rob.setY(600);
		rob.setX(1);
		while (0==0){
			int r =rng.nextInt(2);
			if (r==0) {
				SH(rob);
			}
			else {
				BH(rob);
			}
			System.out.println(r);
			rob.setAngle(90);
			rob.move(20);
		}
		
	}	
	public void run() {

		
		
	}
	public static void BH(Robot R) {
		Random rng = new Random();
		R.setPenColor(rng.nextInt(256),rng.nextInt(256),rng.nextInt(256));
		R.setAngle(0);
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
		Random rng = new Random();
		R.setPenColor(rng.nextInt(256),rng.nextInt(256),rng.nextInt(256));
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
