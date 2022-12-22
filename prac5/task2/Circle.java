package prac5.task2;

import java.awt.*;

public class Circle extends Shape {
    private int r;

    public Circle(int x, int y, int r, Color color) {
        this.w = r;
        this.h = r;
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public double getR() {
        return r;
    }
}
