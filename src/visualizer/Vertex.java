package visualizer;

import javax.swing.*;
import java.awt.*;

public class Vertex extends JPanel {

    public Vertex(int x, int y, String text) {
        setName(String.format("Vertex %s", text));
        setBounds(x, y, 50, 50);
        setBackground(Color.BLACK);
        setLayout(new GridBagLayout());

        JLabel label = new JLabel(text);
        label.setName(String.format("VertexLabel %s", text));
        add(label);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.WHITE);
        g.fillOval(0, 0, 50, 50);
    }
}