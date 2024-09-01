package _03_gui_with_help._2_photo_quiz;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2021
 *    Level 1
 */

import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public static void main(String[] args) {

		JFrame quiz = new JFrame();
		quiz.setVisible(true);
		// This will make sure the program exits when you close the window
		quiz.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		String pig = "https://i.ytimg.com/vi/eDb25pwhtno/maxresdefault.jpg";
		String mc = "https://static.theprint.in/wp-content/uploads/2020/01/Albert-Einstein-696x392.jpg?compress=true&quality=80&w=376&dpr=2.6";
		String bara = "https://upload.wikimedia.org/wikipedia/commons/thumb/3/34/Hydrochoeris_hydrochaeris_in_Brazil_in_Petr%C3%B3polis%2C_Rio_de_Janeiro%2C_Brazil_09.jpg/1200px-Hydrochoeris_hydrochaeris_in_Brazil_in_Petr%C3%B3polis%2C_Rio_de_Janeiro%2C_Brazil_09.jpg";
		Component flamingo = createImage(mc);
		Component piggy = createImage(pig);
		Component capy = createImage(bara);
		// 1. find an image on the internet, and put its URL in a String
		// variable (from your browser, right click on the image, and select
		// “Copy Image Address” )

		// 2. create a variable of type "Component" that will hold your image

		// 3. use the "createImage()" method below to initialize your Component

		// 4. add the image to the quiz window
		quiz.add(piggy);
		quiz.pack();
		String AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA = JOptionPane
				.showInputDialog("Are guinea pigs tasty");
		if (AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA.equals("Yes")
				|| AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA.equals("yes")) {
			JOptionPane.showMessageDialog(null, "Correcto");
		} else {
			JOptionPane.showMessageDialog(null, "You won't go to college!:(");
			System.exit(0);
		}

		quiz.remove(piggy);
		quiz.add(flamingo);
		quiz.pack();
		AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA = JOptionPane.showInputDialog("who is this man?");
		if (AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA.equals("Albert Einstein")||AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA.equals("albert")||AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA.equals("einstein")) {
			JOptionPane.showMessageDialog(null, "Correcto");
		} else {
			JOptionPane.showMessageDialog(null, "You won't go to college! :(");
			System.exit(0);
		}
		quiz.remove(flamingo);
		AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA = JOptionPane.showInputDialog("What is the biggest rodent");
		if (AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA.equals("Capybara")|| AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA.equals("capybara")) {
			quiz.add(capy);
			quiz.pack();
			JOptionPane.showMessageDialog(null, "Correcto");
		} else {
			JOptionPane.showMessageDialog(null, "You won't go to college! :(");
			System.exit(0);
		}
		}
		// g
		// 5. call the pack() method on the quiz window

		// 6. ask a question that relates to the image

		// 7. print "CORRECT" if the user gave the right answer

		// 8. print "INCORRECT" if the answer is wrong

		// 9. remove the component from the quiz window (you may not see the
		// effect of this until step 12)

		// 10. find another image and create it (might take more than one line
		// of code)

		// 11. add the second image to the quiz window

		// 12. pack the quiz window

		// 13. ask another question

		// 14+ check answer, say if correct or incorrect, etc.
	

	static private Component createImage(String imageUrl) {
		JLabel imageLabel = new JLabel();
		URL url;
		try {
			url = new URL(imageUrl);
			Icon icon = new ImageIcon(url);
			imageLabel.setIcon(icon);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, "I can't find your image!!");
		}

		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}
