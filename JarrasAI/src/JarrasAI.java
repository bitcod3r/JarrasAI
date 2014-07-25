import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class JarrasAI extends JFrame {

	// A
	int capacidad_a = 0;
	int nivelagua_a = 0;
	int nivelaguadesde_a = 0;
	int cantidad_a = 0;

	// B
	int capacidad_b = 0;
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
	}

	public void vaciarA() {
		// vaciarA
		cantidad_a = 0;
		nivelagua_a = 0;
		gameP.updateA(getGraphics(), "A");
	}

	public void pasaraB() {
		// pasaraB
		if (nivelagua_b == 0) {
			if (capacidad_a < capacidad_b)
				nivelaguadesde_a = nivelagua_a;
			if (capacidad_a > capacidad_b)
				nivelaguadesde_a = capacidad_b;
		}

		if (nivelagua_b > 0)
			nivelaguadesde_a = capacidad_b - nivelagua_b;

		nivelagua_b = nivelagua_b + nivelaguadesde_a;
		cantidad_b = nivelagua_b;
		nivelagua_a = nivelagua_a - nivelaguadesde_a;
		cantidad_a = nivelagua_a;
	}

	public void llenarB() {
		cantidad_b = capacidad_b;
		nivelagua_b = cantidad_b;
		gameP.updateB(getGraphics(), "B3");
	}

	public void vaciarB() {
		cantidad_b = 0;
		nivelagua_b = 0;
		gameP.updateB(getGraphics(), "B");
	}

	public void pasaraA() {
		if (nivelagua_a == 0) {
			if (capacidad_b < capacidad_a)
				nivelaguadesde_b = nivelagua_b;
			if (capacidad_b > capacidad_a)
				nivelaguadesde_b = capacidad_a;
		}
		if (nivelagua_a > 0)
			nivelaguadesde_b = capacidad_a - nivelagua_a;
		nivelagua_a = nivelagua_a + nivelaguadesde_b;
		cantidad_a = nivelagua_a;
		nivelagua_b = nivelagua_b - nivelaguadesde_b;
		cantidad_b = nivelagua_b;
	}

	public void vaciarTodo() {
		// A
		capacidad_a = 0;
		nivelagua_a = 0;
		nivelaguadesde_a = 0;
		cantidad_a = 0;
		// B
		capacidad_b = 0;
		nivelagua_b = 0;
		nivelaguadesde_b = 0;
		cantidad_b = 0;

		gameP.updateA(getGraphics(), "A");
		gameP.updateB(getGraphics(), "B");
	}
}
