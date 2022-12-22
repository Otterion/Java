package prac7.task3;

public class MovablePoint implements Movable {
    private int x,y,xSpeed,ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                "x=" + x +
                ", y=" + y +
                ", xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }

    public int getxSpeed() {
        return xSpeed;
    }

    public int getySpeed() {
        return ySpeed;
    }

    @Override
    public void moveUp() {
        y++;
    }

    @Override
    public void moveDown() {
        y--;
    }

    @Override
    public void moveLeft() {
        x--;
    }

    @Override
    public void moveRight() {
        x++;
    }

    public boolean speedTest(MovablePoint mp){
        return (Math.sqrt(this.xSpeed*this.xSpeed + this.ySpeed*this.ySpeed) ==
                Math.sqrt(mp.getxSpeed()*mp.getxSpeed() + mp.getySpeed()*mp.getySpeed()));
    }
}
