package _01_methods._5_FlappyBird;

import processing.core.PApplet;
import processing.core.PImage;

import java.util.Random;

import javax.swing.JOptionPane;

public class FlappyBird extends PApplet {
	Random ran = new Random();
	static final int WIDTH = 800;
	static final int HEIGHT = 600;
	int a = 0;
	int b = 400;
	int v = 0;
	int x = 200;
	int h = ran.nextInt(400)+1;
	int l = ran.nextInt(400-h)+200;
	int score=0;
    PImage pig;
	boolean ga = true;

	@Override
	public void settings() {
		size(WIDTH, HEIGHT);
	}

	@Override
	public void setup() {
		background(0, 200, 255);
    	pig = loadImage("/Users/league/Downloads/chonky.png");
    	pig.resize(80, 80);
	}

	@Override
	public void draw() {
		if (ga) {
			v -= 1;
			b -= v;
			x -= 2;
			background(0, 200, 255);
			image (pig, 20, b);
			noStroke();
			fill(255, 55, 0);
			rect(x, 0, 20, h);
			rect(x, l+h, 20, 600);
			fill(0, 255, 0);
			if (mousePressed) {
				v = 10;
			}
			if (x <= -20) {
				x = 780;
				h = ran.nextInt(400)+1;
				l = ran.nextInt(400-h)+200;
			}
			if (b<=0) {
				b=10;
			}
			if (b >= 620 &&b<=h) {
				ga = false;
				JOptionPane.showMessageDialog(null, "Game over!");
			}
			if (x==100) {
				score+=1;
				System.out.println(score);	
			}
			if (x<=30&&b<=h&&x>=0) {
				ga = false;
				JOptionPane.showMessageDialog(null, "Game over!");				
			}
			if (x<=30&&b>=h+l&&x>=0) {
				ga = false;
				JOptionPane.showMessageDialog(null, "Game over!");	
			}
		}
	}

	static public void main(String[] args) {
		PApplet.main(FlappyBird.class.getName());
	}
}
