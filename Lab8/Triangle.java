public class Triangle extends TwoDShape {
    private double height;
    private double base;

    public Triangle(String n, String c, double h, double b)
    {
        super(n, c);
        setHeight(h);
        setBase(b);
    }

    public void setHeight(double b)
    {
        base = b;
    }

    public void setBase(double h)
    {
        height = h;
    }

    @Override
    public double area()
    {
        return (0.5 * base * height);
    }
}
