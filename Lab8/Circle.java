public class Circle extends TwoDShape{
	private double radius;

	public Circle(String n, String c, double r){ 
        super(n, c);
        setRadius(r);
		}

	public double getRadius(){ 
		return radius; 
		}

	public void setRadius(double r){
		radius = r; 
		}

	public double area(){ 
		return Math.PI * Math.pow(radius, 2);
		}

	public String toString() {		
		return ("Radius : " + radius);
	}

	protected String hello() {
		return "Hello";
		}
}