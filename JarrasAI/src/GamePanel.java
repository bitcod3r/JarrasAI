
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;


public class GamePanel extends JPanel {
	
	public GamePanel() {
		setBounds(0, 0, 350, 322);
	}
	
	public void paintComponent(Graphics g) {

		Image imagen = new ImageIcon("bgmain.jpg").getImage();
		g.drawImage(imagen, 0, 0, null);

		// Poner las jarras vacias
		Image imagenA = new ImageIcon("A.jpg").getImage();
		g.drawImage(imagenA, 0, 0, null);
		
		Image imagenB = new ImageIcon("B.jpg").getImage();
		g.drawImage(imagenB, 176, 0, null);
	}
	

}
