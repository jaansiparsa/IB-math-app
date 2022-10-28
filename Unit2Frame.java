

import javax.swing.*;

import java.awt.Font;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.GridLayout;

import java.util.ArrayList;

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

    ArrayList<Object> functionProperties = new ArrayList<Object>();
    ArrayList<quadratics> quadratics = new ArrayList<quadratics>();
    static ArrayList<Object> options = new ArrayList<>();
    static ArrayList<Object> answers = new ArrayList<>();

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

        
        center.setLayout(new GridLayout(8,1));
        center.add(mod1);
        center.add(mod2);
        center.add(mod3);
        center.add(mod4);
        center.add(mod5);
        center.add(mod6);
        center.add(mod7);
        center.add(difficulty);

        difficulty.add(easy);
        difficulty.add(medium);
        difficulty.add(hard);

        easy.setFocusable(false);
        medium.setFocusable(false);
        hard.setFocusable(false);


        bottom.add(practiceThis);
        practiceThis.setFocusable(false);
        practiceThis.setBackground(Color.LIGHT_GRAY);


        back.addActionListener(this);
        practiceThis.addActionListener(this);

        quadratics.add(new quadraticsQ1());
        quadratics.add(new quadraticsQ2());
        quadratics.add(new quadraticsQ3());
        quadratics.add(new quadraticsQ4());
        quadratics.add(new quadraticsQ5());
        quadratics.add(new quadraticsQ6());


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==back){
            this.dispose();
            new MyFrame();
        }
        if (e.getSource()==practiceThis){
            if (easy.isSelected()){
                if (mod2.isSelected()){
                    for (int i =0; i< quadratics.size(); i++){
                        if(quadratics.get(i).getDifficulty()=="easy"){
                            options.add(quadratics.get(i).getQuestion());
                            answers.add(quadratics.get(i).getAnswer());
                        }
                    }
                }
            }
            // THROWS ERROR DURING MEDIUM AND HARD BECAUSE THERE ARE NO MEDIUM/HARD QUESTIONS IN DATABASE
            if (medium.isSelected()){
                if (mod2.isSelected()){
                    for (int i =0; i< quadratics.size(); i++){
                        if(quadratics.get(i).getDifficulty()=="medium"){
                            options.add(quadratics.get(i).getQuestion());
                            answers.add(quadratics.get(i).getAnswer());
                        }
                    }
                }
            }
            if (hard.isSelected()){
                if (mod2.isSelected()){
                    for (int i =0; i< quadratics.size(); i++){
                        if(quadratics.get(i).getDifficulty()=="hard"){
                            options.add(quadratics.get(i).getQuestion());
                            answers.add(quadratics.get(i).getAnswer());
                        }
                    }
                }
            }
            // Object question = options.get((int)(Math.random()*options.size()));
            // System.out.println(question);
            new QuestionScreen();
        }
    }
}

