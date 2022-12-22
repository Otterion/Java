package prac5.task4;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URL;

public class Animation extends JFrame {
    public static ImageIcon img;


    Animation() throws Exception {
        super("Анимация");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(750,550);

        ImageIcon[] icons = new ImageIcon[3];
        icons[0] = new ImageIcon("C:\\Users\\777\\IdeaProjects\\untitled\\src\\prac5\\task4\\frame1.jpg");
        icons[1] = new ImageIcon("C:\\Users\\777\\IdeaProjects\\untitled\\src\\prac5\\task4\\frame2.jpg");
        icons[2] = new ImageIcon("C:\\Users\\777\\IdeaProjects\\untitled\\src\\prac5\\task4\\frame3.jpg");

        JPanel panel = new JPanel(new BorderLayout());
        JLabel label = new JLabel();

        label.setIcon(icons[0]);
        panel.add(label, BorderLayout.CENTER);

        ActionListener animate = new ActionListener() {

            private int index = 0;

            @Override
            public void actionPerformed(ActionEvent e) {
                label.setIcon(icons[(++index)%3]);
            }
        };

        JButton button = new JButton("Дальше");
        button.addActionListener(animate);

        panel.add(button, BorderLayout.PAGE_END);
        getContentPane().add(panel);
    }

    void start(){
        pack();
        setVisible(true);
    }

}
