package prac3;

public class Circle {
    private Point center;
    private double r;

    public Circle(double x, double y, double r) {
        this.r = r;
        center = new Point(x,y);
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

//Методы 6 задания
    public double area(){
        return 3.14*r*r;
    }

    public double length(){
        return 3.14*2*r;
    }

    public void compare(Circle Circle2){
        if (Circle2.getR() == r){
            System.out.println("Окружности равны");
        }else if(Circle2.getR() > r){
            System.out.println("Вторая окружность больше первой");
        }else {
            System.out.println("Первая окружность больше второй");
        }
    }
}
