import java.awt.*;
import javax.swing.*;
import part.Cello;

public class InstrumentBuilder {
    public static void main(String[] args) {

        Cello cello = new Cello();

        JFrame frame = new JFrame("Instrument Builder");
        frame.setSize(1000, 1000);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        frame.setLocationRelativeTo(null);

        JPanel imagePanel = new JPanel();
        imagePanel.setLayout(new OverlayLayout(imagePanel));
        imagePanel.setPreferredSize(new Dimension(700, 700));

        addImageToPanel(imagePanel, cello.getImageName());
        addImageToPanel(imagePanel, "piano.png");
        addImageToPanel(imagePanel, "viola.png");
        addImageToPanel(imagePanel, "violin.png");

        JTextArea descriptionArea = new JTextArea(cello.getDescription());
        descriptionArea.setLineWrap(true);
        descriptionArea.setWrapStyleWord(true);
        descriptionArea.setEditable(false);
        descriptionArea.setFont(new Font("Serif", Font.PLAIN, 16));

        frame.add(imagePanel, BorderLayout.NORTH);
        frame.add(new JScrollPane(descriptionArea), BorderLayout.CENTER);
        frame.setVisible(true);
    }

    private static void addImageToPanel(JPanel panel, String path) {
        ImageIcon icon = new ImageIcon(path);
        JLabel label = new JLabel(icon);
        label.setAlignmentX(0.5f);
        label.setAlignmentY(0.5f);
        panel.add(label);
    }
}