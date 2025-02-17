import javax.swing.*;
import java.awt.*;

public class EventPlanner {
    public static void main(String[] args) {
        // Main Window
        // Nothing Special
        JFrame frame = new JFrame("Even Planner Thing, Or Something??? [Main Window]");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // RegisterPanel panel = new RegisterPanel();
        EventListPanel panel = new EventListPanel();

        Dimension windowSize = new Dimension(500, 400);
        panel.setPreferredSize(windowSize);

        // We can however set window location
        frame.setLocation(
                (Toolkit.getDefaultToolkit().getScreenSize().width  / 2) - (int) (windowSize.getWidth() / 2),
                (Toolkit.getDefaultToolkit().getScreenSize().height / 3) - (int) (windowSize.getHeight() / 2)
        );


        frame.getContentPane().add(panel);

        frame.pack();
        frame.setVisible(true);
    }
}
