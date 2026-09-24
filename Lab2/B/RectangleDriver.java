public class RectangleDriver 
{
        public static void main(String[] args) {
        Rectangle rect1 = new Rectangle();
        Rectangle rect2 = new Rectangle();

        rect1.setLength(7);
        rect1.setWidth(5);
        rect2.setLength(4);
        rect2.setWidth(10);

        
        System.out.println("Rectangle 1: " + rect1.toString());
        System.out.println("Rectangle 2: " + rect2.toString());
        System.out.println("Area of Rectangle 1: " + rect1.getArea());
        System.out.println("Perimeter of Rectangle 1: " + rect1.getPerimeter());
        System.out.println("Area of Rectangle 2: " + rect2.getArea());
        System.out.println("Perimeter of Rectangle 2: " + rect2.getPerimeter());

        rect1.printRectangle();
        rect2.printRectangle();
    }
}
