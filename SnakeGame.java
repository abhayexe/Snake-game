import javax.swing.JFrame;
import javax.swing.ImageIcon;

public class SnakeGame extends JFrame {
    public SnakeGame() {
        add(new GamePanel());
        setTitle("Snakie");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);

        setIconImage(new ImageIcon(getClass().getResource("logo.png")).getImage());
    }

    public static void main(String[] args) {
        new SnakeGame();
    }
}
