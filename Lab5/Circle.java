public class Circle extends Point
{
    private int radius;

    public Circle(int num1, int num2, int num3) //x , y , radius
    {
        this.setX(num1);
        this.setY(num2);
        this.radius = num3;
    }

    public int getRadius()
    {
        return this.radius;
    }

    public void setRadius(int val)
    {
        this.radius = val;
        return;
    }
}