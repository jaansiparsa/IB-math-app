import javax.swing.*;

import java.awt.Font;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Unit3Frame extends UnitFrame implements ActionListener {
    
    JLabel title = new JLabel("Unit 3 Practice");

    public Unit3Frame(){
        top.setLayout(new BorderLayout());
        top.add(title);
        title.setVerticalAlignment(JLabel.CENTER);
        title.setHorizontalAlignment(JLabel.CENTER);
        title.setFont(new Font("Verdana", Font.PLAIN, 18));

        back.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==back){
            this.dispose();
            new MyFrame();
        }
    }
}
