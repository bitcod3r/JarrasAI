import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JSeparator;


public class ButtonPanel  extends JPanel {

	public ButtonPanel() {
		setBounds(350, 0, 150, 322);
		setLayout(null);
		
		JButton btnLlenara = new JButton("LlenarA");
		btnLlenara.setBounds(22, 24, 88, 23);
		
		JButton btnLlenarB = new JButton("Llenar B");
		btnLlenarB.setBounds(22, 165, 88, 23);
		
		JButton btnVaciarA = new JButton("Vaciar A");
		btnVaciarA.setBounds(22, 71, 88, 23);
		
		JButton btnVaciarB = new JButton("Vaciar B");
		btnVaciarB.setBounds(22, 212, 88, 23);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 152, 107, 2);
		
		JButton btnPasarAB = new JButton("Pasar a B");
		btnPasarAB.setBounds(22, 118, 89, 23);
		
		JButton btnPasarAA = new JButton("Pasar a A");
		btnPasarAA.setBounds(22, 259, 89, 23);
		
		add(btnLlenara);
		add(btnLlenarB);
		add(btnVaciarA);
		add(btnVaciarB);
		add(separator);
		add(btnPasarAB);
		add(btnPasarAA);
	}
	
	public void paintComponent(Graphics g) {

		Image imagen = new ImageIcon("bgmenu.jpg").getImage();
		g.drawImage(imagen, 0, 0, null);
		
	}

}
