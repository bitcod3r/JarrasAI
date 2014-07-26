import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class JarrasAI extends JFrame {

	// A
	int capacidad_a = 4;
	int nivelagua_a = 0;
	int nivelaguadesde_a = 0;
	int cantidad_a = 0;

	// B
	int capacidad_b = 3;
	int nivelagua_b = 0;
	int nivelaguadesde_b = 0;
	int cantidad_b = 0;

	GamePanel gameP = new GamePanel();
	ButtonPanel buttonP = new ButtonPanel();

	public JarrasAI() {

		setSize(500, 350);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);

		add(buttonP);
		add(gameP);
		setVisible(true);

		// *********************
		// Acciones para botones

		// Boton Llenar A
		ButtonPanel.btnLlenarA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				llenarA();
			}
		});
		
		// Boton Llenar B
		ButtonPanel.btnLlenarB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				llenarB();
			}
		});
		
		// Boton Vaciar A
		ButtonPanel.btnVaciarA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vaciarA();
			}
		});
		
		// Boton Vaciar B
		ButtonPanel.btnVaciarB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vaciarB();
			}
		});
		
		// Boton Pasar de A a B
		ButtonPanel.btnPasarAB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pasaraB();
			}
		});
		
		// Boton Pasar de B a A
		ButtonPanel.btnPasarBA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pasaraA();
			}
		});
		
		// Boton reiniciar
		ButtonPanel.btnReiniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vaciarTodo();
			}
		});
	}

	public static void main(String[] args) {
		new JarrasAI();

	}

	public void llenarA() {
		// llenar A
		cantidad_a = capacidad_a;
		nivelagua_a = cantidad_a;
		gameP.updateA(getGraphics(), "A4");
		
		updateJarras();
	}

	public void vaciarA() {
		// vaciarA
		cantidad_a = 0;
		nivelagua_a = 0;
		gameP.updateA(getGraphics(), "A");
		
		updateJarras();
	}

	public void pasaraB() {
		int sumatoria = cantidad_a + cantidad_b;
		
		if(sumatoria > capacidad_b) {
			
			cantidad_a = sumatoria - capacidad_b;
			nivelagua_a = cantidad_a;
			cantidad_b = capacidad_b;
			nivelagua_b = cantidad_b;
		} else {
			
			cantidad_a = 0;
			nivelagua_a = cantidad_a;
			cantidad_b = sumatoria;
			nivelagua_b = cantidad_b;
		}
		
		
		updateJarras();
	}

	public void llenarB() {
		cantidad_b = capacidad_b;
		nivelagua_b = cantidad_b;
		
		updateJarras();
	}

	public void vaciarB() {
		cantidad_b = 0;
		nivelagua_b = 0;
		
		updateJarras();
	}

	public void pasaraA() {
		int sumatoria = cantidad_a + cantidad_b;
		
		if(sumatoria > capacidad_a) {
			
			cantidad_b = sumatoria - capacidad_a;
			nivelagua_b = cantidad_b;
			cantidad_a = capacidad_a;
			nivelagua_a = cantidad_a;
		} else {
			
			cantidad_b = 0;
			nivelagua_b = cantidad_b;
			cantidad_a = sumatoria;
			nivelagua_a = cantidad_a;
		}
		
		updateJarras();
	}

	public void vaciarTodo() {
		// A
		nivelagua_a = 0;
		nivelaguadesde_a = 0;
		cantidad_a = 0;
		// B
		nivelagua_b = 0;
		nivelaguadesde_b = 0;
		cantidad_b = 0;

		updateJarras();
	}
	
	public void updateJarras() {
		gameP.updateA(getGraphics(), "A" + nivelagua_a);
		gameP.updateB(getGraphics(), "B" + nivelagua_b);
		
//		mostrarResultados();
	}
	
//	private void mostrarResultados() {
//		System.out.println("nivelagua_a: " + nivelagua_a);
//		System.out.println("nivelaguadesde_a: " + nivelaguadesde_a);
//		System.out.println("cantidad_a: " + cantidad_a);
//		System.out.println("      ");
//		System.out.println("nivelagua_b: " + nivelagua_b);
//		System.out.println("nivelaguadesde_b: " + nivelaguadesde_b);
//		System.out.println("cantidad_b: " + cantidad_b);
//		System.out.println("***********************");
//	}

}
