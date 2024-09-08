package _03_gui_with_help._5_duelling_buttons;

import java.awt.Component;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2021
 *    Level 1
 */

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import game_tools.Sound;

public class DuellingButtons implements ActionListener {
	boolean heha=false;
	JButton leftButton = new JButton();
	JButton rightButton = new JButton();

	Dimension BIG = new Dimension(400, 400);
	Dimension SMALL = new Dimension(200, 200);
    Song song = new Song("src/_03_gui_with_help/_5_duelling_buttons/musicbox.mp3");
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	String freddy="src/_03_gui_with_help/_5_duelling_buttons/Power_outage.png";
	Component lebox=createImage(freddy);
	public void run() {
		// 1. Add the panel to the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		// 2. Make the frame visible
		frame.setVisible(true);
		// 3. Set the text of the leftButton to "Click me!"
		leftButton.setText("CLICK ME!");
		// 4. Set the text of the rightButton to "Click me!"
		rightButton.setText("NO CLICK ME! Don't listen to him");
		// 5. Add an action listener to the leftButton
		leftButton.addActionListener(this);
		// 6. Add an action listener to the rightButton
		rightButton.addActionListener(this);
		// 7. Add the leftButton to the panel
		panel.add(leftButton);
		// 8. Add the rightButton to the panel
		panel.add(rightButton);
		// 9. Pack the frame
			frame.pack();
		// 10. Set the title of the frame to "Demanding Buttons"
		frame.setTitle("Demanding Buttons");
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		JButton buttonPressed = (JButton) arg0.getSource();
		frame.setSize(700,500);
		/* If the buttonPressed was the leftButton.... */
		panel.add(lebox);
		song.play();
		if (buttonPressed==(leftButton)){
			leftButton.setPreferredSize(SMALL);
			rightButton.setPreferredSize(BIG);
			rightButton.setText("I told you");
		}

		else if (buttonPressed==(rightButton)) {
			rightButton.setPreferredSize(SMALL);
			leftButton.setPreferredSize(BIG);
			leftButton.setText("You should have listened");
		}

		// Set the text of the rightButton to "No, click Me!"
		// Set the PREFERRED size of the rightButton to BIG
		// Set the text of the leftButton to "Click Me!"
		// Set the PREFERRED size of the leftButton to SMALL

		
	//	frame.repaint();
		
		
		/* If the buttonPressed was the rightButton, do the opposite. */

		frame.pack();
	}
	static private Component createImage(String imageUrl) {
		JLabel imageLabel = new JLabel();
//			url = new URL(imageUrl);
					Icon icon = new ImageIcon(imageUrl);
					imageLabel.setIcon(icon);

		return imageLabel;
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