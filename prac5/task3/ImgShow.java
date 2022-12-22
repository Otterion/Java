package prac5.task3;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.net.URL;

public class ImgShow extends JFrame {
    public static ImageIcon img;

    ImgShow(){
        super("Фигуры");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(750,550);

    }

    void setImg(String path){
        img  = new ImageIcon(path);
        setIconImage(img.getImage());
        getContentPane().add(new JLabel(img));
    }

    void start(){
        setVisible(true);
    }

    public void paintComponent(Graphics g)
    {
        super.paintComponents(g);

        img.paintIcon(this,g,0,0);
    }
}
