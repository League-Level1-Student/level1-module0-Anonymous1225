package _04_gui_from_scratch._2_jack_in_the_box;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import game_tools.Sound;

public class Jack implements ActionListener {
	int lala = 0;
	JFrame beth = new JFrame();
	JPanel polly = new JPanel();
	JButton GiGi = new JButton();
	String jacker = "src/_04_gui_from_scratch/_2_jack_in_the_box/jackInTheBox.png";
	Component pedro = createImage(jacker);
	Song song = new Song("src/_04_gui_from_scratch/_2_jack_in_the_box/homer-woohoo.wav");

	public void run() {
		beth.setVisible(true);
		beth.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		polly.add(GiGi);
		beth.add(polly);
		GiGi.addActionListener(this);
		beth.pack();
	}

	public void actionPerformed(ActionEvent arg0) {
		lala++;
		if (lala == 5) {
			polly.remove(GiGi);
			JOptionPane.showMessageDialog(null, "Suprise!");
			song.play();
			polly.add(pedro);
			beth.pack();
			System.out.println("UwU");
		}
	}

	class Song extends Sound {
		public Song(String songAddress) {
			super(songAddress);

		}

		public void play() {
			if (!super.isPlaying()) {
				System.out.println("playing");
				super.play();
			}
		}
	}

	static private Component createImage(String imageUrl) {
		JLabel imageLabel = new JLabel();
//			url = new URL(imageUrl);
		Icon icon = new ImageIcon(imageUrl);
		imageLabel.setIcon(icon);

		return imageLabel;
	}
}
