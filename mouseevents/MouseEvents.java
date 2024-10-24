package mouseevents;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MouseEvents extends JFrame implements MouseListener {

    private JPanel panel;

    public MouseEvents() {
        panel = new JPanel();
        panel.setBackground(Color.WHITE);
        panel.addMouseListener(this);

        add(panel);

        setTitle("Mouse Events");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void mouseEntered(MouseEvent me) {
        panel.setBackground(Color.RED);
    }

    @Override
    public void mouseExited(MouseEvent me) {
        panel.setBackground(Color.GREEN);
    }

    @Override
    public void mousePressed(MouseEvent me) {
        panel.setBackground(Color.CYAN);
    }

    @Override
    public void mouseReleased(MouseEvent me) {
        panel.setBackground(Color.BLUE);
    }

    @Override
    public void mouseClicked(MouseEvent me) {
        panel.setBackground(Color.YELLOW);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(MouseEvents::new);
    }
}
