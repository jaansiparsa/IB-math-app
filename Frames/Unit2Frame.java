package Frames;
import javax.swing.*;

import java.awt.Font;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.GridLayout;

public class Unit2Frame extends UnitFrame implements ActionListener {
    
    JLabel title = new JLabel("Unit 2 Practice");

    JButton practiceThis = new JButton("Practice This!");

    JCheckBox easy = new JCheckBox("easy");
    JCheckBox medium = new JCheckBox("medium");
    JCheckBox hard = new JCheckBox("hard");

    JCheckBox mod1 = new JCheckBox("Properties of Functions");
    JCheckBox mod2 = new JCheckBox("Quadratics");
    JCheckBox mod3 = new JCheckBox("Rational Functions");
    JCheckBox mod4 = new JCheckBox("Exponent-Log Functions");
    JCheckBox mod5 = new JCheckBox("Transformations");
    JCheckBox mod6 = new JCheckBox("Polynomials");
    JCheckBox mod7 = new JCheckBox("Modulus and Inequalities");

    JPanel difficulty = new JPanel();

    public Unit2Frame(){
        top.setLayout(new BorderLayout());
        top.add(title);
        title.setVerticalAlignment(JLabel.CENTER);
        title.setHorizontalAlignment(JLabel.CENTER);
        title.setFont(new Font("Verdana", Font.PLAIN, 18));

        mod1.setFocusable(false);
        mod2.setFocusable(false);
        mod3.setFocusable(false);
        mod4.setFocusable(false);
        mod5.setFocusable(false);
        mod6.setFocusable(false);
        mod7.setFocusable(false);

        mod1.setBackground(Color.lightGray);
        mod2.setBackground(Color.lightGray);
        mod3.setBackground(Color.lightGray);
        mod4.setBackground(Color.lightGray);
        mod5.setBackground(Color.lightGray);
        mod6.setBackground(Color.lightGray);
        mod7.setBackground(Color.lightGray);

        difficulty.add(easy);
        difficulty.add(medium);
        difficulty.add(hard);

        easy.setFocusable(false);
        medium.setFocusable(false);
        hard.setFocusable(false);


        center.setLayout(new GridLayout(8,1));
        center.add(mod1);
        center.add(mod2);
        center.add(mod3);
        center.add(mod4);
        center.add(mod5);
        center.add(mod6);
        center.add(mod7);
        center.add(difficulty);

        bottom.add(practiceThis);
        practiceThis.setFocusable(false);
        practiceThis.setBackground(Color.LIGHT_GRAY);


        back.addActionListener(this);
        practiceThis.addActionListener(this);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if (e.getSource()==back){
            this.dispose();
            new MyFrame();
        }
    }
}

