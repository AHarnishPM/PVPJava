import javax.swing.JFrame;
import javax.swing.SwingUtilities;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    /**
     * Start GUI
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> setupGUI());

    }

    private static void setupGUI() {
        JFrame window = new JFrame("PVPJava");

        window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        window.setSize(800, 500);
        window.setVisible(true);

    }
}