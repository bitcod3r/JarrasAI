import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

public class JarrasAI extends JFrame {

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
	
	public JarrasAI() {

		setSize(500, 350);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		
		add(new ButtonPanel());
		add(new GamePanel());
		setVisible(true);
		
		//*********************
		//Acciones para botones
		
		// Boton Llenar A 
		ButtonPanel.btnLlenarA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Mensaje de Prueba");
				llenarA();
				
			}
		});
	}

	public static void main(String[] args) {
		new JarrasAI();

	}
	
	public void llenarA(){
		//llenar A 
		cantidad_a = capacidad_a;
		nivelagua_a = cantidad_a;
		// TODO cambiar la imagen de la jarra A
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
