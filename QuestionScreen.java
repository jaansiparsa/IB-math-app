import javax.swing.*;

import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.Dimension;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class QuestionScreen extends JFrame implements ActionListener{
    
    JPanel top = new JPanel();
    JPanel center = new JPanel();
    JPanel left = new JPanel();
    JPanel right = new JPanel();
    JPanel bottom = new JPanel();

    JButton back = new JButton("Back");
    JButton answer = new JButton("Answer");
    JButton next = new JButton("New Question");

    Color color = new Color(139, 193, 232);

    int index;
    
    QuestionScreen(){

        this.setTitle("Math Question Generator");
        this.setForeground(Color.black);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(new BorderLayout());
        this.setVisible(true);
        this.setAlwaysOnTop(true);
        this.getContentPane().setBackground(color);
        this.setLayout(new BorderLayout());

        this.add(bottom, BorderLayout.SOUTH);
        bottom.setBackground(color);
        bottom.setPreferredSize(new Dimension(50, 100));

        next.setBackground(Color.lightGray);
        answer.setBackground(Color.lightGray);
        back.setBackground(Color.lightGray);

        next.setFocusable(false);
        answer.setFocusable(false);
        back.setFocusable(false);

        bottom.add(back);
        bottom.add(answer);
        bottom.add(next);

        back.addActionListener(this);
        answer.addActionListener(this);
        next.addActionListener(this);

        index = (int)(Math.random()*Unit2Frame.options.size());
        Object question = Unit2Frame.options.get(index);
        System.out.println(question);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==back){
            this.dispose();
            new Unit2Frame();
        }
        if (e.getSource()==next){
            index = (int)(Math.random()*Unit2Frame.options.size());
            Object question = Unit2Frame.options.get(index);
            System.out.println(question);
        }
        if (e.getSource()==answer){
            Object answer = Unit2Frame.answers.get(index);
            System.out.println(answer);
        }
        
    }
}
