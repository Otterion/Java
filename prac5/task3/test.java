package prac5.task3;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class test {

    public static void main(String[] args) {
        ImgShow frame = new ImgShow();
        frame.setImg(args[0]);
        frame.start();
    }
}
