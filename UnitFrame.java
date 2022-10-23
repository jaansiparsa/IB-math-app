import javax.swing.*;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Dimension;
import java.awt.Font;

public class UnitFrame extends JFrame{

    JPanel title = new JPanel();
    JPanel center = new JPanel();
    JPanel left = new JPanel();
    JPanel right = new JPanel();
    JPanel bottom = new JPanel();
    
    UnitFrame(){
        Color color = new Color(139, 193, 232);

        this.setTitle("Math Question Generator");
        this.setForeground(Color.black);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(new BorderLayout());
        this.setVisible(true);
        this.setAlwaysOnTop(true);
        this.getContentPane().setBackground(color);
        this.setLayout(new BorderLayout());

        center.setBackground(color);

        title.setBackground(color);
        center.setPreferredSize(new Dimension(50, 100));

        left.setBackground(color);
        left.setPreferredSize(new Dimension(80, 100));

        right.setBackground(color);
        right.setPreferredSize(new Dimension(80, 100));

        bottom.setBackground(color);
        bottom.setPreferredSize(new Dimension(50, 100));

        this.add(title, BorderLayout.NORTH);
        this.add(center, BorderLayout.CENTER);
        this.add(left,BorderLayout.WEST);
        this.add(right, BorderLayout.EAST);
        this.add(bottom,BorderLayout.SOUTH);

    }
}
