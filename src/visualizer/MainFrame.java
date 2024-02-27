package visualizer;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    public MainFrame() {
        super("Graph-Algorithms Visualizer");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);
        setLayout(null);

        JPanel graph = new JPanel();
        graph.setName("Graph");
        graph.setBounds(0, 0, 800, 600);
        graph.setBackground(Color.BLACK);
        graph.setLayout(null);

        Vertex vertex0 = new Vertex(0, 0, "0");
        graph.add(vertex0);

        Vertex vertex1 = new Vertex(750, 0, "1");
        graph.add(vertex1);

        Vertex vertex2 = new Vertex(0, 550, "2");
        graph.add(vertex2);

        Vertex vertex3 = new Vertex(750, 550, "3");
        graph.add(vertex3);

        add(graph);

        setVisible(true);
    }
}