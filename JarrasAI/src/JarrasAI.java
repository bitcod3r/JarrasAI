import javax.swing.JFrame;

/**
 * @author bitcod3r
 *
 */
public class JarrasAI extends JFrame{

	public JarrasAI() {

		setSize(500, 350);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		add(new GamePanel());
		add(new ButtonPanel());

		setVisible(true);
	}

	public static void main(String[] args) {
		new JarrasAI();

	}
}
