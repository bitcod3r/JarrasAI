import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import java.awt.Color;


public class ButtonPanel  extends JPanel {

	public static JButton btnLlenarA = new JButton("LlenarA");
	public static JButton btnLlenarB = new JButton("Llenar B");
	public static JButton btnVaciarA = new JButton("Vaciar A");
	public static JButton btnVaciarB = new JButton("Vaciar B");
	public static JButton btnPasarAB = new JButton("Pasar a B");
	public static JButton btnPasarBA = new JButton("Pasar a A");
	public static JLabel lblJarraA = new JLabel("Jarra A");
	public static JLabel lblJarraB = new JLabel("Jarra B");
	public static JButton btnReiniciar = new JButton("REINICIAR");
	
	public ButtonPanel() {
		setBounds(350, 0, 150, 322);
		setLayout(null);
		
		
		btnLlenarA.setToolTipText("Llena de l\u00EDquido la Jarra A");
		btnLlenarA.setBounds(31, 39, 88, 23);
		btnLlenarB.setBounds(31, 181, 88, 23);
		btnVaciarA.setBounds(31, 74, 88, 23);		
		btnVaciarB.setBounds(31, 215, 88, 23);
		btnPasarAB.setBounds(31, 109, 89, 23);
		btnPasarBA.setBounds(31, 249, 89, 23);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(22, 150, 107, 2);

		lblJarraA.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblJarraA.setBounds(46, 11, 59, 17);
		lblJarraA.setForeground(Color.WHITE);
		
		lblJarraB.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblJarraB.setBounds(46, 153, 59, 17);
		lblJarraB.setForeground(Color.WHITE);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(22, 283, 107, 2);
	
		btnReiniciar.setBounds(10, 296, 130, 23);
		
		add(btnLlenarA);
		add(btnLlenarB);
		add(btnVaciarA);
		add(btnVaciarB);
		add(separator);
		add(btnPasarAB);
		add(btnPasarBA);
		add(lblJarraA);
		add(lblJarraB);
		add(separator_1);
		add(btnReiniciar);
	}
	
	public void paintComponent(Graphics g) {

		Image imagen = new ImageIcon("bgmenu.jpg").getImage();
		g.drawImage(imagen, 0, 0, null);
		
	}
}
