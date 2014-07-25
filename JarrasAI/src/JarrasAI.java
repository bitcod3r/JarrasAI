import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("unused")
public class JarrasAI extends JFrame {

	public JarrasAI() {

		setSize(500, 350);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		
		add(new ButtonPanel());
		add(new GamePanel());
		setVisible(true);
		
		
		
	}

	public static void main(String[] args) {
		new JarrasAI();

	}
}
