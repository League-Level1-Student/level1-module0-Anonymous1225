package _04_gui_from_scratch._1_fortune_cookie;

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
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Cookies implements ActionListener {
	
	JFrame ahhhhh = new JFrame();
	JPanel helpme = new JPanel();
	JButton wodent = new JButton();
	
	public void showButton() {
		System.out.println("Button clicked");
		
		
		ahhhhh.setVisible(true);
		ahhhhh.add(wodent);
		ahhhhh.pack();
		wodent.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		int rand = new Random().nextInt(4)+1;
		if (rand==1) {
			JOptionPane.showMessageDialog(null, "Time to retire from life");
		}
		if (rand==2) {
			JOptionPane.showMessageDialog(null, "You will receive ebola in 5 minutes");
		}
		if (rand==3) {
			JOptionPane.showMessageDialog(null, "Get divorced");
		}
		if (rand==4) {
			JOptionPane.showMessageDialog(null, "Go broke");
		}
	}
	 


}
