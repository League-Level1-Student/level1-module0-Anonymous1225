package _01_methods._5_FlappyBird;

import processing.core.PApplet;

public class FlappyBird extends PApplet {
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
    int a=0;
    int b=400;
    int v=0;
    int x=200;
    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
    	background(0,200,255);
    }

    @Override
    public void draw() {
    	noStroke();
    	background(0,200,255);
    	fill(255,55,0);
    	fill(0, 255, 0);
    	ellipse(20, b, 20,10);
    	if(mousePressed) {
    		v=10;
    	}
    	v-=1;
    	b-=v;
    	rect(x,0,20,500);
    	System.out.println(b);
    	x+=1;
    }
    static public void main(String[] args) {
        PApplet.main(FlappyBird.class.getName());
    }
}
