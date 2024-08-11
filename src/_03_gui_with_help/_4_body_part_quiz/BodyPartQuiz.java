package _03_gui_with_help._4_body_part_quiz;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2021
 *    Level 1
 */

import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class BodyPartQuiz {

	// You can use the celebrity photos we have placed in the recipe java
	// package,or if you prefer, get celebrity photos from the Internet,
	// place them in the recipe package(body_part_quiz), and change the names below.

	String firstImage = "/Users/league/git/level1-module0-Anonymous1225/src/_03_gui_with_help/_4_body_part_quiz/arnold.jpeg";
	String secondImage = "/Users/league/git/level1-module0-Anonymous1225/src/_03_gui_with_help/_4_body_part_quiz/leonardo.jpeg";
	String thirdImage = "/Users/league/git/level1-module0-Anonymous1225/src/_03_gui_with_help/_4_body_part_quiz/morgan.jpeg";
	String fourthImage = "/Users/league/git/level1-module0-Anonymous1225/src/_03_gui_with_help/_4_body_part_quiz/jack.jpeg";
	String fifthImage = "/Users/league/git/level1-module0-Anonymous1225/src/_03_gui_with_help/_4_body_part_quiz/rick.png";
	JFrame window = new JFrame();
	JPanel panel = new JPanel();

	public void run() {
		initializeGui();
		startQuiz();
	}

	private void initializeGui() {
		initializeImageList();
		imageIterator = imageList.iterator();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.add(panel);
		
		// 3. Change the size of the window so that you can only see part of the
		// image.
		window.setSize(200, 100);


		showNextImage();

	}

	private void startQuiz() {

		// 1. Make an int  variable to hold the score.
		int score=0;
		// 2. Set the size of the window in the initializeGui() method 
		//initializeGui();
		// 4. Ask the user who this person is and store their answer
		
		String guess = JOptionPane.showInputDialog("who is this?");
		if (guess.toLowerCase().equals("arnold schwarzenegger") || guess.toLowerCase().equals("arnold") || guess.toLowerCase().equals("shwarzenegger")) {
			score++;
		}
		System.out.println(score);
		// 5. Check their answer. If they guessed correctly:
		// -- Tell them they are right and increase the score by 1
		// 6. Otherwise:
		// -- Tell them they are wrong and who the person is

		// 7. Use the showNextImage() method below to get the next image
		showNextImage();
		String guess1 = JOptionPane.showInputDialog("who is this?");
		if (guess1.toLowerCase().equals("leonardo decaprio")||guess1.toLowerCase().equals("leonardo")||guess1.toLowerCase().equals("decaprio")) {
			score++;
		}
		System.out.println(score);
		showNextImage();
		window.setSize(150, 150);
		String guess2 =JOptionPane.showInputDialog("who is this?");
		if (guess2.toLowerCase().equals("morgan freeman")||guess2.toLowerCase().equals("morgan")||guess2.toLowerCase().equals("freeman")) {
			score++;
		}
		System.out.println(score);
		showNextImage();
		window.setSize(250, 100);
		String guess3=JOptionPane.showInputDialog("Who is this");
		if (guess3.toLowerCase().equals("jack black") || guess3.toLowerCase().equals("jack")||guess3.toLowerCase().equals("black")) {
			score++;
		}
		System.out.println(score);
		showNextImage();
		String guess4=JOptionPane.showInputDialog("Who is this");
		if (guess4.toLowerCase().equals("rick astley")|| guess4.toLowerCase().equals("rick")||guess4.toLowerCase().equals("astley")) {
			score++;
		}
		System.out.println(score);
		
		
		// 8. .... repeat 4-7 for all your images.....

		// 9. Show them their current score

	}

	public void showNextImage() {
		panel.removeAll();
		panel.add(getNextImage());
		//window.pack();
		window.setVisible(true);
	}

	private JLabel loadImage(String fileName) {
		Icon icon = new ImageIcon(fileName);
		JLabel label = new JLabel(icon);
		return label;
	}

	ArrayList<JLabel> imageList = new ArrayList<JLabel>();
	Iterator<JLabel> imageIterator;

	private void initializeImageList() {
		JLabel imageLabel = loadImage(firstImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(secondImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(thirdImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(fourthImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(fifthImage);
		imageList.add(imageLabel);
	}

	private JLabel getNextImage() {
		if (imageIterator.hasNext()) {
			return imageIterator.next();
		}

		return new JLabel("No more images");
	}
}