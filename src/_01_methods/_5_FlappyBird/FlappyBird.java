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
	int h = ran.nextInt(350) + 50;
	int l = ran.nextInt(575 - h) + 25;
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
    	pig = loadImage("/Level1-Module0/src/_01_methods/_5_FlappyBird/chonk.webp");
    	pig.resize(30, 30);
	}

	@Override
	public void draw() {
		if (ga) {
			v -= 1;
			b -= v;
			x -= 2;
			noStroke();
			background(0, 200, 255);
			fill(255, 55, 0);
			rect(x, 0, 20, h);
			rect(x, h + l, 20, 600);
			fill(0, 255, 0);
			ellipse(20, b, 20, 10);
			if (mousePressed) {
				v = 10;
			}
			if (x <= 0) {
				x = 780;
				h = ran.nextInt(350) + 50;
				l = ran.nextInt(200) + 50;
			}
			if (b<=0) {
				b=10;
			}
			if (b >= 630) {
				ga = false;
				JOptionPane.showMessageDialog(null, "Game over!");
			}
			if (x==30) {
				score+=1;
			}
			if (x<=30&&b<=h) {
				ga = false;
				JOptionPane.showMessageDialog(null, "Game over!");				
			}
			if (x<=30&&b>=h+l) {
				ga = false;
				JOptionPane.showMessageDialog(null, "Game over!");	
			}
		}
	}

	static public void main(String[] args) {
		PApplet.main(FlappyBird.class.getName());
	}
}
