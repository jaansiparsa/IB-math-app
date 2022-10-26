

import javax.swing.*;

import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.Dimension;

public class UnitFrame extends JFrame {

    JPanel top = new JPanel();
    JPanel center = new JPanel();
    JPanel left = new JPanel();
    JPanel right = new JPanel();
    JPanel bottom = new JPanel();

    JButton back = new JButton("Back");
    Color color = new Color(139, 193, 232);
    
    UnitFrame(){

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

        top.setBackground(color);
        top.setPreferredSize(new Dimension(50, 100));

        left.setBackground(color);
        left.setPreferredSize(new Dimension(100, 100));

        right.setBackground(color);
        right.setPreferredSize(new Dimension(100, 100));

        bottom.setBackground(color);
        bottom.setPreferredSize(new Dimension(50, 100));

        bottom.add(back);
        back.setVerticalAlignment(JButton.CENTER);
        back.setFocusable(false);
        back.setBackground(Color.lightGray);

        this.add(top, BorderLayout.NORTH);
        this.add(center, BorderLayout.CENTER);
        this.add(left,BorderLayout.WEST);
        this.add(right, BorderLayout.EAST);
        this.add(bottom,BorderLayout.SOUTH);

    }
}
