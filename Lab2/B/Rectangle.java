public class Rectangle 
{
    private int length;
    private int width;

    public Rectangle()
    {
        length = 1;
        width = 1;
    }

    public Rectangle(int length, int width)
    {
        this.length = length;
        this.width = width;
    }

    public int getLength()
    {
        return length;
    }

    public void setLength(int length)
    {
        this.length = length;
    }

    public int getWidth()
    {
        return width;
    }

    public void setWidth(int width)
    {
        this.width = width;
    }
    
    public String toString()
    {
        return "Length: " + length + ", Width: " + width;
    }

    public int getArea()
    {
        return length * width;
    }

    public int getPerimeter()
    {
        return 2 * (length + width);
    }

    public void printRectangle()
    {
        int rows = this.length;
        int cols = this.width;

        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < cols; j++)   //this took way too long for my brain
            {
                if(i == 0 || i == rows - 1 || j == 0 || j == cols - 1) //checking if * lines up with rectangle
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println(""); // move to next row
        }
    }
}
