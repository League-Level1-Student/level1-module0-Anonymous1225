package _01_methods._2_spinning_record;

import game_tools.Sound;
import processing.core.PApplet;
import processing.core.PImage;
import java.util.Random;
/*
 * Goal: Make a record spin and play music!
 * 1. Make an int variable to keep track of how much the record will spin.
 * In the setup() method:
 * 2. Load a picture of a record using the loadImage() method:
 *    pictureOfRecord = loadImage("images/record.png");
 * 3. Call the image variable's resize() method to set the image's width and
 *    height to the window's width and height.
 * 4. Call the image() method to display the record image. Do you see it?
 * In the draw() method:
 * 5. Make the record spin by increasing the variable from step 1.
 * 6. Call the rotateImage() method to rotate record by the specified amount
 *    rotateImage(PImage image, int amountToRotate);
 * 7. Call the image() method to display the record image
 *    Make sure to put this code AFTER the rotateImage() method.
 * 8. Does the record rotate when the mouse is pressed?
 * 9. Modify your code so the record only spins when the mouse is pressed.
 * 10.Use the song.play() and song.stop() methods to play a song ONLY when
 *    the record is spinning.
 */
public class SpinningRecord extends PApplet {
    Random ran = new Random();
    static final int WIDTH = 600;
    static final int HEIGHT = 600;
  	 int x =300;
  	 int y=0;
    Song song = new Song("awesomeTrack.mp3");
    PImage pictureOfRecord;
    int huh=0;
    boolean spin=false;
    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
    	pictureOfRecord = loadImage("/Users/league/git/level1-module0-Anonymous1225/src/_01_methods/_2_spinning_record/vsauce.jpeg");
    	 size(600,600);
    	 pictureOfRecord.resize(600,600);

    }

    @Override
    public void draw() {
    	if (mousePressed) {
    		spin=true;
    	}
    	if (spin==true) {
    		huh=huh+ran.nextInt(180)+1;
    		song.play();
    		background(192,192,192);
    		rotateImage(pictureOfRecord,huh);
    		image(pictureOfRecord, 0, 0);
    	}
    	
    }

    static public void main(String[] args) {
        PApplet.main(SpinningRecord.class.getName());
    }
    
    /*********************** DO NOT MODIFY THE CODE BELOW ********************/

    void rotateImage(PImage image, int amountToRotate) {
        translate(width / 2, height / 2);
        rotate(amountToRotate * TWO_PI / 360);
        translate(-image.width / 2, -image.height / 2);
    }

    class Song extends Sound {
        public Song(String songAddress) {
            super(songAddress);
        }

        @Override
        public void play() {
            if( !super.isPlaying() ) {
                System.out.println("playing");
                super.play();
            }
        }
    }
}