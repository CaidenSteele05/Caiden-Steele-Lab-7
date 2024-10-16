
public class IsoscelesTrapezoid extends Polygon{
	private double top;
	private double base;
	private double leg;
	private double area;
	private double triangleBase;
	private double height;
	
	public IsoscelesTrapezoid(double top, double base, double leg) {
		super(new double[] {top, base, leg, leg});
		
		this.top = top;
		this.base = base;
		this.leg = leg;
		
		this.triangleBase = (base - top) / 2;
		this.height = Math.sin(Math.acos((triangleBase)/leg))*leg;
		this.area = (top + base) / 2 * height;
	}
	
	public double getTop() {
		return top;
	}
	
	public double getBase() {
		return base;
	}
	
	public double getLeg() {
		return leg;
	}
	
	public double getArea() {
		return area;
	}
	
	public Rectangle getCenterRectangle() {
		return new Rectangle(top > base ? base : top, height);
	}
}
