public class Point
{
    private int x;
    private int y;

public Point()              //no explicit constructor, so default constuctor was needed
    {
        this.x = 0;
        this.y = 0;
    }

    public Point(int num1, int num2)
    {
        this.x = num1;
        this.y = num2;
    }

    public int getX()
    {
        return this.x;
    }

    public void setX(int val)
    {
        this.x = val;
        return;
    }

    public int getY()
    {
        return this.y;
    }

    public void setY(int val)
    {
        this.y = val;
        return;
    }

    public String toString()
    {
        return "X value: " + this.x + " Y value: " + this.y;
    }

}
