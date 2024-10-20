package _04_gui_from_scratch._3_sound_effects_machine;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import game_tools.Sound;
public class Airdance implements ActionListener {
	JFrame beth = new JFrame();
	JPanel polly = new JPanel();
	JButton GiGi = new JButton();
	JButton nacho = new JButton();
	JButton Pheobe = new JButton();
	boolean capybara= false;
	public void run() {
		// TODO Auto-generated method stub
		beth.setVisible(true);
		beth.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		polly.add(GiGi);
		polly.add(nacho);
		polly.add(Pheobe);
		beth.add(polly);
		GiGi.setText("Pipe");
		nacho.setText("laugh");
		Pheobe.setText("fnaf4");
		GiGi.addActionListener(this);
		nacho.addActionListener(this);
		Pheobe.addActionListener(this);
		beth.pack();
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==GiGi) {
		System.out.println("UwU");
		capybara=true;
		playSound("pipe.wav");
		}
		if(e.getSource()==nacho) {
			System.out.println("UwU");
			playSound("laugh.wav");
		}
		if(e.getSource()==Pheobe) {
			System.out.println("UwU");
			playSound("fnaf4.wav");
		}
	}
	private void playSound(String soundFile) {
		String path = "src/_04_gui_from_scratch/_3_sound_effects_machine/";
			File sound = new File(path+soundFile);
			if (sound.exists()) {
				new Thread(() -> {
				try {
					Clip clip = AudioSystem.getClip();
					clip.open(AudioSystem.getAudioInputStream(sound));
					clip.start();
					Thread.sleep(clip.getMicrosecondLength()/1000);
				}
				catch (Exception e) {
					System.out.println("Could not play this sound");
				}}).start();
	 		}
			else {
				System.out.println("File does not exist");
			}
		
	}
    
	}
