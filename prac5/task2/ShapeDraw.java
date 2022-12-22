package prac5.task2;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

class DrawPanel extends JPanel{
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;
        Random rand = new Random();

        Shape[] arr = new Shape[20];
        int type;
        for (int i = 0; i < 20; i++) {
            type = rand.nextInt(3);
            switch (type){
                case 0-> {
                    arr[i] = new Circle(
                            rand.nextInt(100)+100*(i%4),
                            rand.nextInt(100)+100*(i/5),
                            rand.nextInt(50)+50,
                            new Color(rand.nextInt(255),rand.nextInt(255),rand.nextInt(255)));
                    g2.fillOval(arr[i].getX(),arr[i].getY(),arr[i].getW(),arr[i].getH());
                    g2.setPaint(arr[i].getColor());
                }

                case 1-> {
                    arr[i] = new Rectangle(
                            rand.nextInt(100)+100*(i%4),
                            rand.nextInt(100)+100*(i/5),
                            rand.nextInt(50)+50,
                            rand.nextInt(50)+50,
                            new Color(rand.nextInt(255),rand.nextInt(255),rand.nextInt(255)));
                    g2.fillRect(arr[i].getX(),arr[i].getY(),arr[i].getW(),arr[i].getH());
                    g2.setPaint(arr[i].getColor());
                }

                case 2->{
                    arr[i]=new Square(
                            rand.nextInt(100)+100*(i%4),
                            rand.nextInt(100)+100*(i/5),
                            rand.nextInt(50)+50,
                            new Color(rand.nextInt(255),rand.nextInt(255),rand.nextInt(255)));
                    g2.fillRect(arr[i].getX(),arr[i].getY(),arr[i].getW(),arr[i].getH());
                    g2.setPaint(arr[i].getColor());
                }
            }
        }

    }
}

public class ShapeDraw extends JFrame {
    ShapeDraw(){
        super("Фигуры");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,500);
        DrawPanel drawPanel = new DrawPanel();

        getContentPane().add(drawPanel);
        setVisible(true);
    }

}
