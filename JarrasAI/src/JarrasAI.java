import javax.swing.JFrame;

/**
 * @author bitcod3r
 *
 */
public class JarrasAI extends JFrame{

	public JarrasAI() {

		setSize(450, 450);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//add(new GamePanel());
		setVisible(true);
	}

	public static void main(String[] args) {
		new JarrasAI();

	}

}
