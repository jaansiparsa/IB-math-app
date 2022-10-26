import javax.swing.*;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Dimension;
import java.awt.Font;

public class MyFrame extends JFrame implements ActionListener{
    JButton unit1 = new JButton("Unit 1: Numbers & Algebra");
    JButton unit2 = new JButton("Unit 2: Functions");
    JButton unit3 = new JButton("Unit 3: Geometry & Trigonometry");
    JButton unit4 = new JButton("Unit 4: Statistics & Probability");
    JButton unit5 = new JButton("Unit 5: Calculus");
    JButton unit6 = new JButton("Custom Practice");

    JMenuBar menuBar = new JMenuBar();

    JLabel label = new JLabel("IB Math Question Generator");

    JPanel title = new JPanel();
    JPanel center = new JPanel();
    JPanel left = new JPanel();
    JPanel right = new JPanel();
    JPanel bottom = new JPanel();

    JMenu fileMenu = new JMenu("File");
    JMenu editMenu = new JMenu("Edit");
    JMenu helpMenu = new JMenu("Help");

    JMenuItem loadItem = new JMenuItem("Load");
    JMenuItem saveItem = new JMenuItem("Save");
    JMenuItem exitItem = new JMenuItem("Exit");

    public MyFrame(){
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


        unit1.addActionListener(this);
        unit2.addActionListener(this);
        unit3.addActionListener(this);
        unit4.addActionListener(this);
        unit5.addActionListener(this);
        unit6.addActionListener(this);

        /*//unit1.setBounds(200,100,100, 50);

        //unit2.setBounds(200,300,100, 50);*/

        unit1.setFocusable(false);
        unit2.setFocusable(false);
        unit3.setFocusable(false);
        unit4.setFocusable(false);
        unit5.setFocusable(false);
        unit6.setFocusable(false);

        unit1.setBackground(Color.lightGray);
        unit2.setBackground(Color.lightGray);
        unit3.setBackground(Color.lightGray);
        unit4.setBackground(Color.lightGray);
        unit5.setBackground(Color.lightGray);
        unit6.setBackground(Color.lightGray);

        title.setBackground(color);
        title.setPreferredSize(new Dimension(100, 100));
        title.setLayout(new BorderLayout());
        title.add(label);

        center.setBackground(color);
        center.setLayout(new GridLayout(6,1));
        center.add(unit1);
        center.add(unit2);
        center.add(unit3);
        center.add(unit4);
        center.add(unit5);
        center.add(unit6);

        left.setBackground(color);
        left.setPreferredSize(new Dimension(80, 100));

        right.setBackground(color);
        right.setPreferredSize(new Dimension(80, 100));

        bottom.setBackground(color);
        bottom.setPreferredSize(new Dimension(50, 100));

        label.setHorizontalAlignment(JLabel.CENTER);
        label.setFont(new Font("Verdana", Font.PLAIN, 18));
           
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);

        fileMenu.add(loadItem);
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);

        loadItem.addActionListener(this);
        saveItem.addActionListener(this);
        exitItem.addActionListener(this);

        //this.add(unit1);
        //this.add(label);
        this.setJMenuBar(menuBar);
        this.add(title, BorderLayout.NORTH);
        this.add(center, BorderLayout.CENTER);
        this.add(left,BorderLayout.WEST);
        this.add(right, BorderLayout.EAST);
        this.add(bottom,BorderLayout.SOUTH);

        //label.setLayout();

        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==unit1){
            this.dispose();
            new Unit1Frame();
        }
        if (e.getSource()==unit2){
            this.dispose();
            new Unit2Frame();
        }
        if (e.getSource()==unit3){
            this.dispose();
            new Unit3Frame();
        }
        if (e.getSource()==unit4){
            this.dispose();
            new Unit4Frame();
        }
        if (e.getSource()==unit5){
            this.dispose();
            new Unit5Frame();
        }
        if (e.getSource()==unit6){
            this.dispose();
            new CustomFrame();
        }
        if (e.getSource()==unit2){
            this.dispose();
            new Unit2Frame();
        }
        if (e.getSource()==loadItem){
            System.out.println("beep boop you loaded file");
        }
        if (e.getSource()==saveItem){
            System.out.println("beep boop you saved item");
        }
        if (e.getSource()==exitItem){
            System.exit(0);
        }
        
    }
}
