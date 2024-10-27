package _04_gui_from_scratch._4_cuteness_tv;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
public class cute implements ActionListener {
	
	JPanel Beth= new JPanel();
	JFrame Polly = new JFrame();
	JButton GiGi = new JButton();
	JButton Pheobe = new JButton();
	JButton tiny = new JButton();
	JButton Capybara = new JButton();
	JButton nick = new JButton();
	
	public void run() {
		Polly.add(Beth);
		GiGi.setText("Frog");
		Pheobe.setText("Snake");
		tiny.setText("Cat");
		Capybara.setText("Penguin");
		nick.setText("Bunny");
		Beth.add(GiGi);
		Beth.add(Pheobe);
		Beth.add(tiny);
		Beth.add(Capybara);
		Beth.add(nick);
		Pheobe.addActionListener(this);
		tiny.addActionListener(this);
		Capybara.addActionListener(this);
		nick.addActionListener(this);
		GiGi.addActionListener(this); 
		Polly.setVisible(true);
		Polly.pack();
	}
	void froggo() {
		playVideo("https://www.youtube.com/watch?v=dM8x_g_OD_A");
	}
	void snek() {
		playVideo("https://www.youtube.com/watch?v=5f2UYOhw1FY");
	}
	void gato() {
		playVideo("https://www.youtube.com/watch?v=5cxYVeJneT8");
	}
	void pengy() {
		playVideo("https://www.youtube.com/watch?v=z4ZI8T4BstI");
	}
	void bun_bun(){
		playVideo("https://www.youtube.com/watch?v=dC1Lx9WaOLU");
	}
	void playVideo(String videoID) {
	     
	     // Workaround for Linux because "Desktop.getDesktop().browse()" doesn't
	     //work on some Linux implementations
	     try {
	     if (System.getProperty("os.name").toLowerCase().contains("linux")) {
	     if (Runtime.getRuntime().exec(new String[] {
	      "which", "xdg- open" }).getInputStream().read() != -1) {
	     Runtime.getRuntime().exec(new String[] { "xdg-open", videoID });
	     }
	     } else {
	          URI uri = new URI(videoID);
	          java.awt.Desktop.getDesktop().browse(uri);
	     }      } catch (Exception e) {
	          e.printStackTrace();
	     }
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==GiGi) {
			froggo();
		}
		if(e.getSource()==Pheobe) {
			snek();
		}
		if(e.getSource()==tiny) {
			gato();
		}
		if(e.getSource()==Capybara) {
			pengy();
		}
		if(e.getSource()==nick) {
			bun_bun();
		}
	}
}
