
public abstract class Polygon extends Shape{
	private double perimeter;
	
	public Polygon(double[] sides) throws IllegalArgumentException{
		if(sides == null) {
			throw new IllegalArgumentException("null sides");
		}
		
		if(sides.length < 3) {
			throw new IllegalArgumentException("Invalid number of sides: " + sides.length);
		}
		double sumOfSides = 0;
		
		for(double side : sides) {
			if(side <= 0) {
				throw new IllegalArgumentException("Nonpositive side: " + side);
			}
			sumOfSides += side;
		}
		perimeter = sumOfSides;
		
		for(double side : sides) {
			if(side >= sumOfSides - side) {
				throw new IllegalArgumentException("Polygon inequality violated: " + side + " >= " + (sumOfSides-side));
			}
		}
		
	}
	
	public double getPerimeter() {
		return perimeter;
	}
}
