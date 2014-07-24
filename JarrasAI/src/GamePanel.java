
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.UIManager;


public class GamePanel extends JPanel {

	public GamePanel() {
		setBorder(UIManager.getBorder("List.focusCellHighlightBorder"));
		setBounds(14, 5, 340, 310);
	}
	
	public void paintComponent(Graphics g) {

		Image imagen;
		try {
			imagen = ImageIO.read(     new File("robot.jpg")      );
			g.drawImage(imagen, 0, 0, null);
		} catch (IOException e) {
			//e.printStackTrace();
			g.setColor(Color.GREEN);
			g.fillOval(0, 0, 10, 10);
		}
        
//		Toolkit tk = Toolkit.getDefaultToolkit();
//		imagen = tk.createImage("robot.jpg");
//		g.drawImage(imagen, 0, 0, null);
		//g.fillOval(x, y, size, size);
		
		g.setColor(Color.GREEN);
		g.fillOval(0, 0, 10, 10);
		
	}
	

	
}
