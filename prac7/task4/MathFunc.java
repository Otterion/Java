package prac7.task4;

public class MathFunc implements MathCalcilable{
    double x,y;

    public MathFunc(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public double modul() {
        return Math.sqrt(x*x + y*y);
    }

    @Override
    public void power(int n) {
        double m = modul();
        double rcos = Math.cos(x/m);
        double rsin = Math.sin(y/m);
        m = Math.pow(m, n);
        rcos = Math.cos(rcos*n);
        rsin = Math.sin(rsin*n);
        System.out.println(m * rcos + " + i*" + m * rsin + ")");
    }

    public double circleLength(double radius)
    {
        return 2*pi*radius;
    }

}
