import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;

public class Basic {
    public static void main(String[] args) {
        // Create a JFrame (the main window)
        JFrame frame = new JFrame("Simple GUI Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        // Create a JPanel (a container for components)
        JPanel panel = new JPanel();

        // Create components (e.g., buttons, labels)
        JButton button = new JButton("Click Me!");
        JLabel label = new JLabel("Hello, Java Swing!");

        // Add components to the panel
        panel.add(button);
        panel.add(label);

        // Add the panel to the frame
        frame.getContentPane().add(panel);

        // Set the frame visibility to true
        frame.setVisible(true);
    }
}
