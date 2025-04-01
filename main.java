import javax.swing.JComponent;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Main extends JComponent implements KeyListener, MouseListener {
    public static Main M = new Main();
    static JFrame f = new JFrame("Fallen Realms");
    int plX = 0, plY = 20, plZ = 0;

    public static void main(String[] args) {
        f.getContentPane().add(M);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        f.setExtendedState(JFrame.MAXIMIZED_BOTH);
        f.setResizable(false);
        ((JComponent) f.getContentPane()).setBackground(Color.BLACK);
        ((JComponent) f.getContentPane()).setOpaque(true);
        f.addKeyListener(M);
        f.addMouseListener(M);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
}
