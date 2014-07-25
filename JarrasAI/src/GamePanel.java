
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;


public class GamePanel extends JPanel {

	//A
	int capacidad_a = 0;
	int nivelagua_a = 0;
	int nivelaguadesde_a = 0;
	int cantidad_a = 0;

	//B
	int capacidad_b = 0;
	int nivelagua_b = 0;
	int nivelaguadesde_b = 0;
	int cantidad_b = 0;
	
	
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
	
	public void llenarA(){
		//llenar A
		cantidad_a = capacidad_a;
		nivelagua_a = cantidad_a;		
	}
	
	public void vaciarA(){
		//vaciarA
		cantidad_a = 0;
		nivelagua_a = 0;				
	}
	
	public void pasaraB(){
		//pasaraB
		if(nivelagua_b==0) {
			if(capacidad_a<capacidad_b)
				nivelaguadesde_a = nivelagua_a;
			if(capacidad_a>capacidad_b)
				nivelaguadesde_a = capacidad_b;
		}
		
		if(nivelagua_b>0)
			nivelaguadesde_a = capacidad_b-nivelagua_b;
		
		nivelagua_b = nivelagua_b + nivelaguadesde_a;
		cantidad_b = nivelagua_b;
		nivelagua_a = nivelagua_a - nivelaguadesde_a;
		cantidad_a = nivelagua_a;		
	}
	
	public void vaciarTodo(){
		//A
		capacidad_a = 0;
		nivelagua_a = 0;
		nivelaguadesde_a = 0;
		cantidad_a = 0;
		//B
		capacidad_b = 0;
		nivelagua_b = 0;
		nivelaguadesde_b = 0;
		cantidad_b = 0;
	}
	
}
