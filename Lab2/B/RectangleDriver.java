public class RectangleDriver 
{
        public static void main(String[] args) {
        Rectangle rect1 = new Rectangle();
        Rectangle rect2 = new Rectangle();

        rect1.setLength(4.0);
        rect1.setWidth(2.0);
        rect2.setLength(5.0);
        rect2.setWidth(3.0);
        
        System.out.println("Rectangle 1: " + rect1.toString());
        System.out.println("Rectangle 2: " + rect2.toString());
    }
}
